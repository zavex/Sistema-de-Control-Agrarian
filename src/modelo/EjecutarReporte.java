package modelo;

import java.sql.*;
import java.util.Map;
import java.util.HashMap;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.*;
import net.sf.jasperreports.view.save.JRPdfSaveContributor.*;
import net.sf.jasperreports.view.JRViewer.*;
import net.sf.jasperreports.view.save.JRMultipleSheetsXlsSaveContributor.*;

public class EjecutarReporte {

    public static final String DRIVER="com.mysql.jdbc.Driver";
        public static final String RUTA="jdbc:mysql://localhost/Agrarian";
        public static final String USER="root";
        public static final String PASSWORD="";
	public static Connection CONEXION;

    public void startReport(int id){

        try{
            Class.forName(DRIVER);
            CONEXION = DriverManager.getConnection(RUTA,USER,PASSWORD);
            javax.swing.JOptionPane.showMessageDialog(null,"Conexion establecida");
            
            String template="Reporte.jasper";
            JasperReport reporte=null;
            reporte=(JasperReport) JRLoader.loadObject(template);

            Map param=new HashMap();
            param.put("id", id);

            JasperPrint jasperprint= JasperFillManager.fillReport(reporte,param,CONEXION);
            JasperViewer visor=new JasperViewer(jasperprint,false);
            visor.setTitle("Reportes Por Almacen");
            visor.setVisible(true);



        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, e);

        }
    }


}
