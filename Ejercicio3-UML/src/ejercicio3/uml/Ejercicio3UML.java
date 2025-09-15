package ejercicio3.uml;

public class Ejercicio3UML {
    public static void main(String[] args) {
        // Crear una editorial
        Editorial editorial = new Editorial("Bloomsbury", "Calle Falsa 123, Cordoba");

        // Crear un autor
        Autor autor = new Autor("J. K. Rowling", "brit�nica");
        
        // Crear un libro con el autor y la editorial
        // Refleja la asociaci�n unidireccional [Libro] --> [Autor] y la agregaci�n [Libro] o--> [Editorial]
        Libro libro = new Libro("Harry Poter", "456464845646", editorial);
        
        libro.setAutor(autor);// Asociacion a trav�s de setter

        // Mostrar informaci�n usando toString
        System.out.println("Libro: " + libro);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
    }
    
}
