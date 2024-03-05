package U1.ejercicios.src.main.java.U6.t2;

import java.util.Scanner;

import java.io.*;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce cualquier número");
        double num = teclado.nextDouble();

        try {
            ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("C:\\Ficheros_UD6\\t2\\Ej1\\archivo.bin"));
            archivo.writeDouble(num);
            archivo.close();
            System.out.println("Número guardado en archivo.bin ");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        }
    }
}


