package U1.U1.intro_bucles_condicionales.U1_Entregable;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura = 0, columna = 0, fila = 0;


        while (altura <= 3 || altura % 2 == 0) {
            System.out.println("Introduce la altura de la z (impar y >3): ");
            Scanner teclado = new Scanner(System.in);
            altura = teclado.nextInt();
        }


        for (fila = 0; fila < altura; fila++) {

            for (columna = 0; columna < altura; columna++) {

                if (fila == 0 || fila == altura - 1 || columna == altura - 1 - fila) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }


            System.out.print("   ");


            for (columna = 0; columna < altura; columna++) {

                if (fila == 0 || fila == altura - 1 || columna == altura - 1 - fila) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


