package U3.Recuperación;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las filas del array: ");
        int filas = teclado.nextInt();

        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Introduce las columnas del array: ");
        int columnas = teclado2.nextInt();

        int[][] n = new int[filas][columnas];
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = (int) (Math.random() * (90) + 10 );
                System.out.print(n[i][j]);
                System.out.print(" | ");
            }

            System.out.println();
        }

        Scanner teclado3 = new Scanner(System.in);
        System.out.println("Introduce una posicion: ");
        int posicion = teclado3.nextInt();

        nEsimo(n, posicion);
        int resultado = nEsimo(n, posicion);
        System.out.println(resultado);
    }

    public static int nEsimo(int[][] n, int posicion){
        int resultado = 0, contador=0;

        for (int i=0; i<n.length; i++){
            for (int j=0; j<n[i].length; j++){
                if (contador==posicion){
                    resultado=n[i][j];
                }
                if (posicion>(n.length*n[i].length)-1){
                    resultado=-1;}
                contador++;
            }

        }
        return resultado;
    }
}



