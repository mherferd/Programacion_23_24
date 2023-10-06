package U1.t5;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado;
        float num1;
        final double gravedad = 9.8;

        teclado = new Scanner(System.in);
        System.out.print("Introduzca el tiempo: ");
        num1 = teclado.nextFloat();
        double velocidad = (num1 * gravedad);
        if (velocidad != 0) {
            System.out.print("La velocidad (Gravedad x Tiempo) equivale a : " + num1 * gravedad);
        } else {
            System.out.print("Tiempo Incorrecto");
        }
    }
}
