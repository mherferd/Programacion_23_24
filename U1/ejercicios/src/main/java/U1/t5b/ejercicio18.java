package U1.U1.t5b;

import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado;
        double num1, num2;
        String resp;

        teclado = new Scanner(System.in);
        System.out.print("Nota del primer control: ");
        num1 = teclado.nextInt();
        teclado = new Scanner(System.in);
        System.out.print("Nota del segundo control ");
        num2 = teclado.nextInt();
        double media = (num1 + num2) / 2;

        if (media >= 5) {
            System.out.println("Tu nota de programación es " + media);
        } else {
            teclado = new Scanner(System.in);
            System.out.println("¿Cuál ha sido tu resultado en la recuperación");
            resp = teclado.nextLine();
            if (resp.equals("apto")) {
                System.out.println("Tu nota de programación es 5");
            } else
                System.out.println(("Tu nota de programación es " + media));


        }

    }
}
