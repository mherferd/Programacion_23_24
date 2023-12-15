package U3.t3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {

        int t, contador=0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos caracteres va a introducir ");
        t = teclado.nextInt();


        int[] sinRepetidos= new int [t];
        int[] array2 = new int [t];

        int[] fin = new int[12];

        for (int j = 0; j < t; j++) {
            Scanner teclado2 = new Scanner(System.in);
            System.out.println("Introduzca enteros ");
            sinRepetidos[j] = teclado2.nextInt();
        }

        System.out.println(Arrays.toString(sinRepetidos));

        for (int j = 0; j < t; j++) {
            for (int i=j+1; i<t; i++){
            if (sinRepetidos[j]==sinRepetidos[i]){
                array2[j]= sinRepetidos[j];
            }}
        }
        int[] array3 = new int [t-contador];
        for (int j = 0; j < t; j++) {
            array3[j]=sinRepetidos[j]-array2[j];
            if (array3[j]==0) {
            contador++;}
        }

        System.out.println(Arrays.toString(array3));

    }
}
