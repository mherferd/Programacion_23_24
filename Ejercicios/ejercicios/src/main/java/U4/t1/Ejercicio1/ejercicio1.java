package U1.ejercicios.src.main.java.U4.t1.Ejercicio1;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String Nombre = teclado.nextLine();

        System.out.println("Introduce tu DNI: ");
        String DNI = teclado.nextLine();

        Cuenta_Corriente cuenta1 = new Cuenta_Corriente(Nombre, DNI);
        Cuenta_Corriente cuenta2 = new Cuenta_Corriente(Nombre, DNI);

        System.out.println(cuenta1);

    }
}
