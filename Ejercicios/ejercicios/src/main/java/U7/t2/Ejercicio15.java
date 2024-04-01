package U1.ejercicios.src.main.java.U7.t2;

import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        LinkedList<Integer> Lista_Ordenada = new LinkedList<>();

        System.out.println(Lista_Ordenada);
        insertarOrdenado(4);
        insertarOrdenado(7);
        insertarOrdenado(3);
        insertarOrdenado(2);
        insertarOrdenado(8);
        insertarOrdenado(9);
        insertarOrdenado(1);

    }

    private static void insertarOrdenado (int numero){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        numero = teclado.nextInt();
    }
}
