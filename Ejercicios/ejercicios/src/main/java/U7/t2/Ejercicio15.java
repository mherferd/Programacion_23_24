package U1.ejercicios.src.main.java.U7.t2;

import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        LinkedList<Integer> Lista_Ordenada = new LinkedList<>();

        Lista_Ordenada.add(4);
        Lista_Ordenada.add(7);
        Lista_Ordenada.add(3);
        Lista_Ordenada.add(2);
        Lista_Ordenada.add(8);
        Lista_Ordenada.add(9);
        Lista_Ordenada.add(1);
        Lista_Ordenada.add(5);
        Lista_Ordenada.add(6);
        Lista_Ordenada.add(0);

        System.out.println(Lista_Ordenada);

    }

    private static void insertarOrdenado (int numero){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        numero = teclado.nextInt();

        Lista_Orde
    }
}
