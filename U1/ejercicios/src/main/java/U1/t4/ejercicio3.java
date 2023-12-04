package U1.U1.t4;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado;
        float num1, num2, num3;

        teclado = new Scanner(System.in);
        System.out.print("Introduzca la primera nota: ");
        num1 = teclado.nextFloat();
        System.out.print("Introduzca la segunda nota: ");
        num2 = teclado.nextFloat();
        System.out.print("Introduzca la tercera nota: ");
        num3 = teclado.nextFloat();

        int media = (int) ((num1 + num2 + num3) / 3);


        System.out.print("Su media es: " + media);
    }
}
