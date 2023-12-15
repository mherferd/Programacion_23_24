package U3.Examen2021_Tarde;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        String frase = teclado.nextLine();

        int[] resultado = convierteStringEnArray(frase);
        System.out.println(Arrays.toString(resultado));
    }

    public static int[] convierteStringEnArray(String frase) {


        if (frase.isEmpty()) {
            return new int[0];
        }

        int[] resultado = new int[frase.length()];


        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            resultado[i] = Character.getNumericValue(c);
        }

        return resultado;
    }
}

