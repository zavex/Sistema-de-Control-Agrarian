package modelo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Venta {
    private int folioVenta;
    private Date fechaReg;
    private double subtotal;
    private double iva;
    private double total;
    private String estatus;
    private int idAlmacen;
    private int idCliente;
    private int idEmpleado;    
    private int factura;
    private Conexion conexion;
    
    public Venta (Conexion conexion) {
    folioVenta = -1;
    fechaReg = null;
    subtotal = 0;
    iva = 0;
    total = 0;
    estatus = null;
    idAlmacen = 0;
    idCliente = 0;
    idEmpleado = 0;
    this.conexion = conexion;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }
    

    public int getFolioVenta() {
        return folioVenta;
    }

    public void setFolioVenta(int folioVenta) {
        this.folioVenta = folioVenta;
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

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
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

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
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
            comando = conexion.getConexion().prepareStatement("select folioVenta from venta order by folioVenta");
            comando.executeQuery();
            ResultSet rs = comando.executeQuery();
            while(rs.next()){
                valor = rs.getInt(1);
            }
        } catch (SQLException e) {}
        valor++;
        return valor;
    }
        
    public void registrarVenta () {
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
        comando = conexion.getConexion().prepareStatement("exec insertVenta ?,?,?,?,?,?,?");
        comando.setDouble(1, this.subtotal);
        comando.setDouble(2, this.iva);
        comando.setDouble(3, this.total);        
        comando.setInt(4, this.idAlmacen);
        comando.setInt(5, this.idCliente);
        comando.setInt(6, this.idEmpleado);
        comando.setString(7, this.estatus);
        int nfila = comando.executeUpdate();
        conexion.desconectarSQL();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error" + ex.getMessage());
        }    
    }
    
    public DefaultTableModel consultarVentasTotales () {
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("folioVenta as \"Folio Venta\", fechaReg as \"Fecha Reg\", subTotal as \"Subtotal\", iva as \"IVA\", total as \"Total\", idAlmacen as \"Id Almacén\", idCliente as \"Id Cliente\", idEmpleado as \"Id Empleado\", estatus as \"Estatus\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" from venta where subTotal !=0");
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
            table.addColumn(rsm.getColumnLabel(9));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getDouble(3));
                fila.addElement(rs.getDouble(4));
                fila.addElement(rs.getDouble(5));
                fila.addElement(rs.getInt(6));
                fila.addElement(rs.getInt(7));
                fila.addElement(rs.getInt(8));
                fila.addElement(rs.getString(9));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return table;
    }
    
    public DefaultTableModel consultarPorFolioVenta () {
        String folioo = String.valueOf(this.getFolioVenta());
        folioo = folioo.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("folioVenta as \"Folio Venta\", fechaReg as \"Fecha Reg\", subTotal as \"Subtotal\", iva as \"IVA\", total as \"Total\", idAlmacen as \"Id Almacén\", idCliente as \"Id Cliente\", idEmpleado as \"Id Empleado\", estatus as \"Estatus\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM venta where subTotal !=0 and folioVenta LIKE ? ESCAPE '!'");
            comando.setString(1, folioo + "%");
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
            table.addColumn(rsm.getColumnLabel(9));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getDouble(3));
                fila.addElement(rs.getDouble(4));
                fila.addElement(rs.getDouble(5));
                fila.addElement(rs.getInt(6));
                fila.addElement(rs.getInt(7));
                fila.addElement(rs.getInt(8));
                fila.addElement(rs.getString(9));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
            System.out.println(ex.getMessage());
        }
        conexion.desconectarSQL();        
        return table;
    }
    
    public DefaultTableModel consultarVentasPorEstatus () {
        String estatuss = this.estatus.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
             String query = ("folioVenta as \"Folio Venta\", fechaReg as \"Fecha Reg\", subTotal as \"Subtotal\", iva as \"IVA\", total as \"Total\", idAlmacen as \"Id Almacén\", idCliente as \"Id Cliente\", idEmpleado as \"Id Empleado\", estatus as \"Estatus\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM venta where subTotal !=0 and estatus LIKE ? ESCAPE '!'");
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
            table.addColumn(rsm.getColumnLabel(9));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getDouble(3));
                fila.addElement(rs.getDouble(4));
                fila.addElement(rs.getDouble(5));
                fila.addElement(rs.getInt(6));
                fila.addElement(rs.getInt(7));
                fila.addElement(rs.getInt(8));
                fila.addElement(rs.getString(9));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return table;
    }
    
    public DefaultTableModel consultarVentasPorIdAlmacen () {
        String idAlmacenn = String.valueOf(this.getIdAlmacen());
        idAlmacenn = idAlmacenn.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("folioVenta as \"Folio Venta\", fechaReg as \"Fecha Reg\", subTotal as \"Subtotal\", iva as \"IVA\", total as \"Total\", idAlmacen as \"Id Almacén\", idCliente as \"Id Cliente\", idEmpleado as \"Id Empleado\", estatus as \"Estatus\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM venta where subTotal !=0 and idAlmacen LIKE ? ESCAPE '!'");
            comando.setString(1, idAlmacenn + "%");
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
            table.addColumn(rsm.getColumnLabel(9));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getDouble(3));
                fila.addElement(rs.getDouble(4));
                fila.addElement(rs.getDouble(5));
                fila.addElement(rs.getInt(6));
                fila.addElement(rs.getInt(7));
                fila.addElement(rs.getInt(8));
                fila.addElement(rs.getString(9));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return table;
    }
    
    public DefaultTableModel consultarVentasPorIdCliente () {
        String idClientee = String.valueOf(this.getIdCliente());
        idClientee = idClientee.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("folioVenta as \"Folio Venta\", fechaReg as \"Fecha Reg\", subTotal as \"Subtotal\", iva as \"IVA\", total as \"Total\", idAlmacen as \"Id Almacén\", idCliente as \"Id Cliente\", idEmpleado as \"Id Empleado\", estatus as \"Estatus\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM venta where subTotal !=0 and idCliente LIKE ? ESCAPE '!'");            
            comando.setString(1, idClientee + "%");
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
            table.addColumn(rsm.getColumnLabel(9));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getDouble(3));
                fila.addElement(rs.getDouble(4));
                fila.addElement(rs.getDouble(5));
                fila.addElement(rs.getInt(6));
                fila.addElement(rs.getInt(7));
                fila.addElement(rs.getInt(8));
                fila.addElement(rs.getString(9));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return table;
    }
    
    public DefaultTableModel consultarVentasPorIdEmpleado () {
        String idEmpleadoo = String.valueOf(this.idEmpleado);
        idEmpleadoo = idEmpleadoo.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("folioVenta as \"Folio Venta\", fechaReg as \"Fecha Reg\", subTotal as \"Subtotal\", iva as \"IVA\", total as \"Total\", idAlmacen as \"Id Almacén\", idCliente as \"Id Cliente\", idEmpleado as \"Id Empleado\", estatus as \"Estatus\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM venta where subTotal !=0 and idEmpleado LIKE ? ESCAPE '!'");            
            comando.setString(1, idEmpleadoo + "%");
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
            table.addColumn(rsm.getColumnLabel(9));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getDouble(3));
                fila.addElement(rs.getDouble(4));
                fila.addElement(rs.getDouble(5));
                fila.addElement(rs.getInt(6));
                fila.addElement(rs.getInt(7));
                fila.addElement(rs.getInt(8));
                fila.addElement(rs.getString(9));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return table;
    }
    
    public DefaultTableModel consultarVentasFacturadas () {
        
        String facturaa = String.valueOf(this.getFactura());
        //facturaa = facturaa.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("v.folioVenta as \"F Venta\", v.estatus as \"Estatus V\", f.folioFactura as \"F Factura\", f.estatus as \"Estatus F\", v.fechaReg as \"Fecha Reg\", v.subTotal as \"Subtotal\", v.iva as \"IVA\", v.total as \"Total\", v.idAlmacen as \"Id Almacen\", v.idCliente as \"Id Cliente\", v.idEmpleado as \"Id Empleado\"");
            //comando = conexion.getConexion().prepareStatement("SELECT "+query+" from venta v join factura f on v.folioVenta = f.folioVenta");
            //comando = conexion.getConexion().prepareStatement("SELECT "+query+" from venta v join factura f on v.folioVenta = f.folioVenta where f.folioFactura like = ? escape '!'");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" from venta v join factura f on v.folioVenta = f.folioVenta where v.subTotal !=0 and f.folioFactura LIKE ? ESCAPE '!'");
            comando.setString(1, facturaa + "%");
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
            table.addColumn(rsm.getColumnLabel(9));
            table.addColumn(rsm.getColumnLabel(10));    
            table.addColumn(rsm.getColumnLabel(11));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getString(2));
                fila.addElement(rs.getInt(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getDate(5));
                fila.addElement(rs.getDouble(6));
                fila.addElement(rs.getDouble(7));
                fila.addElement(rs.getDouble(8));
                fila.addElement(rs.getInt(9));
                fila.addElement(rs.getInt(10));
                fila.addElement(rs.getInt(11));
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
            ps = conexion.getConexion().prepareStatement("update venta set estatus=? where folioVenta=?");
            ps.setString(1, this.estatus);
            ps.setInt(2, this.folioVenta);
            ps.executeUpdate();
            conexion.desconectarSQL();
        }catch (Exception e) {
            System.out.println("error en conexion");
        }
    }
        
}   
