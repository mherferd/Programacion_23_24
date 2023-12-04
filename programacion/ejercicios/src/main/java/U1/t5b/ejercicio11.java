package U1.U1.t5b;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado;
        double num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
        int calificacion = 0;


        teclado = new Scanner(System.in);
        System.out.println("Primera Pregunta: ");
        System.out.println("¿A qué numero decimal equivale el número 1101 en binario? ");
        num1 = teclado.nextDouble();
        if (num1 == 13) {
            System.out.println("Es correcto, +1 Punto");
            calificacion++;
        } else {
            System.out.println("Es incorrecto");

        }


        teclado = new Scanner(System.in);
        System.out.println("Segunda Pregunta: ");
        System.out.println("¿Cuántos dígitos diferentes tiene el sistema hexadecimal? ");
        num2 = teclado.nextDouble();
        if (num2 == 16) {
            System.out.println("Es correcto, +1 Punto");
            calificacion++;
        } else {
            System.out.println("Es incorrecto");

        }


        teclado = new Scanner(System.in);
        System.out.println("Tercera Pregunta: ");
        System.out.println("¿Cuántos GB son 1024 MB? ");
        num3 = teclado.nextByte();
        if (num3 == 1) {
            System.out.println("Es correcto, +1 Punto");
            calificacion++;
        } else {
            System.out.println("Es incorrecto");

        }


        teclado = new Scanner(System.in);
        System.out.println("Cuarta Pregunta: ");
        System.out.println("¿Cuánto da la operación en binario 10011 + 01010? ");
        num4 = teclado.nextDouble();
        if (num4 == 11101) {
            System.out.println("Es correcto, +1 Punto");
            calificacion++;
        } else {
            System.out.println("Es incorrecto");

        }


        teclado = new Scanner(System.in);
        System.out.println("Quinta Pregunta: ");
        System.out.println("¿Cuántos son los elementos principales en una base de datos?  ");
        num5 = teclado.nextDouble();
        if (num5 == 3) {
            System.out.println("Es correcto, +1 Punto");
            calificacion++;
        } else {
            System.out.println("Es incorrecto");

        }


        teclado = new Scanner(System.in);
        System.out.println("Sexta Pregunta: ");
        System.out.println("¿Cuántos dígitos diferentes tiene el sistema binario? ");
        num6 = teclado.nextDouble();
        if (num6 == 2) {
            System.out.println("Es correcto, +1 Punto");
            calificacion++;
        } else {
            System.out.println("Es incorrecto");

        }


        teclado = new Scanner(System.in);
        System.out.println("Séptima Pregunta: ");
        System.out.println("¿Hasta que cifra de mayor rango abarca el tipo byte ? ");
        num7 = teclado.nextDouble();
        if (num7 == 127) {
            System.out.println("Es correcto, +1 Punto");
            calificacion++;
        } else {
            System.out.println("Es incorrecto");

        }


        teclado = new Scanner(System.in);
        System.out.println("Octava Pregunta: ");
        System.out.println("¿Cuánto es el tamaño (en bits) del tipo short? ");
        num8 = teclado.nextDouble();
        if (num8 == 16) {
            System.out.println("Es correcto, +1 Punto");
            calificacion++;
        } else {
            System.out.println("Es incorrecto");

        }


        teclado = new Scanner(System.in);
        System.out.println("Novena Pregunta: ");
        System.out.println("¿En qué año se creó HTML? ");
        num9 = teclado.nextDouble();
        if (num9 == 1980) {
            System.out.println("Es correcto, +1 Punto");
            calificacion++;
        } else {
            System.out.println("Es incorrecto");

        }


        teclado = new Scanner(System.in);
        System.out.println("Última Pregunta: ");
        System.out.println("¿Cuánto da la operación en binario 10011 - 01010? ");
        num10 = teclado.nextDouble();
        if (num10 == 01001) {
            System.out.println("Es correcto, +1 Punto");
            calificacion++;
        } else {
            System.out.println("Es incorrecto");

        }
        System.out.println("Tu puntuación final es: " + calificacion);

    }
}
