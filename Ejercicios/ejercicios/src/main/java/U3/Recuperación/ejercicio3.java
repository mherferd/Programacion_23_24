package U3.Recuperación;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);
            System.out.print("Introduzca la posición de la reina: ");
            String posReina = teclado.nextLine();

            Scanner teclado2 = new Scanner(System.in);
            System.out.print("Introduzca la posición del rey: ");
            String posRey = teclado2.nextLine();

            jaque(posRey,posReina);

        if (jaque(posRey,posReina)){
            System.out.println("La reina está en posición de jaque al rey");
        }
        else{
            System.out.println("La reina NO está en posición de jaque al rey");}


        }
    public static boolean jaque(String posRey,String posReina){
        boolean resultado = false;

        int columnaReina = (int)(posReina.charAt(0)) - 96;
        int filaReina = (int)(posReina.charAt(1)) - 48;

        int columnaRey = (int)(posRey.charAt(0)) - 96;
        int filaRey = (int)(posRey.charAt(1)) - 48;



        if ((columnaRey==columnaReina) || (filaRey==filaReina)){
            return true;}



        int contador1 = filaReina;
        int contador2 = columnaReina;

        for (int i=1; i<=8; i++){
            for (int j=1; j<=8; j++){
                if (i==contador1+1 && j==contador2+1){
                    contador1++;
                   contador2++;
                if ((columnaRey==j) && (filaRey==i)){
                    resultado = true;}}

            }
        }


        contador1 = filaReina;
        contador2 = columnaReina;

        for (int i=8; i>=1; i--){
            for (int j=8; j>=1; j--){
                if (i==contador1-1 && j==contador2-1){
                    contador1--;
                    contador2--;
                if ((columnaRey==j) && (filaRey==i)){
                    resultado= true;}}

            }
        }


        contador1 = filaReina;
        contador2 = columnaReina;

        for (int i=8; i>=1; i--){
            for (int j=1; j<=8; j++){
                if (i==contador1-1 && j==contador2+1){
                    contador1--;
                    contador2++;
                if ((columnaRey==j) && (filaRey==i)){
                    resultado= true;}}

            }
        };

        contador1 = filaReina;
        contador2 = columnaReina;

        for (int i=1; i<=8; i++){
            for (int j=8; j>=1; j--){
                if (i==contador1+1 && j==contador2-1){
                    contador1++;
                    contador2--;
                if ((columnaRey==j) && (filaRey==i)){
                    resultado= true;}}

            }
        }

        return resultado;
    }

}

