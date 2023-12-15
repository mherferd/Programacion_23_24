package U3.Recuperación;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce el tamaño del array: ");
        int tamano= teclado.nextInt();
        int [] a = new int [tamano];

        for (int i=0; i<a.length; i++){
            Scanner teclado2 = new Scanner(System.in);
            System.out.println("Introduce un numero: ");
            a [i] = teclado.nextInt();
        }

        Scanner teclado3= new Scanner(System.in);
        System.out.println("Introduce un valor: ");
        int valor= teclado3.nextInt();


        Scanner teclado4= new Scanner(System.in);
        System.out.println("Introduce una posición: ");
        int posicion= teclado4.nextInt();


        System.out.println();
        int [] resultado = insertarValor(a, valor, posicion);
        System.out.println(Arrays.toString(resultado));

    }

    public static int[] insertarValor(int[] a, int valor, int posicion){
        int [] resultado = new int [a.length+1];
        if (posicion>a.length){
            System.out.println("INCORRECTO - La posicióo introducida excede los límites del vector");
            resultado = a;
        }
        else{
            int contador=0;
            int contador2=0;
            for (int i=0; i<resultado.length; i++){
                if (i==posicion){
                        resultado[i]=valor;
                        contador++;
                        i++;
                    }

                resultado[i]=a[contador2];
                contador2++;
            }

        }
        return resultado;
    }
    }


