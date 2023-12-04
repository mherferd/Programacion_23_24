package U1.U1.t5b;

import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {

        int num1;
        String tipo, codigo;
        double iva;
        double precio_con_iva = 0;
        double descuento = 0;

        Scanner teclado1 = new Scanner(System.in);
        System.out.print("Introduzca la base imponible: ");
        num1 = teclado1.nextInt();

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido: ");
        tipo = teclado.nextLine();

        Scanner teclado2 = new Scanner(System.in);
        System.out.print("Introduzca el codigo promocional (nopro, mitad, meno5 o 5porc) : ");
        codigo = teclado2.nextLine();

        System.out.println("BASE IMPONIBLE:");
        System.out.println(num1);

        if (tipo.equals("general")) {
            iva = num1 * 0.21;
            System.out.println("IVA (21%) :");
            System.out.println(iva);
            precio_con_iva = ((num1) + (iva));
            System.out.println("PRECIO CON IVA:");
            System.out.println(precio_con_iva);
        }

        if (tipo.equals("reducido")) {
            iva = num1 * 0.10;
            System.out.println("IVA (10%) :");
            System.out.println(iva);
            precio_con_iva = ((num1) + (iva));
            System.out.println("PRECIO CON IVA:");
            System.out.println(precio_con_iva);
        }

        if (tipo.equals("superreducido")) {
            iva = num1 * 0.04;
            System.out.println("IVA (4%) :");
            System.out.println(iva);
            precio_con_iva = ((num1) + (iva));
            System.out.println("PRECIO CON IVA:");
            System.out.println(precio_con_iva);
        }


        if (codigo.equals("nopro")) {
            System.out.println("DESCUENTO:");
            System.out.println("0");
            System.out.println("TOTAL:");
            System.out.println(precio_con_iva - descuento);
        }

        if (codigo.equals("mitad")) {
            descuento = precio_con_iva * 0.5;
            System.out.println("DESCUENTO:");
            System.out.println(descuento);
            System.out.println("TOTAL");
            System.out.println(precio_con_iva - descuento);
        }

        if (codigo.equals("meno5")) {
            descuento = precio_con_iva - 5;
            System.out.println("DESCUENTO:");
            System.out.println(descuento);
            System.out.println("TOTAL");
            System.out.println(precio_con_iva - descuento);
        }

        if (codigo.equals("5porc")) {
            descuento = precio_con_iva * 0.05;
            System.out.println("DESCUENTO:");
            System.out.println(descuento);
            System.out.println("TOTAL");
            System.out.println(precio_con_iva - descuento);
        }

    }
}
