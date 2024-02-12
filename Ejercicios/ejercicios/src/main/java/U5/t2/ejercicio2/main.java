package U1.ejercicios.src.main.java.U5.t2.ejercicio2;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        Cliente[] lista= new Cliente[5];

        Cliente c1 = new Cliente("20202020D", "Jose", 2000, 23);
        Cliente c2 = new Cliente("20202020D", "David", 7000, 31);
        Cliente c3 = new Cliente("10202020D", "David", 700, 17);
        Cliente c4 = new Cliente("98765843D", "Raquel", 200, 15);
        Cliente c5 = new Cliente("73462876F", "Jose", 10000, 54);

        lista[0]=c1;
        lista[1]=c2;
        lista[2]=c3;
        lista[3]=c4;
        lista[4]=c5;

        Arrays.sort(lista);
        Arrays.sort(lista, new Comparar_Edad());
        for (int i=0; i< lista.length; i++){
        System.out.println(lista[i]);
            System.out.println();}

    }
}
