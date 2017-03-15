package modelo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Compra {
    
    private int folioCompra;
    private Date fechaReg;
    private double subtotal;
    private double iva;
    private double total;
    private String estatus;
    private int idAlmacen;
    private int idProveedor;
    private int idEmpleado;    
    private Conexion conexion;
    
    public Compra (Conexion conexion) {
    folioCompra = -1;
    fechaReg = null;
    subtotal = 0;
    iva = 0;
    total = 0;
    estatus = null;
    idAlmacen = 0;
    idProveedor = 0;
    idEmpleado = 0;
    this.conexion = conexion;
    }

    public int getFolioCompra() {
        return folioCompra;
    }

    public void setFolioCompra(int folioCompra) {
        this.folioCompra = folioCompra;
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

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
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
            comando = conexion.getConexion().prepareStatement("select folioCompra from compra");
            comando.executeQuery();
            ResultSet rs = comando.executeQuery();
            while(rs.next()){
                valor = rs.getInt(1);
            }
        } catch (SQLException e) {}
        valor++;
        return valor;
    }
        
    public void registrarCompra () {
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
        comando = conexion.getConexion().prepareStatement("insert into compra (subtotal, iva, total, idAlmacen, idProveedor, "
                + "idEmpleado,estatus) values (?,?,?,?,?,?,?)");
        comando.setDouble(1, this.subtotal);
        comando.setDouble(2, this.iva);
        comando.setDouble(3, this.total);        
        comando.setInt(4, this.idAlmacen);
        comando.setInt(5, this.idProveedor);
        comando.setInt(6, this.idEmpleado);
        comando.setString(7, this.estatus);
        int nfila = comando.executeUpdate();
        conexion.desconectarSQL();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error" + ex.getMessage());
        }    
    }
    
    public DefaultTableModel consultarComprasTotales () {
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("folioCompra as \"FOLIO COMPRA\", fechaReg as \"FECHA REG\", subTotal as \"SUBTOTAL\", iva as \"IVA\", total as \"TOTAL\", idAlmacen as \"ID ALMACÉN\", idProveedor as \"ID PROVEEDOR\", idEmpleado as \"ID EMPLEADO\", estatus as \"Estatus\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM compra");
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
    
    public DefaultTableModel consultarCompraFolio () {
        String folioo = String.valueOf(this.getFolioCompra());
        folioo = folioo.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            
            String query = ("folioCompra as \"FOLIO COMPRA\", fechaReg as \"FECHA REG\", subTotal as \"SUBTOTAL\", iva as \"IVA\", total as \"TOTAL\", idAlmacen as \"ID ALMACÉN\", idProveedor as \"ID PROVEEDOR\", idEmpleado as \"ID EMPLEADO\", estatus as \"Estatus\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM compra where folioCompra=?");
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
        }
        conexion.desconectarSQL();        
        return table;
    }

    public DefaultTableModel consultarCompraEstatus () {
        String estatuss = this.estatus.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            
            String query = ("folioCompra as \"FOLIO COMPRA\", fechaReg as \"FECHA REG\", subTotal as \"SUBTOTAL\", iva as \"IVA\", total as \"TOTAL\", idAlmacen as \"ID ALMACÉN\", idProveedor as \"ID PROVEEDOR\", idEmpleado as \"ID EMPLEADO\", estatus as \"Estatus\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM compra where estatus LIKE ? ESCAPE '!'");
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
    
    public DefaultTableModel consultarCompraPorIdAlmacen () {
        String idAlmacenn = String.valueOf(this.getIdAlmacen());
        idAlmacenn = idAlmacenn.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            
            String query = ("folioCompra as \"FOLIO COMPRA\", fechaReg as \"FECHA REG\", subTotal as \"SUBTOTAL\", iva as \"IVA\", total as \"TOTAL\", idAlmacen as \"ID ALMACÉN\", idProveedor as \"ID PROVEEDOR\", idEmpleado as \"ID EMPLEADO\", estatus as \"Estatus\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM compra where idAlmacen LIKE ? ESCAPE '!'");
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
    
    public DefaultTableModel consultarCompraPorIdProveedor () {
        String idProveedorr = String.valueOf(this.getIdProveedor());
        idProveedorr = idProveedorr.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            
            String query = ("folioCompra as \"FOLIO COMPRA\", fechaReg as \"FECHA REG\", subTotal as \"SUBTOTAL\", iva as \"IVA\", total as \"TOTAL\", idAlmacen as \"ID ALMACÉN\", idProveedor as \"ID PROVEEDOR\", idEmpleado as \"ID EMPLEADO\", estatus as \"Estatus\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM compra where idProveedor LIKE ? ESCAPE '!'");            
            comando.setString(1, idProveedorr + "%");
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
    
    public DefaultTableModel consultarCompraPorIdEmpleado () {
        String idEmpleadoo = String.valueOf(this.idEmpleado);
        idEmpleadoo = idEmpleadoo.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            
            String query = ("folioCompra as \"FOLIO COMPRA\", fechaReg as \"FECHA REG\", subTotal as \"SUBTOTAL\", iva as \"IVA\", total as \"TOTAL\", idAlmacen as \"ID ALMACÉN\", idProveedor as \"ID PROVEEDOR\", idEmpleado as \"ID EMPLEADO\", estatus as \"Estatus\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM compra where idEmpleado LIKE ? ESCAPE '!'");            
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
    
    public void actualizarEstatus () {
        conexion.conexionSQL();
        PreparedStatement ps = null;
        try {
            ps = conexion.getConexion().prepareStatement("update compra set estatus=? where folioCompra=?");
            ps.setString(1, this.estatus);
            ps.setInt(2, this.folioCompra);
            ps.executeUpdate();
            conexion.desconectarSQL();
        }catch (Exception e) {
            System.out.println("error en conexion");
        }
    }
    
}
