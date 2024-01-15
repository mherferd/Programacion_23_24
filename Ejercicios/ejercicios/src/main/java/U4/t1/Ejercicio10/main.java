package U1.ejercicios.src.main.java.U4.t1.Ejercicio10;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la hora: ");
        int horas = teclado.nextInt();

        System.out.println("Introduce los minutos: ");
        int minutos = teclado.nextInt();

        System.out.println("Introduce los segundos: ");
        int segundos = teclado.nextInt();

        Hora hora1 = new Hora();

        hora1.setHoras(horas);
        hora1.setMinutos(minutos);
        hora1.setSegundos(segundos);

        hora1.sumar_segundos();


        System.out.println(hora1.getHoras() +" : " +hora1.getMinutos()+" : "+hora1.getSegundos());




    }
}
