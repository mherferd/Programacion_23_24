package U3.examen_U3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        String frase, letra;
        int pos;

        frase = "abcdefghi";
        frase = frase.replace(" ", "");

        String[][] array = matrizLetras(frase);
        System.out.println("MATRIZ:");

        for (int i = 0; i < array.length; i++) {
            String[] n = array[i];
            System.out.println(Arrays.toString(n));
        }

        Scanner teclado2;
        teclado2 = new Scanner(System.in);
        System.out.println("Introduce 3 letras: (sin espacios) ");
        letra = teclado2.nextLine();

        String[] fila_final = fila_ord(letra);
        System.out.println("FILA: " + Arrays.toString(fila_final));

        Scanner teclado5 = new Scanner(System.in);
        System.out.println("Introduce una posición: ");
        pos = teclado5.nextInt();
    }

    public static String[][] matrizLetras(String frase) {

        int filas = (frase.length() / 3);
        String[][] array_final = new String[filas][3];

        int contador = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < 3; j++) {
                if (contador < frase.length()) {
                    array_final[i][j] = Character.toString(frase.charAt(contador));
                    contador++;
                }
            }
        }
        return array_final;
    }

    public static String[] fila_ord(String letra) {

        int filas = (letra.length());
        String[] fila_final = new String[3];

        int contador = 0;
        for (int i = 0; i < filas; i++) {
            if (contador < letra.length()) {
                fila_final[i] = Character.toString(letra.charAt(contador));
                contador++;
            }
        }

        return fila_final;
    }

    public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos) {
        for (int i = 0; i < matriz.length + 1; i++) {
            for (int j = 0; j < matriz.length + 1; j++) {
                if (i==pos){
                matriz[i][j] = fila[i];}
            }
        }
        return matriz;
    }
}




