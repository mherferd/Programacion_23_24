package U1.ejercicios.src.main.java.U7.t2;

import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        LinkedHashSet<String> conjunto = new LinkedHashSet<>();
        LinkedHashSet<String> conjunto2= new LinkedHashSet<>();


        conjunto.add("Ey");
        conjunto.add("Muy");
        conjunto.add("Buenas");
        conjunto.add("A");
        conjunto.add("Todos");
        conjunto.add("Guapisimos");

        conjunto2.add("Ey");
        conjunto2.add("Muy");
        conjunto2.add("Buenas");
        conjunto2.add("Hoy");
        conjunto2.add("Estamos");
        conjunto2.add("En");
        conjunto2.add("Un");
        conjunto2.add("Nuevo");
        conjunto2.add("VideoDirecto");

        System.out.println(conjunto);
        System.out.println(conjunto2);

        union(conjunto,conjunto2);

        Set<String> resultado = union(conjunto,conjunto2);
        System.out.println(resultado);
    }
    private static Set union (Set conjunto1, Set conjunto2){
        LinkedHashSet<String> rep = new LinkedHashSet<>();
        rep.addAll(conjunto1);
        rep.addAll(conjunto2);
        return rep;
    }

}
