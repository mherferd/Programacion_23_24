package U3.t1;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantas veces quieres mostrar el mensaje: ");
        int n = teclado.nextInt();

        funcion(n);
    }

    public static void funcion(int n){
        for(int i=1; i<=n; i++){
            System.out.println("eco");
        }
    }

}
