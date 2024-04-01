package U1.ejercicios.src.main.java.U7.t2;

import java.util.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena = "Te vash perma";


        List resultado = leeCadena(cadena);
        System.out.println(resultado);

    }
  private static List<Character> leeCadena(String cadena) {
      List<Character> todos = new ArrayList<>();

      for (int i=0; i< cadena.length(); i++){
          todos.add(cadena.charAt(i));
      }
      return todos;
  }

}
