package U1.U1.t8a;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        int contador = 1;
        int numero;

        Scanner teclado3;
        teclado3 = new Scanner(System.in);
        System.out.println("Dime un numero");
        numero = teclado3.nextInt();

        while (numero > 1) {
            contador = contador * numero;
            numero = numero - 1;

        }
        System.out.println("El factorial de ese numero es: " + contador);


    }
}
