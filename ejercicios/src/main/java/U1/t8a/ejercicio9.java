package U1.t8a;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        int arbol, arbol2;
        int contador = 0;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Pulsa -1 para finalizar");
        System.out.println("¿Cuanto mide el árbol (cm)?");
        arbol = teclado.nextInt();


        while (arbol != -1) {

            Scanner teclado2;
            teclado2 = new Scanner(System.in);
            System.out.println("¿Cuanto mide el otro árbol (cm)?");
            arbol2 = teclado2.nextInt();

            if (arbol < arbol2) {
                Scanner teclado3;
                teclado3 = new Scanner(System.in);
                System.out.println("¿Cuanto mide el otro árbol (cm)?");
                arbol = teclado3.nextInt();
                contador = arbol2;

            }
            if (arbol > arbol2) {
                Scanner teclado4;
                teclado4 = new Scanner(System.in);
                System.out.println("¿Cuanto mide el otro árbol (cm)?");
                arbol2 = teclado4.nextInt();
                contador = arbol;

            }
        }
        System.out.println(contador);
    }
}

