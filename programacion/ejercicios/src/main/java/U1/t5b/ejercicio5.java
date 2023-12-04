package U1.U1.t5b;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        System.out.print("Este programa resuelve ecuaciones de primer grado del tipo ax+b=0");
        Scanner teclado;
        double num1, num2;
        teclado = new Scanner(System.in);
        System.out.print("Introduzca el valor de a: ");
        num1 = teclado.nextDouble();
        teclado = new Scanner(System.in);
        System.out.print("Introduzca el valor de b: ");
        num2 = teclado.nextDouble();

        if (num1 == 0) {
            System.out.print("Esa ecuación no tiene solución real");
        } else {
            System.out.println("x = " + (-num2 / num1));
        }
    }
}
