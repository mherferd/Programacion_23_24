package Ejercicios.ejercicios.src.main.java.Entregable_PRA_3;

import java.util.Scanner;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Coronavirus corona = new Coronavirus();

        // Crear médicos
        Medicos medico1 = new Medicos("Juan", "Gómez", 1, "Hospital A");
        Medicos medico2 = new Medicos("María", "López", 2, "Hospital B");

        // Crear pacientes
        Pacientes paciente1 = new Pacientes("Carlos", 25, 70, true, medico1, 'A');
        Pacientes paciente2 = new Pacientes("Ana", 30, 65, false, medico1, 'B');
        Pacientes paciente3 = new Pacientes("Pedro", 40, 80, true, medico2, 'A');
        Pacientes paciente4 = new Pacientes("Elena", 35, 55, false, medico2, 'B');
        Pacientes paciente5 = new Pacientes("Laura", 28, 60, true, medico1, 'A');

        // Añadir pacientes al Coronavirus
        corona.addPaciente(paciente1.getCepa(), paciente1);
        corona.addPaciente(paciente2.getCepa(), paciente2);
        corona.addPaciente(paciente3.getCepa(), paciente3);
        corona.addPaciente(paciente4.getCepa(), paciente4);
        corona.addPaciente(paciente5.getCepa(), paciente5);

        System.out.println("------------------------------------------");

        // Mostrar pacientes del Coronavirus
        System.out.println("Pacientes del Coronavirus:");
        for (Pacientes paciente : corona.getListaPacientes()) {
            System.out.println(paciente);
        }

        System.out.println("------------------------------------------");

        // Eliminar un paciente
        System.out.println("Eliminar un paciente:");
        corona.darDeAlta(paciente3);

        System.out.println("Pacientes del Coronavirus:");
        for (Pacientes paciente : corona.getListaPacientes()) {
            System.out.println(paciente);
        }

        System.out.println("------------------------------------------");

        // Mostrar pacientes de un médico específico
        System.out.println("Pacientes del médico 1:");
        corona.pacientesDeUnDoctor(medico1.getNumero_colegiado());

        System.out.println("------------------------------------------");

        // Ordenar pacientes por peso
        System.out.println("Pacientes ordenados por peso:");
        corona.pacientesporPeso('A');

        System.out.println("------------------------------------------");

        // Ordenar pacientes por edad
        System.out.println("Pacientes ordenados por edad:");
        corona.pacientesporEdad('A');

        System.out.println("------------------------------------------");

        // Cargar pacientes desde archivo
        System.out.println("Cargando pacientes desde archivo...");
        corona.cargarPacientes();

        System.out.println("------------------------------------------");

        // Guardar pacientes en archivo
        System.out.println("Guardando pacientes en archivo...");
        corona.guardarPacientes();

        System.out.println("------------------------------------------");
    }
}
