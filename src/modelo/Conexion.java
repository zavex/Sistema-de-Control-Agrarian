package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    private Connection conexion;
    private String url;
    private String usuario;
    private String clave;
    
    public Conexion(){

    //url = "jdbc:sqlserver://localhost; databaseName=agrarian; integratedSecurity=true;";  
    this.url = "jdbc:sqlserver://localhost\\MSSQLSERVER1;databaseName=agrarian;integratedSecurity=true";
    this.usuario = "root";
    this.clave = "";
    }

    public Connection getConexion() {
        return conexion;
    }
    
    public Connection conexionSQL(){
        try {
            this.conexion = DriverManager.getConnection(url);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error:" + ex.getMessage());
        }
        return conexion;
        
        
        /*
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url,usuario,clave);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"No se encontro el driver");
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Error al conectar la base de datos");
        } 
        return conexion;*/
    }
        
     public void conexionSQL (String url, String usuario, String clave) {
        try {
        Class.forName("com.mysql.jdbc.Driver");
        conexion=DriverManager.getConnection(url,usuario,clave);
        }catch(ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"No se encontro el driver");
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al conectar la base de datos");
        }   
    }
    public void desconectarSQL () {
        try {
            conexion.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al desconectar");
        }
    }    

}