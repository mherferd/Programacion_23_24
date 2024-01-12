package U1.ejercicios.src.main.java.U4.t1.Ejercicio8;

import java.util.Scanner;
import java.util.Vector;

public class main {
    public static void main(String[] args) {
        int numero =0;

        Bombilla Estado = new Bombilla();

        System.out.println(Estado);

        Scanner teclado = new Scanner(System.in);
        System.out.println("1- ENCENDER INTERRUPTOR");
        System.out.println("2- APAGAR INTERRUPTOR");
        System.out.println("3- ENCENDER BOMBILLA");
        System.out.println("4- APAGAR BOMBILLA");
        System.out.println("5- MOSTRAR ESTADO");
        System.out.println("6- SALIR DEL SISTEMA");

        do{

        System.out.println("Qué quieres hacer?: ");
        numero = teclado.nextInt();

        switch (numero){
            case 1: Estado.encender_Interruptor();
            break;
            case 2: Estado.apagar_Interruptor();
            break;
            case 3: Estado.encender_bombilla();
            break;
            case 4: Estado.apagar_bombilla();
            break;
            case 5:
                Estado.mostrar_estado();
                break;
        }}
        while (numero!=6);

    }
}
