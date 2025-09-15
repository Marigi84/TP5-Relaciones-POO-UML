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
    // Método toString para mostrar información de la foto
    @Override
    public String toString() {
        return "Foto{" + "imagen=" + imagen + ", fomato=" + fomato + '}';
    }
    
    
    
}
