/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11.uml;

/**
 *
 * @author marin
 */
public class Reproductor {
     // Dependencia de uso: usa Cancion como parámetro, no la guarda como atributo
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() +
                " - Artista: " + cancion.getArtista().getNombre());
    }
    
}
