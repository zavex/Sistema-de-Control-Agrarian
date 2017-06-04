package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 * Esta clase se encarga de gestinar los traspasos entre almacenes
 * @author Iván Iñiguez
 */
public class Traspaso {
    private int idAlmOri;
    private int idAlmDest;
    private String nombreAlmOr;
    private String nombreAlmDest;
    private Date fechaRegistro;
    private double cantidad;
    private Conexion con;
    
    public Traspaso(Conexion con){
        this.setCon(con);
    }

    public int getIdAlmOri() {
        return idAlmOri;
    }

    public void setIdAlmOri(int idAlmOri) {
        this.idAlmOri = idAlmOri;
    }

    public int getIdAlmDest() {
        return idAlmDest;
    }

    public void setIdAlmDest(int idAlmDest) {
        this.idAlmDest = idAlmDest;
    }

    public String getNombreAlmOr() {
        return nombreAlmOr;
    }

    public void setNombreAlmOr(String nombreAlmOr) {
        this.nombreAlmOr = nombreAlmOr;
    }

    public String getNombreAlmDest() {
        return nombreAlmDest;
    }

    public void setNombreAlmDest(String nombreAlmDest) {
        this.nombreAlmDest = nombreAlmDest;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Conexion getCon() {
        return con;
    }

    public void setCon(Conexion con) {
        this.con = con;
    }
    
    /**
     * Genera la tabla de traspasos de almacen
     * @param opcion Recibe el modificador del query para desplegar la información deseada.
     * @param filtro Determina si se quiere realizar una consulta personalizada.
     * @return Retorna un DefaultTableModel
     */
    public DefaultTableModel tabla(String opcion,boolean filtro){

        DefaultTableModel tabla = new DefaultTableModel(){
            Class[] tipoColumn = {Integer.class,String.class,String.class,String.class,Double.class,Date.class};
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

        String query = "Select t.folio ID, a.nombreA Origen,t.destino Destino,p.nombre Producto,t.cantidad Cantidad,t.fechaReg Fecha from traspaso t\n" +
                "join almacen a\n" +
                "on t.idAlmacen = a.idAlmacen\n" +
                "join producto p\n" +
                "on t.idProducto = p.idProducto";
        if(filtro){
            query = query+"\n"+opcion;
        }
        System.out.println(query);
        try {
            PreparedStatement ps = con.conexionSQL().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            
            //Origen,Destino,Producto,Cantidad,Fecha
            tabla.addColumn(rsm.getColumnName(1));
            tabla.addColumn(rsm.getColumnName(2));
            tabla.addColumn(rsm.getColumnName(3));
            tabla.addColumn(rsm.getColumnName(4));
            tabla.addColumn(rsm.getColumnName(5));
            tabla.addColumn(rsm.getColumnName(6));
            while(rs.next()){
                Vector fila = new Vector();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getString(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getDouble(5));
                fila.addElement(rs.getDate(6));
                tabla.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Traspaso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabla;
    }
    
    
}
