package U3.t2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        String car1;
        int hola =0;

        do {
            Scanner teclado;
            teclado = new Scanner(System.in);
            System.out.println("Introduce una palabra: ");
            car1 = teclado.nextLine();

            if (car1.equals("fin")) {
                System.out.println(car1);
            }

        }
        while (hola==0);
    }
}