/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13.uml;

/**
 *
 * @author marin
 */
public class GeneradorQR {
    // Dependencia de creación: crea un CódigoQR y le asigna el Usuario mediante setter
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor);
        qr.setUsuario(usuario);   // asociación establecida con setter
        System.out.println("QR generado: " + qr);
    }
    
}
