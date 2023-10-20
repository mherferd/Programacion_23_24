package U1.t8a;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        int contador = 1;
        int numero, numero2;

        Scanner teclado3;
        teclado3 = new Scanner(System.in);
        System.out.println("Dime un numero del 1 al 10");
        numero = teclado3.nextInt();


        if (numero < 10) ;
        {
            while ((contador <= 10) && (numero <= 10)) {
                System.out.println(numero * contador);
                contador++;
            }
        }
    }
}