package U1.ejercicios.src.main.java.U7.t6;

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<String> posibilidades = new ArrayList<>();
        posibilidades.add("Dama");
        posibilidades.add("Torre");
        posibilidades.add("Torre");
        posibilidades.add("Alfil");
        posibilidades.add("Alfil");
        posibilidades.add("Caballo");
        posibilidades.add("Caballo");
        posibilidades.add("Peon");
        posibilidades.add("Peon");
        posibilidades.add("Peon");
        posibilidades.add("Peon");
        posibilidades.add("Peon");
        posibilidades.add("Peon");
        posibilidades.add("Peon");
        posibilidades.add("Peon");


        Map<String, Integer> diccionario = new HashMap<>();

        diccionario.put("Dama", 9);
        diccionario.put("Torre", 5);
        diccionario.put("Alfil", 3);
        diccionario.put("Caballo", 2);
        diccionario.put("Peon", 1);


        int capturas = (int)(Math.random()*16);
        System.out.println("Fichas capturadas por el jugador: ");

        int total=0;

        for (int i=0; i<capturas; i++) {
            String pieza = posibilidades.get((int)(Math.random()*posibilidades.size()));
            posibilidades.remove(pieza);
            System.out.println(pieza +"(" +diccionario.get(pieza) +" peones)");
            total=total+diccionario.get(pieza);
        }

        System.out.println("Puntos totales: " +total);

    }
}
