package ejercicio7.uml;
public class Ejercicio7UML {
    public static void main(String[] args) {
       // Crear motor independiente (agregaci�n)
        Motor motor = new Motor("Nafta", "MTR-98765");

        // Crear veh�culo con el motor
        Vehiculo vehiculo = new Vehiculo("AB123CD", "Toyota Corolla", motor);

        // Crear conductor
        Conductor conductor = new Conductor("Marina Cordero", "LIC-555888");

        // Establecer asociaci�n bidireccional
        vehiculo.setConductor(conductor);
        conductor.setVehiculo(vehiculo);

        // Mostrar la informaci�n completa
        System.out.println(vehiculo);
        System.out.println(conductor);
    
    }
    
}
