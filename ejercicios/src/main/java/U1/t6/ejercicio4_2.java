package U1.t6;

import java.util.Scanner;

public class ejercicio4_2 {
    public static void main(String[] args) {
        Scanner teclado;
        byte num1, num2, menor = 0;


        teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        num1 = teclado.nextByte();

        teclado = new Scanner(System.in);
        System.out.print("Introduzca otro numero: ");
        num2 = teclado.nextByte();

        (menor) = (num2 < num1) ? num2 : num1;
        System.out.println(menor);
    }
}
