package U1.ejercicios.src.main.java.U4.t1.Ejercicio5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la longitud: ");
        long longitud = teclado.nextLong();

        teclado.nextLine();
        System.out.println("Introduce una cadena: ");
        String cadena = teclado.nextLine();


        Texto TXT1 = new Texto (longitud, cadena);

        System.out.println("Introduce un carácter para introducir al inicio: ");
        String caracter = teclado.nextLine();

        String mensaje_final = TXT1.sumarcaracter1(caracter);
        System.out.println(mensaje_final);

        System.out.println("Introduce un carácter para introducir al final: ");
        String caracter2 = teclado.nextLine();

        String mensaje_final2 = TXT1.sumarcaracter2(caracter2);
        System.out.println(mensaje_final2);




    }
}