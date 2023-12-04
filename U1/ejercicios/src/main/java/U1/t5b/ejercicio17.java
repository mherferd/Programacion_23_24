package U1.U1.t5b;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        {
            Scanner teclado;
            Long num1;
            teclado = new Scanner(System.in);
            System.out.println("Introduzaca un número ");
            num1 = teclado.nextLong();
            if (num1 < 10) {
                System.out.println(num1);
            } else {
                if ((num1 > 10) && (num1 < 100)) {
                    int media1 = (int) (num1 / 10);
                    System.out.println("La primera cifra es " + media1);
                } else {
                    if ((num1 > 100) && (num1 < 1000)) {
                        int media2 = (int) (num1 / 100);
                        System.out.println("La primera cifra es " + media2);
                    } else {
                        if ((num1 > 1000) && (num1 < 10000)) {
                            int media3 = (int) (num1 / 1000);
                            System.out.println("La primera cifra es " + media3);
                        } else {
                            if ((num1 > 10000) && (num1 < 100000)) {
                                int media4 = (int) (num1 / 10000);
                                System.out.println("La primera cifra es " + media4);
                            }

                        }
                    }
                }
            }
        }
    }
}

