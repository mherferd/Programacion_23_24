package U3.ENTREGABLE;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        String frase;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Introduce la frase: ");
        frase = teclado.nextLine();
        frase = frase.replace(" ","");

        String[][] array = matrizLetras(frase);

        for (int i = 0; i < array.length; i++) {
            String[] fila = array[i];
            System.out.println(Arrays.toString(fila));
        }
    }

    public static String[][] matrizLetras(String frase) {

        int filas = (frase.length() / 5);
        String[][] array_final = new String[filas][5];

        int contador = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < 5; j++) {
                if (contador < frase.length()) {
                    array_final[i][j] = Character.toString(frase.charAt(contador));
                    contador++;
                }
            }
        }
        return array_final;
        }
}
