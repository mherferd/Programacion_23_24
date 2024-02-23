package U1.ejercicios.src.main.java.U5.Examen_23_24;

import U1.ejercicios.src.main.java.U5.Entregable_23_24.Participante;

import java.util.Comparator;

public class Ordenar_ID implements Comparator<Multimedia> {
    //Mediante esta ordenación podemos ordenar los diferentes id de los diferentes elementos Multimedia, llamando
    //al atributo Identificador_multimedia de la clase Multimedia y mediante la interfaz Comparator.
    @Override
    public int compare(Multimedia o1, Multimedia o2) {
        if (o1.Identificador_multimedia < o2.Identificador_multimedia) {
            return 1;
        } else if (o1.Identificador_multimedia > o2.Identificador_multimedia) {
            return -1;
        }
        return 0;
    }
}
