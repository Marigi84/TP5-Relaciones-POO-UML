package ejercicio5.uml;
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;      // composici�n
    private Propietario propietario;    // asociaci�n bidireccional

    // el constructor exige la PlacaMadre, reflejando la composici�n
    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getNumeroSerie() { return numeroSerie; }

    @Override
    public String toString() {
        String infoProp = (propietario != null)
                ? "Propietario: " + propietario.getNombre() + ", Dni: " + propietario.getDni()
                : "sin propietario";
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie +
                ", " + placaMadre + ", " + infoProp + '}';
    }
    
}
