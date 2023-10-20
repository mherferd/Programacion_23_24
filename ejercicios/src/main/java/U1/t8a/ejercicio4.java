package U1.t8a;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        int numero;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Dime un numero");
        numero = teclado.nextInt();

        while (numero > 1) {
            System.out.println(numero - 1);
            numero = numero - 1;

        }


    }

}
