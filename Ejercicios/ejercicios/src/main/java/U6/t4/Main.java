package U1.ejercicios.src.main.java.U6.t4;

import U1.ejercicios.src.main.java.U6.t3.Ejercicio1.Menores;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Título del libro:");
        String titulo = teclado.nextLine();

        System.out.println("Nombre del autor:");
        String autor = teclado.nextLine();

        Libro L1 = new Libro(titulo,autor);

        System.out.println("Título del libro:");
        String titulo2 = teclado.nextLine();

        System.out.println("Nombre del autor:");
        String autor2 = teclado.nextLine();

        Libro L2 = new Libro(titulo2,autor2);

        System.out.println("Título del libro:");
        String titulo3 = teclado.nextLine();

        System.out.println("Nombre del autor:");
        String autor3 = teclado.nextLine();

        Libro L3 = new Libro(titulo3,autor3);



        RegistroLibros R1 = new RegistroLibros(2);

        R1.add_libro(L1);
        R1.add_libro(L2);
        R1.add_libro(L3);

        System.out.println(R1);






    }
}
