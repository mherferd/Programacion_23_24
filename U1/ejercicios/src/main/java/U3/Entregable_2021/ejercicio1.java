package U1.U1.ejercicios.src.main.java.U3.Entregable_2021;

import java.util.Scanner;

public class ejercicio1 {
        public static void main(String[] args) {

            int n;

            Scanner teclado = new Scanner(System.in);
            System.out.println("Cuantos caracteres tiene el array? ");
            n = teclado.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < a.length; i++) {
                Scanner teclado2 = new Scanner(System.in);
                System.out.println("Introduce un numero: ");
                int numero = teclado.nextInt();
                ;
                a[i] = numero;
            }

            System.out.println();
            filtraPrimos(a);
            int[] pares=filtraPrimos(a);
            System.out.println(Arrays.toString(pares));
        }


        public static int[] filtraPrimos(int a[]) {

            int[] resultado = new int[a.length];

            for (int j = 0; j < a.length; j++) {
                int contador = 2;
                while (a[j] > contador) {
                    if (a[j]%contador!=0){
                        contador++;
                        resultado[j]=a[j];
                    }
                    else{
                        break;
                    }
                }}

            return resultado;
        }
    }