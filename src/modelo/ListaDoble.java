package modelo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;


public class ListaDoble {
    //Objetos
    PrintWriter archivoEntrada;
    Scanner archivoEntradaa;
    JFileChooser archivo;
    //Variables de clase
    String msje = null, nomArchivo = null, lineaLeida = null;
    int countLineas=0;
    //public final String user;
    static String usua;
    ArrayList <String> log = new ArrayList ();
    ArrayList <AccionLog> arregloAux = new ArrayList ();
    PrintWriter archivoSalida;
    AccionLog inicio; 
    AccionLog fin;
    int length;
    static ListaDoble ld;

    public ListaDoble() {
        this.inicio = null;
        this.fin = null;
        this.length = 0;
    }
    
    public void insertlog (String s) {
        if (length == 0) {
            AccionLog acci = new AccionLog (s);
            acci.siguiente = null;
            acci.anterior = null;
            inicio = acci;
            fin = acci;
            length++;
        }else {
            AccionLog actual;
            actual = fin;
            AccionLog acci = new AccionLog(s);
            actual.siguiente = acci;
            acci.siguiente = null;
            acci.anterior = actual;
            fin = acci;
            length++;
        }
    }
    
    public void sortearPorUsuario() {       //Iterativo
        if (length > 1) {
            boolean cambio;
            do {                
                AccionLog anterior = null;
                AccionLog actual = inicio;
                AccionLog siguiente = inicio.siguiente;
                cambio = false;
                while ( siguiente != null ) {   //Si es diferente a null existe elemento a comparar
                    if (actual.getUsuario().compareTo(siguiente.getUsuario())>0) {
                        cambio = true;
                        if ( anterior != null ) {   //En caso de que exista un anterior
                            AccionLog sig = siguiente.siguiente;
                            anterior.siguiente = siguiente;     //anterior apunta a siguiente 
                            siguiente.siguiente = actual;
                            actual.siguiente = sig;
                        } else {        //En caso de que sea el primer nodo de la lista
                            AccionLog sig = siguiente.siguiente;
                            inicio = siguiente;      //Paso la referencia de siguiente al primer nodo
                            siguiente.siguiente = actual;   //siguiente apunta a actual
                            actual.siguiente = sig;         //actual apunta al siguiente del siguiente 
                        }
                        anterior = siguiente;   //  guardamos la direccion del nodo anterior      
                        siguiente = actual.siguiente;
                    } else {                        //Si no existe intercambio de ligas
                        anterior = actual;          //actualizamos indicadores de posicion
                        actual = siguiente;
                        siguiente = siguiente.siguiente;
                    }
                }
                fin=actual;
            } while( cambio );
        }
    }
    
    //Recursivo
    public static AccionLog[] sortearPorAccion (AccionLog [] c, int extIzq, int extDer) {
        AccionLog aux;
        AccionLog aux2;
        AccionLog aux3;
        if (extIzq < extDer) {
            aux = c[(extIzq + extDer)/2];
            c[(extIzq + extDer)/2] = c[extDer];    
            c[extDer] = aux;    
            int i = extIzq, j = extDer;          
            while (i < j) {
                while ( i < j && c[i].getAccion().compareTo(c[extDer].getAccion()) <= 0) {
                    i++;
                }
                while ( i < j && c[j].getAccion().compareTo(c[extDer].getAccion()) >= 0) {
                    j--;
                }
                if ( i != j) {
                    aux2 = c[i];
                    c[i] = c[j];    
                    c[j] = aux2;
                }
            }
            if (i != extDer) {
                aux3 = c[i];
                c[i] = c[extDer];    
                c[extDer] = aux3;
            }
           sortearPorAccion (c,extIzq,i-1);
           sortearPorAccion (c,i+1,extDer);
        }
        return c;
    }    
    
    public void destroyAll () {
        while (length>0) {
            deleteFirst();
        }
    }
    
    public void deleteFirst () {
        if (length == 0 ) {
            System.out.println("\nLISTA VACIA");
        }else {
            AccionLog sup;
            sup=inicio;
            inicio = inicio.siguiente;
            if (length==1) {
                inicio=null;
            }
            sup=null;
            length--;
        }
    }
   
}
