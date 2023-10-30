package U1.examenes.U1;

import java.util.Scanner;

public class examen_3_4 {
    public static void main(String[] args) {



    int numero, contador=0,divisor = 0, contador1 = 0;

    Scanner teclado;
    teclado = new Scanner(System.in);
    System.out.println("Introduce un numero");
    numero = teclado.nextInt();

    while (contador<5){

        for (divisor = 2; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                contador1++;
            }
        }
        if (contador1 != 0) {
            System.out.println(numero + " No es número primo");
            } else {
                System.out.println(numero + " Es número primo");
            }

        contador++;
        numero++;
        contador1=0;
    }


}
}
