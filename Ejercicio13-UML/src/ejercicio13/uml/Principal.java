/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13.uml;

/**
 *
 * @author marin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Usuario usuario = new Usuario("Marina Cordero", "marina@example.com");

        GeneradorQR generador = new GeneradorQR();
        // Dependencia de creaci�n: crea y asocia el C�digoQR dentro del m�todo
        generador.generar("ABC-123-XYZ", usuario);
    }
    
}
