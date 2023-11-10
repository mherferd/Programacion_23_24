package U3.t2;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        String frase;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        frase = teclado.nextLine();

        char variable=(frase.charAt(frase.length()/2));

        if (variable == ' '){
        System.out.println("La posición central es un espacio");
        }
        else {
            System.out.println("La posición central no es un espacio");
        }
    }
}


