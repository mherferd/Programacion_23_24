package U1.t7;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        int edad, nivel_de_estudio, ingresos;
        boolean jasp = true;

        Scanner teclado1 = new Scanner(System.in);
        System.out.print("¿Qué edad tiene?:  ");
        edad = teclado1.nextInt();


        Scanner teclado2 = new Scanner(System.in);
        System.out.print("¿Que nivel de estudios tiene?: ");
        nivel_de_estudio = teclado2.nextInt();

        Scanner teclado3 = new Scanner(System.in);
        System.out.print("¿Que ingresos tiene?: ");
        ingresos = teclado3.nextInt();

        jasp = (edad <= 28 && nivel_de_estudio > 3 && ingresos > 28000) ? true : false;
        System.out.println(jasp);
    }
}
