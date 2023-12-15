package U3.Entregable_2021;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n = teclado.nextInt();

        int [][] datos = new int[n][n];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j]= (int) (Math.random() * (200-100)+100);
                System.out.print(datos[i][j]);
                System.out.print(" | ");
            }

            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < datos.length; i++) {
            for (int j = datos.length- 1; j >= 0; j--) {
                System.out.print(datos[j][i]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}