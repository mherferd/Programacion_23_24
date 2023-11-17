package U3.t3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos dígitos va a tener la clave secreta? ");
        int i = teclado.nextInt();
        int[] t = new int[i];
        int[] a = new int[i];


        for (int j = 0; j < i; j++) {
            int numero = (int) (Math.random() * 5);
            t[j] = numero;
        }

        System.out.print("La clave secreta es: ");
        for (int j = 0; j <= t.length-1; j++) {
            System.out.print(t[j] +" ");
        }
        System.out.println();

        do{

        for (int j = 0; j < i; j++) {
            Scanner teclado2 = new Scanner(System.in);
            System.out.println("Intente acertar la clave: ");
            a[j] = teclado2.nextInt();
        }
        for (int j = 0; j <= t.length-1; j++) {
            System.out.print(a[j] +" ");
        }
        System.out.println();

        if (Arrays.equals(t, a)) {
            System.out.println("La clave es correcta!");

        }
        else {
            System.out.println("Incorrecto");
            for (int j = 0; j < i; j++) {
                if(a[j]<t[j]){
                    System.out.println(a[j] +" es menor");
                }
                if(a[j]>t[j]){
                    System.out.println(a[j] +" es mayor");
                }
                if(a[j]==t[j]){
                    System.out.println(a[j] +" es igual");
                }
            }
        }}

        while (!Arrays.equals(t, a)); {

        }

    }
}
