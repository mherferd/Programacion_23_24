package U1.t8a;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        int intento;
        int numero = (int) (Math.random() * 100);

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Pulsa -1 para rendirte");
        System.out.println("¿Cuál es el numero secreto?");
        intento = teclado.nextInt();

        System.out.println(intento);

        while ((intento != numero) && (intento != -1)) {
            if (intento < numero) {
                System.out.println("El numero secreto es mayor que " + intento);
            }
            if (intento > numero) {
                System.out.println("El numero secreto es menor que " + intento);
            }

            Scanner teclado1;
            teclado1 = new Scanner(System.in);
            System.out.println("Dime otro numero");
            intento = teclado1.nextInt();
        }

        if (intento == -1) {
            System.out.println("FIN");
        }

        if (intento == numero) {
            System.out.println(("Enhorabuena has acertado el numero secreto"));
        }
    }
}
