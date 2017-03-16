
package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class VentaProducto {

    
    
    private int folioVenta;
    private int idProducto;
    private double precio;
    private double cantidad;
    private Conexion conexion;

    
    public VentaProducto (Conexion conexion) {
        folioVenta = -1;
        idProducto = 0;
        precio = 0;
        cantidad = 0;
        this.conexion = conexion;
    }
    
    
    public int getFolioVenta() {
        return folioVenta;
    }

    public void setFolioVenta(int folioVenta) {
        this.folioVenta = folioVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }

    
    public void registrarVentaProd () {
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
        comando = conexion.getConexion().prepareStatement("call ventaProd (?,?,?,?)");
        comando.setInt(1, this.folioVenta);
        comando.setInt(2, this.idProducto);
        comando.setDouble(3, this.precio);
        comando.setDouble(4, this.cantidad);
        int nfila = comando.executeUpdate();
        conexion.desconectarSQL();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error" + ex.getMessage());
        }    
    }

    
}
