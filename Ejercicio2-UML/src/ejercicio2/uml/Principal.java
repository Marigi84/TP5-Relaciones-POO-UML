package ejercicio2.uml;
public class Principal {
    public static void main(String[] args) {
        
        //Creamos una batería
        Bateria bateria = new Bateria("BT-001", 5000);
        
        //Creamos el celular con la batería (AGREGACION)
        Celular celular = new Celular("Samsung","A 4",
                "12345323454", bateria);
        
        //Creamos un usuario
        Usuario usuario = new Usuario("Marina Cordero", "31058096");
        
        //Asociamos un usuario al celular
        celular.setUsuario(usuario);
        //Asociamos el celular al usuario para que la relación sea bidireccional.
        usuario.setCelular(celular);
        
        System.out.println(bateria);
        System.out.println(celular);
        System.out.println(usuario);
        
        
        
                

    }
    
}
