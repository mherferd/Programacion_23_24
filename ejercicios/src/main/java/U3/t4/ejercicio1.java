package U3.t4;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        int contador = 0, n;

        int[] array = new int[100];

        for (int j = 0; j < 100; j++) {
            int numero = (int) (Math.random() * 500);
            array[j] = numero;
            if (j%20==0){
                System.out.println();
                System.out.print(array[j]+" ");
            }
            else {
                System.out.print(array[j]+" ");
            }
        }
        System.out.println();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Que quieres destacar? (1- mínimo, 2 -máximo): ");
        n = teclado.nextInt();

        if (n == 2) {

            int maximo = array[0];

            for (int j = 0; j < 100; j++) {
                if (array[j] >= maximo) {
                    maximo = array[j];
                }
            }

            for (int j = 0; j < 100; j++) {
                if (array[j]==maximo){
                    System.out.print("**"+maximo+"** ");}
                if (j%20==0){
                    System.out.println();
                    System.out.print(array[j]+" ");

                }
                else {
                    System.out.print(array[j]+" ");
                }}
        }

        if (n == 1) {

            int minimo = array[0];

            for (int j = 0; j < 100; j++) {
                if (array[j] <= minimo) {
                    minimo = array[j];
                }
            }

            int posicion=0;

            for (int j = 0; j < 100; j++) {
                if (array[j]==minimo){
                    System.out.print("**"+minimo+"** ");}
                if (j%20==0){
                    System.out.println();
                    System.out.print(array[j]+" ");
                }
                else {
                    System.out.print(array[j]+" ");
                }}



        }
    }
}
