package U3.t1;

import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {
        int n;

            Scanner teclado2;
            teclado2 = new Scanner(System.in);
            System.out.println("Introduce un numero: ");
            n = teclado2.nextInt();
        System.out.println(funcion(n));
        }

    public static int funcion(int n) {
        double resultado;
        if (n == 0) {
            resultado=1;
        }
        if (n == 1) {
            resultado=1;
        }
        else{
            resultado= (n*funcion(n-1));
        }
//        System.out.println(resultado);
        return (int) resultado;
    }

}

