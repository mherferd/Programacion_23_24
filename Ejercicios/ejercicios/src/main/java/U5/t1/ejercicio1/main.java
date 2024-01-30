package U1.ejercicios.src.main.java.U5.t1.ejercicio1;

import U1.ejercicios.src.main.java.U5.t1.ejercicio2.Hora12;
import U1.ejercicios.src.main.java.U5.t1.ejercicio3.HoraExacta;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int hora =0, minuto=0;
        Scanner teclado = new Scanner(System.in);
        do{
        System.out.println("Qué hora es? (horas): ");
        hora= teclado.nextInt();
        System.out.println("Qué hora es? (minutos):  ");
        minuto = teclado.nextInt();
        if (hora>23 && minuto>60) {
            System.out.println("Incorrecto! vuelve a introducir una hora correcta");}
        }

        while (hora>23 && minuto>60);


    HoraExacta hora1 = new HoraExacta(hora , minuto, 13  );
    HoraExacta hora2 = new HoraExacta(13,13,13);
    System.out.println(hora1);
    if(hora1.equals(hora2)){
        System.out.println("Son la misma hora");
    }
    else {
        System.out.println("No son la misma hora");
    }
    }
}
