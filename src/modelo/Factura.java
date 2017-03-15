package modelo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Factura {
    
    private int folioFactura;
    private int folioVenta;
    private Date fechaReg;
    private double subtotal;
    private double iva;
    private double total;
    private String estatus;
    private Conexion conexion;
    
    public Factura (Conexion conexion){
        folioFactura = -1;
        folioVenta = 0;
        fechaReg = null;
        subtotal = 0;
        iva = 0;
        total = 0;
        estatus = null;
        this.conexion = conexion;
    }

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }
    
    
    public int getFolioFactura() {
        return folioFactura;
    }

    public void setFolioFactura(int folioFactura) {
        this.folioFactura = folioFactura;
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
    
    public void generarFactura () {
        PreparedStatement comand = null;
        try {
            comand = conexion.conexionSQL().prepareStatement("INSERT INTO factura (folioVenta, subtotal, iva, total, estatus)"
                    + " VALUES (?,?,?,?,?)");
            comand.setInt(1,this.folioVenta);
            comand.setDouble(2,this.subtotal);
            comand.setDouble(3,this.iva);
            comand.setDouble(4,this.total);
            comand.setString(5,this.estatus);
            comand.executeUpdate();
            conexion.desconectarSQL();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
    
    public void actualizarEstatusFac () {
        conexion.conexionSQL();
        PreparedStatement ps = null;
        try {
            ps = conexion.getConexion().prepareStatement("update factura set estatus=? where folioFactura=?");
            ps.setString(1, this.estatus);
            ps.setInt(2, this.folioFactura);
            ps.executeUpdate();
            conexion.desconectarSQL();
        }catch (Exception e) {
            System.out.println("error en conexion");
        }
    }
        
}
