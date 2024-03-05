package U1.ejercicios.src.main.java.U6.t2;

import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

            int n=0;

            do {

                Scanner teclado = new Scanner(System.in);
                System.out.println("Qué quieres hacer?\n-----------------------------\n1-Mostrar Archivo\n2-Insertar nuevo numero\n(negativo)-Salir del programa");
                n = teclado.nextInt();
                teclado.nextLine();
                String texto="";
                switch (n) {
                    case 1:

                        try {
                            ObjectInputStream archivo = new ObjectInputStream(new FileInputStream("C:\\Ficheros_UD6\\t2\\Ej2\\archivo.bin"));;
                            double numero = archivo.readDouble();
                            while (true){
                            System.out.println(numero);}
                        }  catch (EOFException ex) {
                            System.out.println("Fin de fichero");
                        } catch (FileNotFoundException e) {
                            throw new RuntimeException(e);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(texto);
                        break;
                    case 2:
                        Scanner teclado2 = new Scanner(System.in);
                        System.out.println("Introduce cualquier número");
                        double num = teclado2.nextDouble();

                        try {
                            ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("C:\\Ficheros_UD6\\t2\\Ej2\\archivo.bin", true));
                            archivo.writeDouble(num);
                            System.out.println("Número guardado en archivo.bin ");
                        } catch (IOException e) {
                            System.out.println("Error al escribir en el archivo");
                        }
                        break;
                }
            }
            while (n>=0);
        }
    }
