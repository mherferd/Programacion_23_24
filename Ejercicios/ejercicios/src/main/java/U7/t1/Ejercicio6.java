package U1.ejercicios.src.main.java.U7.t1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        String nombre="";

        do {
            System.out.println("Dime un nombre: ");
            nombre = teclado.nextLine();
            if (!nombre.equalsIgnoreCase("FIN") & (!lista.contains(nombre))){
            lista.add(nombre);}
        }
        while (!nombre.equalsIgnoreCase("FIN"));

        System.out.println(lista);
    }
}

