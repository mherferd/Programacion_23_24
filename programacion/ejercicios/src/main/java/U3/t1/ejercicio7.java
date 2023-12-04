package U3.t1;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        int numero;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        numero = teclado.nextInt();

        funcion(numero);
    }

    public static int funcion(int numero) {
        int primo1 = 0;

        for (int divisor = 2; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                primo1++;
            }
        }
        if (primo1 != 0) {
            System.out.println(numero + " - No es un número primo");
        } else {
            System.out.println(numero + " - Es un número primo");

        }
        return numero;
    }
}

