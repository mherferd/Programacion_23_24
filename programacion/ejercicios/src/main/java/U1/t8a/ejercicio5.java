package U1.U1.t8a;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        int numero, numero2, num;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Dime un numero mínimo");
        numero = teclado.nextInt();

        Scanner teclado2;
        teclado2 = new Scanner(System.in);
        System.out.println("Dime un numero maximo");
        numero2 = teclado2.nextInt();

        Scanner teclado3;
        teclado3 = new Scanner(System.in);
        System.out.println("Dime un numero dentro del rango solicitado");
        num = teclado3.nextInt();

        while ((num < numero) || (num > numero2)) {

            Scanner teclado4;
            teclado4 = new Scanner(System.in);
            System.out.println("Te he dicho dentro del rango solicitado, introduce otro valor");
            num = teclado4.nextInt();


        }

    }
}
