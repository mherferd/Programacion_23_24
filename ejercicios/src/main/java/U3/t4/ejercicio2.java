package U3.t4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {


        String[] a = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String[] b = new String[8];
        String[] c = new String[8];


        for (int j = 0; j < 8; j++) {
            Scanner teclado2 = new Scanner(System.in);
            System.out.println("Introduzca palabras: ");
            b[j] = teclado2.nextLine();
        }

        int y=0;
        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 9; i++) {
            if (b[j].equalsIgnoreCase(a[i])){
                c[y]=b[j];
                y++;
            }

            }
        }

        for (int j = 0; j < 8; j++) {
            System.out.print(c[j]+" ");
        }

        System.out.println(y);

        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 9; i++) {
                if (!b[j].equalsIgnoreCase(a[i])){
                    c[y]=b[j];
                }
                y++;

            }
        }

        for (int j = 0; j < 8; j++) {
            System.out.print(c[j]+" ");
        }




    }
}
