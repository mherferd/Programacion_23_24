package U1.U1.t8b;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        int numero, contador = 0, pos = 0, neg = 0;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Dime un numero");
        numero = teclado.nextInt();

        while (contador < 10) {
            if (numero < 0) {
                neg++;
            } else {
                pos++;
            }

            Scanner teclado2;
            teclado2 = new Scanner(System.in);
            System.out.println("Dime un numero");
            numero = teclado2.nextInt();

            contador++;

        }
        System.out.println("Hay " + pos + " numeros positivos y " + neg + " numeros negativos");
    }
}
