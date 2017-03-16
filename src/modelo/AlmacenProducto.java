package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AlmacenProducto {
    
    private int idAlmacen;
    private int idProducto;
    private double cantidad;
    private Conexion conexion;
    
    public AlmacenProducto (Conexion conexion) {
        idAlmacen = -1;
        idProducto = 0;
        this.conexion = conexion;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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
    
    public void registarAltaProducto () {
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
        comando = conexion.getConexion().prepareStatement("exec altaProdAlmacen ?,?,? ");
        comando.setInt(1, this.idAlmacen);
        comando.setInt(2, this.idProducto);
        comando.setDouble(3, this.cantidad);
        int nfila = comando.executeUpdate();
        conexion.desconectarSQL();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error" + ex.getMessage());
        }   
    }
    
    public void registarSalidaProducto () {
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
        comando = conexion.getConexion().prepareStatement(" exec bajaProdAlmacen ?,?,?");
        comando.setInt(1, this.idAlmacen);
        comando.setInt(2, this.idProducto);
        comando.setDouble(3, this.cantidad);
        int nfila = comando.executeUpdate();
        conexion.desconectarSQL();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error" + ex.getMessage());
        }   
    }


}
