package U3.t3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {

        int contador=0, n;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos caracteres tiene el array? ");
        n = teclado.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int j = 0; j < n; j++) {
            Scanner teclado2 = new Scanner(System.in);
            System.out.println("Introduzca numeros: ");
            a[j]= teclado2.nextInt();
            if ( a[j]%2==0){
                b[j]=a[j];
            }
            else {j--;
            contador++;}
        }

        System.out.println(Arrays.toString(a));

        funcion(contador);


    }

        public static void funcion(int contador){
            System.out.println("A introducido un total de "+contador+" numeros impares");
        }



}
