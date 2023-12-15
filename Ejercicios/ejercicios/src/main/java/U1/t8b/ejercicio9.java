package U1.U1.t8b;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura = 0, columna = 0, fila = 0;


        System.out.println("Introduce la altura de la L: ");
        Scanner teclado = new Scanner(System.in);
        altura = teclado.nextInt();


        for (fila = 0; fila <= altura; fila++) {

            for (columna = 0; columna <= (altura / 2); columna++) {

                if (columna == 1 || fila == altura) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
