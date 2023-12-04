package U1.U1.t8a;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        double edad;
        double contador = 0, media = 0, mayores = 0;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Dame la edad del alumno");
        edad = teclado.nextDouble();
        while (edad > 0) {
            contador = (double) ((double) contador + edad);
            media++;
            if (edad >= 18) {
                mayores++;
            }
            Scanner teclado1;
            teclado1 = new Scanner(System.in);
            System.out.println("Dime otra edad");
            edad = teclado1.nextDouble();
        }
        System.out.println("La suma de las edades es " + contador);
        System.out.println("La media de las edades es " + contador / media);
        System.out.println("Hemos introducido la edad de " + media + " alumnos");
        System.out.println("Hay " + mayores + " alumnos mayores de edad");


    }

}
