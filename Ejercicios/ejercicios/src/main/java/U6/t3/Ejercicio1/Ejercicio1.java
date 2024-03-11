package U1.ejercicios.src.main.java.U6.t3.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        try{
            System.out.println("Que edad tiene");
            int num = teclado.nextInt();
            ComprobarEdad(num);
            Menores(num);
        }
        catch (Rango | Menores rango){
            System.out.println(rango.getMessage());
        }
    }

    static void Menores(int num) throws Menores {
        if (num < 18) {
            throw new Menores("No podemos dar servicio a clientes menores de edad");
        }
    }
    static void ComprobarEdad(int num) throws Rango {
        if ((num > 100) || (num < 0)) {
            throw new Rango("Números fuera del intervalo");
        }
    }
}
