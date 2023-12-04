package U1.U1.t8b;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        int numero, contador = 2, n1 = 0, n2 = 1, n3 = 0;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Dime hasta que término quieres ver la serie Fibonacci");
        numero = teclado.nextInt();
        System.out.println(n1);
        System.out.println(n2);


        while (contador < numero) {
            n3 = n2 + n1;
            System.out.println(n3);
            contador++;
            if (contador % 2 == 1) {
                n1 = n3;
            } else {
                n2 = n3;
            }


        }
    }
}
