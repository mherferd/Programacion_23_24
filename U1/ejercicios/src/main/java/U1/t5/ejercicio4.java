package U1.U1.t5;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado;
        int num1, num2;
        teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        num1 = teclado.nextInt();
        teclado = new Scanner(System.in);
        System.out.print("Introduzca otro numero: ");
        num2 = teclado.nextInt();

        if ((num1 % 2 == 1) && (num2 % 2 == 1)) {
            System.out.println("no hay numeros pares");
        } else {
            if (((num1 % 2 == 1) && (num2 % 2 == 0)) || ((num1 % 2 == 0) && (num2 % 2 == 1))) {
                System.out.println("hay 1 numero par");
            } else {
                System.out.println("hay 2 numero pares");


            }

        }
    }
}

