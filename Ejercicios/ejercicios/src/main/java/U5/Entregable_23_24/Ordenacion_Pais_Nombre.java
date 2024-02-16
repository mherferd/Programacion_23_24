package U1.ejercicios.src.main.java.U5.Entregable_23_24;

import java.util.Comparator;

public class Ordenacion_Pais_Nombre implements Comparator<Pais> {

    @Override
    public int compare(Pais o1, Pais o2) {
       return o1.getNombre().compareTo(o2.getNombre());
    }
}
