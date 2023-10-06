package U1.t5b;

import javax.swing.*;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado;
        int num1;
        teclado = new Scanner(System.in);
        System.out.print("Introduzca el número de horas trabajadas durante la semana: ");
        num1 = teclado.nextInt();
        int extras = num1 - 40;

        if (num1 <= 40) {
            System.out.println("El sueldo que le corresponde es de " + (num1 * 12) + " Euros");
        } else {
            System.out.println(("El sueldo que le corresponde es de " + ((40 * 12) + (extras * 16))) + " Euros");
        }
    }
}

