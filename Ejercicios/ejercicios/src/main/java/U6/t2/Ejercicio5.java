package U1.ejercicios.src.main.java.U6.t2;

import java.io.*;
import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        String texto="";

        try (ObjectInputStream Lee = new ObjectInputStream(new FileInputStream("C:\\Ficheros_UD6\\t2\\Ej4\\archivo.bin"))){
           double[] array = (double[])Lee.readObject();
            for (int i=0; i<array.length; i++){
            }
            System.out.println(Arrays.toString(array));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    }

