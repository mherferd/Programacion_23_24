package U1.U1.t6;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado;

        teclado = new Scanner(System.in);
        System.out.print("Dime un numero del 1 al 10: ");
        int mes = teclado.nextInt();
        switch (mes) {
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
            case 10:
                System.out.println("Diez");
                break;

        }
    }
}
