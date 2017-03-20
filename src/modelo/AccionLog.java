package modelo;

public class AccionLog {

    private String fecha;
    private String usuario;
    private String accion;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }
    
        
    public AccionLog siguiente;
    public AccionLog anterior;
    
    public AccionLog izquierda;
    public AccionLog derecha;

    public AccionLog(String cadena) {
        try {
        String []arr = cadena.split("\t");
        this.fecha = arr[0].substring(7);
        this.usuario = arr[1].substring(9);
        this.accion = arr[2].substring(8);
        }catch (Exception e) {System.out.println(e.getMessage());}
    }
    
    @Override
    public String toString () {
        return (  "\nFecha: "+this.getFecha()
                + "\nUsuario: "+this.getUsuario()
                + "\nAccion: "+this.getAccion()
                );
    }
    
    
    
    
    
}
