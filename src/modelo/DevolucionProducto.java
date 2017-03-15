package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DevolucionProducto {


    private int folioDev ;
    private int idProducto;
    private double precio;
    private double cantidad;
    private Conexion conexion;
    
    public DevolucionProducto (Conexion conexion) {
        folioDev = -1;
        idProducto = 0;
        precio = 0.00;
        cantidad = 0.00;
        this.conexion = conexion;

}
    

    public int getFolioDev() {
        return folioDev;
    }

    public void setFolioDev(int folioDev) {
        this.folioDev = folioDev;
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
    
    public void registrarDevolucionProd () {
        conexion.conexionSQL();
        PreparedStatement comand = null;
        try {
            comand = conexion.getConexion().prepareStatement("insert into devolucion_producto (folioDev, idProducto , precio , cantidad) "
                    + "VALUES (?,?,?,?)");
            comand.setInt(1,this.folioDev);
            comand.setInt(2,this.idProducto);
            comand.setDouble(3,this.precio);
            comand.setDouble(4,this.cantidad);
            comand.executeUpdate();
            conexion.desconectarSQL();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    
}
