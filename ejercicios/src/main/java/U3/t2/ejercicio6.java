package U3.t2;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        String contrasena, intento;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Introduce la contraseña: ");
        contrasena = teclado.nextLine();

        int pista1 = contrasena.length();
        char pista2 = contrasena.charAt(0);
        char pista3 = contrasena.charAt(pista1-1);

        System.out.println("número de caracteres: "+pista1);
        System.out.println("primera letra: "+pista2);
        System.out.println("ultima letra: "+pista3);

        do{
        Scanner teclado2;
        teclado2 = new Scanner(System.in);
        System.out.println("Introduce la contraseña: ");
        intento = teclado2.nextLine();
            if (!intento.equals(contrasena)){
            System.out.println("Incorrecto!");}
            intento.compareTo(contrasena);}

            while (!intento.equals(contrasena));


    }
    }
