package U1.ejercicios.src.main.java.U4.t2.Ejercicio2;

import java.util.Arrays;

public class Pila {
    private Integer[] Pila;
    private int indice=0;

    public Pila() {
        this.Pila=new Integer[0];
    }


    public void apilar (int numero){
        if (indice>=Pila.length){
            Pila = Arrays.copyOf(Pila,Pila.length+1);
        }
        Pila[indice]=numero;
        indice++;
    }

    public void desapilar (){
        Pila= Arrays.copyOf(Pila,Pila.length-1);
        indice--;
        }

    @Override
    public String toString() {
        return "Pila{" +
                "Pila=" + Arrays.toString(Pila) +
                ", indice=" + indice +
                '}';
    }

    public Integer cima (){
        return (Pila[Pila.length-1]);
    }
}
