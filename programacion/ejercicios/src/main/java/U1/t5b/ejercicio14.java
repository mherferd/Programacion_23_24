package U1.U1.t5b;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        System.out.println("¿De que caracter quieres la pirámide?");
        Scanner teclado1 = new Scanner(System.in);
        String hola = teclado1.nextLine();
        System.out.println("¿Cómo quieres la pirámide?");
        System.out.println("1. Vértice hacia arriba");
        System.out.println("2. Vértice hacia abajo");
        System.out.println("3. Vértice hacia la derecha");
        System.out.println("4. Vértice hacia la izquierda");
        Scanner teclado2 = new Scanner(System.in);
        int num1 = teclado2.nextInt();

        switch (num1) {
            case 1:
                System.out.println("  " + hola);
                System.out.println(" " + hola + hola + hola);
                System.out.println("  " + hola + hola + hola + hola + hola);
                break;

            case 2:
                System.out.println("" + hola + hola + hola + hola + hola);
                System.out.println(" " + hola + hola + hola);
                System.out.println("  " + hola);
                break;

            case 3:
                System.out.println("  " + hola);
                System.out.println("  " + hola + hola);
                System.out.println("  " + hola + hola + hola);
                System.out.println("  " + hola + hola);
                System.out.println("  " + hola);
                break;

            case 4:
                System.out.println("  " + hola);
                System.out.println(" " + hola + hola);
                System.out.println("" + hola + hola + hola);
                System.out.println(" " + hola + hola);
                System.out.println("  " + hola);
                break;

        }


    }
}
