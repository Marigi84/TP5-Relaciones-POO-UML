package ejercicio1;
//Clase Titular: Representa la persona asociada al pasaporte
public class Titular {
    private String nombre;
    private String DNI;
    private Pasaporte pasaporte;// Relación bidireccional con Pasaporte
    
    //Constructor
    public Titular(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }
    // Getter y setter para la relación bidireccional con Pasaporte
    public Pasaporte getPasaporte() {
        return pasaporte;
    }
    // Establece la relación bidireccional con Pasaporte
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    // Método toString para mostrar información del titular
    // Incluye el número del pasaporte para reflejar la relación bidireccional
    @Override
    public String toString() {
        String infoPasaporte = null;
        if (pasaporte != null){
            // Mostramos solo el número del pasaporte para evitar recursión infinita
            infoPasaporte = "número de pasaporte: " + pasaporte.getNumero();
        }
        return "Titular: " + nombre + ", DNI=" + DNI + ", pasaporte: " + infoPasaporte;
    }
    
    
    
}
