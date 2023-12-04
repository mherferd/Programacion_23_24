package U1.U1.t5b;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado;
        double num1, num2, num3;
        teclado = new Scanner(System.in);
        System.out.print("Introduzca la primera nota: ");
        num1 = teclado.nextDouble();
        teclado = new Scanner(System.in);
        System.out.print("Introduzca la segunda nota: ");
        num2 = teclado.nextDouble();
        teclado = new Scanner(System.in);
        System.out.print("Introduzca la tercera nota: ");
        num3 = teclado.nextDouble();

        System.out.println("La nota media es: " + ((num1 + num2 + num3) / 3));
    }
}
