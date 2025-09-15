package ejericio4.uml;
public class TarjetaCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;// Relación bidireccional con Cliente
    private Banco banco;// Relación de agregación con Banco

    // Constructor de TarjetaDeCrédito
    // Incluye solo banco como parámetro, reflejando la agregación
    public TarjetaCredito(String nuemero, String fechaVencimiento, Banco banco) {
        this.numero = nuemero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    // Getter y setter para la relación bidireccional con Cliente

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }   
    
    // Método toString para mostrar información de la tarjeta.
    //Incluye solo nombre y DNI del cliente para reflejar la relación bidireccional
    // Evita recursión infinita mostrando solo atributos específicos
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
