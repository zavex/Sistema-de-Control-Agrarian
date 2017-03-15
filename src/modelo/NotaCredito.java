package modelo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NotaCredito {
    private int folioNC;
    private int idCliente;
    private Date fechaReg;
    private String concepto;
    private double subtotal;
    private double iva;
    private double total;
    private String estatus;
    private Conexion conexion;
    
    public NotaCredito (Conexion conexion) {
    folioNC = -1;
    idCliente = 0;
    fechaReg = null;
    concepto = null;
    subtotal = 0;
    iva = 0;
    total = 0;
    estatus = null;
    this.conexion = conexion;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }


    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getFolioNC() {
        return folioNC;
    }

    public void setFolioNC(int folioNC) {
        this.folioNC = folioNC;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }
    
    public int obtenerNoId(){
        int valor=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            comando = conexion.getConexion().prepareStatement("SELECT folioNC FROM notacredito");
            comando.executeQuery();
            ResultSet rs = comando.executeQuery();
            while(rs.next()){
                valor = rs.getInt(1);
            }
        } catch (SQLException e) {}
        valor++;
        return valor;
    }
    
    public void generarNotaCredito () {
        conexion.conexionSQL();
        PreparedStatement comand = null;
        try {
            comand = conexion.getConexion().prepareStatement("insert into notacredito (idCliente, concepto, subtotal, "
                    + "iva, total, estatus) VALUES (?,?,?,?,?,?)");
            comand.setInt(1,this.idCliente);
            comand.setString(2,this.concepto);
            comand.setDouble(3,this.subtotal);
            comand.setDouble(4,this.iva);
            comand.setDouble(5,this.total);
            comand.setString(6,this.estatus);
            comand.executeUpdate();
            conexion.desconectarSQL();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    public DefaultTableModel consultarNotasCreditoTotales () {
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("folioNC as \"FOLIO NOTA C\", IdCliente as \"ID CLIENTE\", fechaReg as \"FECHA REGISTRO\", concepto as "
                 + "\"CONCEPTO\", subTotal as \"SUBTOTAL\", iva as \"IVA\", total as \"TOTAL\", estatus as \"ESTATUS\"");
            comando = conexion.getConexion().prepareStatement("select "+query+" from notaCredito");
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
                fila.addElement(rs.getInt(2));
                fila.addElement(rs.getDate(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getDouble(5));
                fila.addElement(rs.getDouble(6));
                fila.addElement(rs.getDouble(7));
                fila.addElement(rs.getString(8));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return table;
    }    
     
    public DefaultTableModel consultarFolioNotaCredito () {
        String folioo = String.valueOf(this.folioNC);
        folioo = folioo.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("folioNC as \"FOLIO NOTA C\", IdCliente as \"ID CLIENTE\", fechaReg as \"FECHA REGISTRO\", concepto as "
                 + "\"CONCEPTO\", subTotal as \"SUBTOTAL\", iva as \"IVA\", total as \"TOTAL\", estatus as \"ESTATUS\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" from notaCredito where folioNC LIKE ? ESCAPE '!'");
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
                fila.addElement(rs.getInt(2));
                fila.addElement(rs.getDate(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getDouble(5));
                fila.addElement(rs.getDouble(6));
                fila.addElement(rs.getDouble(7));
                fila.addElement(rs.getString(8));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return table;
    }
    
    public DefaultTableModel consultarNotaPorIdCliente () {
        String idClientee = String.valueOf(this.idCliente);
        idClientee = idClientee.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("folioNC as \"FOLIO NOTA C\", IdCliente as \"ID CLIENTE\", fechaReg as \"FECHA REGISTRO\", concepto as "
                 + "\"CONCEPTO\", subTotal as \"SUBTOTAL\", iva as \"IVA\", total as \"TOTAL\", estatus as \"ESTATUS\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" from notaCredito where idCliente LIKE ? ESCAPE '!'");
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
                fila.addElement(rs.getInt(2));
                fila.addElement(rs.getDate(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getDouble(5));
                fila.addElement(rs.getDouble(6));
                fila.addElement(rs.getDouble(7));
                fila.addElement(rs.getString(8));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return table;
    }

    public DefaultTableModel consultarNotaEstatus () {
        String estatuss = this.estatus.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("folioNC as \"FOLIO NOTA C\", IdCliente as \"ID CLIENTE\", fechaReg as \"FECHA REGISTRO\", concepto as "
                 + "\"CONCEPTO\", subTotal as \"SUBTOTAL\", iva as \"IVA\", total as \"TOTAL\", estatus as \"ESTATUS\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" from notaCredito WHERE estatus LIKE ? ESCAPE '!'");
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
                fila.addElement(rs.getInt(2));
                fila.addElement(rs.getDate(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getDouble(5));
                fila.addElement(rs.getDouble(6));
                fila.addElement(rs.getDouble(7));
                fila.addElement(rs.getString(8));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return table;
    }
    
    public void actualizarEstatus () {
        conexion.conexionSQL();
        PreparedStatement ps = null;
        try {
            ps = conexion.getConexion().prepareStatement("update notaCredito set estatus=? where folioNC=?");
            ps.setString(1, this.estatus);
            ps.setInt(2, this.folioNC);
            ps.executeUpdate();
            conexion.desconectarSQL();
        }catch (Exception e) {
            System.out.println("error en conexion");
        }
    }
    
}
