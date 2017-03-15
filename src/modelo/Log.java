package modelo;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Log {
    
    public final String user;
    static String usua;
    ArrayList <String> log = new ArrayList ();
    PrintWriter archivoSalida;
    String msje = null, nomArchivo = null;
    int countLineas=0;

    public Log(String user) {
        this.user = user;
    }

    public Log() {
        this.user = usua;
    }

    public  void agregarAccionFinal (String fecha,String user1,String accion) {
        log.add("Fecha: "+fecha +"\tUsuario: "+ user1 +"\tAccion: "+ accion);
        usua = user;
        grabar();
    }
    
    public  void agregarAccion (String fecha,String accion) {
        log.add("Fecha: "+fecha +"\tUsuario: "+ user +"\tAccion: "+ accion);
        usua = user;
        grabar();
    }
    
    public void grabar () {  
            try {
                nomArchivo = "C:\\Users\\zawex\\Desktop\\log.txt";
                archivoSalida = new PrintWriter(new FileWriter(nomArchivo,true));
                msje = null;
                msje = log.toString();
                archivoSalida.println(msje);
                archivoSalida.close();
            }catch (Exception e) {
                archivoSalida = null;
            }
    }
}
