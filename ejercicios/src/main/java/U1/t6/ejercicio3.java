package U1.t6;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        int variable = 0;
        Scanner teclado;

        teclado = new Scanner(System.in);
        System.out.print("Dime un valor : ");
        int num = teclado.nextInt();

        if (num % 2 == 0) {
            System.out.println("El valor es par: ");
            variable++;
            System.out.println(variable);
        } else {
            System.out.println("El valor es impar");
            System.out.println(variable);
        }

    }
}