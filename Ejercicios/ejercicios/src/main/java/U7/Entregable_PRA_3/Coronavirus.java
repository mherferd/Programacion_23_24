package Ejercicios.ejercicios.src.main.java.Entregable_PRA_3;

import java.util.*;

public class Coronavirus {
    private Map<Character, List<Paciente>> pacientesPorCepa;
    private List<Medico> medicos;

    // Constructor
    public Coronavirus() {
        this.pacientesPorCepa = new HashMap<>();
        this.medicos = new ArrayList<>();
    }

    // Método para añadir paciente
    public void addPaciente ( char cepa, Paciente paciente){
        if (paciente.getCepa() == cepa) {
            List<Paciente> pacientes = pacientesPorCepa.getOrDefault(cepa, new ArrayList<>());
            pacientes.add(paciente);
            pacientesPorCepa.put(cepa, pacientes);
        } else {
            System.out.println("Error: El paciente no está infectado por la cepa especificada.");
        }
    }

    // Método para dar de alta a un paciente
    public void darDeAltaPaciente (Paciente paciente){
        for (List<Paciente> lista : pacientesPorCepa.values()) {
            if (lista.remove(paciente)) {
                System.out.println("Paciente dado de alta correctamente.");
                return;
            }
        }
        System.out.println("No se ha encontrado el paciente.");
    }

    // Método para obtener pacientes de un médico
    public void pacientesDeUnDoctor ( int numeroColegiado){
        boolean encontrado = false;
        for (List<Paciente> lista : pacientesPorCepa.values()) {
            for (Paciente paciente : lista) {
                if (paciente.getMedico().getNumeroColegiado() == numeroColegiado) {
                    System.out.println(paciente);
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("Este médico/a no lleva ningún paciente.");
        }
    }

    // Método para obtener pacientes por peso
    public void pacientesPorPeso ( char cepa){
        List<Paciente> pacientes = pacientesPorCepa.getOrDefault(cepa, new ArrayList<>());
        pacientes.sort(Comparator.comparingDouble(Paciente::getPeso).reversed());
        for (Paciente paciente : pacientes) {
            System.out.println(paciente);
        }
    }

    // Método para obtener pacientes por edad
    public void pacientesPorEdad ( char cepa){
        List<Paciente> pacientes = pacientesPorCepa.getOrDefault(cepa, new ArrayList<>());
        pacientes.sort(Comparator.comparingInt(Paciente::getEdad).reversed());
        for (Paciente paciente : pacientes) {
            System.out.println(paciente);
        }
    }

    // Método para cargar pacientes desde un archivo binario
    public void cargarPacientes () {
        // Código para cargar pacientes desde "pacientes.dat"
        // Se debe manejar excepciones
    }

    // Método para guardar pacientes en un archivo binario
    public void guardarPacientes () {
        // Código
    }
}