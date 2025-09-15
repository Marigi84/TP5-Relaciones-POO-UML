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
    // Dependencia de creaci�n: crea un Render en este m�todo
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato); // crea el objeto
        render.setProyecto(proyecto);        // establece la asociaci�n con setter
        System.out.println("Exportaci�n realizada: " + render);
    }
    
}
