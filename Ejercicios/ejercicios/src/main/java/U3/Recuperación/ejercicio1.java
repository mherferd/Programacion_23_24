package U3.Recuperación;

import com.sun.source.tree.BreakTree;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce el tamaño del array:");
        int tamano= teclado.nextInt();
        int [] a = new int [tamano];

        for (int i=0; i<a.length; i++){
            Scanner teclado2 = new Scanner(System.in);
            System.out.println("Introduce un numero: ");
            a [i] = teclado.nextInt();
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
        int resultado = aleatorioDeArray(a);
        System.out.println(resultado);

        }

    public static int aleatorioDeArray(int[] a){
       int posicion = (int) (Math.random() * (a.length));
       int resultado = a[posicion];
       return resultado;
    }

}
