package U1.ejercicios.src.main.java.U4.t2.Ejercicio1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Longitud: ");
        int longitud = teclado.nextInt();

        System.out.println("numero: ");
        int numero = teclado.nextInt();

        int posicion = 4;

        Lista lista1= new Lista();
        lista1.generar(longitud);
        lista1.anadir1(numero);
        lista1.anadir2(numero);
        lista1.anadir3(numero, posicion);

    }
}
