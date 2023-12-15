package U3.t2;

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        String texto;
        String java1 = "Javalín, javalón";
        String java2= "javalén,len,len";

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Introduce el texto: ");
        texto = teclado.nextLine();


        if (texto.substring(0,16).equalsIgnoreCase(java1)){
            System.out.println("El texto está en idioma de JavaLandia");
            System.out.println("El mensaje sin este idioma es:");
            System.out.println(texto.substring(17,texto.length()));}

        if (texto.substring(texto.length()-15,texto.length()).equalsIgnoreCase(java2)){
            System.out.println("El texto está en idioma de JavaLandia");
            System.out.println("El mensaje sin este idioma es:");
            System.out.println(texto.substring(0,texto.length()-16));}

        else {
            System.out.println("el mensaje no está en idioma de JavaLandia");}


    }
}
