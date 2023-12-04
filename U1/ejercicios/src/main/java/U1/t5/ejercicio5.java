package U1.U1.t5;

import java.util.Scanner;

public class ejercicio5 {
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

        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("el " + num1 + " es el mayor");
        } else {
            if ((num2 > num1) && (num2 > num3)) {
                System.out.println("el " + num2 + " es el mayor");
            } else {
                if ((num3 > num1) && (num3 > num2)) {
                }
                System.out.println("el " + num3 + " es el mayor");


            }

        }
    }
}
