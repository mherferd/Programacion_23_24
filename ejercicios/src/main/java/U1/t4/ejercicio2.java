package U1.t4;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado;
        float num1, num2;

        teclado = new Scanner(System.in);
        System.out.print("Introduzca la primera nota: ");
        num1 = teclado.nextFloat();
        System.out.print("Introduzca la segunda nota: ");
        num2 = teclado.nextFloat();

        System.out.print("Su media es: " + ((num1 + num2) / 2));
    }
}
