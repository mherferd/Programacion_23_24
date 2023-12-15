package U1.U1.intro_bucles_condicionales.U1_Entregable;

import java.util.Scanner;

public class EJ3 {

    public static void main(String[] args) {

        double precio = 0, contador = 0;

        System.out.println("Venta de entradas CineCampa");

        Scanner teclado2;
        teclado2 = new Scanner(System.in);
        System.out.print("Número de entradas: ");
        double entradas = teclado2.nextDouble();

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.print("Dia de la semana: ");
        String dia = teclado.nextLine();

        Scanner teclado3;
        teclado3 = new Scanner(System.in);
        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        String tarjeta = teclado3.nextLine();


        switch (dia) {
            case "lunes":
                precio = (precio + 8) * entradas;
                break;
            case "martes":
                precio = (precio + 8) * entradas;
                break;
            case "miercoles":
                precio = (precio + 5) * entradas;
                break;
            case "jueves":
                if (entradas % 2 == 0) {
                    precio = ((precio + 11) * (entradas / 2));
                } else {
                    precio = ((precio + 11) * ((int) entradas / 2) + 8);
                }
                contador++;
                break;
            case "viernes":
                precio = (precio + 8) * entradas;
                break;
            case "sabado":
                precio = (precio + 8) * entradas;
                break;
            case "domingo":
                precio = (precio + 8) * entradas;
                break;
        }
        System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
        if (contador == 0) {
            System.out.println("Entradas individuales: " + entradas);
            System.out.println("Precio por entrada individual: " + precio / entradas + " €");

        } else {
            System.out.println("Entradas de pareja: " + (int) entradas / 2);
            System.out.println("Precio por entrada por pareja: 11€");
            if (entradas % 2 == 1) {
                System.out.println("Precio por entrada individual: 8,00€");
            }
        }
        System.out.println("Total: " + precio + " €");

        if (tarjeta.equals("s")) {
            System.out.println("Descuento: " + precio / 10 + " €");
            System.out.println("A pagar: " + (precio - (precio / 10)) + " €");
        }

        if (tarjeta.equals("n")) {
            System.out.println("Descuento: 0,00€");
            System.out.println("A pagar: " + precio + " €");
        }
    }
}

