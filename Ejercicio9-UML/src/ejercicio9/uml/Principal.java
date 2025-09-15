/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9.uml;

/**
 *
 * @author marin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Crear paciente y profesional
        Paciente paciente = new Paciente("Marina Cordero", "OSDE");
        Profesional profesional = new Profesional("Dr. Juan Pérez", "Cardiología");

        // Crear cita médica con relaciones unidireccionales
        CitaMedica cita = new CitaMedica("2025-09-20", "10:30", paciente, profesional);

        // Mostrar información de la cita
        System.out.println(cita);
    }
    
}
