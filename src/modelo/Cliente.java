package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cliente extends Validacion {

    private int idCliente;
    private Date fechaReg;
    private String contrasena; 
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
    
    public Cliente (Conexion conexion) {
   
        idCliente = -1;
    fechaReg = null;
    contrasena= null;
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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
            comando = conexion.getConexion().prepareStatement("SELECT IDCLIENTE FROM CLIENTES");
            comando.executeQuery();
            ResultSet rs = comando.executeQuery();
            while(rs.next()){
                valor = rs.getInt(1);
            }
        } catch (SQLException e) {}
    valor++;
    return valor;
    }
    
    public void registrarCliente () {
        conexion.conexionSQL();
        PreparedStatement comand = null;
        try {
            comand = conexion.getConexion().prepareStatement("INSERT INTO CLIENTES (password, nombre,rfc,direccion,telefono,"
                    + "cp,municipio,estado,correo,contacto) VALUES (md5(?),?,?,?,?,?,?,?,?,?)");
            comand.setString(1,this.contrasena);
            comand.setString(2,this.nombre);
            comand.setString(3,this.rfc);
            comand.setString(4,this.direccion);
            comand.setString(5,this.telefono);
            comand.setString(6,this.cp);
            comand.setString(7,this.municipio);
            comand.setString(8,this.estado);
            comand.setString(9,this.correo);
            comand.setString(10,this.contacto);
            comand.executeUpdate();
            conexion.desconectarSQL();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    public DefaultTableModel consultarClientesTotales () {
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idCliente as \"ID CLIENTE\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCIÓN, telefono as TELÉFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO, password as PASS , fechaReg as \"FECHA REG\"");
            comando = conexion.getConexion().prepareStatement("select "+query+" from clientes");
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
            table.addColumn(rsm.getColumnLabel(12));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getString(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                fila.addElement(rs.getDate(12));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,ex);
        }
        conexion.desconectarSQL();        
        return table;
    }

    public DefaultTableModel consultarClienteId () {
        String id = String.valueOf(this.idCliente);
        id = id.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idCliente as \"ID CLIENTE\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCIÓN, telefono as TELÉFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO, password as PASS , fechaReg as \"FECHA REG\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM clientes WHERE idCliente LIKE ? ESCAPE '!'");
            comando.setString(1,id + "%");
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
            table.addColumn(rsm.getColumnLabel(12));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getString(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                fila.addElement(rs.getDate(12));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return table;
    }
    
    public DefaultTableModel consultarClienteNombre () {
        String nombree = this.nombre.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idCliente as \"ID CLIENTE\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCIÓN, telefono as TELÉFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO, password as PASS , fechaReg as \"FECHA REG\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM clientes WHERE nombre LIKE ? ESCAPE '!'");
            comando.setString(1,nombree + "%");
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
            table.addColumn(rsm.getColumnLabel(12));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getString(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                fila.addElement(rs.getDate(12));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return table;
    }
    
    public DefaultTableModel consultarClienteRfc () {
        String rfcc = this.rfc.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idCliente as \"ID CLIENTE\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCIÓN, telefono as TELÉFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO, password as PASS , fechaReg as \"FECHA REG\"");            
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM clientes WHERE rfc LIKE ? ESCAPE '!'");
            comando.setString(1,rfcc + "%");
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
            table.addColumn(rsm.getColumnLabel(12));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getString(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                fila.addElement(rs.getDate(12));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return table;
    }
    
    public DefaultTableModel consultarClienteDireccion () {
        String direccionn = this.direccion.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idCliente as \"ID CLIENTE\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCIÓN, telefono as TELÉFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO, password as PASS , fechaReg as \"FECHA REG\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM clientes WHERE direccion LIKE ? ESCAPE '!'");
            comando.setString(1,direccionn + "%");
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
            table.addColumn(rsm.getColumnLabel(12));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getString(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                fila.addElement(rs.getDate(12));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return table;
    }
    
    public DefaultTableModel consultarClienteTelefono () {
        String telefonoo = this.telefono.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idCliente as \"ID CLIENTE\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCIÓN, telefono as TELÉFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO, password as PASS , fechaReg as \"FECHA REG\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM clientes WHERE telefono LIKE ? ESCAPE '!'");
            comando.setString(1,telefonoo + "%");
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
            table.addColumn(rsm.getColumnLabel(12));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getString(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                fila.addElement(rs.getDate(12));
                table.addRow(fila);   
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return table;
    }
    
    public DefaultTableModel consultarClienteCp () {
        String cpp = this.cp.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idCliente as \"ID CLIENTE\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCIÓN, telefono as TELÉFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO, password as PASS , fechaReg as \"FECHA REG\"");            
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM clientes WHERE cp LIKE ? ESCAPE '!'");
            comando.setString(1,cpp + "%");
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
            table.addColumn(rsm.getColumnLabel(12));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getString(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                fila.addElement(rs.getDate(12));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return table;    
    }
    
    public DefaultTableModel consultarClienteMunicipio () {
        String municipioo = this.municipio.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idCliente as \"ID CLIENTE\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCIÓN, telefono as TELÉFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO, password as PASS , fechaReg as \"FECHA REG\"");            
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM clientes WHERE municipio LIKE ? ESCAPE '!'");
            comando.setString(1,municipioo + "%");
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
            table.addColumn(rsm.getColumnLabel(12));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getString(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                fila.addElement(rs.getDate(12));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();    
        return table;
    }
    
    public DefaultTableModel consultarClienteEstado () {
        String estadoo = this.estado.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idCliente as \"ID CLIENTE\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCIÓN, telefono as TELÉFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO, password as PASS , fechaReg as \"FECHA REG\"");            
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM clientes WHERE estado LIKE ? ESCAPE '!'");
            comando.setString(1,estadoo + "%");
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
            table.addColumn(rsm.getColumnLabel(12));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getString(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                fila.addElement(rs.getDate(12));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return table;    
    }
     
    public DefaultTableModel consultarClienteCorreo () {
        String correoo = this.correo.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idCliente as \"ID CLIENTE\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCIÓN, telefono as TELÉFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO, password as PASS , fechaReg as \"FECHA REG\"");            
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM clientes WHERE correo LIKE ? ESCAPE '!'");
            comando.setString(1,correoo + "%");
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
            table.addColumn(rsm.getColumnLabel(12));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getString(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                fila.addElement(rs.getDate(12));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return table;    
     }
     
    public DefaultTableModel consultarClienteContacto () {
        String contactoo = this.contacto.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel table = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idCliente as \"ID CLIENTE\", nombre as NOMBRE, rfc as RFC, direccion as DIRECCIÓN, telefono as TELÉFONO, cp as CP, municipio as MUNICIPIO, estado as ESTADO, correo as CORREO, contacto as CONTACTO, password as PASS , fechaReg as \"FECHA REG\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM clientes WHERE contacto LIKE ? ESCAPE '!'");
            comando.setString(1,contactoo + "%");
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
            table.addColumn(rsm.getColumnLabel(12));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getString(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                fila.addElement(rs.getDate(12));
                table.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return table;
    }
    
    public void modificarCliente () {
        conexion.conexionSQL();
        PreparedStatement ps = null;
        try {
            ps = conexion.getConexion().prepareStatement("update clientes set password=md5(?), nombre=?, "
                    + "rfc=?, direccion=?, telefono=?, cp=?, municipio=?, estado=?, correo=?, contacto=? where idCliente=?");
            ps.setString(1, this.contrasena);
            ps.setString(2, this.nombre);
            ps.setString(3, this.rfc);
            ps.setString(4, this.direccion);
            ps.setString(5, this.telefono);
            ps.setString(6, this.cp);
            ps.setString(7, this.municipio);
            ps.setString(8, this.estado);
            ps.setString(9, this.correo);
            ps.setString(10, this.contacto);
            ps.setInt(11, this.idCliente);
            ps.executeUpdate();
            conexion.desconectarSQL();
        }catch (Exception e) {
            System.out.println("error en conexion");
        }
    }
    
    public String CadenaAlfanumAleatoria (int longitud){
        
        String cadenaAleatoria = "";
        
        long milis = new java.util.GregorianCalendar().getTimeInMillis();
        
        Random r = new Random(milis);
        
        int i = 0;
        
        while ( i < longitud){
        
            char c = (char)r.nextInt(255);
        
            if ( (c >= '0' && c <='9') || (c >='A' && c <='Z') ){
        
                cadenaAleatoria += c;
        
                i ++;
        
            }
        
        }
        
        return cadenaAleatoria;
    
    }
    
    public boolean buscarCliente(int buscar) {
        
        boolean completado = false;
        conexion.conexionSQL();

        // Instrucción
        String query = "SELECT "
                + "idCliente AS 'ID', "
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
                + "FROM clientes "
                + "WHERE idCliente = " + buscar;

        try {
            PreparedStatement consulta = conexion.getConexion().prepareStatement(query);
            ResultSet rs = consulta.executeQuery();

            // Ciclo para llenar filas
            if (rs.first()) {
                idCliente = rs.getInt(1);
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
    
    public boolean buscarClienteN(String buscar) {
        boolean completado = false;
        conexion.conexionSQL();

        // Instrucción
       String query = "SELECT "
                + "idCliente AS 'ID', "
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
                + "FROM cliente "
                + "WHERE nombre LIKE '%" + buscar + "%'";

        try {
            PreparedStatement consulta = conexion.getConexion().prepareStatement(query);
            ResultSet rs = consulta.executeQuery();

            // Ciclo para llenar filas
            if (rs.first()) {
                idCliente = rs.getInt(1);
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