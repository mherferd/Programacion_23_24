package U3.t1;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una letra: ");
        String letra = teclado.nextLine();

        if (funcion(letra)){
            System.out.println(letra+" es vocal");
        }
        else{
            System.out.println(letra+" no es vocal");}

    }

    public static boolean funcion(String letra) {
        if (letra.equals("a") || letra.equals("e")  || letra.equals("i")  || letra.equals("o")  || letra.equals("u")) {
            return true;
        } else {
            return false;
        }
    }

}

