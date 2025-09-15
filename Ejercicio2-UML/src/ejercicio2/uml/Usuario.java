package ejercicio2.uml;
public class Usuario {
    
    private String nombre;
    private String DNI;
    private Celular celular;// Relación bidireccional con Celular

    public Usuario(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }
    // Método toString para mostrar información del usuario
    // Incluye solo el modelo y marca del celular para reflejar la relación bidireccional
    // Evita recursión infinita 
    @Override
    public String toString() {
        String infoCelular;
        if(celular != null){
            infoCelular = "marca: " +  celular.getMarca() + ", modelo: " + celular.getModelo();
        }
        else{
            infoCelular=null;
        }
        return "Usuario{" + "nombre=" + nombre + ", DNI=" + DNI + ", Celular: " + infoCelular + '}';
    }
    
    
   
    
}
