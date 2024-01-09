package U1.ejercicios.src.main.java.U4.t1.Ejercicio3;

import U1.ejercicios.src.main.java.U4.t1.Ejercicio2.Cuenta_Corriente;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String Nombre = teclado.nextLine();

        System.out.println("Introduce tu DNI: ");
        String DNI = teclado.nextLine();

        System.out.println("Introduce tu saldo: ");
        long saldo = teclado.nextLong();

        System.out.println("Introduce tu limite_de_descubrimiento: ");
        long limite_de_descubrimiento = teclado.nextLong();

        Cuenta_Corriente cuenta1 = new Cuenta_Corriente(saldo, limite_de_descubrimiento, DNI);
        Cuenta_Corriente cuenta2 = new Cuenta_Corriente(saldo);

        System.out.println(cuenta1);
        System.out.println(cuenta2);

    }
}
