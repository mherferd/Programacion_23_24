package U1.t3;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado;
        short num1;

        teclado = new Scanner(System.in);
        System.out.print("Introduzca su año de nacimiento: ");
        num1 = teclado.nextShort();
        System.out.print("Usted tiene: " + (2023 - num1) + " años");
    }
}
