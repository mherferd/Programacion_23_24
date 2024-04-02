package U1.ejercicios.src.main.java.U7.t3.Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre del fichero:");
        String fichero = teclado.nextLine();


        Traductor traductor = new Traductor(fichero);

        System.out.println("Que palabra quieres traducir?");
        String cadena = teclado.nextLine();
        traductor.traducir(cadena);
    }
}
