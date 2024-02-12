package U1.ejercicios.src.main.java.U5.t2.ejercicio2;

import java.util.Comparator;

public class Comparar_Nombre implements Comparator <Cliente> {
    @Override
    public int compare(Cliente persona1, Cliente persona2) {

        return persona1.getNombre().compareTo(persona2.getNombre());
    }
}
