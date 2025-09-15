package ejercicio7.uml;
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;         // Agregación
    private Conductor conductor; // Asociación bidireccional

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public String getPatente() { return patente; }
    public String getModelo() { return modelo; }

    @Override
    public String toString() {
        String infoConductor = (conductor != null)
                ? "Conductor: " + conductor.getNombre() + ", Licencia: " + conductor.getLicencia()
                : "sin conductor";
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", " 
                + motor + ", " + infoConductor + '}';
    }
    
}
