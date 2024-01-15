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
            int numero= (int) (Math.random()*100);
            System.out.println(numero);}
    }
}

