package U1.ejercicios.src.main.java.U6.t2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String texto = "";
        int  numero = 0, indice=0;
        int[] numeros = new int[0];

        do {
            System.out.println("Introduce un numero");
            numero = teclado.nextInt();
            numeros = Arrays.copyOf(numeros, numeros.length + 1);
            numeros[indice] = numero;
            indice++;
        }while (numero >= 0);

        System.out.println(Arrays.toString(numeros));

            try (ObjectOutputStream hola = new ObjectOutputStream(new FileOutputStream("C:\\Ficheros_UD6\\t2\\Ej3\\archivo.bin", true))) {
                hola.writeObject(numeros);
                System.out.println("Array");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

            try (ObjectInputStream Lee = new ObjectInputStream(new FileInputStream("C:\\Ficheros_UD6\\t2\\Ej3\\archivo.bin"))){
            int[] array = (int[])Lee.readObject();
            for (int i=0; i<array.length; i++){
                if (array[i]>0){
                System.out.println(array[i]);}
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }



    }
}