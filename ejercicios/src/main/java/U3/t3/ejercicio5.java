package U3.t3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {

        int[] b = new int[6];
        int[] a = new int[6];
        int[] fin = new int[12];
        int j1=0,j2=0;

        for (int j = 0; j < 6; j++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduzca enteros ");
            a[j] = teclado.nextInt();
        }

        for (int j = 0; j < 6; j++) {
            Scanner teclado2 = new Scanner(System.in);
            System.out.println("Introduzca enteros ");
            b[j] = teclado2.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);

        while (j1<6 || j2<6){
            if (j1 ==6){
                System.out.println(b[j2]);
                fin[j1+j2]=b[j2];
                j2++;
            }

            if (j1<6 && j2 ==6){
                System.out.println(a[j1]);
                fin[j1+j2]=a[j1];
                j1++;
            }

            if (j1<6 && j2<6 && a[j1]<=b[j2]){
                System.out.println(a[j1]);
                fin[j1+j2]=a[j1];
                j1++;
            }
            else if (j1<6 && j2<6 && b[j2]<a[j1]){
                System.out.println(b[j2]);
                fin[j1+j2]=b[j2];
                j2++;
            }


        }

        System.out.println(Arrays.toString(fin));



    }
}

