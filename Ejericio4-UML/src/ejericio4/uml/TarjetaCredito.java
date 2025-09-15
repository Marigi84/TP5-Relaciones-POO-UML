package ejericio4.uml;
public class TarjetaCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;// Relaci�n bidireccional con Cliente
    private Banco banco;// Relaci�n de agregaci�n con Banco

    // Constructor de TarjetaDeCr�dito
    // Incluye solo banco como par�metro, reflejando la agregaci�n
    public TarjetaCredito(String nuemero, String fechaVencimiento, Banco banco) {
        this.numero = nuemero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    // Getter y setter para la relaci�n bidireccional con Cliente

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }   
    
    // M�todo toString para mostrar informaci�n de la tarjeta.
    //Incluye solo nombre y DNI del cliente para reflejar la relaci�n bidireccional
    // Evita recursi�n infinita mostrando solo atributos espec�ficos
    @Override
    public String toString() {
        String infoCliente;
        if(cliente != null){
            infoCliente = "Cliente: " + cliente.getNombre() + ", Dni: " + cliente.getDni();
        }else{
            infoCliente = null;
        }
        return "TarjetaCredito{" + "nuemero=" + numero + ", fechaVencimiento=" 
                + fechaVencimiento + ", " + banco + ", " + infoCliente + '}';
    }
    
    
}
