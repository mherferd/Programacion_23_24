package U3.ENTREGABLE;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        int n;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos caracteres tiene el array? ");
        n = teclado.nextInt();

        int[] a = new int[n];

        for (int j = 0; j < n; j++) {
            Scanner teclado2 = new Scanner(System.in);
            System.out.println("Introduzca enteros ");
            a[j] = teclado2.nextInt();
        }

        System.out.println(Arrays.toString(a));
        boolean resultado = funcion(a);
        System.out.println(resultado);

        eliminarepetidos(a);
        int[] a_final=eliminarepetidos(a);
        System.out.println(Arrays.toString(a_final));

    }

    public static boolean funcion(int[] a) {
        boolean variable = false;
        int contador = 1;
        for (int j = 0; j < a.length; j++) {
            for (int i = contador; i < a.length; i++) {
                if (a[j] == a[i]) {
                    variable = true;
                }
            }
            contador++;
        }
        return variable;
    }

    public static int [] eliminarepetidos(int[] a) {
        int[] arrayfinal = new int[0];
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (!repetidos(arrayfinal, a[i])) {
                arrayfinal=Arrays.copyOf(arrayfinal, arrayfinal.length+1);
                arrayfinal[contador] = a[i];
                contador++;}
    }
        return arrayfinal;
    }


    public static boolean repetidos (int[] a, int numero) {
        for (int j = 0; j < a.length; j++) {
            if (a[j] == numero) {
                return true;
            }
        }
        return false;
    }
}






