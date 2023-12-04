package U1.U1.t5b;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado;
        double num1, num2, num3;
        teclado = new Scanner(System.in);
        System.out.print("Introduzca la primera nota: ");
        num1 = teclado.nextDouble();
        teclado = new Scanner(System.in);
        System.out.print("Introduzca la segunda nota: ");
        num2 = teclado.nextDouble();
        teclado = new Scanner(System.in);
        System.out.print("Introduzca la tercera nota: ");
        num3 = teclado.nextDouble();

        int media = (int) Math.round((num1 + num2 + num3) / 3);
        if (media < 5)
            System.out.println("La nota media es: " + (media) + ", Insuficiente");
        else {
            if (media < 6) {
                System.out.println("La nota media es: " + (media) + ", Suficiente");
            } else {
                if (media < 7) {
                    System.out.println("La nota media es: " + (media) + ", Bien");
                } else {
                    if (media < 9) {
                        System.out.println("La nota media es: " + (media) + ", Notable");
                    } else {
                        if (media >= 9) {
                            System.out.println("La nota media es: " + (media) + ", Sobresaliente");
                        }
                    }

                }
            }
        }
    }
}
