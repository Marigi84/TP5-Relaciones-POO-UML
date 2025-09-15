package ejercicio8.uml;
public class Ejercicio8UML {
    public static void main(String[] args) {
        // Crear usuario independiente (agregaci�n)
        Usuario usuario = new Usuario("Marina Cordero", "marina@example.com");

        // Crear firma digital asociada a ese usuario
        FirmaDigital firma = new FirmaDigital("abc123hash", "2025-09-13", usuario);

        // Crear documento que contiene la firma (composici�n)
        Documento documento = new Documento("Contrato de Servicio",
                "Contenido del contrato...", firma);

        // Mostrar informaci�n
        System.out.println(documento);
    }
    
}
