package U1.intro_bucles_condicionales.U1_Entregable;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {

        int numero, cifra, contador1 = 1, contador2 = 0, posicion = 0;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Introduce un número:");
        numero = teclado.nextInt();

        Scanner teclado2;
        teclado2 = new Scanner(System.in);
        System.out.println("Una cifra:");
        cifra = teclado2.nextInt();

        while (numero > 0) {
            if (numero % 10 == cifra) {
                contador2++;
                posicion = contador1;
            }
            numero = numero / 10;
            contador1++;
        }

        System.out.println("Resultado: ");
        System.out.println(contador2 + " ocurrencias");

        if (contador2 == 0) {
            System.out.println("Posiciones: Ninguna");
        } else {
            System.out.println("Posicion: " + contador1 + ("  ") + posicion);
        }


    }
}


