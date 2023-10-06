package U1.t2;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el primer numero: ");
        int num1 = teclado.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        int num2 = teclado.nextInt();

        System.out.print("Su division es: ");
        System.out.println(num1 / num2);
    }
}
