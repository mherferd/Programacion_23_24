package U1.U1.t5b;

import java.util.Scanner;

public class ejercicio22 {
    public static void main(String[] args) {

        Long altura, anchura;
        String bordado;

        Scanner teclado1 = new Scanner(System.in);
        System.out.print("Introduzca la altura de la bandera: ");
        altura = teclado1.nextLong();

        Scanner teclado2 = new Scanner(System.in);
        System.out.print("¿Introduzca la anchura de la bandera : ");
        anchura = teclado2.nextLong();

        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Quiere escudo bordado? (s/n): ");
        bordado = teclado.nextLine();

        double precio = (double) (altura * anchura) / 100;

        System.out.println("Gracias, aquí tiene el desglose de su compra ");
        System.out.println("Bandera de " + altura * anchura + "cm2: " + precio + "€");

        if (bordado.equals("n")) {
            System.out.println("Sin escudo: 0€");
            System.out.println("Gastos de envío: 3,25€");
            System.out.println("TOTAL:" + (precio + 3.25) + "€");
        }

        if (bordado.equals("s")) {
            System.out.println("Con escudo: 2,50€");
            System.out.println("Gastos de envío: 3,25€");
            System.out.println("TOTAL:" + (precio + 3.25 + 2.50) + "€");
        }

    }
}
