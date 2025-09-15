package ejercicio3.uml;

public class Ejercicio3UML {
    public static void main(String[] args) {
        // Crear una editorial
        Editorial editorial = new Editorial("Bloomsbury", "Calle Falsa 123, Cordoba");

        // Crear un autor
        Autor autor = new Autor("J. K. Rowling", "británica");
        
        // Crear un libro con el autor y la editorial
        // Refleja la asociación unidireccional [Libro] --> [Autor] y la agregación [Libro] o--> [Editorial]
        Libro libro = new Libro("Harry Poter", "456464845646", editorial);
        
        libro.setAutor(autor);// Asociacion a través de setter

        // Mostrar información usando toString
        System.out.println("Libro: " + libro);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
    }
    
}
