package U1.Examen;

import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {

        double precio = 0, contador = 0;

        System.out.println("Pedidos Pitanza Feliz");

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.print("Número de hamburguesas básicas: ");
        double basicas = teclado.nextDouble();

        Scanner teclado2;
        teclado2 = new Scanner(System.in);
        System.out.print("Número de hamburguesas gourmet: ");
        double gourmet = teclado2.nextDouble();

        Scanner teclado3;
        teclado3 = new Scanner(System.in);
        System.out.print("Dia de la semana: ");
        String dia = teclado3.nextLine();

        Scanner teclado4;
        teclado4 = new Scanner(System.in);
        System.out.print("¿Pertenece al club Fanegas? (s/n): ");
        String tarjeta = teclado4.nextLine();


        switch (dia) {
            case "lunes":
                precio = ((precio + 3) * basicas+ (precio + 5) * gourmet);
                break;
            case "martes":
                if (gourmet % 2 == 0) {
                    precio = ((precio + 9) * (gourmet / 2));
                } else {
                    precio = ((precio + 9) * ((int) gourmet / 2) + 5);
                }
                precio=precio+(3*basicas);
                break;
            case "miercoles":
                precio = ((precio + 2) * basicas+ (precio + 5) * gourmet);
                break;
            case "jueves":
                precio = ((precio + 3) * basicas+ (precio + 5) * gourmet);
                break;
            case "viernes":
                precio = ((precio + 3) * basicas+ (precio + 5) * gourmet);
                break;
            case "sabado":
                precio = ((precio + 3) * basicas+ (precio + 5) * gourmet);
                break;
            case "domingo":
                precio = ((precio + 3) * basicas+ (precio + 5) * gourmet);
                break;
        }
        System.out.println("Aquí tiene su pedido. Gracias por su compra.");
        System.out.println("Hamburguesas básicas: " +(int) basicas);
        System.out.println("Hamburguesas gourmet: " +(int) gourmet);
        System.out.println("Total: "+precio);

        if (tarjeta.equals("s")) {
            System.out.println("Descuento: " + precio*0.12 + " €");
            System.out.println("A pagar: " + (precio - (precio*0.12)) + " €");
        }

        if (tarjeta.equals("n")) {
            System.out.println("Descuento: 0,00€");
            System.out.println("A pagar: " + precio + " €");
        }
    }
}
