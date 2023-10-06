package U1.t5b;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado;

        teclado = new Scanner(System.in);
        System.out.print("Introduzca su dia: ");
        int dia = teclado.nextInt();
        switch (dia) {
            case 1:
                System.out.println("A primera hora toca Programación");
                break;
            case 2:
                System.out.println("A primera hora toca FOL");
                break;
            case 3:
                System.out.println("A primera hora toca Sistemas Informárticos");
                break;
            case 4:
                System.out.println("A primera hora toca FOL");
                break;
            case 5:
                System.out.println("A primera hora toca programación");
                break;
        }
    }
}
