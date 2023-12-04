package U1.U1.t7;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        int a, b;
        int variable = 0;
        Scanner teclado;

        teclado = new Scanner(System.in);
        System.out.print("Dime un valor : ");
        a = teclado.nextInt();

        teclado = new Scanner(System.in);
        System.out.print("Dime un valor : ");
        b = teclado.nextInt();

        System.out.println("a= " + a + "    " + "b= " + b);

        variable = a;
        a = b;
        b = variable;

        System.out.println("--------------INTERCAMBIO----------------");
        System.out.println("a= " + a + "    " + "b= " + b);

    }
}
