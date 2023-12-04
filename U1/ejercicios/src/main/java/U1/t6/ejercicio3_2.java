package U1.U1.t6;

import java.util.Scanner;

public class ejercicio3_2 {
    public static void main(String[] args) {
        int variable = 0;
        int numero;
        Scanner teclado;

        teclado = new Scanner(System.in);
        System.out.print("Dime un valor : ");
        int num = teclado.nextInt();

        (numero) = (num % 2 == 0) ? variable + 1 : variable;
        System.out.println(numero);
    }
}
