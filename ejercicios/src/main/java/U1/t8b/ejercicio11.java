package U1.t8b;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura = 0, columna = 0, fila = 0;


        while (altura <= 3 || altura % 2 == 0) {
            System.out.println("Introduce la altura de la x (impar y >3): ");
            Scanner teclado = new Scanner(System.in);
            altura = teclado.nextInt();
        }

        for (fila = 1; fila <= altura; fila++) {
            for (columna = 1; columna <= altura; columna++) {
                if (columna == fila) {
                    System.out.print("*");
                }

                if ((columna + fila == altura + 1) && (fila != (altura / 2) + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();


        }

    }
}






