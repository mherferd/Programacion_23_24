package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int numero = 3;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        numero = teclado.nextInt();
        System.out.println("El número introducido es: " + numero);
    }
}
