package U1.ejercicios.src.main.java.U7.t5;

import java.util.Scanner;

public class InsertaAspirante  {

    private static int identificador =0;

    public InsertaAspirante() {
        super();
        identificador++;
    }

    private static void IntroducirAspirantes(Aspirante aspirante) {

        aspirante.setID(identificador);
        System.out.println("El aspirante " +aspirante.getNombre() +" ha sido insertado con el id " +aspirante.getID());

    }
}
