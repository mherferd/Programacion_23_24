package U3.t4;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {

        int [] diagonal = new int [10];

        int [][] datos = new int[10][10];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j]= (int) (Math.random() * 100 + 200);
                System.out.print(datos[i][j]);
                System.out.print(" | ");
                if (i==j) {
                    diagonal[i] = datos [i] [j];
                }
                }

            System.out.println();
            }
        System.out.println();
        System.out.println();

        int media =0;

        System.out.print("DIAGONAL: ");
        for (int i = 0; i < datos.length; i++) {
            System.out.print(diagonal[i]+" ");
            media=diagonal[i]+media;
        }
        System.out.println();
        System.out.println("MEDIA: " +media/10);


        int maximo = diagonal[0];

        for (int j = 0; j < 10; j++) {
            if (diagonal[j] >= maximo) {
                maximo = diagonal[j];
            }
        }
        System.out.println("MÁXIMO: "+maximo);


        int minimo = diagonal[0];

        for (int j = 0; j < 10; j++) {
            if (diagonal[j] <= minimo) {
                minimo = diagonal[j];
            }
        }
        System.out.println("MÍNIMO: "+minimo);

    }
}


