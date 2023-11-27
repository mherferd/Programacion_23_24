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
            num=j+1;
        }}

        String numero = String.valueOf(pos.charAt(1));
        for (int j = 0; j < 8; j++) {
            if (numero.equalsIgnoreCase(fila[j])){
            num2=j+1;
        }}
        int num_1=num;
        int num_2=num2;

        System.out.println(num);
        System.out.println(num2);


        while (num_1+num_2<=14){
            System.out.print(columna[num_1]);
            System.out.println(fila[num_2]);
            num_1++;
            num_2++;
        }

        num_1=num;
        num_2=num2;

        while (num_1+num_2<=14){
            System.out.print(columna[num_1);
            System.out.println(fila[num_2]);
            num_1++;
            num_2++;
        }




    }
}
