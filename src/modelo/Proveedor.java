package modelo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Proveedor extends Validacion {
    private int idProveedor;
    private Date fechaReg;
    private String nombre;
    private String rfc;
    private String direccion;
    private String telefono;
    private String cp;
    private String municipio;
    private String estado;
    private String correo;
    private String contacto;
    private Conexion conexion;
    
    public Proveedor (Conexion conexion) {
    idProveedor = -1;
    fechaReg = null;
    nombre = null;
    rfc = null;
    direccion = null;
    telefono = null;
    cp = null;
    municipio = null;
    estado = null;
    correo = null;
    contacto = null;
    this.conexion = conexion;    
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
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
            comando = conexion.getConexion().prepareStatement("SELECT idProveedor FROM proveedor");
            comando.executeQuery();
            ResultSet rs = comando.executeQuery();
        
            while(rs.next()){
                valor = rs.getInt(1);
            }
        
        } catch (SQLException e) {}
    
        valor++;
    
        return valor;
    
    }

    
    public void registrarProveedor() {
        conexion.conexionSQL();
        PreparedStatement comand = null;
        try {
            comand = conexion.getConexion().prepareStatement(" exec ingresa_proveedor ?,?,?,?,?,?,?,?,?,?");
            comand.setInt(1, this.idProveedor);
            comand.setString(2, this.nombre);
            comand.setString(3, this.rfc);
            comand.setString(4, this.direccion);
            comand.setString(5, this.telefono);
            comand.setString(6, this.cp);
            comand.setString(7, this.municipio);
            comand.setString(8, this.estado);
            comand.setString(9, this.correo);
            comand.setString(10, this.contacto);
            comand.executeUpdate();
            conexion.desconectarSQL();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    public DefaultTableModel consultarProveedoresTotales () {
        DefaultTableModel ProvTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idProveedor as \"ID PROV\", fechaReg as \"FECHA REG\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCION, telefono as TELEFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO");
            comando = conexion.getConexion().prepareStatement("select "+query+" from proveedor");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            ProvTable.addColumn(rsm.getColumnLabel(1));
            ProvTable.addColumn(rsm.getColumnLabel(2));
            ProvTable.addColumn(rsm.getColumnLabel(3));
            ProvTable.addColumn(rsm.getColumnLabel(4));
            ProvTable.addColumn(rsm.getColumnLabel(5));
            ProvTable.addColumn(rsm.getColumnLabel(6));
            ProvTable.addColumn(rsm.getColumnLabel(7));
            ProvTable.addColumn(rsm.getColumnLabel(8));
            ProvTable.addColumn(rsm.getColumnLabel(9));
            ProvTable.addColumn(rsm.getColumnLabel(10));
            ProvTable.addColumn(rsm.getColumnLabel(11));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                ProvTable.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return ProvTable;        
    }
    
    public DefaultTableModel consultarProveedorId () {
        String id = String.valueOf(this.idProveedor);
        id = id.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idProveedor as \"ID PROV\", fechaReg as \"FECHA REG\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCION, telefono as TELEFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM proveedor WHERE idProveedor LIKE ? ESCAPE '!'");
            comando.setString(1,id + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            empTable.addColumn(rsm.getColumnLabel(8));
            empTable.addColumn(rsm.getColumnLabel(9));
            empTable.addColumn(rsm.getColumnLabel(10));
            empTable.addColumn(rsm.getColumnLabel(11));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                empTable.addRow(fila);   
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return empTable;
    }
    
    public DefaultTableModel consultarProveedorNombre () {
        String nombree = this.nombre.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idProveedor as \"ID PROV\", fechaReg as \"FECHA REG\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCION, telefono as TELEFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM proveedor WHERE nombre LIKE ? ESCAPE '!'");
            comando.setString(1,nombree + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            empTable.addColumn(rsm.getColumnLabel(8));
            empTable.addColumn(rsm.getColumnLabel(9));
            empTable.addColumn(rsm.getColumnLabel(10));
            empTable.addColumn(rsm.getColumnLabel(11));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return empTable;
    }
    
    public DefaultTableModel consultarProveedorRfc () {
        String rfcc = this.rfc.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idProveedor as \"ID PROV\", fechaReg as \"FECHA REG\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCION, telefono as TELEFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM proveedor WHERE rfc LIKE ? ESCAPE '!'");
            comando.setString(1,rfcc + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            empTable.addColumn(rsm.getColumnLabel(8));
            empTable.addColumn(rsm.getColumnLabel(9));
            empTable.addColumn(rsm.getColumnLabel(10));
            empTable.addColumn(rsm.getColumnLabel(11));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return empTable;
    }
    
    public DefaultTableModel consultarProveedorDireccion () {
        String direccionn = this.direccion.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idProveedor as \"ID PROV\", fechaReg as \"FECHA REG\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCION, telefono as TELEFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM proveedor WHERE direccion LIKE ? ESCAPE '!'");
            comando.setString(1,direccionn + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            empTable.addColumn(rsm.getColumnLabel(8));
            empTable.addColumn(rsm.getColumnLabel(9));
            empTable.addColumn(rsm.getColumnLabel(10));
            empTable.addColumn(rsm.getColumnLabel(11));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                empTable.addRow(fila);   
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return empTable;
    }
    
    public DefaultTableModel consultarProveedorTelefono () {
        String telefonoo = this.telefono.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idProveedor as \"ID PROV\", fechaReg as \"FECHA REG\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCION, telefono as TELEFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM proveedor WHERE telefono LIKE ? ESCAPE '!'");
            comando.setString(1,telefonoo + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            empTable.addColumn(rsm.getColumnLabel(8));
            empTable.addColumn(rsm.getColumnLabel(9));
            empTable.addColumn(rsm.getColumnLabel(10));
            empTable.addColumn(rsm.getColumnLabel(11));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                empTable.addRow(fila);   
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return empTable;    
    }
    
    public DefaultTableModel consultarProveedorCp () {
        String cpp = this.cp.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idProveedor as \"ID PROV\", fechaReg as \"FECHA REG\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCION, telefono as TELEFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM proveedor WHERE cp LIKE ? ESCAPE '!'");
            comando.setString(1,cpp + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            empTable.addColumn(rsm.getColumnLabel(8));
            empTable.addColumn(rsm.getColumnLabel(9));
            empTable.addColumn(rsm.getColumnLabel(10));
            empTable.addColumn(rsm.getColumnLabel(11));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return empTable;    
    }
    
    public DefaultTableModel consultarProveedorMunicipio () {
        String municipioo = this.municipio.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idProveedor as \"ID PROV\", fechaReg as \"FECHA REG\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCION, telefono as TELEFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM proveedor WHERE municipio LIKE ? ESCAPE '!'");
            comando.setString(1,municipioo + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            empTable.addColumn(rsm.getColumnLabel(8));
            empTable.addColumn(rsm.getColumnLabel(9));
            empTable.addColumn(rsm.getColumnLabel(10));
            empTable.addColumn(rsm.getColumnLabel(11));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return empTable;    
    }
    
    public DefaultTableModel consultarProveedorEstado () {
        String estadoo = this.estado.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idProveedor as \"ID PROV\", fechaReg as \"FECHA REG\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCION, telefono as TELEFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM proveedor WHERE estado LIKE ? ESCAPE '!'");
            comando.setString(1,estadoo + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            empTable.addColumn(rsm.getColumnLabel(8));
            empTable.addColumn(rsm.getColumnLabel(9));
            empTable.addColumn(rsm.getColumnLabel(10));
            empTable.addColumn(rsm.getColumnLabel(11));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return empTable;    
    }
     
     public DefaultTableModel consultarProveedorCorreo () {
        String correoo = this.correo.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idProveedor as \"ID PROV\", fechaReg as \"FECHA REG\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCION, telefono as TELEFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM proveedor WHERE correo LIKE ? ESCAPE '!'");
            comando.setString(1,correoo + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            empTable.addColumn(rsm.getColumnLabel(8));
            empTable.addColumn(rsm.getColumnLabel(9));
            empTable.addColumn(rsm.getColumnLabel(10));
            empTable.addColumn(rsm.getColumnLabel(11));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return empTable;    
    }
     
     public DefaultTableModel consultarProveedorContacto () {
        String contactoo = this.contacto.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");   
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idProveedor as \"ID PROV\", fechaReg as \"FECHA REG\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCION, telefono as TELEFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM proveedor WHERE contacto LIKE ? ESCAPE '!'");
            comando.setString(1,contactoo + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            empTable.addColumn(rsm.getColumnLabel(8));
            empTable.addColumn(rsm.getColumnLabel(9));
            empTable.addColumn(rsm.getColumnLabel(10));
            empTable.addColumn(rsm.getColumnLabel(11));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return empTable;
    }
     
    public void modificarProveedor () {
        conexion.conexionSQL();
        PreparedStatement ps = null;
        try {
            ps = conexion.getConexion().prepareStatement(" exec ingresa_proveedor ?,?,?,?,?,?,?,?,?,?");
            ps.setInt(1, this.idProveedor);
            ps.setString(2, this.nombre);
            ps.setString(3, this.rfc);
            ps.setString(4, this.direccion);
            ps.setString(5, this.telefono);
            ps.setString(6, this.cp);
            ps.setString(7, this.municipio);
            ps.setString(8, this.estado);
            ps.setString(9, this.correo);
            ps.setString(10, this.contacto);
            ps.executeUpdate();
            conexion.desconectarSQL();
        }catch (Exception e) {
            System.out.println("error en conexion");
        }
    }
    
    public boolean buscarProveedor(int buscar) {
        
        boolean completado = false;
        conexion.conexionSQL();

        // Instrucción
        String query = "SELECT "
                + "idProveedor AS 'ID', "
                + "fechaReg AS 'Fecha de registro', "
                + "nombre AS 'Nombre', "
                + "rfc AS 'RFC', "
                + "direccion AS 'Dirección', "
                + "telefono AS 'Telefono', "
                + "cp AS 'Cp', "
                + "municipio AS 'Municipio', "
                + "estado AS 'Estado', "
                + "correo AS 'Correo electronico', "
                + "contacto  'Contacto' "
                + "FROM proveedor "
                + "WHERE idproveedor = " + buscar;

        try {
            PreparedStatement consulta = conexion.getConexion().prepareStatement(query);
            ResultSet rs = consulta.executeQuery();

            // Ciclo para llenar filas
            if (rs.first()) {
                idProveedor = rs.getInt(1);
                fechaReg = rs.getDate(2);
                nombre = rs.getString(3);
                rfc = rs.getString(4);
                direccion = rs.getString(5);
                telefono = rs.getString(6);
                cp = rs.getString(7);
                municipio = rs.getString(8);
                estado = rs.getString(9);
                correo = rs.getString(10);
                contacto = rs.getString(11);
                completado = true;
            } else {
               
                JOptionPane.showMessageDialog(null, "No se encontraron registros con esos datos", "Error de busqueda", JOptionPane.WARNING_MESSAGE);
            
            }
        
        } catch (SQLException ex) {
        
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error de busqueda", JOptionPane.ERROR_MESSAGE);
        
        }

        conexion.desconectarSQL();
        return completado;

    }
    
    public boolean buscarProveedorN(String buscar) {
        boolean completado = false;
        conexion.conexionSQL();

        // Instrucción
       String query = "SELECT "
                + "idProveedor AS 'ID', "
                + "fechaReg AS 'Fecha de registro', "
                + "nombre AS 'Nombre', "
                + "rfc AS 'RFC', "
                + "direccion AS 'Dirección', "
                + "telefono AS 'Telefono', "
                + "cp AS 'Cp', "
                + "municipio AS 'Municipio', "
                + "estado AS 'Estado', "
                + "correo AS 'Correo electronico', "
                + "contacto  'Contacto' "
                + "FROM proveedor "
                + "WHERE nombre LIKE '%" + buscar + "%'";

        try {
            PreparedStatement consulta = conexion.getConexion().prepareStatement(query);
            ResultSet rs = consulta.executeQuery();

            // Ciclo para llenar filas
            if (rs.first()) {
                idProveedor = rs.getInt(1);
                fechaReg = rs.getDate(2);
                nombre = rs.getString(3);
                rfc = rs.getString(4);
                direccion = rs.getString(5);
                telefono = rs.getString(6);
                cp = rs.getString(7);
                municipio = rs.getString(8);
                estado = rs.getString(9);
                correo = rs.getString(10);
                contacto = rs.getString(11);
                completado = true;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron registros con esos datos", "Error de busqueda", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error de busqueda", JOptionPane.ERROR_MESSAGE);
        }

        conexion.desconectarSQL();
        return completado;
    }
    
}
