package ejericio4.uml;
public class Cliente {
    private String nombre; 
    private String dni;
    private TarjetaCredito tarjeta;// Relación bidireccional con TarjetaDeCrédito

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    // Establece la relación bidireccional con TarjetaDeCrédito usando un setter
    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
           
    // Método toString para mostrar información del cliente
    // Incluye el número de la tarjeta para reflejar la relación bidireccional
    // Evita recursión infinita mostrando solo el número
    @Override
    public String toString() {
        String infoTarjeta;
        if(tarjeta != null){
            infoTarjeta = "tarjeta número: " + tarjeta.getNumero();
        }else{
            infoTarjeta = null;
        }
        return "Cliente{" + "nombre=" + nombre + ", cuit=" + dni + ", " + infoTarjeta + '}';
    }
    
    
}
