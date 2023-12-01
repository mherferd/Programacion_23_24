package U3.ENTREGABLE;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {
    //SI QUIERE QUE EL RESULTADO SEA TRUE, COMO LAS POSIBILIDADES
    // SON MUY BAJAS ES RECOMENDABLE CAMBIAR EL VALOR DE MATH.RANDOM A 1.
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array: ");
        int n = teclado.nextInt();
        int[][] datos = new int[n][n];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j] = (int) (Math.random() *  10)+1;
                System.out.print(datos[i][j]);
                System.out.print(" | ");}

            System.out.println();
        }
        System.out.println();
        System.out.println();

        boolean resultado = cuadradoMagico(datos);

        System.out.println(resultado);
    }


    public static boolean cuadradoMagico(int [][] datos) {
        boolean variable=false;

        int[] filas = new int [datos.length];

        for (int i=0; i<datos.length;i++){
            int suma=0;
        for (int j = 0; j < datos.length; j++) {
            suma=datos[1][j]+suma;
        }
            filas[i]=suma;
        }



        int[] columnas = new int [datos.length];

        for (int j=0; j<datos.length;j++){
            int suma=0;
            for (int i = 0; i < datos.length; i++) {
                suma=datos[i][j]+suma;
            }
            columnas[j]=suma;
        }


        int contador=0;
        for (int j=0; j<filas.length; j++){
            if (filas[j] == columnas[j]){
            contador++;}

        }

        if (contador==filas.length){
            return true;}


        return variable;

    }
}
