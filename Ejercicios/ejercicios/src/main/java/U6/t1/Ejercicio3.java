package U1.ejercicios.src.main.java.U6.t1;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String texto = "";

        //Leer el fichero original.txt
        try {
            FileReader in = new FileReader("C:\\Ficheros_UD6\\t1\\Ej3\\original.txt");
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

        //Copiar contenido de original.txt -> copia.txt
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("C:/Ficheros_UD6/t1/Ej3/copia.txt"));
            out.write(texto);
            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //Leer contenido de prueba.txt
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cómo se llama el fichero?");
        String nombre = teclado.nextLine();

        if (nombre.isEmpty()){
            nombre="prueba.txt";}

        String texto2 = "";

        //Leer contenido de prueba.txt
        try {
            FileReader in = new FileReader("C:\\Ficheros_UD6\\t1\\Ej3\\"+nombre);
            int c = in.read();
            while (c != -1) {
                texto2 += (char) c;
                c = in.read();
            }
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(texto2);

        //Copiar contenido de prueba.txt -> copia_de_prueba.txt
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("C:/Ficheros_UD6/t1/Ej3/copia_de_"+nombre));
            out.newLine();
            out.write(texto2);
            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
