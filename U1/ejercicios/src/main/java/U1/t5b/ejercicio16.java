package U1.U1.t5b;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        {
            Scanner teclado;
            Long num1;
            teclado = new Scanner(System.in);
            System.out.println("Introduzaca un número");
            num1 = teclado.nextLong();
            System.out.println("La ultima cifra es " + num1 % 10);
        }

    }
}
