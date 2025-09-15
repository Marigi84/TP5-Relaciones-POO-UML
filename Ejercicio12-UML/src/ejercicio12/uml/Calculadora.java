/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12.uml;

/**
 *
 * @author marin
 */
public class Calculadora {
    // Dependencia de uso: solo usa Impuesto como parámetro
    public void calcular(Impuesto impuesto) {
        double interes = impuesto.getMonto() * 0.10;
        double total = impuesto.getMonto() + interes;

        System.out.println("Contribuyente: " +
                (impuesto.getContribuyente() != null
                 ? impuesto.getContribuyente().getNombre()
                 : "No asignado"));
        System.out.println("Monto base: " + impuesto.getMonto());
        System.out.println("Total con interés 10%: " + total);
    }
    
}
