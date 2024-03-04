package U1.ejercicios.src.main.java.U6.t1;

import java.io.*;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        int n=0;

        do {

            Scanner teclado = new Scanner(System.in);
            System.out.println("Qué quieres hacer?\n-----------------------------\n1-Mostrar Libro de Firmas\n2-Insertar nuevo nombre\n0-Salir del programa");
            n = teclado.nextInt();
            teclado.nextLine();
            String texto="";
            switch (n) {
                case 1:
                    try {
                        BufferedReader in = new BufferedReader(new FileReader("C:\\Ficheros_UD6\\t1\\Ej6\\firmas.txt"));
                        String linea = in.readLine();
                        while (linea != null) {

                            texto += linea + "\n";
                            linea = in.readLine();
                        }
                        in.close();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }

                    System.out.println(texto);
                    break;
                case 2:
                    try {
                        BufferedReader in = new BufferedReader(new FileReader("C:\\Ficheros_UD6\\t1\\Ej6\\firmas.txt"));
                        String linea = in.readLine();
                        while (linea != null) {

                            texto += linea +"\n";
                            linea = in.readLine();
                        }
                        in.close();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }

                    Scanner teclado2 = new Scanner(System.in);
                    System.out.println("Inserte un nuevo nombre");
                    String texto2 = teclado.nextLine();
                    try {
                        BufferedWriter out = new BufferedWriter(new FileWriter("C:/Ficheros_UD6/t1/Ej6/firmas.txt"));
                        out.write(texto);
                        out.write(texto2);
                        out.close();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
            }
        }
        while (n!=0);

    }
}
