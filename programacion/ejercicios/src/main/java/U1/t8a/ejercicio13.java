package U1.U1.t8a;

import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {
        int nota;
        int contador = 0, contador2 = 0, contador3 = 0, contador4 = 0;


        while (contador != 6) {

            Scanner teclado;
            teclado = new Scanner(System.in);
            System.out.println("¿Cuanto ha sacado el alumno?");
            nota = teclado.nextInt();
            contador++;
            if (nota >= 5) {
                contador2++;
            }
            if (nota == 4) {
                contador3++;
            }
            if (nota < 4) {
                contador4++;
            }
        }
        System.out.println("Hay " + contador2 + " aprobados, " + contador3 + " condicionales y " + contador4 + (" suspensos"));
    }
}
