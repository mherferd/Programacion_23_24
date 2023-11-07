package U3.t1;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        int numero;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        numero = teclado.nextInt();

        funcion(numero);
    }

    public static int funcion(int numero) {

        for (int divisor = 2; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                divisoresPrimos(divisor);
            }
        }
        return numero;
    }
    public static int divisoresPrimos(int divisor) {
        int primo1=0;
        for (int divisor2 = 2; divisor2 < divisor; divisor2++) {
            if (divisor % divisor2 == 0) {
                primo1++;
            }
        }
        if (primo1 == 0) {
            System.out.println(divisor + " - Es un número primo");
        }
        return divisor;
    }
}
