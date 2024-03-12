package U1.ejercicios.src.main.java.U6.t3.Ejercicio2;

import U1.ejercicios.src.main.java.U6.t3.Ejercicio1.Menores;
import U1.ejercicios.src.main.java.U6.t3.Ejercicio1.Rango;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {


        String dni = "12312312D";

        Scanner teclado = new Scanner(System.in);

        try{
            System.out.println("Que edad tiene");
            int num = teclado.nextInt();
            ComprobarEdad(num,dni);
            Menores(num,dni);
        }
        catch (Rango | Menores rango){
                try {
                    BufferedWriter out = new BufferedWriter(new FileWriter("C:/Ficheros_UD6/t3/Ejercicio.txt"));
                    out.newLine();
                    out.write(rango.getMessage());
                    out.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }


    static void Menores(int num, String dni) throws Menores {
        LocalDateTime hoy = LocalDateTime.now();
        if (num < 18) {
            throw new Menores(hoy.getDayOfMonth() +" : " +hoy.getMonthValue() +" : "+hoy.getYear()+" : "+hoy.getMinute()
            +"- EX002 - MenorDeEdadException: Imposible crear el usuario con dni "+dni +" . El cliente no puede ser menor de edad ( Edad indicada: - " +num +" )");
        }
    }
    static void ComprobarEdad(int num, String dni) throws Rango {
        LocalDateTime hoy = LocalDateTime.now();
        if ((num > 100) || (num < 0)) {
            throw new Rango(hoy.getDayOfMonth() +" : " +hoy.getMonthValue() +" : "+hoy.getYear()+" : "+hoy.getMinute()
                    +"- EX001 - EdadErroneaException: Imposible crear el usuario con dni "+dni +" . La edad no puede ser negativa (Edad indicada: - " +num+" )");
        }
    }
}
