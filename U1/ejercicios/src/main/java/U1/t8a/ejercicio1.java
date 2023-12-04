package U1.U1.t8a;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        double num;
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Dime un numero");
        num = teclado.nextDouble();
        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println(num + " Es par");
            }
            if (num > 0) {
                System.out.println(num + " Es positivo");
            }
            System.out.println("Su cuadrado es " + num * num);

            Scanner teclado1;
            teclado1 = new Scanner(System.in);
            System.out.println("Dime otro numero");
            num = teclado1.nextDouble();
        }
    }
}
