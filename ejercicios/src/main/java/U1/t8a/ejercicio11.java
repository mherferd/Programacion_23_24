package U1.t8a;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        int contador = 1, contador2 = 1;

        while ((contador2 <= 10) && (contador <= 10)) {
            System.out.println(contador2 * contador);
            contador2++;
            if (contador2 == 10) {
                System.out.println("TABLA DEL " + contador);
                contador2 = 1;
                contador++;

            }
        }

    }
}
