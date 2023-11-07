package U3.t2;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        String car1, car2;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        car1 = teclado.nextLine();

        Scanner teclado2;
        teclado2 = new Scanner(System.in);
        System.out.println("Introduce otra palabra: ");
        car2 = teclado2.nextLine();

        if (car1.length()<car2.length()){
            System.out.println(car1+ " es más corta que " +car2);}
        else{System.out.println(car2+ " es más corta que " +car1);}

    }
}
