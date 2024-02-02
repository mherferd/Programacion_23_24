package U1.ejercicios.src.main.java.U5.t1.ejercicio5;

import java.util.Arrays;

public abstract class Instrumento {
        public abstract void interpretar();
        public enum NOTAS{
            DO,RE,MI,FA,SOL,LA,SI
        }

        protected NOTAS[] notas;
        protected int contador;

        public Instrumento() {
                notas = new NOTAS[100];
                contador = 0;
        }

        public void add(NOTAS nota_musical){
                notas[contador] = nota_musical;
                contador++;
        }
}

