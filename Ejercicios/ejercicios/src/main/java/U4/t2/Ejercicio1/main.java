package U1.ejercicios.src.main.java.U4.t2.Ejercicio1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Longitud: ");
        int longitud = teclado.nextInt();

        Lista lista1= new Lista();
        lista1.generar(longitud);
    }
}
