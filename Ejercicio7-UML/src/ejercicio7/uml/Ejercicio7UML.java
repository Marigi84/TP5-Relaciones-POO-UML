package ejercicio7.uml;
public class Ejercicio7UML {
    public static void main(String[] args) {
       // Crear motor independiente (agregación)
        Motor motor = new Motor("Nafta", "MTR-98765");

        // Crear vehículo con el motor
        Vehiculo vehiculo = new Vehiculo("AB123CD", "Toyota Corolla", motor);

        // Crear conductor
        Conductor conductor = new Conductor("Marina Cordero", "LIC-555888");

        // Establecer asociación bidireccional
        vehiculo.setConductor(conductor);
        conductor.setVehiculo(vehiculo);

        // Mostrar la información completa
        System.out.println(vehiculo);
        System.out.println(conductor);
    
    }
    
}
