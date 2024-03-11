package U1.ejercicios.src.main.java.U6.t2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos numeros va a meter?");
        int n = teclado.nextInt();
        String texto="";

        double[] numeros = new double[n];

        for (int i=0; i<n; i++) {

            Scanner teclado2 = new Scanner(System.in);
            System.out.println("Introduce un numero");
            double numero = teclado.nextDouble();

            numeros[i]=numero;}

            try (ObjectOutputStream hola = new  ObjectOutputStream(new FileOutputStream("C:\\Ficheros_UD6\\t2\\Ej4\\archivo.bin",true))){
               hola.writeObject(numeros);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

