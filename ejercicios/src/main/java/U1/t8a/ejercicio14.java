package U1.t8a;

import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {

        int n;
        int i = 1, j = 1;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("¿Cuanta altura quiere?");
        n = teclado.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println("*");

        }
    }
}
