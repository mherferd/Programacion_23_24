package U3.ENTREGABLE;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        int n;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos caracteres tiene el array? ");
        n = teclado.nextInt();

        int[] a = new int[n];

        for (int j = 0; j < a.length; j++) {
            a[j] = (int) (Math.random() *  47 +18);
            System.out.print(a[j]);
            System.out.print(" | ");}

        System.out.println();
        paresImpares(a);
        int[] pares=paresImpares(a);
        System.out.println(Arrays.toString(pares));
    }


    public static int[] paresImpares(int a[]) {
        int[] resultado = new int[a.length];
        int pares = 0;
        int impares = a.length - 1;

        for (int j = 0; j < a.length; j++) {
            if (a[j] % 2 == 0) {
                resultado[pares] = a[j];
                pares++;
            }}
        for (int j = 0; j < a.length; j++) {
        if (a[j] % 2 != 0) {
            resultado[pares] = a[j];
            pares++;
        }}
        return resultado;
    }
}


