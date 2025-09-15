/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14.uml;

/**
 *
 * @author marin
 */
public class Render {
    private String formato;
    private Proyecto proyecto; // Asociación unidireccional vía setter

    public Render(String formato) {
        this.formato = formato;
    }

    // Asociación realizada mediante setter
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public String getFormato() { return formato; }
    public Proyecto getProyecto() { return proyecto; }

    @Override
    public String toString() {
        return "Render{" +
               "formato=" + formato +
               ", proyecto=" + (proyecto != null ? proyecto.getNombre() : "sin asignar") +
               '}';
    }
    
}
