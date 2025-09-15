/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14.uml;

/**
 *
 * @author marin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Video Promocional", 12);

        EditorVideo editor = new EditorVideo();
        // Aquí se ve la dependencia de creación y la asociación por setter
        editor.exportar("MP4", proyecto);
    }
    
}
