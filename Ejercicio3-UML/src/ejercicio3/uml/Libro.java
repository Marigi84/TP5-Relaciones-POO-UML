package ejercicio3.uml;

public class Libro {
    private String titulo; 
    private String isbn; 
    private Autor autor; // Asociación unidireccional con Autor (atributo en UML:
    private Editorial editorial; // Relación de agregación con Editorial.

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo: " + titulo + ", isbn=" + isbn 
                + ", " + autor + ", " + editorial + '}';
    }
    
    
}
