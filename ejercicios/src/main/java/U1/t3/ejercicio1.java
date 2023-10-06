package U1.t3;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado;
        byte num1, num2;

        teclado = new Scanner(System.in);
        System.out.print("Introduzca el primer numero: ");
        num1 = teclado.nextByte();
        System.out.print("Introduzca el segundo numero: ");
        num2 = teclado.nextByte();

        System.out.print("Su suma es: " + (num1 + num2));

    }
}
