/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12.uml;

/**
 *
 * @author marin
 */
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente; // asociación unidireccional

    public Impuesto(double monto) {
        this.monto = monto;
    }

    // Asociación mediante setter
    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    public double getMonto() { return monto; }
    public Contribuyente getContribuyente() { return contribuyente; }

    @Override
    public String toString() {
        return "Impuesto{" +
                "monto=" + monto +
                ", contribuyente=" +
                (contribuyente != null ? contribuyente.getNombre() : "sin asignar") +
                '}';
    }
}
