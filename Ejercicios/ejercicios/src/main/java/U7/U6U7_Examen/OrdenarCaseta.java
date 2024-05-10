package U7.U6U7_Examen;

import java.util.Comparator;

public class OrdenarCaseta implements Comparator<Caseta> {

    @Override
    public int compare(Caseta o1, Caseta o2) {

        return o1.getNombre().compareTo(o2.getNombre());
    }
}