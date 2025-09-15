package ejercicio5.uml;
public class Principal {
    public static void main(String[] args) {
        // Composici�n: la PlacaMadre se crea junto con la Computadora
        PlacaMadre placa = new PlacaMadre("ASUS ROG", "X570");
        Computadora pc = new Computadora("Dell", "SN-2025-001", placa);

        // Propietario y asociaci�n bidireccional
        Propietario propietario = new Propietario("Marina Cordero", "31058096");
        pc.setPropietario(propietario);
        propietario.setComputadora(pc);

        // Mostrar informaci�n
        System.out.println(pc);
        System.out.println(propietario);
    }
    
}
    

