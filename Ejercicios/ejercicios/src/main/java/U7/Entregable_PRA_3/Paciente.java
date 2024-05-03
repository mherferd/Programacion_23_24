package Ejercicios.ejercicios.src.main.java.Entregable_PRA_3;

import java.io.Serializable;

public class Pacientes implements Serializable {
    private String nombre;
    private int edad;
    private int peso;
    private boolean vacunas;
    private Medicos medico;
    private char cepa;

    public Pacientes(String nombre, int edad, int peso, boolean vacunas, Medicos medico, char cepa) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunas = vacunas;
        this.medico = medico;
        this.cepa = cepa;
    }

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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isVacunas() {
        return vacunas;
    }

    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }

    public Medicos getMedico() {
        return medico;
    }

    public void setMedico(Medicos medico) {
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
        return "Pacientes{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunas=" + vacunas +
                ", medico=" + medico +
                ", cepa='" + cepa + '\'' +
                '}';
    }
}
