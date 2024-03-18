package U1.ejercicios.src.main.java.U7.t1;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {
        public static void main(String[] args) {

            ArrayList<Integer> Aleatorios = new ArrayList<>();
            for (int i=0; i<20; i++){
                int numero = (int) (Math.random()*100);
                Aleatorios.add(numero);
            }

            System.out.println(Aleatorios);

            Collections.sort(Aleatorios);
            System.out.println(Aleatorios);
    }
}
