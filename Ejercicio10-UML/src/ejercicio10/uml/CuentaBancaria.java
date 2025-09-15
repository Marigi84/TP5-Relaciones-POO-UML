/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10.uml;

/**
 *
 * @author marin
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; // composición
    private Titular titular;               // relación bidireccional

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        // Composición: la clave se crea junto con la cuenta
        this.claveSeguridad = new ClaveSeguridad(codigoClave, ultimaModificacion);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "cbu=" + cbu +
                ", saldo=" + saldo +
                ",\n " + claveSeguridad +
                ", titular=" + (titular != null ? titular.getNombre() + " DNI: " + 
                titular.getDni() : "sin titular") + '}';
    }
    
}
