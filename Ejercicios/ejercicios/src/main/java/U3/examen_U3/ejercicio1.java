package U3.examen_U3;

import java.util.Arrays;
import java.util.Scanner;
//Este ejercicio puede resultar lioso, por lo que aunque no esté correcto le voy a dejar algunos comentarios
public class ejercicio1 {
    public static void main(String[] args) {

        String palabra_adivinar;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Introduce la palabra a adivinar: ");
        palabra_adivinar = teclado.nextLine();

        Scanner teclado2;
        teclado2 = new Scanner(System.in);
        System.out.println("Introduce una letra : ");
        char letra = teclado2.next().charAt(0);

        int contador=0;

        String resultado_parcial=palabra_adivinar;

        //Creo un bucle para añadir a la palabra tantos (-) como letras tiene la cadena palabra_adivinar
        while (contador<palabra_adivinar.length()){
        resultado_parcial = resultado_parcial.concat(palabra_adivinar.replaceAll(palabra_adivinar,"-"));
        contador++;}

        //Elimino los caracteres que no sean (-)
        resultado_parcial=resultado_parcial.replaceAll(palabra_adivinar,"");

        String resultado = palabraAhorcado(palabra_adivinar,resultado_parcial,letra);
        System.out.println(resultado);


    }

    public static String palabraAhorcado(String palabra_adivinar, String resultado_parcial, char letra) {

        //Cambio los (-) por la letra introducida
        for (int i = 0; i < palabra_adivinar.length(); i++) {
            if (letra == palabra_adivinar.charAt(i)) {
                resultado_parcial=resultado_parcial.replace(String.valueOf(resultado_parcial.charAt(i)), String.valueOf(letra));
            }
        }
        return resultado_parcial;
    }
}


