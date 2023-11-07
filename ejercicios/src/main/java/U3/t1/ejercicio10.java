package U3.t1;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        int numero, numero2;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        numero = teclado.nextInt();

        Scanner teclado2;
        teclado2 = new Scanner(System.in);
        System.out.println("Introduce otro numero: ");
        numero2 = teclado2.nextInt();

        funcion(numero, numero2);
    }

    public static int funcion(int numero, int numero2) {
    int suma=0;
        for (int divisor = 1; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                suma=divisor+suma;
            }
        }
        if (suma==numero2){
            System.out.println(numero +" y " +numero2 +" son amigos");}
        else {
            System.out.println("no son amigos");
        }
        return numero;
    }
}
