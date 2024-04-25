package Ejercicios.ejercicios.src.main.java.Entregable_PRA_3;

public class Medico {
    private String nombre;
    private String apellidos;
    private int numeroColegiado;
    private String hospital;

    // Constructor
    public Medico(String nombre, String apellidos, int numeroColegiado, String hospital) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroColegiado = numeroColegiado;
        this.hospital = hospital;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(int numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numeroColegiado=" + numeroColegiado +
                ", hospital='" + hospital + '\'' +
                '}';
    }
}
