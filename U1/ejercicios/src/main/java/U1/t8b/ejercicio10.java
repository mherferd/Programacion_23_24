package U1.U1.t8b;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura = 0, columna = 0, fila = 0;


        System.out.println("Introduce la altura de la U: ");
        Scanner teclado = new Scanner(System.in);
        altura = teclado.nextInt();


        for (fila = 1; fila <= altura; fila++) {

            for (columna = 1; columna <= altura; columna++) {

                if (columna == 1 && fila != altura) {
                    System.out.print("*");
                } else if (columna == 1 && fila == altura) {
                    System.out.print(" ");
                }

                if (fila == altura) {
                    System.out.print("*");
                }
                if (fila != altura) {
                    System.out.print(" ");
                }
                if (columna == altura && fila != altura) {
                    System.out.print("*");
                } else if (columna == altura && fila == altura) {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
