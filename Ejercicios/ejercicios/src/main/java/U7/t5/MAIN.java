package U1.ejercicios.src.main.java.U7.t5;

import U1.ejercicios.src.main.java.U7.t4.Empleado;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        InsertaAspirante is1 = new InsertaAspirante();
        CalificacionPruebas cal1 = new CalificacionPruebas();
        Aprobados ap1 = new Aprobados();

        int decision;
        HashMap<Integer,Aspirante> Lista = new HashMap<>();


        do {
            System.out.println("------------MENU-----------");
            System.out.println("1. Introducir datos de aspirantes");
            System.out.println("2. Calificar prueba");
            System.out.println("3. Aprobados");
            System.out.println("4. Salir");
            decision = teclado.nextInt();


            switch (decision) {
                case 1:
                    is1.IntroducirAspirantes();
                    is1.guardarFicheros();
                    break;
                case 2:
                    cal1.leeFichero();
                    cal1.guardarFicheros();
                    break;
                case 3:
                    ap1.LeeFichero();
                    break;
            }
        }while(decision!=4);
    }


}
