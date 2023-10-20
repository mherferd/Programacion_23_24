package U1.t8b;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        int numero = teclado.nextInt();
        int numero2 = 0;

        while (numero > 0) {
            numero2 = (numero2 * 10) + (numero % 10);
            numero /= 10;
        }
        System.out.println(numero2);
    }
}
