package U3.Examen2021_Tarde;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array: ");
        int n = teclado.nextInt();

        int[][] datos = new int[n][n];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j] = (int) (Math.random() * (100-10));
                System.out.print(datos[i][j]);
                System.out.print(" | ");
            }

            System.out.println();
        }
        subcorteza(datos);
        int[] a_final = subcorteza(datos);
        System.out.println(Arrays.toString(a_final));
    }

    public static int[] subcorteza(int[][] datos) {
        int filas = datos.length;
        int columnas = datos[0].length;

        int[] a_final = new int[2 * (filas + columnas) - 9];
        int contador = 0;


        for (int i = 1; i < columnas - 1; i++) {
            a_final[contador++] = datos[1][i];
        }
        for (int i = 1; i < filas - 1; i++) {
            a_final[contador++] = datos[i][columnas - 2];
        }
        for (int i = columnas - 2; i > 0; i--) {
            a_final[contador++] = datos[filas - 2][i];
        }
        for (int i = filas - 2; i > 1; i--) {
            a_final[contador++] = datos[i][1];
        }

        return a_final;
    }
}
