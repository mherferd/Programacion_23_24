package U3.t1;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int n = teclado.nextInt();

        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Dime otro numero: ");
        int n2 = teclado2.nextInt();


        funcion(n,n2);
    }

    public static void funcion(int n, int n2){
        for(int i=n; i<=n2; i++){
            System.out.println(i);
        }
    }
}

