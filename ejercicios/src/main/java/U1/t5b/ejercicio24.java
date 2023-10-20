package U1.t5b;

import java.util.Scanner;

public class ejercicio24 {
    public static void main(String[] args) {

        String jugada1, jugada2;

        Scanner teclado1 = new Scanner(System.in);
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera):");
        jugada1 = teclado1.nextLine();

        Scanner teclado2 = new Scanner(System.in);
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera):");
        jugada2 = teclado1.nextLine();

        if (jugada1.equals(jugada2)) {
            System.out.println("Empate");
        } else {
            if (jugada1.equals("piedra") && jugada2.equals(("tijera"))) {
                System.out.println("Gana jugador 1");
            }
            if (jugada1.equals("tijera") && jugada2.equals("papel")) {
                System.out.println("Gana jugador 1");
            }
            if (jugada1.equals("papel") && jugada2.equals("piedra")) {
                System.out.println("Gana jugador 1");
            } else {
                System.out.println("Gana jugador 2");

            }

        }
    }
}

