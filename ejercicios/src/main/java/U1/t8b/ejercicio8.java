package U1.t8b;

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {

        Scanner teclado2;
        teclado2 = new Scanner(System.in);
        System.out.print("Que hora es? ");
        int hora = teclado2.nextInt();

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.print("Que día es? (del 1 al 7): ");
        int dia = teclado.nextInt();
        if ((dia <= 7) && (dia >= 1) && (hora < 24) && (hora >= 0)) {
            switch (dia) {
                case 1:
                    break;
                case 2:
                    hora = hora + 24;
                    break;
                case 3:
                    hora = hora + 48;
                    break;
                case 4:
                    hora = hora + 72;
                    break;
                case 5:
                    hora = hora + 96;
                    break;
                case 6:
                    hora = hora + 120;
                    break;
                case 7:
                    hora = hora + 144;
                    break;
            }
        } else System.out.println("Datos incorrectos");


        Scanner teclado3;
        teclado3 = new Scanner(System.in);
        System.out.print("Que hora es? ");
        int hora2 = teclado3.nextInt();

        Scanner teclado4;
        teclado4 = new Scanner(System.in);
        System.out.print("Que día es? (del 1 al 7): ");
        int dia2 = teclado4.nextInt();
        if ((dia2 <= 7) && (dia2 >= 1) && (hora2 < 24) && (hora2 >= 0)) {
            switch (dia2) {
                case 1:
                    break;
                case 2:
                    hora2 = hora2 + 24;
                    break;
                case 3:
                    hora2 = hora2 + 48;
                    break;
                case 4:
                    hora2 = hora2 + 72;
                    break;
                case 5:
                    hora2 = hora2 + 96;
                    break;
                case 6:
                    hora2 = hora2 + 120;
                    break;
                case 7:
                    hora2 = hora2 + 144;
                    break;
            }
        } else System.out.println("Datos incorrectos");

        if (hora > hora2) {
            System.out.println("No se puede viajar al pasado!");
        } else System.out.println("Entre esas dos horas hay un intervalo de " + (hora2 - hora) + " horas");
    }
}

