package U2.t1;

import java.util.Scanner;

public class ejercicio1 {
    public static class ejercicio2 {
        public static void main(String[] args) {
            int i, num;
            Scanner sc = new Scanner(System.in);

            System.out.println("Introduce un numero");
            num = sc.nextInt();

            System.out.println("Mostrando los 10 numeros posteriores " + num);
            i = num;

            while (i < num + 10) {
                System.out.println("Numero posterior " + i);
                i++;
            }
        }
    }
}
