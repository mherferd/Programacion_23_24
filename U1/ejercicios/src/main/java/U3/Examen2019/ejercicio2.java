package U3.Examen2019;

import java.util.Scanner;

public class ejercicio2 {

        public static void main(String[] args) {


            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce un numero: ");
            long numero1 = teclado.nextLong();

            Scanner teclado2 = new Scanner(System.in);
            System.out.println("Introduce un numero: ");
            long numero2 = teclado2.nextLong();

            long resultado=juntaNumeros(numero1,numero2);

            System.out.println("El resultado de unir los números es: " + resultado);
        }

        public static long juntaNumeros(long numero1, long numero2) {


            String strB = String.valueOf(numero2);


            numero1 = numero1 * (long) Math.pow(10, strB.length());


            return numero1+ numero2;
        }
    }

