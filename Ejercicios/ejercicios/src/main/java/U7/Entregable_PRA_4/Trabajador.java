package Ejercicios.ejercicios.src.main.java.Entregable_PRA_4;

import java.io.Serializable;

public class Trabajador implements Serializable {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private String formacionAcademica;

    public Trabajador(String dni, String nombre, String apellidos, int edad, String formacionAcademica) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.formacionAcademica = formacionAcademica;
    }

    // Getters
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getFormacionAcademica() {
        return formacionAcademica;
    }

    @Override
    public String toString() {
        return apellidos + ", " + nombre + " - DNI: " + dni + " - Edad: " + edad + " - Formación: " + formacionAcademica;
    }
}