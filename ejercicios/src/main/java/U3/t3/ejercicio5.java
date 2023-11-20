package U3.t3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {

        int[] b = new int[6];
        int[] a = new int[6];
        int[] fin = new int[12];

        for (int j = 0; j < 6; j++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduzca enteros ");
            a[j] = teclado.nextInt();
        }

        for (int j = 0; j < 6; j++) {
            Scanner teclado2 = new Scanner(System.in);
            System.out.println("Introduzca enteros ");
            b[j] = teclado2.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);

        for (int j = 0; j < 6; j++) {
            if (a[j] <= b[j]) {
                fin[j] = a[j];
        }}

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(fin));


    }
}

