package U1.ejercicios.src.main.java.U5.t1.ejercicio6;

import U1.ejercicios.src.main.java.U5.t1.ejercicio5.Instrumento;

public class Piano extends Instrumento {

    @Override
    public void interpretar() {
        System.out.println("NOTAS MUSICALES DEL PIANO:");
        for (int i=0; i<contador; i++){
            System.out.println(notas[i]);
        }
    }
}
