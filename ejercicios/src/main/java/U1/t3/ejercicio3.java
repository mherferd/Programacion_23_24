package U1.t3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado;
        float num1, num2;

        teclado = new Scanner(System.in);
        System.out.print("Introduzca el primer numero: ");
        num1 = teclado.nextFloat();
        System.out.print("Introduzca el segundo numero: ");
        num2 = teclado.nextFloat();

        System.out.print("Su division es: " + (num1 / num2));
    }
}
