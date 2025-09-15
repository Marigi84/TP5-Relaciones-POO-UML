package ejercicio6.uml;
public class Principal {
    public static void main(String[] args) {
         // Crear cliente y mesa independientes
        Cliente cliente = new Cliente("Marina Cordero", "341-5551234");
        Mesa mesa = new Mesa(7, 4);

        // Crear reserva asociando cliente y mesa
        Reserva reserva = new Reserva("2025-09-14", "20:30", cliente, mesa);

        // Mostrar la información completa
        System.out.println(reserva);
    }
    
    
}
