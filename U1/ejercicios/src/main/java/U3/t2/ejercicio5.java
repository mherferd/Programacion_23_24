package U3.t2;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        String palabra;
        int contador = 0;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Introduce su nombre: ");
        palabra = teclado.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            char letra = (palabra.charAt(i));
            if ((letra != 'o')&&(letra != 'a')&&(letra != 'e')&&(letra != 'i')&&(letra != 'u')){
                System.out.print(letra);

            }
        }
    }
}
