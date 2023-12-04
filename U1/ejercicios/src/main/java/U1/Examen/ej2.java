package U1.U1.Examen;

import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {

        int numero, cifra, contador = 1 ,numero1 = 0, numero2=0, numero3=0,n1=0, n2=0;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Introduce un número:");
        numero = teclado.nextInt();

        Scanner teclado2;
        teclado2 = new Scanner(System.in);
        System.out.println("Introduce el salto:");
        cifra = teclado2.nextInt();

        n1 = numero;
        while (numero > 0) {
            numero1 = (numero1 * 10) + (numero % 10);
            numero /= 10;
        }

        switch (cifra){
            case 0:
                System.out.println(numero);
                break;
            case 1:
                n2=n1;
                while (n1 / 10 >= 1) {
                    contador++;
                    n1 = n1 / 10;
                    if (contador%2==0){
                    numero2=n1%10;
                    numero3 = numero3 +(int) (Math.pow(10, contador-1)*numero2);
                    }
                    }
                System.out.println(n2-numero3);
                break;
            case 2:
                n2=0;
                numero3=0;
                contador=0;
                while (n1 / 10 >= 1) {
                    contador++;
                    n1 = n1 / 10;
                    if (contador!=1);{
                    numero2=n1%10;
                    numero3 = numero3 +(int) (Math.pow(10, contador-1)*numero2);
                }
                    if (contador>3);
                    contador=1;
                }
                System.out.println(numero3);
                break;

                }

        }
    }


