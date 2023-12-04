package U1.U1.t5;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado;
        int num1;
        teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        num1 = teclado.nextInt();
        if (num1 % 2 == 1) {
            System.out.println("el número " + num1 + " es impar");
        } else {
            System.out.println("el número " + num1 + " es par");

        }
    }
}
