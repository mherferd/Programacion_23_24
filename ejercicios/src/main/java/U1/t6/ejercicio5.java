package U1.t6;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado;

        int radio;

        teclado = new Scanner(System.in);
        System.out.print("Dime el valor del radio de una circunferencia: ");
        radio = teclado.nextInt();

        teclado = new Scanner(System.in);
        System.out.println("1.Calcular diámetro ");
        System.out.println("2.Calcular perímetro ");
        System.out.println("3.Calcular área ");

        System.out.print("Introduzca que quiere realizar: ");

        int menu = teclado.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Diametro= " + radio * 2);
                break;
            case 2:
                System.out.println("Perimetro= " + radio * 2 * 3.14);
                break;
            case 3:
                System.out.println("Area= " + radio * radio * 3.14);
                break;

        }
    }
}
