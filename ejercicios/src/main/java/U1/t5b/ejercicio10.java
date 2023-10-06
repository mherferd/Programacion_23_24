package U1.t5b;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado;
        int horas, minutos;
        teclado = new Scanner(System.in);
        System.out.print("Introduzca la hora actual (horas): ");
        horas = teclado.nextInt();
        teclado = new Scanner(System.in);
        System.out.print("Introduzca la hora actual (minutos): ");
        minutos = teclado.nextInt();

        int actual = (horas * 3600) + (minutos * 60);
        System.out.println("Quedan: " + (86400 - actual) + " segundos para llegar a la medianoche");
    }
}
