package U1.ejercicios.src.main.java.U4.t2.Ejercicio3;

import java.util.Arrays;

public class Pila {
    private Integer[] Lista;
    private int indice=0;

    public Pila() {
        this.Lista=new Integer[0];
    }


    public void apilar (int numero){
        if (indice>=Lista.length){
            Lista = Arrays.copyOf(Lista,Lista.length+1);
        }
        Lista[indice]=numero;
        indice++;
    }

    public void desapilar (){
        Lista= Arrays.copyOf(Lista,Lista.length-1);
        indice--;
    }

    @Override
    public String toString() {
        return "Pila{" +
                "Pila=" + Arrays.toString(Lista) +
                ", indice=" + indice +
                '}';
    }

    public Integer cima (){
        return (Lista[Lista.length-1]);
    }
}

