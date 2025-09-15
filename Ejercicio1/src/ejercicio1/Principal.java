package ejercicio1;

public class Principal {
    public static void main(String[] args) {
        // Crear una foto
        Foto foto = new Foto("imagen1245", "JPEG");
        
        // Crear un pasaporte con la foto (relaci�n de composici�n)
        Pasaporte pasaporte = new Pasaporte("AB123486", "12/02/2015", foto);
        
        // Crear un titular
        Titular titular = new Titular("Marina Cordero", "31058096");
        
        // Establecer la relaci�n bidireccional entre Pasaporte y Titular
        pasaporte.setTitular(titular);
        titular.setPasaporte(pasaporte);
        
        // Mostrar informaci�n usando toString
        System.out.println(pasaporte);
        System.out.println(titular);
        System.out.println(foto);
    }
    
}
