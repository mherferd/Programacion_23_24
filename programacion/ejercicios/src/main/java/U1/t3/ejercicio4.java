package U1.U1.t3;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado;
        float num1;

        teclado = new Scanner(System.in);
        System.out.print("Dame una longitud en millas: ");
        num1 = teclado.nextFloat();
        System.out.print("Eso equivale a: " + (num1 * 1.609) + " metros");
    }
}
