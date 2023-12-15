package U3.t3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {

        int [][] datos = new int[5][5];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j]= i+j;
                System.out.print(datos[i][j]);
            }
            System.out.println();
        }


    }
}
