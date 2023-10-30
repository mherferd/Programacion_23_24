package U1.examenes.U1;

import java.util.Scanner;

public class examen_4_2 {
    public static void main(String[] args) {

        int contador =1;
        String caracter = null;

        while (contador<=10){

        int numero = (int) (Math.random() * 40);
        int numerocaracter = (int) (Math.random() * 6);

        Scanner scanner = new Scanner(System.in);
        int altura = 10, columna = 0, fila = 0;

        switch (numerocaracter){
            case 1:
                caracter="*";
                break;
            case 2:
                caracter="-";
                break;
            case 3:
                caracter="=";
                break;
            case 4:
                caracter=".";
                break;
            case 5:
                caracter="|";
                break;
            case 6:
                caracter="@";
                break;
        }



        for (fila = 0; fila <= 0; fila++) {
            for (columna = 0; columna <= numero; columna++) {
                    System.out.print(caracter);
            }
            System.out.println();
        }
        contador++;
    }}
}
