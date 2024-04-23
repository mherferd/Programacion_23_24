package U1.ejercicios.src.main.java.U7.t6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Map<String, Double> diccionario = new HashMap<String, Double>();
        Map<String, Integer> lista_compra = new HashMap<String, Integer>();
        double total=0;



        diccionario.put("Aceitunas", 5.34);
        diccionario.put("Escalopendra", 245.10);
        diccionario.put("Frijoles", 2.99);
        diccionario.put("Rabo de toro", 10.00);
        diccionario.put("Skibidi", 1.50);
        diccionario.put("Banana", 1.00);
        diccionario.put("Macarron dorado puro albanes/tailandes", 12345.88);

        String producto = "";
        System.out.println("Lista de la compra:");

        while (!producto.equalsIgnoreCase("fin")) {

            System.out.println("Producto: ");
            producto = teclado.nextLine();

            System.out.println("Cantidad: ");
            int cantidad = teclado.nextInt();
            teclado.nextLine();

            if (diccionario.containsKey(producto)){
                if (lista_compra.containsKey(producto)){
                    lista_compra.put(producto,cantidad+lista_compra.get(producto));
                }
                else {
                    lista_compra.put(producto, cantidad);
                }
            }
            else {
                System.out.println("Ese producto no existe");
            }
        }
        System.out.println("Introduce un codigo de descuento (INTRO si no tiene ninguno)");
        String codigo = teclado.nextLine();

        for (Map.Entry<String, Integer> iterate : lista_compra.entrySet()) {
            System.out.println("PRODUCTO: " + iterate.getKey() + "\n CANTIDAD: " + iterate.getValue() + "\n PRECIO:  "+diccionario.get(iterate.getKey()) +"\n SUBTOTAL:  "+diccionario.get(iterate.getKey())*iterate.getValue());
            total=total+(diccionario.get(iterate.getKey())*iterate.getValue());
        }
        System.out.println("----------------------------------------");
        if (codigo.equalsIgnoreCase("ECODTO")){
            System.out.println("TOTAL:  " +(total-(total*0.1)));
        }
        else{
            System.out.println("TOTAL:  " +total);
        }


    }
}
