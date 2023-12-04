package U1.U1.intro_bucles_condicionales.U1_Entregable;

import java.util.Scanner;

public class EJ4 {

    public static void main(String[] args) {

        int numero, numero2, contador = 1, n1 = 0, n2 = 0, divisor = 0, contador1 = 0, divisor2 = 0, contador2 = 0;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Introduce un numero con una cantidad de cifras par");
        numero = teclado.nextInt();
        numero2 = numero;

        while (numero / 10 >= 1) {
            contador++;
            numero = numero / 10;
        }

        while (contador % 2 != 0) {
            contador = 1;
            Scanner teclado2;
            teclado2 = new Scanner(System.in);
            System.out.println("Introduce un numero con una cantidad de cifras par");
            numero = teclado2.nextInt();
            while (numero / 10 > 1) {
                contador++;
                numero = numero / 10;
            }
        }

        if (contador % 2 == 0) {
            n1 = (int) ((double) numero2 % Math.pow(10, contador / 2));
            System.out.println(n1);
            n2 = (int) ((double) numero2 / Math.pow(10, contador / 2));
            System.out.println(n2);

            for (divisor = 2; divisor < n1; divisor++) {
                if (n1 % divisor == 0) {
                    contador1++;
                }
            }
            if (contador1 != 0) {
                System.out.println(n1 + " No es número primo");
            } else {
                System.out.println(n1 + " Es número primo");
            }

            for (divisor2 = 2; divisor2 < n2; divisor2++) {
                if (n2 % divisor2 == 0) {
                    contador2++;
                }
            }
            if (contador2 != 0) {
                System.out.println(n2 + " No es número primo");
            } else {
                System.out.println(n2 + " Es número primo");
            }


        }


    }
}


