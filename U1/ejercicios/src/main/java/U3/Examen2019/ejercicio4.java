package U3.Examen2019;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array: ");
        int n = teclado.nextInt();
        int[] datos = new int[n];

        for (int i = 0; i < datos.length; i++) {
            Scanner teclado2 = new Scanner(System.in);
            System.out.println("Introduce un numero: ");
            int numero = teclado.nextInt();
            ;
            datos[i] = numero;
        }

        filtraCapicuas(datos);
        int[] resultado = filtraCapicuas(datos);
        System.out.println(Arrays.toString(resultado));

    }

    public static int[] filtraCapicuas(int[] datos) {
        int contador = 0;

        for (int i = 0; i < datos.length; i++) {

            int num = datos[i];
            int numInvertido = 0;
            int numOriginal = num;

            while (num > 0) {
                int digito = num % 10;
                numInvertido = numInvertido * 10 + digito;
                num /= 10;
            }

            if (numOriginal == numInvertido) {
                contador++;
            }
        }

        if (contador == 0) {
            return new int[]{-1};
        }


        int[] resultado = new int[contador];
        int contador2 = 0;


        for (int i = 0; i < datos.length; i++) {
            int num = datos[i];
            int numInvertido = 0;

            while (num > 0) {
                int digito = num % 10;
                numInvertido = numInvertido * 10 + digito;
                num /= 10;
            }

            if (numInvertido == datos[i]) {
                resultado[contador2] = datos[i];
                contador2++;
            }
        }

        return resultado;
    }
}


