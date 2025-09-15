package ejercicio1;
// Clase Foto: Representa la foto asociada a un pasaporte
public class Foto {
    
    private String imagen;
    private String fomato;

    //Constructor
    public Foto(String imagen, String fomato) {
        this.imagen = imagen;
        this.fomato = fomato;
    }
    // M�todo toString para mostrar informaci�n de la foto
    @Override
    public String toString() {
        return "Foto{" + "imagen=" + imagen + ", fomato=" + fomato + '}';
    }
    
    
    
}
