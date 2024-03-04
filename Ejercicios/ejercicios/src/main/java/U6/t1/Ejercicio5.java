package U1.ejercicios.src.main.java.U6.t1;

import java.io.*;
import java.sql.Array;
import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {

        String texto = "";
        String texto2 = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Ficheros_UD6\\t1\\Ej5\\numeros.txt"));
            String linea = in.readLine();
            while (linea != null) {
                texto += linea;
                linea = in.readLine();
            }
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(texto);


        int[] numeros = new int[texto.length()];

        for (int i = 0; i < texto.length(); i++) {
            numeros[i] = texto.charAt(i) - 48;
        }
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));


        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("C:/Ficheros_UD6/t1/Ej5/numeros.txt"));
            for (int i = 0; i < numeros.length; i++) {
                out.write(numeros[i] + "\n");

            }
            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}



