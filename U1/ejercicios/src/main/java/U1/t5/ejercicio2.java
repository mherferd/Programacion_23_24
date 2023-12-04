package U1.U1.t5;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado;
        int num1;
        teclado = new Scanner(System.in);
        System.out.print("Introduzca el numero 12: ");
        num1 = teclado.nextInt();
        if (num1 == 12) {
            System.out.println("Bien hecho");
        } else {
            System.out.println("Te he dicho el 12, no el " + num1);

        }
    }
}
