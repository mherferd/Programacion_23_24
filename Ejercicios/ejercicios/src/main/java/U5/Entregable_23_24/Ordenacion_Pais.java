package U1.ejercicios.src.main.java.U5.Entregable_23_24;

import java.util.Comparator;

public class Ordenacion_Pais implements Comparator<Pais> {
    @Override
    public int compare(Pais o1, Pais o2) {
        if (o1.getN_Participantes() < o2.getN_Participantes()) {
            return 1;
        } else if (o1.getN_Participantes() > o2.getN_Participantes()) {
            return -1;
        }
        return 0;
    }
}
