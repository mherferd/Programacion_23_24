package U1.ejercicios.src.main.java.U5.Examen_23_24;

import java.util.Comparator;

public class Ordenar_Anyo implements Comparator<Multimedia> {
    //Mediante esta ordenación podemos ordenar los diferentes años de creación de los diferentes elementos Multimedia,
    // llamando al atributo Anyo de la clase Multimedia y mediante la interfaz Comparator.
    @Override
    public int compare(Multimedia o1, Multimedia o2) {
        if (o1.getAnyo() < o2.getAnyo()) {
            return 1;
        } else if (o1.getAnyo() > o2.getAnyo()) {
            return -1;
        }
        return 0;
    }
}
