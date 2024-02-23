package U1.ejercicios.src.main.java.U5.Examen_23_24;

import java.util.Comparator;

public class Ordenar_Titulo implements Comparator<Multimedia> {
    //Mediante esta ordenación podemos ordenar los diferentes titulos de los diferentes elementos Multimedia, llamando
    //al atributo Titulo de la clase Multimedia y mediante la interfaz Comparator.
    @Override
    public int compare(Multimedia o1, Multimedia o2) {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
}
