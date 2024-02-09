package U1.ejercicios.src.main.java.U5.t2.ejercicio1;

import U1.ejercicios.src.main.java.U5.t1.ejercicio9.Lavadora;

import java.util.Arrays;

public class PilaLista implements Pila,Comparable{
        private Integer[] Pila;
        private int indice;

    public PilaLista(int indice) {
        this.indice = indice;
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
            return "Pila{"+ indice +
                    '}';
        }

        public Integer cima (){
            return (Pila[Pila.length-1]);
        }

    @Override
    public int compareTo(Object o) {
        if(this==o || o==null) return 0;
        PilaLista p = (PilaLista) o;
        if(this.indice> p.indice){
            return 1;
        }
        else if (this.indice<p.indice){
            return -1;
        }
        return 0;
    }

    }



