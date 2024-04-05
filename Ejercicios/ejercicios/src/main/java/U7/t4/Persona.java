package U1.ejercicios.src.main.java.U7.t4;
import java.io.Serializable;

public class Persona implements Serializable{

    private String Nombre;
    private String DNI;
    private int Edad;
    private double Estatura;

    public Persona(String nombre, String DNI, int edad, double estatura) {
        Nombre = nombre;
        this.DNI = DNI;
        Edad = edad;
        Estatura = estatura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public double getEstatura() {
        return Estatura;
    }

    public void setEstatura(double estatura) {
        Estatura = estatura;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre='" + Nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", Edad=" + Edad +
                ", Estatura=" + Estatura +
                '}';
    }
}
