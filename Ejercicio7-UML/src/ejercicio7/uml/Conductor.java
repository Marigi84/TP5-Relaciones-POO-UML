package ejercicio7.uml;
public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;  // Asociación bidireccional

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getNombre() { return nombre; }
    public String getLicencia() { return licencia; }

    @Override
    public String toString() {
        String infoVehiculo = (vehiculo != null)
                ? "Vehiculo patente: " + vehiculo.getPatente()
                : "sin vehiculo";
        return "Conductor{" + "nombre=" + nombre + ", licencia=" 
                + licencia + ", " + infoVehiculo + '}';
    }
    
}
