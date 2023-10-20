package U1.t8b;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        int intento, contador = 0;
        int numero = (int) (Math.random() * 9999);

        System.out.println(numero);

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("¿Cuál es el código de la caja fuerte?");
        intento = teclado.nextInt();

        while (contador < 3) {
            if (intento == numero) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                contador = 3;
            } else {
                System.out.println("Incorrecto tiene " + (3 - contador) + " intentos");
                Scanner teclado1;
                teclado1 = new Scanner(System.in);
                System.out.println("Dime otro numero");
                intento = teclado1.nextInt();
                contador++;
            }

        }

    }
}

