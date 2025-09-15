/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11.uml;

/**
 *
 * @author marin
 */
public class Ejercicio11UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear artista
        Artista artista = new Artista("Marina Cordero", "Pop");

        // Crear canción asociada al artista
        Cancion cancion = new Cancion("Mi Canción Favorita", artista);

        // Crear reproductor y usar dependencia de uso
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion); // usa Cancion solo en el método
    
    }
    
}
