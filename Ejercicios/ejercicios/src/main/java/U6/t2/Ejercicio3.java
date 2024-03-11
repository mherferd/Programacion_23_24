package U1.ejercicios.src.main.java.U6.t2;

import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

            int n=0;

            do {

                Scanner teclado = new Scanner(System.in);
                System.out.println("Numero:");
                n = teclado.nextInt();
                if (n>0){
                    try(ObjectOutputStream buenas = new ObjectOutputStream(new FileOutputStream("C:\\Ficheros_UD6\\t2\\Ej3\\archivo.bin",true)){
                        buenas.
                    }
                    catch (IOException e){
                        System.out.println(e.getMessage());
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
            while (n>=0);

            try (ObjectInputStream  Lee = new ObjectInputStream(new FileInputStream("C:\\Ficheros_UD6\\t2\\Ej3\\archivo.bin"))){
                while (true){
                    System.out.println("");
                }
                catch(IOException e)
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
    }
    }
