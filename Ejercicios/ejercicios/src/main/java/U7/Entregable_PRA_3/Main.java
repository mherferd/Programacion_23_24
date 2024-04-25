package Ejercicios.ejercicios.src.main.java.Entregable_PRA_3;

public  class Main {
    public static void main(String[] args) {
        // Crear médicos
        Medico medico1 = new Medico("Juan", "García", 12345, "Hospital A");
        Medico medico2 = new Medico("María", "López", 54321, "Hospital B");
        Medico medico3 = new Medico("Pedro", "Martínez", 98765, "Hospital C");

        // Crear pacientes
        Paciente paciente1 = new Paciente("Pablo", 30, 70.5, true, medico1, 'A');
        Paciente paciente2 = new Paciente("Ana", 45, 65.2, false, medico1, 'B');
        Paciente paciente3 = new Paciente("Carlos", 55, 80.0, true, medico2, 'A');
        Paciente paciente4 = new Paciente("Sofía", 25, 55.8, true, medico2, 'B');
        Paciente paciente5 = new Paciente("Elena", 35, 68.3, false, medico3, 'A');
        Paciente paciente6 = new Paciente("Luis", 40, 75.6, true, medico3, 'C');

        // Crear instancia de Coronavirus
        Coronavirus coronavirus = new Coronavirus();

        // Añadir pacientes a la instancia de Coronavirus
        coronavirus.addPaciente('A', paciente1);
        coronavirus.addPaciente('B', paciente2);
        coronavirus.addPaciente('A', paciente3);
        coronavirus.addPaciente('B', paciente4);
        coronavirus.addPaciente('A', paciente5);
        coronavirus.addPaciente('C', paciente6);

        // Ejemplos de uso de métodos
        System.out.println("Pacientes por peso (cepa A):");
        coronavirus.pacientesPorPeso('A');

        System.out.println("\nPacientes por edad (cepa B):");
        coronavirus.pacientesPorEdad('B');

        System.out.println("\nPacientes del médico 54321:");
        coronavirus.pacientesDeUnDoctor(54321);
    }
}