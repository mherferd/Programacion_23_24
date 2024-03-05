package U1.ejercicios.src.main.java.U6.t2;

import java.io.*;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

                try {
                    ObjectInputStream archivo = new ObjectInputStream(new FileInputStream("C:\\Ficheros_UD6\\t2\\Ej1\\archivo.bin"));;
                    double numero = archivo.readDouble();
                    System.out.println(numero);
                    archivo.close();
                } catch (IOException e) {
                    System.out.println("Error al escribir en el archivo");
                }
            }
        }

