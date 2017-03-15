package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class SQLConnection {
    
    static private Connection conexion;
    static private String url;
    
    public static void main(String[] args) {
        String conexion = "jdbc:sqlserver://localhost\\MSSQLSERVER1;databaseName=agrarian;integratedSecurity=true";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(conexion);
            System.out.println("Exito");
        }catch(Exception e) {}
        
    }
    
    
    
    public SQLConnection(){
        url = "jdbc:sqlserver://localhost\\MSSQLSERVER1;databaseName=agrarian;integratedSecurity=true";  
    }
    
    public static Connection conexionSQL(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url);
            System.out.println("conexion = " + conexion);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conexion;
    }    
    
    public static void desconectarSQL () {
        try {
            conexion.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al desconectar");
        }
        
        
    } 
    
    public static Connection getConexion() {
        return conexion;
    }
    
}
