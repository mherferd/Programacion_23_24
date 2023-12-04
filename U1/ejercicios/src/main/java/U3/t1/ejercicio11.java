package U3.t1;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        int n;
        double a;
    do{
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Introduce un numero (a): ");
        a = teclado.nextDouble();

        Scanner teclado2;
        teclado2 = new Scanner(System.in);
        System.out.println("Introduce a que numero está elevado (n): ");
        n = teclado2.nextInt();}

    while (n<0);{

            System.out.println(funcion(a,n));
    }}

    public static int funcion(double a, int n) {
        double resultado;
        if (n == 0) {
           resultado=1;
        }
        if (n == 1) {
            resultado= (double) a;
        }
        else{
            resultado= (double) (a*funcion(a, n-1));
        }
        return (int) resultado;
    }

}
