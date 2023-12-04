package U1.U1.t5b;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado;
        int num1, num2, num3;
        teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        num1 = teclado.nextInt();
        teclado = new Scanner(System.in);
        System.out.print("Introduzca otro numero: ");
        num2 = teclado.nextInt();
        teclado = new Scanner(System.in);
        System.out.print("Introduzca otro numero: ");
        num3 = teclado.nextInt();

        int ordenar = 0;
        if (num2 < num1) ;
        {
            ordenar = num2;
            num2 = num1;
            num1 = ordenar;
        }

        if (num3 < num1) ;
        {
            ordenar = num3;
            num3 = num1;
            num1 = ordenar;
        }

        if (num2 < num3) ;
        {
            ordenar = num2;
            num2 = num3;
            num3 = ordenar;
        }

        System.out.println(" " + num1 + " " + num2 + " " + num3);
    }
}