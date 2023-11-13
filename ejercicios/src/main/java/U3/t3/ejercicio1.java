package U3.t3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio1 {
    public static void main( String args[] ) {
        double[] a = new double[5];
        int i;

        for (i = 0; i < 5; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce un numero: ");
            a[i] = teclado.nextDouble();
        }

        System.out.println(Arrays.toString(a));


    }
}
