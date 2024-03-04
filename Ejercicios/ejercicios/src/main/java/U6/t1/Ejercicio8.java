package U1.ejercicios.src.main.java.U6.t1;

import U1.ejercicios.src.main.java.U5.Examen_23_24.Multimedia;

import java.io.*;
import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        String texto="";
        String texto2="";
        String texto_todos="";
        int n_nombres=0;
        int n_lineas=0;
        String[] Nombres=new String[0];


        System.out.println("FICHERO 1:");
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Ficheros_UD6\\t1\\Ej8\\perso1.txt"));
            String linea = in.readLine();
            while (linea != null) {

                texto += linea + "\n";
                if (Nombres.length == n_nombres) {
                    Nombres = Arrays.copyOf(Nombres, Nombres.length + 1);
                }
                Nombres[n_nombres] = linea;
                n_nombres++;
                linea = in.readLine();


            }
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(texto);


        System.out.println("FICHERO 2:");
        try {
        BufferedReader in = new BufferedReader(new FileReader("C:\\Ficheros_UD6\\t1\\Ej8\\perso2.txt"));
        String linea = in.readLine();
        while (linea != null) {

            texto2 += linea + "\n";
            if (Nombres.length == n_nombres) {
                Nombres = Arrays.copyOf(Nombres, Nombres.length + 1);
            }
            Nombres[n_nombres] = linea;
            n_nombres++;
            linea = in.readLine();

        }
        in.close();
        } catch (IOException ex) {
        System.out.println(ex.getMessage());
        }
        System.out.println(texto2);

        Arrays.sort(Nombres);

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("C:/Ficheros_UD6/t1/Ej8/todos.txt"));
            for (int i=0; i<Nombres.length; i++){
                out.write(Nombres[i]+"\n");
            }
            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("FICHERO TODOS:");
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Ficheros_UD6\\t1\\Ej8\\todos.txt"));
            String linea = in.readLine();
            while (linea != null) {
                texto_todos += linea + "\n";
                linea = in.readLine();
            }
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(texto_todos);



}
}
