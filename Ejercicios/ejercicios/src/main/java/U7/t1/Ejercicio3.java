package U1.ejercicios.src.main.java.U7.t1;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> Aleatorios = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int numero = (int) (Math.random() * 10);
            Aleatorios.add(numero);
            Collections.sort(Aleatorios);
            Collections.reverse(Aleatorios);
        }


        System.out.println(Aleatorios);
    }
}
