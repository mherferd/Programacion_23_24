package U1.t5b;

import java.util.Scanner;

public class ejercicio25 {
    public static void main(String[] args) {

        String comida, bebida, pit = "";
        double precio = 0;

        Scanner teclado1 = new Scanner(System.in);
        System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo):  ");
        comida = teclado1.nextLine();

        if (comida.equals("pitufo")) {
            Scanner teclado4 = new Scanner(System.in);
            System.out.print("¿Con aceite o con tortilla?: ");
            pit = teclado4.nextLine();
        }


        Scanner teclado2 = new Scanner(System.in);
        System.out.print("¿Que ha tomado de beber? (zumo o café): ");
        bebida = teclado2.nextLine();


        if (comida.equals("palmera")) {
            System.out.println("Palmera: 1,40€");
            precio = precio + 1.4;
        }
        if (comida.equals("donut")) {
            System.out.println("Donut: 1€");
            precio = precio + 1;
        }

        if (pit.equals("aceite")) {
            System.out.println("Tarta de chocolate blanco: 1,20€");
            precio = precio + 1.2;
        }

        if (pit.equals("tortilla")) {
            System.out.println("Pitufo con tortilla: 1,60€");
            precio = precio + 1.6;
        }


        if (bebida.equals("zumo")) {
            System.out.println("Con nata: 1,50€");
            precio = precio + 1.5;
        }

        if (bebida.equals("cafe")) {
            System.out.println("Cafe: 1,20€");
            precio = precio + 1.2;

        }

        System.out.println("TOTAL: " + precio + "€");

    }
}
