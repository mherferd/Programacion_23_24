package U3.t3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos numeros vas a introducir: ");
        int i = teclado.nextInt();

        int[] a = new int[i];
        int j =0;
        for (j = 0; j < i; j++) {
            Scanner teclado2 = new Scanner(System.in);
            System.out.println("Introduce un numero: ");
            a[j] = teclado2.nextInt();
        }

        System.out.print("El array inverso es: ");
        for (j = a.length-1; j >= 0; j--) {
            System.out.print(a[j] +" ");
        }



    }
}
