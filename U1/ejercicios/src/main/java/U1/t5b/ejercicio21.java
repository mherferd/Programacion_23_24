package U1.U1.t5b;

import javax.swing.*;
import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {

        Long cargo, viaje, estado;
        double sueldo_base = 0;

        System.out.print("1- Programador junior ");
        System.out.print("2- Programador senior ");
        System.out.print("3- Jefe de proyecto");

        Scanner teclado1 = new Scanner(System.in);
        System.out.print("Introduzca el cargo de empleado (1-3): ");
        cargo = teclado1.nextLong();

        Scanner teclado2 = new Scanner(System.in);
        System.out.print("¿Cuántos dias ha estado de viaje visitando clientes? : ");
        viaje = teclado2.nextLong();
        double dieta = viaje * 30;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca su estado civil (1- soltero / 2- Casado): ");
        estado = teclado.nextLong();

        System.out.println("---------------------------------------- ");

        if (cargo == 1) {
            sueldo_base = 950;
            System.out.println("/ Sueldo base 950,00 /");
            System.out.println("/ Dietas (" + viaje + "viajes) " + dieta + " /");
        }

        if (cargo == 2) {
            sueldo_base = 1200;
            System.out.println("/ Sueldo base 1200,00 /");
            System.out.println("/ Dietas (" + viaje + "viajes) " + dieta + " /");
        }

        if (cargo == 3) {
            sueldo_base = 1600;
            System.out.println("/ Sueldo base 1600,00 /");
            System.out.println("/ Dietas (" + viaje + "viajes) " + dieta + " /");
        }

        System.out.println("/----------------------------------------/");

        if (estado == 1) {
            System.out.println("/ Sueldo bruto " + (sueldo_base + dieta) + " /");
            System.out.println("/ Retención IRPF (20%)" + (sueldo_base + dieta) * 0.25 + " /");
            System.out.print("/----------------------------------------/");

            System.out.print("/ Sueldo neto " + ((sueldo_base + dieta) - (sueldo_base + dieta) * 0.25) + " /");
        }

        if (estado == 2) {

            System.out.println("/ Sueldo bruto " + (sueldo_base + dieta) + " /");
            System.out.println("/ Retención IRPF (25%)" + (sueldo_base + dieta) * 0.2 + " /");
            System.out.println("/----------------------------------------/");

            System.out.print("/ Sueldo neto " + ((sueldo_base + dieta) - (sueldo_base + dieta) * 0.2) + " /");
        }


    }
}
