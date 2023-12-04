package U3.Entregable_PRA;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array: ");
        int cantidad = teclado.nextInt();

        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Introduce el valor máximo ");
        int a = teclado2.nextInt();

        Scanner teclado3 = new Scanner(System.in);
        System.out.println("Introduce el valor mínimo: ");
        int b = teclado3.nextInt();


        aleatorioDeArray(a,b,cantidad);
        int[] resultado=aleatorioDeArray(a, b, cantidad);
        System.out.println(Arrays.toString(resultado));


    }
    public static int[] aleatorioDeArray(int a, int b, int cantidad) {
        int [] resultado = new int [cantidad];

        for (int j=0; j<cantidad; j++){
            resultado[j]= (int) (Math.random() * (a-b)+b);
        }

        return resultado;
    }}