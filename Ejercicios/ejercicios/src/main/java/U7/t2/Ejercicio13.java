package U1.ejercicios.src.main.java.U7.t2;

import java.util.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2= new ArrayList<>();

        lista1.add(6);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);
        lista1.add(1);

        lista2.add(4);
        lista2.add(5);
        lista2.add(6);
        lista2.add(7);
        lista2.add(8);
        lista2.add(9);
        lista2.add(10);
        lista2.add(11);
        lista2.add(12);

        Collections.sort(lista1);
        Collections.sort(lista2);

        listas(lista1,lista2);

        List resultado = listas(lista1,lista2);
        System.out.println(resultado);
    }
    private static List listas (List lista1, List lista2) {
       List resultado = new ArrayList();

        resultado.addAll(lista1);
        resultado.addAll(lista2);
        Collections.sort(resultado);
        return resultado;
    }
}
