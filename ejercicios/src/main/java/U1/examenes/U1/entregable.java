package U1.examenes.U1;

import java.util.Scanner;

public class entregable {

    public static void main(String[] args) {

        int precio = 0;

        System.out.println("Venta de entradas CineCampa");

        Scanner teclado2;
        teclado2 = new Scanner(System.in);
        System.out.print("Número de entradas: ");
        int entradas = teclado2.nextInt();

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
                    precio = ((precio + 11) * (entradas / 2) + 8);
                }
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
        System.out.println(precio);


    }

}
