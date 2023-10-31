package U1.Examen;

import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {

        int numero, numero2=0, contador = 1, n1=0, n2=0, primo1=0, primo2=0;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Introduce un numero con 6 cifras");
        numero = teclado.nextInt();
        numero2=numero;

        while (numero / 10 >= 1) {
            contador++;
            numero = numero / 10;
        }

        while (contador != 6) {
            contador = 1;
            Scanner teclado2;
            teclado2 = new Scanner(System.in);
            System.out.println("Introduce un numero con 6 cifras ");
            numero = teclado2.nextInt();
            numero2=numero;
            while (numero / 10 >= 1) {
                contador++;
                numero = numero / 10;
            }
        }

        System.out.println(numero2);

        n2 = (int) ((double) numero2 / Math.pow(10, contador / 2));
        n1 = (int) ((double) numero2 % Math.pow(10, contador / 2));

        for (int divisor = 2; divisor < n2; divisor++) {
            if (n2 % divisor == 0) {
                primo1++;
            }
        }
        if (primo1 != 0) {
            System.out.println(n2 + " - No es un número primo");
        } else {
            System.out.println(n2 + " - Es un número primo");
        }

        for (int divisor2 = 2; divisor2 < n1; divisor2++) {
            if (n1 % divisor2 == 0) {
                primo2++;
            }
        }
        if (primo2 != 0) {
            System.out.println(n1 + " - No es número primo");
        } else {
            System.out.println(n1+ " - Es número primo");
        }

    }


    }

