package U1.t4;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado;
        float num1;

        teclado = new Scanner(System.in);
        System.out.print("Introduzca su nota: ");
        num1 = teclado.nextFloat();
        int media = Math.round(num1);
        System.out.println("Su media es " + media);
    }
}
