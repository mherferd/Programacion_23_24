package U1.U1.t5b;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado;

        teclado = new Scanner(System.in);
        System.out.print("Introduzca que hora es : ");
        int dia = teclado.nextInt();
        if (dia >= 6 && dia <= 12) {
            System.out.println("Buenos días");
        } else {
            if (dia >= 13 && dia <= 20) {
                System.out.print("Buenas tardes");
            } else {
                if (dia >= 21 && dia <= 5) {
                    System.out.print("Buenas noches");
                }
            }
        }


    }
}