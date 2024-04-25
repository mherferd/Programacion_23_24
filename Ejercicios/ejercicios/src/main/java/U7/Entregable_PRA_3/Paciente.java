package Ejercicios.ejercicios.src.main.java.Entregable_PRA_3;

public class Paciente {
    private String nombre;
    private int edad;
    private double peso;
    private boolean vacunasRequeridas;
    private Medico medico;
    private char cepa;

    // Constructor
    public Paciente(String nombre, int edad, double peso, boolean vacunasRequeridas, Medico medico, char cepa) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunasRequeridas = vacunasRequeridas;
        this.medico = medico;
        this.cepa = cepa;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isVacunasRequeridas() {
        return vacunasRequeridas;
    }

    public void setVacunasRequeridas(boolean vacunasRequeridas) {
        this.vacunasRequeridas = vacunasRequeridas;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public char getCepa() {
        return cepa;
    }

    public void setCepa(char cepa) {
        this.cepa = cepa;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunasRequeridas=" + vacunasRequeridas +
                ", medico=" + medico +
                ", cepa=" + cepa +
                '}';
    }
}
