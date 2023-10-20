package U1.t8b;

import java.util.Scanner;

public class ejercicio6 {

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

            if (i != 1) {

                for (j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                System.out.print(hola);

                for (j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print(hola);
                System.out.println();
            } else if (i == 1) {
                for (j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                System.out.println(hola);
            }
        }
        for (j = 1; j <= 2 * n - 1; j++) {
            System.out.print(hola);


        }

    }
}



