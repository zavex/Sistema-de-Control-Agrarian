
package modelo;

import com.toedter.calendar.JDateChooser;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



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
                query = "exec consultaVenta "+datos[0]+","+datos[1]+""; //Folio, idCliente
                try {
                    ps = conexion.conexionSQL().prepareStatement(query);
                    ResultSet rs = ps.executeQuery();
                    rs.next();

                    this.setId(rs.getInt(1));
                    this.setNombre(rs.getString(2));
                    this.setFolio(rs.getInt(3));
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

                   this.setId(rs.getInt(1));
                    this.setNombre(rs.getString(2));
                    this.setFolio(rs.getInt(3));
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
    
    public void llenarFormulario(JTextField txtFolio,JDateChooser txtFechaV,JTextField txtNombreC,JTextField txtMonto,JTextField txtIVA,JTextField txtTotal,JTextField txtEstatus,JTextField txtSaldo){
        BigDecimal subtotal, iva, total;
        subtotal = new BigDecimal(this.getMonto()).setScale(2);
        iva = new BigDecimal(this.getMonto()).multiply(BigDecimal.valueOf(0.16)).setScale(2);
        total = subtotal.add(iva);
       
        txtFolio.setText(String.valueOf(this.getFolio()));
        txtFechaV.setDate(this.getFechaV());
        txtNombreC.setText(String.valueOf(this.getNombre()));
        txtMonto.setText("$ "+subtotal);
        txtIVA.setText("$ "+iva);
        txtTotal.setText("$ "+total);
        
        txtEstatus.setText(this.getEstatus());
        if(this.getSaldo()!="Pagado"){
            txtSaldo.setText(txtTotal.getText());
        }
    }
    
    public boolean grabarPago(java.util.Date fP,BigDecimal pago,String bancoDestino){
        Date fechaP = Fecha_Java_A_SQL(fP);
        
        try {
            System.out.println(this.getId());
            System.out.println(this.getFolio());
            System.out.println(fechaP);
            System.out.println(pago);
            System.out.println(bancoDestino);
            
            String query = "exec registrarPagoVenta "+this.getId()+","+this.getFolio()+",'"+fechaP+"',"+pago+",'"+bancoDestino+"'";
            PreparedStatement ps = conexion.conexionSQL().prepareStatement(query);
            ps.executeUpdate();
            conexion.desconectarSQL();
            return true;
        } catch (Exception ex) {
            Logger.getLogger(Pago.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean grabarPago(java.util.Date fP,BigDecimal pago,String bancoOrigen,String bancoDestino){
        Date fechaP = Fecha_Java_A_SQL(fP);
        
        try {
            System.out.println(this.getId());
            System.out.println(this.getFolio());
            System.out.println(fechaP);
            System.out.println(pago);
            System.out.println(bancoDestino);
            
            String query = "exec registrarPagoCompra "+this.getId()+","+this.getFolio()+",'"+fechaP+"',"+pago+",'"+bancoOrigen+"','"+bancoDestino+"'";
            PreparedStatement ps = conexion.conexionSQL().prepareStatement(query);
            ps.executeUpdate();
            conexion.desconectarSQL();
            return true;
        } catch (Exception ex) {
            Logger.getLogger(Pago.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public DefaultTableModel cargarHistorial(int opcion){
        DefaultTableModel tabla;
        String query= null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ResultSetMetaData rms = null;
        System.out.println(this.getFolio());
        try {
            switch(opcion){
                case 1:
                    tabla = new DefaultTableModel(){
                        Class[] tipoColumn = {Integer.class,String.class,String.class,Date.class,String.class};
                        boolean[] editColumn = {false,false,false,false,false};
                        @Override
                        public Class getColumnClass(int indColumn){
                            return tipoColumn[indColumn];
                        }
                        @Override
                        public boolean isCellEditable(int indFila, int indColum){
                            return editColumn[indColum];
                        }
                    };
                
                    query = "exec mostrarAbonosCliente "+this.getFolio()+"";
                    ps = conexion.conexionSQL().prepareStatement(query);
                    rs = ps.executeQuery();
                    rms = rs.getMetaData();
                    tabla.addColumn(rms.getColumnName(1));
                    tabla.addColumn(rms.getColumnName(2));
                    tabla.addColumn(rms.getColumnName(3));
                    tabla.addColumn(rms.getColumnName(4));
                    tabla.addColumn(rms.getColumnName(5));
                    while(rs.next()){
                        //pp.idPagoP, e.nombre, pp.monto, pp.fecha, pp.bancoDest
                        Vector filas = new Vector();
                        filas.addElement(rs.getInt(1));
                        filas.addElement(rs.getString(2));
                        filas.addElement("$ "+rs.getDouble(3));
                        filas.addElement(rs.getDate(4));
                        filas.addElement(rs.getString(5));
                        tabla.addRow(filas);
                    }
                return tabla;
                case 2:
                    tabla = new DefaultTableModel(){
                        Class[] tipoColumn = {Integer.class,String.class,String.class,Date.class,String.class,String.class};
                        boolean[] editColumn = {false,false,false,false,false,false};
                        @Override
                        public Class getColumnClass(int indColumn){
                            return tipoColumn[indColumn];
                        }
                        @Override
                        public boolean isCellEditable(int indFila, int indColum){
                            return editColumn[indColum];
                        }
                    };
                    query = "exec mostrarAbonoProveedor "+this.getFolio()+"";
                    ps = conexion.conexionSQL().prepareStatement(query);
                    rs = ps.executeQuery();
                    rms = rs.getMetaData();
                    tabla.addColumn(rms.getColumnName(1));
                    tabla.addColumn(rms.getColumnName(2));
                    tabla.addColumn(rms.getColumnName(3));
                    tabla.addColumn(rms.getColumnName(4));
                    tabla.addColumn(rms.getColumnName(5));
                    tabla.addColumn(rms.getColumnName(6));
                    while(rs.next()){
                        //pp.idPagoP, e.nombre, pp.monto, pp.fecha, pp.bancoOrigen,pp.bancoDest
                        Vector filas = new Vector();
                        filas.addElement(rs.getInt(1));
                        filas.addElement(rs.getString(2));
                        filas.addElement("$ "+rs.getDouble(3));
                        filas.addElement(rs.getDate(4));
                        filas.addElement(rs.getString(5));
                        filas.addElement(rs.getString(6));
                        tabla.addRow(filas);
                    }
                return tabla;
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Pago.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public java.sql.Date Fecha_Java_A_SQL(java.util.Date date) {
            return new java.sql.Date(date.getTime());
    }

    
}
