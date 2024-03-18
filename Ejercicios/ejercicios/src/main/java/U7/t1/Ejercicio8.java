package U1.ejercicios.src.main.java.U7.t1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();
        String nombre="";

        do {
            System.out.println("Dime un nombre: ");
            nombre = teclado.nextLine();
            if ((!nombre.equalsIgnoreCase("FIN")) & (lista.contains(nombre))){
                lista2.add(nombre);
            }
            if (!nombre.equalsIgnoreCase("FIN")){
                lista.add(nombre);}
        }
        while (!nombre.equalsIgnoreCase("FIN"));

        System.out.println("Nombres antes de pasar por la función: ");
        System.out.println(lista);
        System.out.println();


        eliminaRepetidos(lista,lista2);

    }

    public static List eliminaRepetidos (List lista, List lista2){
        lista.removeAll(lista2);
        lista.addAll(lista2);
        System.out.println("Nombres despues de pasar por la función: ");
        System.out.println(lista);
        return lista;
    }

}

