package U3.t4;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {


        int[] n_mesa = {1,2,3,4,5,6,7,8,9,10};
        int[] ocupacion = new int [10];
        int num;

        for (int j = 0; j < 10; j++) {
            int numero = (int) (Math.random() * 4);
            ocupacion[j] = numero;
        }

        do{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas personas sois?(-1 para salir del programa)");
        num = teclado.nextInt();

        while (num > 4) {
            Scanner teclado2;
            teclado2 = new Scanner(System.in);
            System.out.println("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo");
            num = teclado2.nextInt();
        }

        int minimo = ocupacion[0];

        for (int j = 0; j < 10; j++) {
            if ((ocupacion[j] < minimo)&&(num+ocupacion[j]<=4)) {
                minimo = ocupacion[j];
                ocupacion[j]=num+ocupacion[j];}
        }
        minimo=0;

        System.out.println(Arrays.toString(n_mesa));
        System.out.println(Arrays.toString(ocupacion));
    }
    while (num!=-1);}
}
