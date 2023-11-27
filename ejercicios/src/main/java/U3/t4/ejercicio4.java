package U3.t4;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {


        String[] fila = {"1","2","3","4","5","6","7","8"};
        String[] columna = {"a","b","c","d","e","f","g","h"};
        String pos;
        int num=0,num2=0;

        Scanner teclado2;
        teclado2 = new Scanner(System.in);
        System.out.println("Introduzca la posicion del alfil: ");
        pos = teclado2.nextLine();

        String letra = String.valueOf(pos.charAt(0));
        for (int j = 0; j < 8; j++) {
            if (letra.equalsIgnoreCase(columna[j])){
            num=j;
        }}

        String numero = String.valueOf(pos.charAt(1));
        for (int j = 0; j < 8; j++) {
            if (letra.equalsIgnoreCase(fila[j])){
            num2=j;
        }}

        System.out.println(num2);
        System.out.println(num);
    }
}
