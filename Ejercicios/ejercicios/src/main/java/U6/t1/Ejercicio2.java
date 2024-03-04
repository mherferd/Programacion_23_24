package U1.ejercicios.src.main.java.U6.t1;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cual es tu nombre?");
        String nombre = teclado.nextLine();

        Scanner teclado1 = new Scanner(System.in);
        System.out.println("¿Cual es tu edad?");
        int edad = teclado.nextInt();


        String texto = "";

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("C:/Ficheros_UD6/t1/Ej2/datos.txt"));
            out.newLine();
            out.write("Mi nombre es: " +nombre +" y tengo "+edad +" años");
            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }



    }
}
