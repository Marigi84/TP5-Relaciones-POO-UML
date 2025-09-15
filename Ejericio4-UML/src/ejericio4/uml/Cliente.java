package ejericio4.uml;
public class Cliente {
    private String nombre; 
    private String dni;
    private TarjetaCredito tarjeta;// Relaci�n bidireccional con TarjetaDeCr�dito

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    // Establece la relaci�n bidireccional con TarjetaDeCr�dito usando un setter
    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
           
    // M�todo toString para mostrar informaci�n del cliente
    // Incluye el n�mero de la tarjeta para reflejar la relaci�n bidireccional
    // Evita recursi�n infinita mostrando solo el n�mero
    @Override
    public String toString() {
        String infoTarjeta;
        if(tarjeta != null){
            infoTarjeta = "tarjeta n�mero: " + tarjeta.getNumero();
        }else{
            infoTarjeta = null;
        }
        return "Cliente{" + "nombre=" + nombre + ", cuit=" + dni + ", " + infoTarjeta + '}';
    }
    
    
}
