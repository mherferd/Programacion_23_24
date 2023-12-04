package U1.U1.t8b;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        int numero, contador = 1;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Dime un numero");
        numero = teclado.nextInt();

        while (contador < 6) {
            System.out.print(numero);
            System.out.print("  " + numero * numero);
            System.out.println("  " + numero * numero * numero);
            numero = numero + 1;
            contador++;

        }
    }
}
