package U1.t2;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame una temperatura en grados celcius: ");
        int num1 = teclado.nextInt();
        System.out.print("Eso equivale a: " + (num1 * 9 / 5 + 32) + " grados Fahrenheit");
    }
}
