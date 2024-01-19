package U1.ejercicios.src.main.java.U4.t2.Ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista {
    private int indice=0;
    private Integer[] Lista;

    public Lista() {
        this.Lista=new Integer[10];
    }

    public Lista(int longitud) {
        this.Lista = new Integer[longitud];
    }


    public int generar (){
      return indice;
    }

    public void anadir_numero (int numero){
        if (indice>=Lista.length){
            Lista= Arrays.copyOf(Lista,Lista.length+1);
        }
       Lista[indice]=numero;
       indice++;
    }

    public void anadir_inicio (int numero){
        Integer[]copia = Arrays.copyOf(Lista,indice);
        Lista[0]=numero;
        for(int i=0; i<copia.length; i++){
            Lista[i+1]=copia[i];
        }
        indice++;
    }

    public void anadir_final (int numero, int posicion){
        if (posicion >= 0 && posicion<indice){
        Integer[]copia = Arrays.copyOf(Lista,indice);
        Lista[posicion]=numero;
        for(int i=posicion; i<copia.length; i++){
            Lista[i+1]=copia[i];
        }
        indice++;
    }}

    public void anadirLista (Integer[] lista) {
        for(int i=0; i<lista.length ; i++){
            anadir_numero(lista[i]);
        }
    }
    public void mostrar (){
        for (int i=0; i<indice; i++){
            System.out.print(" "+Lista[i]);
        }
    }

    public void eliminar (int posicion){
        if (posicion >= 0 && posicion<indice){
        Integer[]copia = Arrays.copyOf(Lista,indice);
        for(int i=posicion+1; i<copia.length; i++){
            Lista[i-1]=copia[i];
        }
        indice--;
    }}

    public Integer obtener_numero (int posicion) {
        if (posicion >= 0 && posicion<indice){
        return Lista[posicion];
    } else return null;
    }

    public int comparar (int numero) {
        for (int i=0; i<Lista.length; i++){
            if (Lista[i].equals(numero)){
                return i;
            }
        }return -1;
    }
}

