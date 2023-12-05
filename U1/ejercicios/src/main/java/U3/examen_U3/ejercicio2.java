package U3.examen_U3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tamaño del primer vector: ");
        int tamano1 = teclado.nextInt();

        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Introduce el tamaño del segundo vector: ");
        int tamano2 = teclado2.nextInt();

        int [] v1 = new int [tamano1];
        int [] v2 = new int [tamano2];

        for (int i = 0; i < v1.length; i++) {
            Scanner teclado3 = new Scanner(System.in);
            System.out.println("Introduce un numero para el 1º vector: ");
            int numero1 = teclado3.nextInt();;
            v1[i] = numero1;
        }

        for (int i = 0; i < v2.length; i++) {
            Scanner teclado4 = new Scanner(System.in);
            System.out.println("Introduce un numero para el 2º vector: ");
            int numero1 = teclado4.nextInt();;
            v2[i] = numero1;
        }



        System.out.println(Arrays.toString(v1));
        System.out.println(Arrays.toString(v2));

        Scanner teclado5 = new Scanner(System.in);
        System.out.println("Introduce una posición: ");
        int pos = teclado5.nextInt();

        insertarEnVector(v1,v2,pos);
        int[] a_final = insertarEnVector(v1,v2,pos);
        System.out.println(Arrays.toString(a_final));
    }

    public static int [] insertarEnVector(int []v1, int [] v2, int pos) {
        int [] a_final= new int [v1.length+v2.length];

        if (pos<0){
            a_final= v1;
        }
        if (pos>v1.length){
            a_final = v2;
        }
        else{
            int contador=0;
            int contador2=0;
            for (int i=0; i<a_final.length; i++){
                if (i==pos){
                    while(contador<v2.length){
                    a_final[i]=v2[contador];
                    contador++;
                    i++;
                }
                }
                a_final[i]=v1[contador2];
                contador2++;
            }

        }
        return a_final;
    }

    }


