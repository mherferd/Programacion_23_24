package U1.t8b;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {

        int n;
        int i = 1, j = 1, y = 1;

        System.out.println("¿De que caracter quieres la pirámide?");
        Scanner teclado1 = new Scanner(System.in);
        String hola = teclado1.nextLine();

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("¿Cuanta altura quiere?");
        n = teclado.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= (i * 2) - 1; j++) {
                System.out.print(hola);
            }

            System.out.println(" ");

        }

    }
}

