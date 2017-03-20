
package modelo;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;



public class Pago {
    private int folio;
    private int id;
    private Date fechaV;

    public Date getFechaV() {
        return fechaV;
    }

    public void setFechaV(Date fechaV) {
        this.fechaV = fechaV;
    }
    private String nombre;
    private double monto;
    private String estatus;
    
    private String Saldo;

    Conexion conexion;
    
    public Pago(int[] datos,int opcion){
        String query;
        conexion = new Conexion();
        PreparedStatement ps = null;
        switch(opcion){
            case 1: //Venta
                query = "exec consultaVenta "+datos[0]+","+datos[1]+"";
                try {
                    ps = conexion.conexionSQL().prepareStatement(query);
                    ResultSet rs = ps.executeQuery();
                    rs.next();

                    this.setFolio(rs.getInt(1));
                    this.setNombre(rs.getString(2));
                    this.setId(rs.getInt(3));
                    this.setFechaV(rs.getDate(4));
                    this.setMonto(rs.getDouble(5));
                    this.setEstatus(rs.getString(6));


                    //idProveedor, nombre, folioCompra, fechaReg, subTotal, estatus
                } catch (SQLException ex) {
                    Logger.getLogger(Pago.class.getName()).log(Level.SEVERE, null, ex);
                }
        
                conexion.desconectarSQL();
                break;
            case 2: //Compra
                query = "exec consultaCompra "+datos[0]+","+datos[1]+"";
                try {
                    ps = conexion.conexionSQL().prepareStatement(query);
                    ResultSet rs = ps.executeQuery();
                    rs.next();

                    this.setFolio(rs.getInt(1));
                    this.setNombre(rs.getString(2));
                    this.setId(rs.getInt(3));
                    this.setFechaV(rs.getDate(4));
                    this.setMonto(rs.getDouble(5));
                    this.setEstatus(rs.getString(6));


                    //idProveedor, nombre, folioCompra, fechaReg, subTotal, estatus
                } catch (SQLException ex) {
                    Logger.getLogger(Pago.class.getName()).log(Level.SEVERE, null, ex);
                }
        
                conexion.desconectarSQL();
                break;
                
        }
    }
    
    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getSaldo() {
        return Saldo;
    }

    public void setSaldo(String Saldo) {
        this.Saldo = Saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void llenarFormulario(JTextField txtFolio,JTextField txtFechaV,JTextField txtNombreC,JTextField txtMonto,JTextField txtIVA,JTextField txtTotal,JTextField txtEstatus,JTextField txtSaldo){
        BigDecimal subtotal, iva, total;
        subtotal = new BigDecimal(this.getMonto()).setScale(2);
        iva = new BigDecimal(this.getMonto()).multiply(BigDecimal.valueOf(0.16)).setScale(2);
        total = subtotal.add(iva);
       
        txtFolio.setText(String.valueOf(this.getFolio()));
        txtFechaV.setText(String.valueOf(this.getFechaV()));
        txtNombreC.setText(String.valueOf(this.getNombre()));
        txtMonto.setText("$ "+subtotal);
        txtIVA.setText("$ "+iva);
        txtTotal.setText("$ "+total);
        
        txtEstatus.setText(this.getEstatus());
        if(this.getSaldo()!="Pagado"){
            txtSaldo.setText(txtTotal.getText());
        }
    }
    
    
}
