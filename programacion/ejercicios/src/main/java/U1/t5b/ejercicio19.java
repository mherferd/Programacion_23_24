package U1.U1.t5b;

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {

        int horas, minutos;
        Scanner teclado1 = new Scanner(System.in);
        System.out.print("¿Que dia de la semana es? (antes del viernes a las 15:00 y expresado del 1 al 5): ");
        int dia = teclado1.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Lunes");

                Scanner teclado2 = new Scanner(System.in);
                System.out.print("Introduzca la hora actual (horas): ");
                horas = teclado2.nextInt();

                Scanner teclado3 = new Scanner(System.in);
                System.out.print("Introduzca la hora actual (minutos): ");
                minutos = teclado3.nextInt();

                int actual = (horas * 60) + (minutos);
                System.out.println("Quedan: " + (6660 - actual) + " minutos para llegar al fin de semana");
                break;
            case 2:
                System.out.println("Martes");
                Scanner teclado4 = new Scanner(System.in);
                System.out.print("Introduzca la hora actual (horas): ");
                horas = teclado4.nextInt();

                Scanner teclado5 = new Scanner(System.in);
                System.out.print("Introduzca la hora actual (minutos): ");
                minutos = teclado5.nextInt();

                int actual2 = (horas * 60) + (minutos) + 1440;
                System.out.println("Quedan: " + (6660 - actual2) + " minutos para llegar al fin de semana");
                break;
            case 3:
                System.out.println("Miercoles");
                Scanner teclado6 = new Scanner(System.in);
                System.out.print("Introduzca la hora actual (horas): ");
                horas = teclado6.nextInt();

                Scanner teclado7 = new Scanner(System.in);
                System.out.print("Introduzca la hora actual (minutos): ");
                minutos = teclado7.nextInt();

                int actual3 = (horas * 60) + (minutos) + 2880;
                System.out.println("Quedan: " + (6660 - actual3) + " minutos para llegar al fin de semana");
                break;
            case 4:
                System.out.println("Jueves");
                Scanner teclado8 = new Scanner(System.in);
                System.out.print("Introduzca la hora actual (horas): ");
                horas = teclado8.nextInt();

                Scanner teclado9 = new Scanner(System.in);
                System.out.print("Introduzca la hora actual (minutos): ");
                minutos = teclado9.nextInt();

                int actual4 = (horas * 60) + (minutos) + 4320;
                System.out.println("Quedan: " + (6660 - actual4) + " minutos para llegar al fin de semana");
                break;
            case 5:
                System.out.println("Viernes");
                Scanner teclado10 = new Scanner(System.in);
                System.out.print("Introduzca la hora actual (horas): ");
                horas = teclado10.nextInt();

                Scanner teclado11 = new Scanner(System.in);
                System.out.print("Introduzca la hora actual (minutos): ");
                minutos = teclado11.nextInt();

                int actual5 = (horas * 60) + (minutos) + 5760;
                System.out.println("Quedan: " + (6660 - actual5) + " minutos para llegar al fin de semana");
                break;
        }
    }
}