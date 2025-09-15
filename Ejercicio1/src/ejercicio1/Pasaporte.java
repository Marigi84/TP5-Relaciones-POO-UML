package ejercicio1;
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
    }
    public String getNumero() {
        return numero;

    }    
    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        String infoTitular= null;
        if( titular != null ){
            // mostramos solo nombre y dni, para eviatr recursion infinita.
            infoTitular = titular.getNombre() + ", Dni: " + titular.getDNI();
        }
        return "Pasaporte: " + numero + ", fecha de emisión: " 
       + fechaEmision + " " + foto + " " + "titular: " + infoTitular;
    }

       
    
}
