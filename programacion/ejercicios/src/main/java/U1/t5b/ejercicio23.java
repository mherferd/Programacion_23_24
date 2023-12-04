package U1.U1.t5b;

import java.util.Scanner;

public class ejercicio23 {
    public static void main(String[] args) {

        String sabor, nata, nombre, nob = "";
        double precio = 0;

        Scanner teclado1 = new Scanner(System.in);
        System.out.print("Elija un sabor (chocolate, fresa o manzana): ");
        sabor = teclado1.nextLine();

        if (sabor.equals("chocolate")) {
            Scanner teclado4 = new Scanner(System.in);
            System.out.print("Que tipo de chocolate quiere?(negro/blanco): ");
            nob = teclado4.nextLine();
        }


        Scanner teclado2 = new Scanner(System.in);
        System.out.print("Quiere nata?(si/no): ");
        nata = teclado2.nextLine();


        Scanner teclado3 = new Scanner(System.in);
        System.out.print("Quiere ponerle un nombre?(si/no): ");
        nombre = teclado3.nextLine();

        if (sabor.equals("manzana")) {
            System.out.println("Tarta de manzana: 18€");
            precio = precio + 18;
        }
        if (sabor.equals("fresa")) {
            System.out.println("Tarta de fresa: 16€");
            precio = precio + 16;
        }

        if (nob.equals("blanco")) {
            System.out.println("Tarta de chocolate blanco: 15€");
            precio = precio + 15;
        }

        if (nob.equals("negro")) {
            System.out.println("Tarta de chocolate negro: 14€");
            precio = precio + 14;
        }


        if (nata.equals("si")) {
            System.out.println("Con nata: 2,50€");
            precio = precio + 2.50;
        }

        if (nombre.equals("si")) {
            System.out.println("Con nombre: 2,75€");
            precio = precio + 2.75;

        }

        System.out.println("TOTAL: " + precio + "€");

    }
}

