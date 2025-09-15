/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10.uml;

/**
 *
 * @author marin
 */
public class Ejercicio10UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Crear titular
        Titular titular = new Titular("Marina Cordero", "31058096");

        // Crear cuenta bancaria (la clave de seguridad se crea dentro)
        CuentaBancaria cuenta = new CuentaBancaria(
                "1234567890123456789012", 25000.50,
                "ABC123", "2025-09-13"
        );

        // Establecer relación bidireccional
        cuenta.setTitular(titular);
        titular.setCuenta(cuenta);

        // Mostrar información
        System.out.println(cuenta);
        
    
    }
    
}
