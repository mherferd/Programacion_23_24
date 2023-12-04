package U1.U1.t5;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado;
        int num1;
        teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        num1 = teclado.nextInt();
        if (num1 < 0) {
            System.out.println("el número " + num1 + " es negativo");
        } else {
            System.out.println("el número " + num1 + " es positivo");

        }
    }
}
