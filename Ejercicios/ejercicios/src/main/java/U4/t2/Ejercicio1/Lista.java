package U1.ejercicios.src.main.java.U4.t2.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private int longitud;
    List <Integer> lista=new ArrayList<>();

    public Lista() {
        longitud = 10;
    }

    public Lista(int longitud) {
        this.longitud = longitud;
    }

    public void generar (int longitud){
        for (int i=0; i<longitud; i++){
            int introducido= (int) (Math.random()*100);
             lista.add(i,introducido);
    }}

    public void anadir1 (int numero){
        lista.add(0,numero);
        System.out.println(lista);
    }

    public void anadir2 (int numero){
        lista.add(lista.size(),numero);
        System.out.println(lista);
    }

    public void anadir3 (int numero, int posicion){
        lista.add(posicion,numero);
        System.out.println(lista);
    }
}

