package U1.U1.examenes.U1;

import java.util.Scanner;

public class examen_4_4 {
    public static void main(String[] args) {

        int numero = (int) (Math.random() * 7);
        int contador =1;
        String caracter = null;

        while (contador<=numero){

            Scanner scanner = new Scanner(System.in);
            int  columna = 0, fila = 0;


            for (fila = 0; fila <= 0; fila++) {
                for (columna = 0; columna <= 3; columna++) {
                    int numerocaracter = (int) (Math.random() * 7);
                    switch (numerocaracter){
                        case 1:
                            caracter="do";
                            break;
                        case 2:
                            caracter="re";
                            break;
                        case 3:
                            caracter="mi";
                            break;
                        case 4:
                            caracter="fa";
                            break;
                        case 5:
                            caracter="sol";
                            break;
                        case 6:
                            caracter="la";
                            break;
                        case 7:
                            caracter="si";
                            break;
                    }
                    System.out.print(" "+caracter);
                }
                System.out.print(" | ");
            }

            contador++;
        }
        System.out.print("|");
    }


}
