package modelo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class Log {
    
        //Objetos
    PrintWriter archivoEntrada;
    Scanner archivoEntradaa;
    JFileChooser archivo;

    
    //Variables de clase
    String msje = null, nomArchivo = null, lineaLeida = null;
    int countLineas=0;
    public final String user;
    static String usua;
    public ArrayList <String> log = new ArrayList ();
    ArrayList <AccionLog> arregloAux = new ArrayList ();
    
    PrintWriter archivoSalida;

    
    ListaDoble ld = new ListaDoble();
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
        
    public DefaultTableModel obtenerCantidadMovimientos () throws FileNotFoundException {
        ld.destroyAll();
        log.clear();
        DefaultTableModel ProvTable = new DefaultTableModel ();
        int cantidad=0;
        nomArchivo = "C:\\Users\\zawex\\Desktop\\log.txt";
        archivoEntradaa = new Scanner (new FileReader (nomArchivo));
        lineaLeida = "";
        countLineas = 0;
        while (archivoEntradaa.hasNext()) { 
            lineaLeida = archivoEntradaa.nextLine();
            log.add(lineaLeida);
        }
        cantidad = log.size();
        ProvTable.addColumn("FECHA");
        ProvTable.addColumn("USUARIO");
        ProvTable.addColumn("ACCION");
        for (int i = 0; i < (cantidad); i++) {
            ld.insertlog(log.get(i));
        }
        AccionLog actual;
        actual = ld.inicio;
        while (actual != null) {
            Vector fila = new Vector ();
            fila.addElement(actual.getFecha());
            fila.addElement(actual.getUsuario());
            fila.addElement(actual.getAccion());
            actual = actual.siguiente;
            ProvTable.addRow(fila);
        }       
        return ProvTable;
    }   
    
    public DefaultTableModel obtenerCantidadMovimientosPorUsuario () throws FileNotFoundException {
        ld.destroyAll();
        log.clear();
        DefaultTableModel ProvTable = new DefaultTableModel ();
        int cantidad=0;
        nomArchivo = "C:\\Users\\zawex\\Desktop\\log.txt";
        archivoEntradaa = new Scanner (new FileReader (nomArchivo));
        lineaLeida = "";
        countLineas = 0;
        while (archivoEntradaa.hasNext()) { 
            lineaLeida = archivoEntradaa.nextLine();
            log.add(lineaLeida);
        }
        cantidad = log.size();
        ProvTable.addColumn("FECHA");
        ProvTable.addColumn("USUARIO");
        ProvTable.addColumn("ACCION");
        for (int i = 0; i < (cantidad); i++) {
            ld.insertlog(log.get(i));
        }
        ld.sortearPorUsuario();
        AccionLog actual;
        actual = ld.inicio;
        while (actual != null) {
            Vector fila = new Vector ();
            fila.addElement(actual.getFecha());
            fila.addElement(actual.getUsuario());
            fila.addElement(actual.getAccion());
            actual = actual.siguiente;
            ProvTable.addRow(fila);
        }       
        return ProvTable;
    }
    
    public DefaultTableModel obtenerCantidadMovimientosPorAccion () throws FileNotFoundException {
        ld.destroyAll();
        log.clear();
        DefaultTableModel ProvTable = new DefaultTableModel ();
        int cantidad=0;
        nomArchivo = "C:\\Users\\zawex\\Desktop\\log.txt";
        archivoEntradaa = new Scanner (new FileReader (nomArchivo));
        lineaLeida = "";
        countLineas = 0;
        while (archivoEntradaa.hasNext()) { 
            lineaLeida = archivoEntradaa.nextLine();
            log.add(lineaLeida);
        }
        cantidad = log.size();
        ProvTable.addColumn("FECHA");
        ProvTable.addColumn("USUARIO");
        ProvTable.addColumn("ACCION");
        for (int i = 0; i < (cantidad); i++) {
            ld.insertlog(log.get(i));
        }
        int extIzq = 0;
        int extDer = cantidad-1;
        AccionLog [] acc = new AccionLog [cantidad];        
        AccionLog actual;
        actual = ld.inicio;
        while (actual != null) {
            for (int i = 0; i < acc.length; i++) {
                while (actual != null) {
                    acc[i]=actual;
                    actual = actual.siguiente;
                    break;
                }
            }
        }       
        acc = ld.sortearPorAccion(acc,extIzq,extDer);
        for (int i = 0; i < acc.length; i++) {
            Vector fila = new Vector ();
            fila.addElement(acc[i].getFecha());
            fila.addElement(acc[i].getUsuario());
            fila.addElement(acc[i].getAccion());
            ProvTable.addRow(fila);
        }
        return ProvTable;
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
