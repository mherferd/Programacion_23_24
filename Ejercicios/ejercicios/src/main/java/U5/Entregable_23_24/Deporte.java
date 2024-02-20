package U1.ejercicios.src.main.java.U5.Entregable_23_24;

import U1.ejercicios.src.main.java.U5.t1.Examen21_22.Integrante;

import java.util.Arrays;
import java.util.Objects;

public abstract class Deporte {
    protected String Nombre;
    protected String Pabellon;


    public Deporte(String nombre, String pabellon) {
        Nombre = nombre;
        Pabellon = pabellon;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPabellon() {
        return Pabellon;
    }

    public void setPabellon(String pabellon) {
        Pabellon = pabellon;
    }



    @Override
    public String toString() {
        return "Deporte{" +
                "Nombre='" + Nombre + '\'' +
                ", Pabellon='" + Pabellon + '\'' +
                '}';
    }
}
