package U3.Examen2021_TardeA;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {


        int[][] datos = new int[5][6];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                Scanner teclado= new Scanner(System.in);
                System.out.println("Introduce un numero: ");
                datos[i][j] = teclado.nextInt();
            }
        }


        int suma = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                suma = suma + datos[i][j];
                System.out.print(datos[i][j]);
                System.out.print(" | ");
            }
            System.out.print(suma);
            System.out.println();
            suma = 0;
        }


        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 4; i++) {
                suma = suma + datos[i][j];
            }
            System.out.print(suma+" | ");

            suma = 0;
        }
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 4; i++) {
                suma = suma + datos[i][j];
            }

        }

        for (int j = 5; j < 6; j++) {
            for (int i = 4; i < 5; i++) {
                suma = suma + datos[i][j];
            }
            System.out.print(suma);
        }

        System.out.println();

    }

}
