package Ejercicios.ejercicios.src.main.java.Entregable_PRA_3;

public class Medicos implements Serializable {
    private String nombre;
    private String apellido;
    private int numero_colegiado;
    private String hospital;

    public Medicos(String nombre, String apellido, int numero_colegiado, String hospital) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_colegiado = numero_colegiado;
        this.hospital = hospital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumero_colegiado() {
        return numero_colegiado;
    }

    public void setNumero_colegiado(int numero_colegiado) {
        this.numero_colegiado = numero_colegiado;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Medicos{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numero_colegiado=" + numero_colegiado +
                ", hospital='" + hospital + '\'' +
                '}';
    }
}
