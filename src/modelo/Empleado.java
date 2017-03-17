package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Empleado extends Validacion {
    
    private int idEmpleado;
    private Date fechaReg;
    private String nombre;
    private String rfc;
    private String curp;
    private String nss;
    private String direccion;
    private String correo;
    private String telefono;
    private String departamento;
    private String status;
    private Conexion conexion;
    
    public Empleado (Conexion conexion) {
    idEmpleado = -1;
    fechaReg = null;
    nombre = null;
    rfc = null;
    curp = null;
    nss = null;
    departamento = null;
    status = null;
    telefono = null;
    direccion = null;
    this.conexion = conexion;
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public String getCurp() {
        return curp;
    }

    public String getNss() {
        return nss;
    }

    
    public String getDepartamento() {
        return departamento;
    }

    public Conexion getConexion() {
        return conexion;
    }
    
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }


    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }
    
    
    
    public void registrarEmpleado () {
        PreparedStatement comand = null;
        try {
            comand = conexion.conexionSQL().prepareStatement(" exec ingresa_empleado ?,?,?,?,?,?,?,?,?,?");
            comand.setInt(1, this.idEmpleado);
            comand.setString(2,this.nombre);
            comand.setString(3,this.rfc);
            comand.setString(4,this.curp);
            comand.setString(5,this.nss);
            comand.setString(6,this.departamento);
            comand.setString(7,this.status);
            comand.setString(8,this.telefono);
            comand.setString(9,this.direccion);
            comand.setString(10,this.correo);
            comand.executeUpdate();
            conexion.desconectarSQL();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
    
    /*public int verificarPermisoEscritura () {
        int value=0;
        conexion.conexionSQL();
        try {       
            PreparedStatement ps=conexion.getConexion().prepareStatement("SELECT EMPLEADO FROM PERMISOS WHERE IDEMP=?");
            //ps.setInt(1, idEmp);           
            ResultSet rs = ps.executeQuery();
            if(rs.first()){
                value++;
            }
        } catch (SQLException e) {
            System.out.println("Error en conexion");
        }
        conexion.desconectarSQL();
        return value;
    }*/
    
    
    public void modificarEmpleado () {
        conexion.conexionSQL();
        PreparedStatement ps = null;
        try {
            ps = conexion.conexionSQL().prepareStatement(" exec ingresa_empleado ?,?,?,?,?,?,?,?,?,?");
            ps.setInt(1, this.idEmpleado);
            ps.setString(2,this.nombre);
            ps.setString(3,this.rfc);
            ps.setString(4,this.curp);
            ps.setString(5,this.nss);
            ps.setString(6,this.departamento);
            ps.setString(7,this.status);
            ps.setString(8,this.telefono);
            ps.setString(9,this.direccion);
            ps.setString(10,this.correo);
            ps.executeUpdate();
            conexion.desconectarSQL();
        }catch (Exception e) {
            System.out.println("error en conexion");
        }
    }
    
    public int obtenerNoId(){
        int valor=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            comando = conexion.getConexion().prepareStatement("SELECT IDEMPLEADO FROM EMPLEADO");
            comando.executeQuery();
            ResultSet rs = comando.executeQuery();
            while(rs.next()){
                valor = rs.getInt(1);
            }
        } catch (SQLException e) {}
    valor++;
    return valor;
    }

    public DefaultTableModel consultarEmpleadosTotales () {
        DefaultTableModel ProvTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idEmpleado as \"ID EMP\", fechaReg as \"FECHA REG\", nombre as NOMBRE, rfc as RFC, curp as CURP, nss as NSS, direccion as DIRECCIÓN, correo as CORREO, telefono as TELÉFONO, departamento as DEPTO, estatus as ESTATUS");
            comando = conexion.getConexion().prepareStatement("select "+query+" from empleado");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            ProvTable.addColumn(rsm.getColumnLabel(1));
            ProvTable.addColumn(rsm.getColumnLabel(2));
            ProvTable.addColumn(rsm.getColumnLabel(3));
            ProvTable.addColumn(rsm.getColumnLabel(4));
            ProvTable.addColumn(rsm.getColumnLabel(5));
            ProvTable.addColumn(rsm.getColumnLabel(6));
            ProvTable.addColumn(rsm.getColumnLabel(7));
            ProvTable.addColumn(rsm.getColumnLabel(8));
            ProvTable.addColumn(rsm.getColumnLabel(9));
            ProvTable.addColumn(rsm.getColumnLabel(10));
            ProvTable.addColumn(rsm.getColumnLabel(11));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                ProvTable.addRow(fila);
            }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return ProvTable;
    }
    
    public DefaultTableModel consultarEmpleadoId () {
        String id = String.valueOf(this.idEmpleado);
        id = id.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idEmpleado as \"ID EMP\", fechaReg as \"FECHA REG\", nombre as NOMBRE, rfc as RFC, curp as CURP, nss as NSS, direccion as DIRECCIÓN, correo as CORREO, telefono as TELÉFONO, departamento as DEPTO, estatus as ESTATUS");      
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM EMPLEADO WHERE IDEMPLEADO LIKE ? ESCAPE '!'");
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
            empTable.addColumn(rsm.getColumnLabel(8));
            empTable.addColumn(rsm.getColumnLabel(9));
            empTable.addColumn(rsm.getColumnLabel(10));
            empTable.addColumn(rsm.getColumnLabel(11));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return empTable;
    }
    
    public DefaultTableModel consultarEmpleadoNombre () {
        String nombree = this.nombre.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idEmpleado as \"ID EMP\", fechaReg as \"FECHA REG\", nombre as NOMBRE, rfc as RFC, curp as CURP, nss as NSS, direccion as DIRECCIÓN, correo as CORREO, telefono as TELÉFONO, departamento as DEPTO, estatus as ESTATUS");            
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM EMPLEADO WHERE NOMBRE LIKE ? ESCAPE '!'");
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
            empTable.addColumn(rsm.getColumnLabel(8));
            empTable.addColumn(rsm.getColumnLabel(9));
            empTable.addColumn(rsm.getColumnLabel(10));
            empTable.addColumn(rsm.getColumnLabel(11));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return empTable;
    }
    
    public DefaultTableModel consultarEmpleadoRfc () {
        String rfcc = this.rfc.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idEmpleado as \"ID EMP\", fechaReg as \"FECHA REG\", nombre as NOMBRE, rfc as RFC, curp as CURP, nss as NSS, direccion as DIRECCIÓN, correo as CORREO, telefono as TELÉFONO, departamento as DEPTO, estatus as ESTATUS");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM EMPLEADO WHERE RFC LIKE ? ESCAPE '!'");
            comando.setString(1,rfcc + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            empTable.addColumn(rsm.getColumnLabel(8));
            empTable.addColumn(rsm.getColumnLabel(9));
            empTable.addColumn(rsm.getColumnLabel(10));
            empTable.addColumn(rsm.getColumnLabel(11));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return empTable;
    }
    
    public DefaultTableModel consultarEmpleadoCurp () {
        String curpp = this.curp.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idEmpleado as \"ID EMP\", fechaReg as \"FECHA REG\", nombre as NOMBRE, rfc as RFC, curp as CURP, nss as NSS, direccion as DIRECCIÓN, correo as CORREO, telefono as TELÉFONO, departamento as DEPTO, estatus as ESTATUS");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM EMPLEADO WHERE CURP LIKE ? ESCAPE '!'");
            comando.setString(1,curpp + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            empTable.addColumn(rsm.getColumnLabel(8));
            empTable.addColumn(rsm.getColumnLabel(9));
            empTable.addColumn(rsm.getColumnLabel(10));
            empTable.addColumn(rsm.getColumnLabel(11));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return empTable;
    }
    
    public DefaultTableModel consultarEmpleadoNss () {
        String nsss = this.nss.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idEmpleado as \"ID EMP\", fechaReg as \"FECHA REG\", nombre as NOMBRE, rfc as RFC, curp as CURP, nss as NSS, direccion as DIRECCIÓN, correo as CORREO, telefono as TELÉFONO, departamento as DEPTO, estatus as ESTATUS");            
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM EMPLEADO WHERE NSS LIKE ? ESCAPE '!'");
            comando.setString(1,nsss + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            empTable.addColumn(rsm.getColumnLabel(8));
            empTable.addColumn(rsm.getColumnLabel(9));
            empTable.addColumn(rsm.getColumnLabel(10));
            empTable.addColumn(rsm.getColumnLabel(11));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return empTable;
    }
    
    public DefaultTableModel consultarEmpleadoDepto () {
        String deptoo = this.departamento.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idEmpleado as \"ID EMP\", fechaReg as \"FECHA REG\", nombre as NOMBRE, rfc as RFC, curp as CURP, nss as NSS, direccion as DIRECCIÓN, correo as CORREO, telefono as TELÉFONO, departamento as DEPTO, estatus as ESTATUS");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM EMPLEADO WHERE DEPARTAMENTO LIKE ? ESCAPE '!'");
            comando.setString(1,deptoo + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            empTable.addColumn(rsm.getColumnLabel(8));
            empTable.addColumn(rsm.getColumnLabel(9));
            empTable.addColumn(rsm.getColumnLabel(10));
            empTable.addColumn(rsm.getColumnLabel(11));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return empTable;
    }
    
    public DefaultTableModel consultarEmpleadoStatus () {
        String statuss = this.status.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idEmpleado as \"ID EMP\", fechaReg as \"FECHA REG\", nombre as NOMBRE, rfc as RFC, curp as CURP, nss as NSS, direccion as DIRECCIÓN, correo as CORREO, telefono as TELÉFONO, departamento as DEPTO, estatus as ESTATUS");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM EMPLEADO WHERE ESTATUS LIKE ? ESCAPE '!'");
            comando.setString(1,statuss + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            empTable.addColumn(rsm.getColumnLabel(8));
            empTable.addColumn(rsm.getColumnLabel(9));
            empTable.addColumn(rsm.getColumnLabel(10));
            empTable.addColumn(rsm.getColumnLabel(11));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                fila.addElement(rs.getString(8));
                fila.addElement(rs.getString(9));
                fila.addElement(rs.getString(10));
                fila.addElement(rs.getString(11));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return empTable;
    }
    
    /*public boolean buscarEmpleado(int buscar) {
        
        boolean completado = false;
        conexion.conexionSQL();

        // Instrucción
        String query = "SELECT "
                + "idEmpleado AS 'ID', "
                + "fechaReg AS 'Fecha de registro', "
                + "nombre AS 'Nombre', "
                + "rfc AS 'RFC', "
                + "curp AS 'CURP', "
                + "nss AS 'NSS', "
                + "departamento AS 'Departamento', "
                + "estatus AS 'Estatus', "
                + "telefono AS 'Teléfono', "
                + "direccion AS 'Dirección', "
                + "correo  'Correo electronico' "
                + "FROM empleado "
                + "WHERE idEmpleado = " + buscar;

        try {
            PreparedStatement consulta = conexion.getConexion().prepareStatement(query);
            ResultSet rs = consulta.executeQuery();

            // Ciclo para llenar filas
            if (rs.first()) {
                idEmpleado = rs.getInt(1);
                fechaReg = rs.getDate(2);
                nombre = rs.getString(3);
                rfc = rs.getString(4);
                curp = rs.getString(5);
                nss = rs.getString(6);
                departamento = rs.getString(7);
                status = rs.getString(8);
                telefono = rs.getString(9);
                direccion = rs.getString(10);
                correo = rs.getString(11);
                completado = true;
            } else {
               
                JOptionPane.showMessageDialog(null, "No se encontraron registros con esos datos", "Error de busqueda", JOptionPane.WARNING_MESSAGE);
            
            }
        
        } catch (SQLException ex) {
        
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error de busqueda", JOptionPane.ERROR_MESSAGE);
        
        }

        conexion.desconectarSQL();
        return completado;

    }*/
    
    public boolean buscarEmpleadoN(String buscar) {
        boolean completado = false;
        conexion.conexionSQL();

        // Instrucción
        String query = "SELECT "
                + "idEmpleado AS 'ID', "
                + "fechaReg AS 'Fecha de registro', "
                + "nombre AS 'Nombre', "
                + "rfc AS 'RFC', "
                + "curp AS 'CURP', "
                + "nss AS 'NSS', "
                + "departamento AS 'Departamento', "
                + "estatus AS 'Estatus', "
                + "telefono AS 'Teléfono', "
                + "direccion AS 'Dirección', "
                + "correo  'Correo electronico' "
                + "FROM empleado "
                + "WHERE nombre LIKE '%" + buscar + "%'";

        try {
            PreparedStatement consulta = conexion.getConexion().prepareStatement(query);
            ResultSet rs = consulta.executeQuery();

            // Ciclo para llenar filas
            if (rs.first()) {
                idEmpleado = rs.getInt(1);
                fechaReg = rs.getDate(2);
                nombre = rs.getString(3);
                rfc = rs.getString(4);
                curp = rs.getString(5);
                nss = rs.getString(6);
                departamento = rs.getString(7);
                status = rs.getString(8);
                telefono = rs.getString(9);
                direccion = rs.getString(10);
                correo = rs.getString(11);
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
    
    public boolean buscarEmpleado(int buscar) {        
        boolean completado = false;
        conexion.conexionSQL();
        String query = "select nombre from empleado where idEmpleado = " + buscar;
        try {
            PreparedStatement consulta = conexion.getConexion().prepareStatement(query);
            ResultSet rs = consulta.executeQuery();
            if (rs.next()) {
                nombre = rs.getString(1);
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
