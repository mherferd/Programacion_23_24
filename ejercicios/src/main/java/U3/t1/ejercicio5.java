package U3.t1;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int n = teclado.nextInt();

        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Dime otro numero: ");
        int n2 = teclado2.nextInt();

        Scanner teclado3 = new Scanner(System.in);
        System.out.println("Dime otro numero: ");
        int n3 = teclado3.nextInt();


        int mayor2 = masGrande(masGrande(n,n2),n3);
        System.out.println(mayor2);
    }

    public static int masGrande(int n, int n2){
        if (n<n2){
            return n2;
        }
        else{
            return n;
        }
    }}