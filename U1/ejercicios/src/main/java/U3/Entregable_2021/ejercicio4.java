package U3.Entregable_2021;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n = teclado.nextInt();

        String[][] datos = new String[n][n];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                int variable = (int) (Math.random() * (2) + 1);
                if (variable == 1) {
                    (datos[i][j]) = ("X");
                    System.out.print(datos[i][j]);
                    System.out.print(" | ");
                }
                if (variable == 2) {
                    (datos[i][j]) = ("-");
                    System.out.print(datos[i][j]);
                    System.out.print(" | ");
                }
            }

            System.out.println();
        }


        int numero = 0;

        do {
            Scanner teclado2 = new Scanner(System.in);
            System.out.println("Introduce una posicion: ");
            System.out.print("Fila: ");
            System.out.println();
            int numero1 = teclado2.nextInt();
            System.out.print("Columna: ");
            Scanner teclado3 = new Scanner(System.in);
            int numero2 = teclado3.nextInt();

            numero = numero1;

            for (int i = numero1; i <= numero1; i++) {
                for (int j = numero2; j <= numero2; j++) {
                    boolean x = true;
                    if (datos[i][j].equalsIgnoreCase("X")) {
                        System.out.println("En la posición " + numero1 + "," + numero2 + " hay una bomba");
                        numero = -1;
                    } else {
                        int contador = 0;
                        if (numero1 != 0 || numero2 != 0) {
                            for (int z = numero1 - 1; z < numero1 + 2; z++) {
                                for (int y = numero2 - 1; y < numero2 + 2; y++) {
                                    if (datos[z][y].equalsIgnoreCase("X")) {
                                        contador++;
                                    }
                                }

                            }
                        } else {

                        }
                        System.out.println("La posición " + numero1 + "," + numero2 + " tiene " + contador + " bomba en los alrededores");
                    }
                }


            }
        } while (numero != -1);

        System.out.println("Juego finalizado");


    }
}