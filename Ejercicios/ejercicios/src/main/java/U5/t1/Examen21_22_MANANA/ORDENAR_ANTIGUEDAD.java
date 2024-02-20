package U1.ejercicios.src.main.java.U5.t1.Examen21_22_MANANA;

import java.util.Comparator;

public class ORDENAR_ANTIGUEDAD implements Comparator<Propiedad> {
    @Override
    public int compare(Propiedad o1, Propiedad o2) {
        if ((o1.getAno_constr()) < o2.getAno_constr()) {
            return 1;
        } else if (o1.getAno_constr() > o2.getAno_constr()) {
            return -1;
        }
        else{
            if ((o1.getMetros2()) < o2.getMetros2()) {
                return 1;
            } else if (o1.getMetros2() > o2.getMetros2()) {
                return -1;
        }

    }
        return 0;
}
}

