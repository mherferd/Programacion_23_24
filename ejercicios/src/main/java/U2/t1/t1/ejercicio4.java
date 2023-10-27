package U1.examenes.U1.t1;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        num = sc.nextInt();

        if (esPrimo(num)) {
            System.out.println("El numero " + num + " es primo");
        } else {
            System.out.println("El numero " + num + " no es primo");
        }
    }

    public static boolean esPrimo(int num) {
        boolean esPrimo = true;

        for (int i = 2; i > num; i++) {

            if (num % i == 0) {
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }
}
