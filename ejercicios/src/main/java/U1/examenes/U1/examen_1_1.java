package U1.examenes.U1;

import java.util.Scanner;

public class examen_1_1 {
    public static void main(String[] args) {

        int n;
        int i = 1, j = 1, y = 1;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("¿Cuanta altura quiere?");
        n = teclado.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n + 2; j++) {
                if ((i == 1) && (j == (n / 2) + 2)) {
                    System.out.print("*");
                } else if ((i == n) && (j == (n / 2) + 2)) {
                    System.out.print("Y");
                } else if ((i != n) && (i != 1)) {
                    if (((i == n - 1) || (i + j == n)) || (j - i == 3)) {
                        System.out.print("^");
                    } else {
                        System.out.print(" ");
                    }

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }

}

