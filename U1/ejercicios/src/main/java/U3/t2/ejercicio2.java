package U3.t2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        String palabra;
        String frase = "";

        do {
            Scanner teclado;
            teclado = new Scanner(System.in);
            System.out.println("Introduce una palabra: ");
            palabra = teclado.nextLine();

            if (!palabra.equalsIgnoreCase("fin")){
            frase=frase.concat(palabra +" ");}
        }
        while (!palabra.equalsIgnoreCase("fin"));
        System.out.println(frase);

    }
}