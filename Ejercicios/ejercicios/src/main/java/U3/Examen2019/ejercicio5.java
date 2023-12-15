package U3.Examen2019;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {
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

        int[] a_final = new int[2 * (filas + columnas) - 4];
        int contador = 0;


        for (int i =  0; i < columnas - 1; i++) {
            a_final[contador++] = datos[0][i];
        }
        for (int i = 0; i < filas - 1; i++) {
            a_final[contador++] = datos[i][columnas - 1];
        }
        for (int i = columnas - 1; i > 0; i--) {
            a_final[contador++] = datos[filas - 1][i];
        }
        for (int i = filas - 1; i > 0; i--) {
            a_final[contador++] = datos[i][0];
        }

        return a_final;
    }
}

