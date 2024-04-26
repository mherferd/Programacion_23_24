package U1.ejercicios.src.main.java.U7.U6U7_Entregable;

import java.util.Comparator;

public class OrdenarFinisher implements Comparator<Atleta> {

    @Override
    public int compare(Atleta o1, Atleta o2) {
        if(o1.getMarca() > o2.getMarca()){
            return 1;
        } else if (o1.getMarca() < o2.getMarca()) {
            return -1;
        }
        return 0;
    }
}
