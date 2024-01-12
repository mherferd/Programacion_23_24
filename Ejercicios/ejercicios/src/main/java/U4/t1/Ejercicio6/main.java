package U1.ejercicios.src.main.java.U4.t1.Ejercicio6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el nombre del banco: ");
        String nombre = teclado.nextLine();

        System.out.println("Introduce la dirección del banco: ");
        String direccion = teclado.nextLine();

        System.out.println("Introduce tu nombre: ");
        String Nombre = teclado.nextLine();

        System.out.println("Introduce tu DNI: ");
        String DNI = teclado.nextLine();

        System.out.println("Introduce tu saldo: ");
        long saldo = teclado.nextLong();

        System.out.println("Introduce tu limite_de_descubrimiento: ");
        long limite_de_descubrimiento = teclado.nextLong();

        Banco Banco1 = new Banco(nombre,direccion);
        Cuenta_Corriente Cuenta1 = new Cuenta_Corriente(saldo,limite_de_descubrimiento,DNI);

        System.out.println(Cuenta1);
        System.out.println(Banco1);
    }
}
