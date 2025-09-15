package ejercicio8.uml;
public class Ejercicio8UML {
    public static void main(String[] args) {
        // Crear usuario independiente (agregación)
        Usuario usuario = new Usuario("Marina Cordero", "marina@example.com");

        // Crear firma digital asociada a ese usuario
        FirmaDigital firma = new FirmaDigital("abc123hash", "2025-09-13", usuario);

        // Crear documento que contiene la firma (composición)
        Documento documento = new Documento("Contrato de Servicio",
                "Contenido del contrato...", firma);

        // Mostrar información
        System.out.println(documento);
    }
    
}
