package U3.t3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        int contador = 0, contadorpos=0, contadorneg=0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos numeros vas a introducir: ");
        int i = teclado.nextInt();

        int[] t = new int[i];
        int[] pos = new int[i];
        int[] neg = new int[i];
        int j = 0;
        for (j = 0; j < i; j++) {
            Scanner teclado2 = new Scanner(System.in);
            System.out.println("Introduce " + i + " numeros: ");
            t[j] = teclado2.nextInt();
            if (t[j] == 0) {
                contador++;
            }}

            System.out.println(contador);

        for (j = 0; j < i; j++) {
            if (t[j] < 0){
            neg[j] = t[j];
            contadorneg++;}
            else {
            neg[j]= 0;}
        }

        for (j = 0; j < i; j++) {
            if (t[j] > 0){
                pos[j] = t[j];
                contadorpos++;
            }
            else {
                pos[j]= 0;}
        }
        for (j = 0; j < i; j++) {
        }

        for (j = 0; j < i; j++) {
        }
        System.out.println(Arrays.toString(neg));



    }
}

