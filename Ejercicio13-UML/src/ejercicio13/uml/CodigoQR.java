/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13.uml;

/**
 *
 * @author marin
 */
public class CodigoQR {
    private String valor;
    private Usuario usuario; // Asociación unidireccional (por setter)

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    // Establece la asociación con Usuario
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getValor()   { return valor; }
    public Usuario getUsuario(){ return usuario; }

    @Override
    public String toString() {
        return "CodigoQR{" +
                "valor=" + valor +
                ", usuario=" +
                (usuario != null ? usuario.getNombre() : "sin asignar") +
                '}';
    }
}
