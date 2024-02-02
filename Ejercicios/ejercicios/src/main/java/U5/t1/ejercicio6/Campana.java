package U1.ejercicios.src.main.java.U5.t1.ejercicio6;

import U1.ejercicios.src.main.java.U5.t1.ejercicio5.Instrumento;

import java.sql.SQLOutput;

public class Campana extends Instrumento {

    @Override
    public void interpretar() {
        System.out.println("NOTAS MUSICALES DE LA CAMPANA:");
        for (int i=0; i<contador; i++){
            System.out.println(notas[i]);
        }
    }
}
