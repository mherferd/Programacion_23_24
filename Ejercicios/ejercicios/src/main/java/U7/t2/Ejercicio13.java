package U1.ejercicios.src.main.java.U7.t2;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        TreeSet<String> conjunto = new TreeSet<>();
        TreeSet<String> conjunto2= new TreeSet<>();


        conjunto.add("I");
        conjunto.add("O");
        conjunto.add("U");
        conjunto.add("A");
        conjunto.add("Y");
        conjunto.add("J");

        conjunto2.add("A");
        conjunto2.add("B");
        conjunto2.add("P");
        conjunto2.add("V");
        conjunto2.add("E");
        conjunto2.add("Z");
        conjunto2.add("G");
        conjunto2.add("C");
        conjunto2.add("L");



        System.out.println(conjunto);
        System.out.println(conjunto2);

        listas(conjunto,conjunto2);

        Set<String> resultado = listas(conjunto,conjunto2);
        System.out.println(resultado);
    }
    private static Set listas (Set conjunto1, Set conjunto2) {
        TreeSet<String> todos = new TreeSet<>();
        todos.addAll(conjunto1);
        todos.addAll(conjunto2);

        return todos;

    }
}
