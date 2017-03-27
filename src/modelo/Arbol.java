package modelo;
/**
 *
 * @author Ivi 
 * Dedicado a mi profe favorito Hassem <3
 */
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class Arbol {
    
    PrintWriter archivoEntrada;
    Scanner archivoEntradaa;
    JFileChooser archivo;    
    //Variables de clase
    String msje = null, nomArchivo = null, lineaLeida = null;
    int countLineas=0;
    public final String user="";
    static String usua;    
    PrintWriter archivoSalida;

    
    Nodo raiz;
    Nodo Final;
    Nodo ordenado;
    Nodo Inicio = null;
    String Diccionario = null;
    String cadenaOriginal = null;
    String encriptado = null;
    String compresion = null;
    String cadenaEncriptada = null;
    
    
    public void convertir(String cadena){
        this.cadenaOriginal = cadena;
        contador(cadena, raiz);
    }
    
    public String regresarCadEnc(){
        return this.cadenaEncriptada;
    }
    
    public void contador(String cadena,Nodo arbol){
        Nodo nuevo;
        if(cadena.length()==0){
            imprimeListaLigada(raiz);
            ordenarFrecuencia();
            return;
        }
        char key = (char) cadena.charAt(0);
        cadena = cadena.substring(1);
        nuevo = localizar(key, raiz);
        
        if(nuevo == null){
            nuevo = new Nodo();
            nuevo.setCaracter(key);
            nuevo.setFrecuencia(1);
            
            if(this.raiz == null){
                raiz = nuevo;
                Final = nuevo;
                contador(cadena,nuevo);
            } else {
                if(arbol.getNodoSig()==null){
                    arbol.setNodoSig(nuevo);
                    Final = nuevo;
                } else {
                    while(arbol.getNodoSig()!=null){
                        arbol = arbol.getNodoSig();
                    }
                    arbol.setNodoSig(nuevo);
                    Final = nuevo;
                }
                contador(cadena,nuevo);
            }
        } else {
            nuevo.setFrecuencia(nuevo.getFrecuencia()+1);
            contador(cadena, this.raiz);
        }
        
    }
    
    public void imprimeListaLigada(Nodo arbol){
        if(arbol == null){
            return;
        }
        arbol.imprimeDatos();
        imprimeListaLigada(arbol.getNodoSig());
        
    }
    
    public void imprimeDiccionario(Nodo arbol){
        if(arbol == null){
            return;
        }
        arbol.ruta();
        imprimeDiccionario(arbol.getNodoSig());
        
        
    }
    
    public Nodo localizar(char letra, Nodo raiz){
        Nodo actual = raiz;
        if(actual == null){
            return null;
        }
        
        if(actual.getCaracter() == letra){
            return actual;
        } else {
           if(actual.getNodoSig() != null){
               return localizar(letra, actual.getNodoSig());
           } else {
               return null;
           } 
        }
    }
    
    public void ordenarFrecuencia(){
        Nodo aux = new Nodo();
        Nodo menor = null;
        Nodo i=raiz,j=raiz;
    
        while(i != null){
            menor = i;
            j = i.nodoSig;
            while(j != null){
                if(j.getFrecuencia() <= menor.getFrecuencia()){
                    if(j.getFrecuencia() < menor.getFrecuencia()){
                        menor = j;
                    }
                    if(j.getFrecuencia() == menor.getFrecuencia()){
                        if(j.getCaracter() < menor.getCaracter()){
                            menor = j;
                        }
                    }
                    
                }
                j = j.getNodoSig();
            }

            if(menor != i){
                aux.setCaracter(i.getCaracter());
                aux.setFrecuencia(i.getFrecuencia());
                
                i.setCaracter(menor.getCaracter());
                i.setFrecuencia(menor.getFrecuencia());
                
                menor.setCaracter(aux.getCaracter());
                menor.setFrecuencia(aux.getFrecuencia());
            }
            i = i.getNodoSig();
        }
        System.out.println();
        imprimeListaLigada(raiz);
        System.out.println("\n-----------------------------");
        subArbol(raiz, raiz.getNodoSig());
    }
    
    public void subArbol(Nodo uno, Nodo dos){
        if(dos == null){
            crearDiccionario();
            return;
        }
        Nodo nuevo = new Nodo();
        nuevo.setFrecuencia(uno.getFrecuencia()+dos.getFrecuencia());
        nuevo.setNodoSig(dos.getNodoSig());
        
        nuevo.setNodoIzq(uno);
        nuevo.setNodoDer(dos);
        uno.setNodoAnt(null);
        uno.setNodoSig(null);
        dos.setNodoAnt(null);
        dos.setNodoSig(null);
        
        this.raiz = nuevo;
        ordenarSub(this.raiz);
        subArbol(this.raiz,this.raiz.getNodoSig());
        
    }
    
    public void ordenarSub(Nodo uno){
        Nodo i, j, pivote = new Nodo();
        Nodo aux = new Nodo();
        i = this.raiz;
        j = this.raiz;
        
        pivote = i;
        j = i.getNodoSig();
        while(j!=null){
            if(raiz.getFrecuencia() >= j.getFrecuencia()){
                if(raiz.getFrecuencia() > j.getFrecuencia()){
                    pivote = j;
                } else {
                    if(raiz.getFrecuencia() == j.getFrecuencia()){
                        if(raiz.getCaracter() >= j.getCaracter()){
                            pivote = j;
                        }
                    }
                }
                
            }
            j = j.getNodoSig();
        }
        
        if(pivote != i){
            aux = pivote.getNodoSig();
            this.raiz = i.getNodoSig();
            pivote.setNodoSig(i);
            i.setNodoSig(aux);
        }
    }
    
    public void crearDiccionario(){
        if(esHoja(this.raiz)){
            imprimeDiccionario(Inicio);
            encriptar(this.cadenaOriginal);
            return;
        }
        Nodo padre = this.raiz;
        Nodo x = this.raiz;
        Nodo nuevo;
        String cadena = "";
        
        while(!esHoja(x)){
            if(x.getNodoIzq()!=null){
                cadena = cadena+"1";
                padre = x;
                x = x.getNodoIzq();
            } else {
                if(x.getNodoDer()!=null){
                    cadena = cadena+"0";
                    padre = x;
                    x = x.getNodoDer();
                }
            }
        }
        
        if(x.getCaracter()!=0){
            nuevo = new Nodo();
            nuevo.setCaracter(x.getCaracter());
            nuevo.setFrecuencia(x.getFrecuencia());
            nuevo.setCadena(cadena);
            
            
            if(this.Inicio==null){
                this.Inicio = nuevo;
            } else {
                Nodo actual = Inicio;
                while(actual.getNodoSig()!=null){
                    actual = actual.getNodoSig();
                }
                actual.setNodoSig(nuevo);
            }
            if(padre.getNodoIzq()==x){
                padre.setNodoIzq(null);
            } else if(padre.getNodoDer()==x){
                padre.setNodoDer(null);
            }
        } else {
            if(padre.getNodoIzq()==x){
                padre.setNodoIzq(null);
            } else if(padre.getNodoDer()==x){
                padre.setNodoDer(null);
            }
        }
        crearDiccionario();
    }
    
    public boolean esHoja(Nodo nodo){
        if(nodo.getNodoIzq() == null && nodo.getNodoDer() ==null){
            return true;
        }
        return false;
    }
    
    public void encriptar(String cadena){
        while(cadena.length()!=0){
            char key = (char) cadena.charAt(0);
            Nodo nodo = localizar(key, this.Inicio);
            if(encriptado == null){
                this.encriptado = nodo.getCadena();
            } else {
                this.encriptado = encriptado+nodo.getCadena();
            }
            cadena = cadena.substring(1);
        }
        System.out.println(encriptado);
        
        compresion();
    }
    
    public void compresion(){
        while(encriptado.length()%8!=0){ 
            this.encriptado = encriptado+"0"; 
            System.out.println(encriptado.length());
            System.out.println(encriptado+"\n");
        }
        while(encriptado.length()!=0){
            int binario = Integer.parseInt(encriptado.substring(0, 8));
            char key = (char) convertBinario(binario);
            System.out.println("( "+binario+" | "+convertBinario(binario)+" | "+(char)key+" )");
            if(this.compresion == null){
                this.compresion = String.valueOf(key);
            } else {
                this.compresion = compresion+(char)key;
            }
            encriptado = encriptado.substring(8);
        }
        System.out.println(this.compresion);
        this.cadenaEncriptada = this.compresion;
        //grabar(compresion);
    }
    
    
    public void grabar (String s) {  
            try {
                nomArchivo = "C:\\Users\\zawex\\Desktop\\logEncriptado.txt";
                archivoSalida = new PrintWriter(new FileWriter(nomArchivo,true));
                archivoSalida.println(s);
                archivoSalida.close();
            }catch (Exception e) {
                archivoSalida = null;
            }
    }

    public int convertBinario(int binario){
        int exponente = 0;
        int decimal = 0; 
        int digito = 0;
        while (binario != 0){
            digito = binario % 10;
            decimal = decimal + digito * (int) Math.pow(2, exponente);
            exponente++;
            binario = binario / 10;
        }    
        
        return decimal;
    }
}
