package modelo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Producto {
    
    private int idProducto;
    private Date fechaReg;
    private String nombre;
    private String descripcion;
    private String medida;
    private String presentacion;
    private double precioSugerido;
    private Conexion conexion;
    
    public Producto (Conexion conexion) {
    idProducto = -1;
    fechaReg = null;
    nombre = null;
    descripcion = null;
    medida = null;
    presentacion = null;
    precioSugerido = 0;
    this.conexion = conexion;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public double getPrecioSugerido() {
        return precioSugerido;
    }

    public void setPrecioSugerido(double precioSugerido) {
        this.precioSugerido = precioSugerido;
    }

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }
 
    public int obtenerNoId(){
        int valor=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            comando = conexion.getConexion().prepareStatement("SELECT idProducto FROM productos");
            comando.executeQuery();
            ResultSet rs = comando.executeQuery();
            while(rs.next()){
                valor = rs.getInt(1);
            }
        } catch (SQLException e) {}
        valor++;
        return valor;
    }

    public void registrarProducto() {
        conexion.conexionSQL();
        PreparedStatement comand = null;
        try {
            comand = conexion.getConexion().prepareStatement("call insertProducto(?,?,?,?,?)");
            comand.setString(1, this.nombre);
            comand.setString(2, this.descripcion);
            comand.setString(3, this.medida);
            comand.setString(4, this.presentacion);
            comand.setDouble(5, this.precioSugerido);
            comand.executeUpdate();
            conexion.desconectarSQL();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    public DefaultTableModel consultarProductoTotales () {
        DefaultTableModel ProvTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idProducto as \"ID PRODUCTO\", fechaReg as \"FECHA REG\", nombre as \"NOMBRE\", descripcion as \"DESCRIPCIÓN\", medida as \"MEDIDA\", presentacion as PRESENTACIÓN, precioSugerido as \"PRECIO SUGERIDO\"");
            comando = conexion.getConexion().prepareStatement("select "+query+" from productos");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            ProvTable.addColumn(rsm.getColumnLabel(1));
            ProvTable.addColumn(rsm.getColumnLabel(2));
            ProvTable.addColumn(rsm.getColumnLabel(3));
            ProvTable.addColumn(rsm.getColumnLabel(4));
            ProvTable.addColumn(rsm.getColumnLabel(5));
            ProvTable.addColumn(rsm.getColumnLabel(6));
            ProvTable.addColumn(rsm.getColumnLabel(7));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                ProvTable.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return ProvTable;
    }
    
    public DefaultTableModel consultarProductoId () {
        String id = String.valueOf(this.idProducto);
        id = id.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
       try {
            String query = ("idProducto as \"ID PRODUCTO\", fechaReg as \"FECHA REG\", nombre as \"NOMBRE\", descripcion as \"DESCRIPCIÓN\", medida as \"MEDIDA\", presentacion as PRESENTACIÓN, precioSugerido as \"PRECIO SUGERIDO\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM productos WHERE idProducto LIKE ? ESCAPE '!'");
            comando.setString(1,id + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            
            while (rs.next()) {
                
                Vector fila = new Vector ();
                
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return empTable;        
    }
    
    public DefaultTableModel consultarProductoNombre () {
        String nombree = this.nombre.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idProducto as \"ID PRODUCTO\", fechaReg as \"FECHA REG\", nombre as \"NOMBRE\", descripcion as \"DESCRIPCIÓN\", medida as \"MEDIDA\", presentacion as PRESENTACIÓN, precioSugerido as \"PRECIO SUGERIDO\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM productos WHERE nombre LIKE ? ESCAPE '!'");
            comando.setString(1,nombree + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return empTable;    
    }
    
    public DefaultTableModel consultarProductoDescripcion () {
        String descripcionn = this.descripcion.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idProducto as \"ID PRODUCTO\", fechaReg as \"FECHA REG\", nombre as \"NOMBRE\", descripcion as \"DESCRIPCIÓN\", medida as \"MEDIDA\", presentacion as PRESENTACIÓN, precioSugerido as \"PRECIO SUGERIDO\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM productos WHERE descripcion LIKE ? ESCAPE '!'");            
            comando.setString(1,descripcionn + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return empTable;
    }
    
    public DefaultTableModel consultarProductoMedida () {
        String medidaa = this.medida.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idProducto as \"ID PRODUCTO\", fechaReg as \"FECHA REG\", nombre as \"NOMBRE\", descripcion as \"DESCRIPCIÓN\", medida as \"MEDIDA\", presentacion as PRESENTACIÓN, precioSugerido as \"PRECIO SUGERIDO\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM productos WHERE medida LIKE ? ESCAPE '!'");
            comando.setString(1, medidaa + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return empTable;
    }
    
    public DefaultTableModel consultarProductoPresentacion () {
        String presentacionn = this.presentacion.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idProducto as \"ID PRODUCTO\", fechaReg as \"FECHA REG\", nombre as \"NOMBRE\", descripcion as \"DESCRIPCIÓN\", medida as \"MEDIDA\", presentacion as PRESENTACIÓN, precioSugerido as \"PRECIO SUGERIDO\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM productos WHERE presentacion LIKE ? ESCAPE '!'");
            comando.setString(1, presentacionn + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return empTable;
    }
    
    public DefaultTableModel consultarProductoPrecio () {
        double precioo = this.precioSugerido;
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idProducto as \"ID PRODUCTO\", fechaReg as \"FECHA REG\", nombre as \"NOMBRE\", descripcion as \"DESCRIPCIÓN\", medida as \"MEDIDA\", presentacion as PRESENTACIÓN, precioSugerido as \"PRECIO SUGERIDO\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM productos WHERE precioSugerido LIKE ? ESCAPE '!'");
            comando.setString(1, precioo + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return empTable;
    }
     
    public void modificarProducto () {
        conexion.conexionSQL();
        PreparedStatement ps = null;
        try {
            ps = conexion.getConexion().prepareStatement("update productos set nombre=?, descripcion=?, medida=?, presentacion=?, precioSugerido=? where idProducto=?");
            ps.setString(1, this.nombre);
            ps.setString(2, this.descripcion);
            ps.setString(3, this.medida);
            ps.setString(4, this.presentacion);
            ps.setDouble(5, this.precioSugerido);
            ps.setInt(6, this.idProducto);
            System.out.println(this.idProducto);
            ps.executeUpdate();
            conexion.desconectarSQL();
        }catch (Exception e) {
            System.out.println("error en conexion");
        }
    }
    
    public boolean buscarProdcuto(int buscar) {
        
        boolean completado = false;
        conexion.conexionSQL();

        // Instrucción
        String query = "SELECT "
                + "idProducto AS 'ID', "
                + "fechaReg AS 'Fecha de registro', "
                + "nombre AS 'Nombre', "
                + "descripcion AS 'Descripción', "
                + "medida AS 'Medida', "
                + "presentacion AS 'Presentación', "
                + "precioSugerido AS 'Precio' "
                + "FROM producto "
                + "WHERE idproducto = " + buscar;

        try {
            PreparedStatement consulta = conexion.getConexion().prepareStatement(query);
            ResultSet rs = consulta.executeQuery();

            // Ciclo para llenar filas
            if (rs.first()) {
                idProducto = rs.getInt(1);
                fechaReg = rs.getDate(2);
                nombre = rs.getString(3);
                descripcion = rs.getString(4);
                medida = rs.getString(5);
                presentacion = rs.getString(6);
                precioSugerido = rs.getDouble(7);
                
                completado = true;
            } else {
               
                JOptionPane.showMessageDialog(null, "No se encontraron registros con esos datos", "Error de busqueda", JOptionPane.WARNING_MESSAGE);
            
            }
        
        } catch (SQLException ex) {
        
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error de busqueda", JOptionPane.ERROR_MESSAGE);
        
        }

        conexion.desconectarSQL();
        return completado;

    }
    
    public boolean buscarProductoN(String buscar) {
        boolean completado = false;
        conexion.conexionSQL();

        // Instrucción
       String query = "SELECT "
                + "idProducto AS 'ID', "
                + "fechaReg AS 'Fecha de registro', "
                + "nombre AS 'Nombre', "
                + "descripcion AS 'Descripción', "
                + "medida AS 'Medida', "
                + "presentacion AS 'Presentación', "
                + "precioSugerido AS 'Precio' "
                + "FROM producto "
                + "WHERE nombre LIKE '%" + buscar + "%'";

        try {
            PreparedStatement consulta = conexion.getConexion().prepareStatement(query);
            ResultSet rs = consulta.executeQuery();

            // Ciclo para llenar filas
           if (rs.first()) {
                idProducto = rs.getInt(1);
                fechaReg = rs.getDate(2);
                nombre = rs.getString(3);
                descripcion = rs.getString(4);
                medida = rs.getString(5);
                presentacion = rs.getString(6);
                precioSugerido = rs.getDouble(7);
                
                completado = true;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron registros con esos datos", "Error de busqueda", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error de busqueda", JOptionPane.ERROR_MESSAGE);
        }

        conexion.desconectarSQL();
        return completado;
    }
    
}
