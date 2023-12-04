package U1.U1.t2;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame una longitud en millas: ");
        int num1 = teclado.nextInt();
        System.out.print("Eso equivale a: " + (num1 * 1609) + " metros");
    }
}
