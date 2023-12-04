package U3.t1;

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {

        int numero;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        numero = teclado.nextInt();

        funcion(numero);
    }

    public static int funcion(int numero) {
        int primo1 = 0, divisor2=0, contador=0;

        for (int divisor = 2; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                System.out.println(divisor);
                contador++;
                for (divisor2 = 4; divisor2 < divisor; divisor2++){
                    if (divisor % divisor2 == 0) {
                        primo1++;}}
            }
        }
        System.out.println(numero  + " tiene " +(contador-primo1) +" divisores primos");

        return numero;
    }
}
