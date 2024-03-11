package U1.ejercicios.src.main.java.U6.t2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        int[] numeros = new int[10];

        for (int j = 0; j < 10; j++) {
            int numero = (int) (Math.random() * 100);
            numeros[j] = numero;
        }
        Arrays.sort(numeros);

        try (ObjectOutputStream hola = new  ObjectOutputStream(new FileOutputStream("C:\\Ficheros_UD6\\t2\\Ej8\\archivo.bin",true))){
            hola.writeObject(numeros);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (ObjectInputStream Lee = new ObjectInputStream(new FileInputStream("C:\\Ficheros_UD6\\t2\\Ej8\\archivo.bin"))){
            for (int i=0; i<numeros.length; i++){
                System.out.println(numeros[i]);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}

