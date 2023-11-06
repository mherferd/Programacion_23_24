package U3.t1;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Altura: ");
        int n = teclado.nextInt();

        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Radio de la base: ");
        int n2 = teclado2.nextInt();

        Scanner teclado3 = new Scanner(System.in);
        System.out.println("Quiere calcular el área(1) o el volumen(2): ");
        int n3 = teclado3.nextInt();


        funcion(n,n2,n3);
    }

    public static void funcion(int n, int n2, int n3){
        if (n3==1){
            System.out.println("Area total: ");
            System.out.println(2*3.14*n2*(n+n2));
        } else if (n3 == 2) {
            System.out.println("Volumen total: ");
            System.out.println(3.14*(n2*n2)*n);

        }
    }
}
