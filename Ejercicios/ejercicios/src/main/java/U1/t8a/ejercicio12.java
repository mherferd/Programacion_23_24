package U1.U1.t8a;

import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {
        int nota;
        int contador = 0, contador2 = 0;


        while (contador != 5) {

            Scanner teclado;
            teclado = new Scanner(System.in);
            System.out.println("¿Cuanto ha sacado el alumno?");
            nota = teclado.nextInt();
            contador++;
            if (nota < 5) {
                contador2++;

            }
        }
        if (contador2 >= 1) {
            System.out.println("Hay suspenso");
        } else {
            System.out.println("No hay ningun suspenso");

        }
    }
}
