package ejercicio5.uml;
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora;   // asociación bidireccional

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }

    @Override
    public String toString() {
        String infoPC = (computadora != null)
                ? "Computadora serie: " + computadora.getNumeroSerie()
                : "sin computadora";
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + ", " + infoPC + '}';
    }
    
}
