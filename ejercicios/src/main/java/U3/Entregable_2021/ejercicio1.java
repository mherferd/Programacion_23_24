package U1.ejercicios.src.main.java.U3.Entregable_2021;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        int[] b = new int[10];
        int[] a = new int[10];

        int a_pos=0;


        for (int j = 0; j < 10; j++) {
            Scanner teclado2 = new Scanner(System.in);
            System.out.println("Introduzca enteros ");
            b[j] = teclado2.nextInt();
            int primo1 = 0;
            for (int divisor = 2; divisor < b[j]; divisor++) {
                if (b[j] % divisor == 0) {
                    a[a_pos]=b[j];
                    a_pos++;
                }
            }
        }
    }
}
