package U3.examen_U3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las filas del array: ");
        int filas = teclado.nextInt();

        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Introduce las columnas del array: ");
        int columnas = teclado2.nextInt();

        int[][] datos = new int[filas][columnas];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j] = (int) (Math.random() * (64)+14);
                System.out.print(datos[i][j]);
                System.out.print(" | ");
            }

            System.out.println();
        }


        int contador=0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (((i%2==0)&&(j%2==0))|(i==0 && j==0)){
                contador++;
            }}
        }

        int [] pares = new int [contador];

        int contador2=0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (((i%2==0)&&(j%2==0))|(i==0 && j==0)){
                    pares[contador2]=datos[i][j];
                    contador2++;
                }}
        }


        contador=0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (((i%2!=0)&&(j%2!=0))){
                    contador++;
                }}
        }

        int [] impares = new int [contador];

        contador2=0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (((i%2!=0)&&(j%2!=0))){
                    impares[contador2]=datos[i][j];
                    contador2++;
                }}
        }
        System.out.println("PARES: "+Arrays.toString(pares));

        System.out.println("IMPARES: "+Arrays.toString(impares));

        int media_pares =0;
        int media_impares =0;

        for (int i = 0; i < pares.length; i++) {
            media_pares=pares[i]+media_pares;
        }
        System.out.println();

        for (int i = 0; i < impares.length; i++) {
            media_impares=impares[i]+media_impares;
        }
        System.out.println();
        System.out.println("SUMA DE PARES: " +media_pares);
        System.out.println("SUMA DE IMPARES: " +media_impares);
        System.out.println("MEDIA DE PARES: " +media_pares/pares.length);
        System.out.println("MEDIA DE IMPARES: " +media_impares/impares.length);


        int maximo = pares[0];

        for (int j = 0; j < pares.length; j++) {
            if (pares[j] >= maximo) {
                maximo = pares[j];
            }
        }
        System.out.println("MÁXIMO DE PARES: "+maximo);

        maximo = impares[0];

        for (int j = 0; j < impares.length; j++) {
            if (impares[j] >= maximo) {
                maximo = impares[j];
            }
        }
        System.out.println("MÁXIMO DE IMPARES: "+maximo);


        int minimo = pares[0];

        for (int j = 0; j < pares.length; j++) {
            if (pares[j] <= minimo) {
                minimo = pares[j];
            }
        }
        System.out.println("MÍNIMO DE PARES: "+minimo);



        minimo = impares[0];

        for (int j = 0; j < impares.length; j++) {
            if (impares[j] <= minimo) {
                minimo = impares[j];
            }
        }
        System.out.println("MÍNIMO DE IMPARES: "+minimo);

    }


}

