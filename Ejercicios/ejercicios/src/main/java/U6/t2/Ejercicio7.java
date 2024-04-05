package U1.ejercicios.src.main.java.U6.t2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        String texto="";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase");
        texto = teclado.nextLine();

        try (ObjectOutputStream hola = new  ObjectOutputStream(new FileOutputStream("C:\\Ficheros_UD6\\t2\\Ej7\\archivo.bin",true))){
                hola.writeObject(texto);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }


        try (ObjectInputStream Lee = new ObjectInputStream(new FileInputStream("C:\\Ficheros_UD6\\t2\\Ej7\\archivo.bin"))){
            System.out.println(texto);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

