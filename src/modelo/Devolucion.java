package modelo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Devolucion {
    private int folioDev;
    private Date fechaReg;
    private double subtotal;
    private double iva;
    private double total;
    private int idAlmacen;
    private int idCliente;
    private String estatus;
    private Conexion conexion;
    
    public Devolucion (Conexion conexion) {
    folioDev = -1;
    fechaReg = null;
    subtotal = 0;
    iva = 0;
    total = 0;
    idAlmacen = 0;
    idCliente = 0;
    this.conexion = conexion;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    

    public int getFolioDev() {
        return folioDev;
    }

    public void setFolioDev(int folioDev) {
        this.folioDev = folioDev;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }
       
            
    public int obtenerFolio(){
        int valor=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            comando = conexion.getConexion().prepareStatement("select folioDev from devolucion");
            comando.executeQuery();
            ResultSet rs = comando.executeQuery();
            while(rs.next()){
                valor = rs.getInt(1);
            }
        } catch (SQLException e) {}
    valor++;
    return valor;
    }      
    
    public void registrarDevolucion () {
        conexion.conexionSQL();
        PreparedStatement comand = null;
        try {
            comand = conexion.getConexion().prepareStatement("insert into devolucion (subTotal, iva , total , idAlmacen ,"
                    + " idCliente, estatus) VALUES (?,?,?,?,?,?)");
            comand.setDouble(1,this.subtotal);
            comand.setDouble(2,this.iva);
            comand.setDouble(3,this.total);
            comand.setInt(4,this.idAlmacen);
            comand.setInt(5,this.idCliente);
            comand.setString(6,this.estatus);
            comand.executeUpdate();
            conexion.desconectarSQL();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    public void actualizarEstatus () {
        conexion.conexionSQL();
        PreparedStatement ps = null;
        try {
            ps = conexion.getConexion().prepareStatement("update devolucion set estatus=? where folioDev=?");
            ps.setString(1, this.estatus);
            ps.setInt(2, this.folioDev);
            ps.executeUpdate();
            conexion.desconectarSQL();
        }catch (Exception e) {
            System.out.println("error en conexion");
        }
    }
    
    public DefaultTableModel consultarDevolucionesTotales () {
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("folioDev as \"FOLIO DEVOLUCIÓN\", fechaReg as \"FECHA REGISTRO\", subtotal as \"SUBTOTAL\", iva as \"IVA\", total as \"TOTAL\", idAlmacen as \"ID ALMACÉN\", idCliente as "
                 + "\"ID CLIENTE\", estatus as \"ESTATUS\"");
            comando = conexion.getConexion().prepareStatement("select "+query+" from devolucion");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            table.addColumn(rsm.getColumnLabel(1));
            table.addColumn(rsm.getColumnLabel(2));
            table.addColumn(rsm.getColumnLabel(3));
            table.addColumn(rsm.getColumnLabel(4));
            table.addColumn(rsm.getColumnLabel(5));
            table.addColumn(rsm.getColumnLabel(6));
            table.addColumn(rsm.getColumnLabel(7));
            table.addColumn(rsm.getColumnLabel(8));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getDouble(3));
                fila.addElement(rs.getDouble(4));
                fila.addElement(rs.getDouble(5));
                fila.addElement(rs.getInt(6));
                fila.addElement(rs.getInt(7));
                fila.addElement(rs.getString(8));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return table;
    }        
    
    public DefaultTableModel consultarFolioDevolucion () {
        String folioo = String.valueOf(this.folioDev);
        folioo = folioo.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("folioDev as \"FOLIO DEVOLUCIÓN\", fechaReg as \"FECHA REGISTRO\", subtotal as \"SUBTOTAL\", iva as \"IVA\", total as \"TOTAL\", idAlmacen as \"ID ALMACÉN\", idCliente as "
                 + "\"ID CLIENTE\", estatus as \"ESTATUS\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" from devolucion where folioDev LIKE ? ESCAPE '!'");
            comando.setString(1,folioo + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            table.addColumn(rsm.getColumnLabel(1));
            table.addColumn(rsm.getColumnLabel(2));
            table.addColumn(rsm.getColumnLabel(3));
            table.addColumn(rsm.getColumnLabel(4));
            table.addColumn(rsm.getColumnLabel(5));
            table.addColumn(rsm.getColumnLabel(6));
            table.addColumn(rsm.getColumnLabel(7));
            table.addColumn(rsm.getColumnLabel(8));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getDouble(3));
                fila.addElement(rs.getDouble(4));
                fila.addElement(rs.getDouble(5));
                fila.addElement(rs.getInt(6));
                fila.addElement(rs.getInt(7));
                fila.addElement(rs.getString(8));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return table;
    }
    
    public DefaultTableModel consultarEstatusDevolucion () {
        String estatuss = this.estatus.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("folioDev as \"FOLIO DEVOLUCIÓN\", fechaReg as \"FECHA REGISTRO\", subtotal as \"SUBTOTAL\", iva as \"IVA\", total as \"TOTAL\", idAlmacen as \"ID ALMACÉN\", idCliente as "
                 + "\"ID CLIENTE\", estatus as \"ESTATUS\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" from devolucion WHERE estatus LIKE ? ESCAPE '!'");
            comando.setString(1, estatuss + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            table.addColumn(rsm.getColumnLabel(1));
            table.addColumn(rsm.getColumnLabel(2));
            table.addColumn(rsm.getColumnLabel(3));
            table.addColumn(rsm.getColumnLabel(4));
            table.addColumn(rsm.getColumnLabel(5));
            table.addColumn(rsm.getColumnLabel(6));
            table.addColumn(rsm.getColumnLabel(7));
            table.addColumn(rsm.getColumnLabel(8));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getDouble(3));
                fila.addElement(rs.getDouble(4));
                fila.addElement(rs.getDouble(5));
                fila.addElement(rs.getInt(6));
                fila.addElement(rs.getInt(7));
                fila.addElement(rs.getString(8));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return table;
    }
    
    public DefaultTableModel consultarDevPorIdAlmacen () {
        String idAlmacenn = String.valueOf(this.idAlmacen);
        idAlmacenn = idAlmacenn.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("folioDev as \"FOLIO DEVOLUCIÓN\", fechaReg as \"FECHA REGISTRO\", subtotal as \"SUBTOTAL\", iva as \"IVA\", total as \"TOTAL\", idAlmacen as \"ID ALMACÉN\", idCliente as "
                 + "\"ID CLIENTE\", estatus as \"ESTATUS\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" from devolucion where idAlmacen LIKE ? ESCAPE '!'");
            comando.setString(1,idAlmacenn + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            table.addColumn(rsm.getColumnLabel(1));
            table.addColumn(rsm.getColumnLabel(2));
            table.addColumn(rsm.getColumnLabel(3));
            table.addColumn(rsm.getColumnLabel(4));
            table.addColumn(rsm.getColumnLabel(5));
            table.addColumn(rsm.getColumnLabel(6));
            table.addColumn(rsm.getColumnLabel(7));
            table.addColumn(rsm.getColumnLabel(8));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getDouble(3));
                fila.addElement(rs.getDouble(4));
                fila.addElement(rs.getDouble(5));
                fila.addElement(rs.getInt(6));
                fila.addElement(rs.getInt(7));
                fila.addElement(rs.getString(8));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return table;
    }
    
    public DefaultTableModel consultarDevPorIdCliente () {
        String idClientee = String.valueOf(this.idCliente);
        idClientee = idClientee.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("folioDev as \"FOLIO DEVOLUCIÓN\", fechaReg as \"FECHA REGISTRO\", subtotal as \"SUBTOTAL\", iva as \"IVA\", total as \"TOTAL\", idAlmacen as \"ID ALMACÉN\", idCliente as "
                 + "\"ID CLIENTE\", estatus as \"ESTATUS\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" from devolucion where idCliente LIKE ? ESCAPE '!'");
            comando.setString(1,idClientee + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            table.addColumn(rsm.getColumnLabel(1));
            table.addColumn(rsm.getColumnLabel(2));
            table.addColumn(rsm.getColumnLabel(3));
            table.addColumn(rsm.getColumnLabel(4));
            table.addColumn(rsm.getColumnLabel(5));
            table.addColumn(rsm.getColumnLabel(6));
            table.addColumn(rsm.getColumnLabel(7));
            table.addColumn(rsm.getColumnLabel(8));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getDouble(3));
                fila.addElement(rs.getDouble(4));
                fila.addElement(rs.getDouble(5));
                fila.addElement(rs.getInt(6));
                fila.addElement(rs.getInt(7));
                fila.addElement(rs.getString(8));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return table;
    }
}
