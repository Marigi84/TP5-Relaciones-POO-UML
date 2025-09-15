/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14.uml;

/**
 *
 * @author marin
 */
public class EditorVideo {
    // Dependencia de creación: crea un Render en este método
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato); // crea el objeto
        render.setProyecto(proyecto);        // establece la asociación con setter
        System.out.println("Exportación realizada: " + render);
    }
    
}
