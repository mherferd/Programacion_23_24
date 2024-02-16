package U1.ejercicios.src.main.java.U5.Entregable_23_24;

import java.util.Comparator;

public class Ordenacion_Baloncesto implements Comparator<Baloncestistas> {

    @Override
    public int compare(Baloncestistas o1, Baloncestistas o2) {
        if ((o1.getAltura()) < o2.getAltura()) {
            return 1;
        } else if (o1.getAltura() > o2.getAltura()) {
            return -1;
        }
        return 0;
    }
}
