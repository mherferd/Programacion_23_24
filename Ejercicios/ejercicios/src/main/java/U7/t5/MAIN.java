package U1.ejercicios.src.main.java.U7.t5;

import U1.ejercicios.src.main.java.U7.t4.Empleado;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<String, Aspirante> diccionario = new HashMap<>();

        System.out.println("------------MENU-----------");
        System.out.println("1. Introducir datos de aspirantes");
        System.out.println("2. Calificar prueba");
        System.out.println("3. Aprobados");
        System.out.println("4. Salir");

        Aspirante a1 = new Aspirante("Joselito","101010A",123123123);

        int decision = teclado.nextInt();

        switch (decision){
            case 1:
                InsertaAspirante.
                break;
            case 2 :

                break;
            case 3 :

                break;
        }
    }
}
