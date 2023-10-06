package U1.t5b;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado;
        int num1;
        teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        num1 = teclado.nextInt();
        if ((num1 % 2 == 0) && (num1 % 5 == 0)) {
            System.out.println("el número " + num1 + " es par y divisible entre 5");
        } else {
            if ((num1 % 2 == 0) || (num1 % 5 == 0)) {
                if (num1 % 2 == 0) {
                    System.out.println("el número " + num1 + " es par");
                } else {
                    System.out.println("el número " + num1 + " es divisible entre 5");
                }
            } else {
                System.out.println("el número " + +num1 + " no es par ni divisible entre 5");

            }
        }
    }
}
