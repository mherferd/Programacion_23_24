package U3.t3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {

        int total1=0, total2=0, total3=0;

        int tri1 [] = new int [5];
        int tri2 [] = new int [5];
        int tri3 [] = new int [5];
        int media [] = new int [5];

        for (int j = 0; j < 5; j++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduzca la nota del " +(j+1) +" alumno en el 1º trimestre: ");
            tri1[j] = teclado.nextInt();
        }

        for (int j = 0; j < 5; j++) {
            Scanner teclado2 = new Scanner(System.in);
            System.out.println("Introduzca la nota del " +(j+1) +" alumno en el 2º trimestre: ");
            tri2[j] = teclado2.nextInt();
        }

        for (int j = 0; j < 5; j++) {
            Scanner teclado3 = new Scanner(System.in);
            System.out.println("Introduzca la nota del " +(j+1) +" alumno en el 3º trimestre: ");
            tri3[j] = teclado3.nextInt();
        }

        System.out.println("NOTAS DEL 1ºTRIMESTRE: "+Arrays.toString(tri1));
        System.out.println("NOTAS DEL 2ºTRIMESTRE: "+Arrays.toString(tri2));
        System.out.println("NOTAS DEL 3ºTRIMESTRE: "+Arrays.toString(tri3));

        for (int j = 0; j < 5; j++) {
            total1 = tri1[j] + total1;
            total2 = tri2[j] + total2;
            total3 = tri3[j] + total3;
        }

        int [] total = {total1/5, total2/5, total3/5};
        System.out.println("NOTAS MEDIAS TRIMESTRALES DE GRUPO: "+Arrays.toString(total));

        for (int j = 0; j < 5; j++) {
           media[j] = ((tri1[j]) + (tri2[j]) + (tri3[j]))/3;
        }

        System.out.println(Arrays.toString(media));



    }
}
