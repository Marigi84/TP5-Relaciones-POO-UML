/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9.uml;

/**
 *
 * @author marin
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;       // asociaci�n unidireccional
    private Profesional profesional; // asociaci�n unidireccional

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    public void setPaciente(Paciente paciente) { this.paciente = paciente; }
    public void setProfesional(Profesional profesional) { this.profesional = profesional; }

    @Override
    public String toString() {
        return "CitaMedica{" +
                "fecha=" + fecha +
                ", hora=" + hora +
                ", " + paciente +
                "\n, " + profesional +
                '}';
    }
}
