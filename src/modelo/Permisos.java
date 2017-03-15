package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Permisos {
    
    private static int workload = 12; // for bcrypt
    
    private int idEmp;
    private String usuario;
    private String contrasena;
    private int proveedor;
    private int producto;
    private int notaCredito;
    private int empleado;
    private int devolucion;
    private int cliente;
    private int almacen;
    private int permisos;
    private int compra;
    private int venta;
    private int factura;
    private int pagos;
    private int traspasos;
    private int mezcla;
    private String contrasenaBcrypt;
    private Conexion conexion;
    
    public Permisos (Conexion conexion) {
    idEmp = 0;
    usuario = null;
    contrasena = null;
    proveedor = 0;
    producto = 0;
    notaCredito = 0;
    empleado = 0;
    devolucion = 0;
    cliente = 0;
    almacen = 0;
    permisos = 0;
    compra = 0;
    venta = 0;
    factura = 0;
    pagos = 0;
    traspasos = 0;
    mezcla = 0;
    this.conexion = conexion;
    }

    public String getContrasenaBcrypt() {
        return contrasenaBcrypt;
    }

    public void setContrasenaBcrypt(String contrasenaBcrypt) {
        String salt = BCrypt.gensalt(workload);
        String hashed_password = BCrypt.hashpw(contrasenaBcrypt, salt);
        this.contrasenaBcrypt = hashed_password;
    }
      
     public static String hashPassword(String password_plaintext) { 
        String salt = BCrypt.gensalt(workload);
        String hashed_password = BCrypt.hashpw(password_plaintext, salt);
        return(hashed_password);
    }
        
    public static boolean checkPassword(String password_plaintext, String stored_hash) {
        boolean password_verified = false;
        if(null == stored_hash || !stored_hash.startsWith("$2a$"))
                throw new java.lang.IllegalArgumentException("Invalid hash provided for comparison");
        password_verified = BCrypt.checkpw(password_plaintext, stored_hash);
        return(password_verified);
    }
    
    public void verificarPermisos() {
        try {
        String consulta = "SELECT IdEmpleado, proveedor, producto, notaCredito, empleado, devolucion, cliente, almacen, permisos, compra, venta, mezcla, factura, pagos, traspasos, contrasenaBcrypt FROM PERMISO WHERE IdEmpleado = ?";
        PreparedStatement ps = conexion.conexionSQL().prepareStatement(consulta);
        ps.setInt(1,this.idEmp);
        ResultSet rs = ps.executeQuery();
        //ResultSetMetaData rsm = rs.getMetaData();
        if(rs.next()){
            this.idEmp = rs.getInt(1);
            System.out.println("this.idEmp " +this.idEmp);
            this.proveedor = rs.getInt(2);
            System.out.println(this.proveedor);
            this.producto = rs.getInt(3);
            System.out.println(this.producto);
            this.notaCredito = rs.getInt(4);
            this.empleado = rs.getInt(5);
            this.devolucion = rs.getInt(6);
            this.cliente = rs.getInt(7);
            this.almacen = rs.getInt(8);
            this.permisos = rs.getInt(9);
            this.compra = rs.getInt(10);
            this.venta = rs.getInt(11);
            this.mezcla = rs.getInt(12);
            this.factura = rs.getInt(13);
            this.pagos = rs.getInt(14);
            this.traspasos = rs.getInt(15);
            this.factura = rs.getInt(16);
        } 
        }catch (SQLException e){ e.getMessage();
        }
        conexion.desconectarSQL();
        
        
    }
    
    public void registrarPermisos () {
        conexion.conexionSQL();
        PreparedStatement comand = null;
        try {
            comand = conexion.conexionSQL().prepareStatement("INSERT INTO PERMISOS (idEmpleado, usuario, password, "
                    + "proveedor, producto, notaCredito, empleado, devolucion, cliente, almacen, permisos , compra, "
                    + "venta, mezcla, factura) VALUES (?,?,md5(?), ?,?,?, ?,?,? ,?,?,? ,?,?,?)");
            comand.setInt(1, this.idEmp);
            comand.setString(2, this.usuario);
            comand.setString(3, this.contrasena);
            comand.setInt(4, this.proveedor);
            comand.setInt(5, this.producto);
            comand.setInt(6, this.notaCredito);
            comand.setInt(7, this.empleado);
            comand.setInt(8, this.devolucion);
            comand.setInt(9, this.cliente);
            comand.setInt(10, this.almacen);
            comand.setInt(11, this.permisos);
            comand.setInt(12, this.compra);
            comand.setInt(13, this.venta);
            comand.setInt(14, this.mezcla);
            comand.setInt(15, this.factura);
            comand.executeUpdate();
            conexion.desconectarSQL();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error en la clase");
        }
    }   

    public void actualizarPermisos () {
        conexion.conexionSQL();
        PreparedStatement comand = null;
        try {
            System.out.println();
            comand = conexion.conexionSQL().prepareStatement("UPDATE PERMISOS SET usuario=?, password=md5(?), proveedor=?, producto=?, notaCredito=?, "
                    + "empleado=?, devolucion=?, cliente=?, almacen=?, permisos=?, compra=?, venta=?, mezcla=?, factura=? WHERE idEmpleado=?");
            comand.setString(1, this.usuario);
            comand.setString(2, this.contrasena);
            comand.setInt(3, this.proveedor);
            comand.setInt(4, this.producto);
            comand.setInt(5, this.notaCredito);
            comand.setInt(6, this.empleado);
            comand.setInt(7, this.devolucion);
            comand.setInt(8, this.cliente);
            comand.setInt(9, this.almacen);
            comand.setInt(10, this.permisos);
            comand.setInt(11, this.compra);
            comand.setInt(12, this.venta);
            comand.setInt(13, this.mezcla);
            comand.setInt(14, this.factura);
            comand.setInt(15, this.idEmp);
            comand.executeUpdate();
            conexion.desconectarSQL();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
    
    public boolean existePermiso  (int idEmp)   {        
        boolean flag = false;
        conexion.conexionSQL();
        try {
            PreparedStatement ps = conexion.conexionSQL().prepareStatement("select idEmpleado from permisos where idEmpleado=?");
            ps.setInt(1, idEmp);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while(rs.next()){
               i++; 
            if (i>0){
                flag=true;
                break;
               }
            }             
        }catch (SQLException e) {
        }
        return flag;
    }
        
    public int [] consultarPermisos (int idEmp) {
        conexion.conexionSQL();
        int[] permiso = new int[12];
        int col = 1;
        //int col = 0;
        try {       
            PreparedStatement ps=conexion.getConexion().prepareStatement("SELECT PROVEEDOR, PRODUCTO, NOTACREDITO, EMPLEADO, DEVOLUCION, CLIENTE, ALMACEN, PERMISOS, COMPRA, VENTA, MEZCLA, factura FROM PERMISOS WHERE IDEMPLEADO=?");
            ps.setInt(1, idEmp);           
            ResultSet rs = ps.executeQuery();
            if(rs.first()){
                for(int index=0;index<12;index++){
                    permiso[index] = rs.getInt(col);
                    col++;
                }
            }
        } catch (SQLException e) {
            System.out.println("exception 1");
        }
        conexion.desconectarSQL();
        return permiso;
    }
    
    public boolean verificarDuplicado(){  
        boolean valor=false;
        try {
            PreparedStatement ps = conexion.conexionSQL().prepareStatement("select usuario from permisos where usuario=?");
            ps.setString(1, this.usuario);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while(rs.next()){
               i++; 
            if (i>0){
                valor=true;
                break;
               }
            } 
        } catch (SQLException e) {
        }
        return valor;
    }
    
    
    public int AccederSistema(String user, String pass) throws SQLException{
        String consulta = "exec verificar '"+user+"',"+pass;
        System.out.println("\nuser: " + user + "\npass" +pass);
        PreparedStatement ps = conexion.conexionSQL().prepareStatement(consulta);
        ResultSet rs = ps.executeQuery();
        if(rs.next() && rs.getString(1).equalsIgnoreCase(user)){
            return 1;
        }    
            return 0;
        /*if(rs.getString(1).equalsIgnoreCase(user)){
            return 0;
        }*/
        
        /*
        int valor=0;
        PreparedStatement ps = conexion.conexionSQL().prepareStatement(" select e.idempleado from empleado e join permisos p on e.idempleado = p.idempleado WHERE usuario=? AND password=md5(?)");
        ps.setString(1, user);
        ps.setString(2, String.valueOf(pass));
        ResultSet rs = ps.executeQuery();
        if(rs.first()){
            valor = rs.getInt(1);
        }
        return valor;
        */
    }
    
    public String obtenerUser (int idEmp) {
        conexion.conexionSQL();
        String userr=null;
        try {       
            PreparedStatement ps=conexion.getConexion().prepareStatement("SELECT usuario FROM permisos WHERE IDEMPLEADO=?");
            ps.setInt(1, idEmp);           
            ResultSet rs = ps.executeQuery();
            if(rs.first()){
                userr = rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println("exception 1");
        }
        conexion.desconectarSQL();
        return userr;
    }
    
    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }

    
    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public void setNotaCredito(int notaCredito) {
        this.notaCredito = notaCredito;
    }

    public void setEmpleado(int empleado) {
        this.empleado = empleado;
    }

    public void setDevolucion(int devolucion) {
        this.devolucion = devolucion;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public void setAlmacen(int almacen) {
        this.almacen = almacen;
    }

    public void setPermisos(int permisos) {
        this.permisos = permisos;
    }


    public void setCompra(int compra) {
        this.compra = compra;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }


    public int getIdEmp() {
        return idEmp;
    }

    public int getProveedor() {
        return proveedor;
    }

    public int getProducto() {
        return producto;
    }

    public int getNotaCredito() {
        return notaCredito;
    }

    public int getEmpleado() {
        return empleado;
    }

    public int getDevolucion() {
        return devolucion;
    }

    public int getCliente() {
        return cliente;
    }

    public int getAlmacen() {
        return almacen;
    }

    public int getPermisos() {
        return permisos;
    }

    public int getCompra() {
        return compra;
    }

    public int getVenta() {
        return venta;
    }

    public Conexion getConexion() {
        return conexion;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getMezcla() {
        return mezcla;
    }

    public void setMezcla(int mezcla) {
        this.mezcla = mezcla;
    }

    public int getPagos() {
        return pagos;
    }

    public void setPagos(int pagos) {
        this.pagos = pagos;
    }

    public int getTraspasos() {
        return traspasos;
    }

    public void setTraspasos(int traspasos) {
        this.traspasos = traspasos;
    }
    
    
        
    
    
}
