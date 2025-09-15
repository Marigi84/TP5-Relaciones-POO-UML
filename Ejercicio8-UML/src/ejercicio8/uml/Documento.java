package ejercicio8.uml;
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; // Composición

    public Documento(String titulo, String contenido, FirmaDigital firmaDigital) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = firmaDigital;
    }

    public String getTitulo() { return titulo; }
    public String getContenido() { return contenido; }

    @Override
    public String toString() {
        return "Documento{" +
               "titulo=" + titulo + 
               ", contenido=" + contenido +
               "\n, " + firmaDigital +
               '}';
    }
}
