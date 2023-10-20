package U1.t8a;

import java.util.Scanner;

public class ejercicio15 {

    public static void main(String[] args) {
        int numero, contador = 1;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Dime un numero");
        numero = teclado.nextInt();

        while (numero > 1) {
            System.out.println(numero - 1);
            while ((numero % contador != 0) && (numero != contador)) {
                System.out.println("No primo");
                contador++;
            }
            numero = numero - 1;

        }
    }

}
