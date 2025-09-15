package ejericio4.uml;
public class Principal {
    public static void main(String[] args) {
        // Crear un banco
        Banco banco = new Banco("Santander", "30-12345678-9");

        // Crear un cliente
        Cliente cliente = new Cliente("MArina Cordero", "31058096");
        
        //Crear Tarjeta de  crédito
        TarjetaCredito tarjeta = new TarjetaCredito("4455555659788545", "22/05/2028", banco);
        
        // Establecer la relación bidireccional entre TarjetaDeCrédito y Cliente usando setters
        tarjeta.setCliente(cliente);
        cliente.setTarjeta(tarjeta);

        // Mostrar información usando toString
        System.out.println( tarjeta);
        System.out.println( cliente);
        System.out.println( banco);

        
    }
    
}
