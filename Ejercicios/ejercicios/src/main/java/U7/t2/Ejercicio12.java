package U1.ejercicios.src.main.java.U7.t2;

import java.sql.PreparedStatement;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio12 {
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
            conjunto2.add("A");
            conjunto2.add("Todos");
            conjunto2.add("Guapisimos");



            System.out.println(conjunto);
            System.out.println(conjunto2);

            incluido(conjunto,conjunto2);

            boolean res_final = incluido(conjunto,conjunto2);
            System.out.println(res_final);
        }
        private static boolean incluido (Set conjunto1, Set conjunto2) {
            boolean resultado = false;
            if (conjunto2.containsAll(conjunto1)) {
                     return true;
            }

            return resultado;

        }

    }



