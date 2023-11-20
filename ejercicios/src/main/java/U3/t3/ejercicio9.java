package U3.t3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        int contador=0;

        int[] a = new int[6];
        int[] ganadora = new int[6];

        for (int j = 0; j < 6; j++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduzca sus numeros del boleto ");
            a[j] = teclado.nextInt();
        }
        System.out.println("SU COMBINACION: "+Arrays.toString(a));

        for (int j = 0; j < 6; j++) {
            int numero = (int) (Math.random() * 9);
            ganadora[j] = numero;
        }
        System.out.println("COMBINACION GANADORA: "+Arrays.toString(ganadora));

        for (int j = 0; j < 6; j++) {
            if (ganadora[j]==a[j]){
                contador++;
            }
        }
        System.out.println("ACIERTOS: "+contador);


    }
}
