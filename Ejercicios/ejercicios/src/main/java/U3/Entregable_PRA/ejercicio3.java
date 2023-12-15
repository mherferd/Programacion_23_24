package U3.Entregable_PRA;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {
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

        filtraCon8(datos);
        int[] resultado=filtraCon8(datos);
        System.out.println(Arrays.toString(resultado));

    }
    public static int[] filtraCon8(int datos[]) {

        int contador = 0, contador2=0;
        for (int num : datos) {
            int temp = num;
            while (temp != 0) {
                if (temp % 10 == 8) {
                    contador++;
                    break;
                }
                temp /= 10;
            }
        }

        if (contador == 0) {
            return new int[]{-1};
        }

        int[] resultado = new int[contador];


        for (int num : datos) {
            int temp = num;
            while (temp != 0) {
                if (temp % 10 == 8) {
                    resultado[contador2++] = num;
                    break;
                }
                temp /= 10;
            }
        }

        return resultado;
    }}

