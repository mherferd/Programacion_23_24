package U1.ejercicios.src.main.java.U5.t2.ejercicio2;

import java.util.Comparator;

public class Comparar_Edad implements Comparator<Cliente> {
    @Override
    public int compare(Cliente persona1, Cliente persona2) {

        if (persona1.getEdad() < persona2.getEdad()) {
            return -1;
        } else if (persona1.getEdad() > persona2.getEdad()) {
            return 1;
        }
        return 0;

    }
}