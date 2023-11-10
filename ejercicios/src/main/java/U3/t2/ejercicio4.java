package U3.t2;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        String palabra;
        int contador = 0;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        palabra = teclado.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            char letra = (palabra.charAt(i));
            if (letra == ' ') {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " espacios");
    }
}

