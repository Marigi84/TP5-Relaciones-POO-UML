package ejercicio1;
//Clase Titular: Representa la persona asociada al pasaporte
public class Titular {
    private String nombre;
    private String DNI;
    private Pasaporte pasaporte;// Relaci�n bidireccional con Pasaporte
    
    //Constructor
    public Titular(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }
    // Getter y setter para la relaci�n bidireccional con Pasaporte
    public Pasaporte getPasaporte() {
        return pasaporte;
    }
    // Establece la relaci�n bidireccional con Pasaporte
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    // M�todo toString para mostrar informaci�n del titular
    // Incluye el n�mero del pasaporte para reflejar la relaci�n bidireccional
    @Override
    public String toString() {
        String infoPasaporte = null;
        if (pasaporte != null){
            // Mostramos solo el n�mero del pasaporte para evitar recursi�n infinita
            infoPasaporte = "n�mero de pasaporte: " + pasaporte.getNumero();
        }
        return "Titular: " + nombre + ", DNI=" + DNI + ", pasaporte: " + infoPasaporte;
    }
    
    
    
}
