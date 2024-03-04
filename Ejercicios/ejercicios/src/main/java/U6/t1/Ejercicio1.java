package U1.ejercicios.src.main.java.U6.t1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cómo se llama el fichero?");
        String nombre = teclado.nextLine();

        if (nombre.isEmpty()){
            nombre="prueba.txt";}

        String texto = "";

        try {
            FileReader in = new FileReader("C:\\Ficheros_UD6\\t1\\Ej1\\"+nombre);
            int c = in.read();
            while (c != -1) {
                texto += (char) c;
                c = in.read();
            }
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(texto);

        /*
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Ficheros_UD6\\"+nombre));
            String linea = in.readLine();
            while (linea != null) {
                texto += linea;
                linea = in.readLine();
            }
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }*/

    }

}


