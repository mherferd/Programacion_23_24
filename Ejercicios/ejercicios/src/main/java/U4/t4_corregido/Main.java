package U1.ejercicios.src.main.java.U4.t4_corregido;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        Ingrediente queso = new Ingrediente();

        System.out.println(pizza1);

        int n =0;
        do{

            Scanner teclado = new Scanner(System.in);
            System.out.println("Qué desea hacer?: ");
            System.out.println("1 - Cuántos ingredientes tiene mi Pizza?: ");
            System.out.println("2 - Añadir un ingrediente: ");
            System.out.println("3 - Mostrar información: ");
            System.out.println("4 - Salir del prgrama: ");
            n = teclado.nextInt();

            switch (n){
                case 1:
                    System.out.println(ingrediente.length);
                    break;
            }
        } while (n!=4);
    }
}
