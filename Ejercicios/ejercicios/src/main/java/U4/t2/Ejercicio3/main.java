package U1.ejercicios.src.main.java.U4.t2.Ejercicio3;

import U1.ejercicios.src.main.java.U4.t2.Ejercicio1.Lista;

public class main {
        public static void main(String[] args) {

            Lista lista1 = new Lista();
            lista1.anadir_numero(3);
            lista1.anadir_numero(7);
            lista1.anadir_numero(5);
            lista1.anadir_numero(4);
            lista1.anadir_inicio(2);
            lista1.anadir_final(9,2);
            Integer[] lista = {8,1,6,7,9};
            lista1.anadirLista(lista);
            lista1.eliminar(2);
            System.out.println();
            lista1.mostrar();
            System.out.println();
            System.out.println(lista1.obtener_numero(2));
            System.out.println(lista1.comparar(5));
        }
    }
