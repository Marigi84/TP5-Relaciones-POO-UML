/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12.uml;

/**
 *
 * @author marin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contribuyente contrib = new Contribuyente("Marina Cordero", "20-31058096-4");

        // Crear impuesto y establecer relación con setter
        Impuesto impuesto = new Impuesto(15000.0);
        impuesto.setContribuyente(contrib);

        Calculadora calc = new Calculadora();
        calc.calcular(impuesto);
    }
    
}
