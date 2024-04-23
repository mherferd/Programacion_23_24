package U1.ejercicios.src.main.java.U7.t6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Map<String, String> diccionario = new HashMap<>();

        diccionario.put("España", "Madrid");
        diccionario.put("Francia", "Paris");
        diccionario.put("Portugal", "Lisboa");

        String producto = "";


        while (!producto.equalsIgnoreCase("salir")) {

            System.out.println("Escribe el nombre de un país y te dire su capital: ");
            producto = teclado.nextLine();


            if (diccionario.containsKey(producto)){
                System.out.println("La capital de " +producto +" es " + diccionario.get(producto));
            }
            else {
                System.out.println("No conozco la respuesta ¿cuál es la capital de " +producto +"?:");
                String capital = teclado.nextLine();
                diccionario.put(producto,capital);
                System.out.println("Gracias por enseñarme nuevas capitales");
            }
        }

    }
}
