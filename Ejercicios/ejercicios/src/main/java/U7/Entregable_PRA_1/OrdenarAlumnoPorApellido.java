package U1.ejercicios.src.main.java.U7.Entregable_PRA_1;

import java.util.Comparator;

public class OrdenarAlumnoPorApellido implements Comparator<Alumno> {

    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o1.getApellidos().compareTo(o2.getApellidos());
    }
}