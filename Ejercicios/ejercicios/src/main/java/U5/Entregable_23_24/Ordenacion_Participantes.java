package U1.ejercicios.src.main.java.U5.Entregable_23_24;

import java.util.Comparator;

public class Ordenacion_Participantes implements Comparator<Participante>{
    @Override
    public int compare(Participante o1, Participante o2) {
        if (o1.getEdad() < o2.getEdad()) {
            return 1;
        } else if (o1.getEdad() > o2.getEdad()) {
            return -1;
        }
        return 0;
    }
}
