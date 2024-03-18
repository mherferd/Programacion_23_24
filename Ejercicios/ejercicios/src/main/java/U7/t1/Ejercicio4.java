package U1.ejercicios.src.main.java.U7.t1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> lista_rep = new ArrayList<>();
        ArrayList<String> lista_NO_rep = new ArrayList<>();

        System.out.println("Dime una frase: ");
        String frase = teclado.nextLine();

        String[] palabras = frase.split(" ");

        for (String palabra : palabras) {
            if (lista.contains(palabra)) {
                if (!lista_rep.contains(palabra)) {
                    lista_rep.add(palabra);
                }
            } else {
                lista.add(palabra);
                lista_NO_rep.add(palabra);
            }

        }
        System.out.println("REPETIDAS :" + lista_rep);
        System.out.println("NO REPETIDAS :" + lista_NO_rep);
    }
}
