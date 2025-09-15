package ejercicio2.uml;
public class Celular {
    
    private String marca;
    private String modelo;
    private String imei;
    private Bateria bateria;//Relaci�n de agregaci�n con Bateria
    private Usuario usuario;//Relaci�n bidireccional con Usuario
    
    // El constructor incluye la bater�a como par�metro, reflejando la agregaci�n
    public Celular(String marca, String modelo, String imei, Bateria bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.imei = imei;
        this.bateria = bateria;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    @Override
    public String toString() {
        String infoUsuario;
        if (usuario != null){
            infoUsuario = "usuario: " + usuario.getNombre() + ", Dni: " + usuario.getDNI();
        }
        else{
            infoUsuario = null;
        }
        return "Celular{" + "marca=" + marca + ", modelo=" + modelo + ", imei=" 
         + imei + ", " + bateria + ", " + infoUsuario + '}';
    }
   
    
    
}
