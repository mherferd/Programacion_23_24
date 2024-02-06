package U1.ejercicios.src.main.java.U5.t1.ejercicio9;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Electrodomestico e1 = new Electrodomestico(100,5, Electrodomestico.CONSUMO.F, Electrodomestico.COLOR.blanco);

        e1.getPrecioFinal(e1.getPrecio_base(), e1.getPeso());
        System.out.println(e1);

            Lavadora[] array = new Lavadora[5];

                Lavadora l1 = new Lavadora(150, 20, Electrodomestico.CONSUMO.F, Electrodomestico.COLOR.blanco, 20);
                l1.getPrecioFinal();

                Lavadora l2 = new Lavadora(300, 40, Electrodomestico.CONSUMO.A, Electrodomestico.COLOR.blanco, 70);
                l2.getPrecioFinal();

                Lavadora l3 = new Lavadora(100, 5, Electrodomestico.CONSUMO.C, Electrodomestico.COLOR.blanco, 20);
                l3.getPrecioFinal();

                Lavadora l4 = new Lavadora(200, 5, Electrodomestico.CONSUMO.C, Electrodomestico.COLOR.blanco, 70);
                l4.getPrecioFinal();

                Lavadora l5 = new Lavadora(100, 70, Electrodomestico.CONSUMO.D, Electrodomestico.COLOR.blanco, 40);
                l5.getPrecioFinal();


                array[0] = l1;
                array[1] = l2;
                array[2] = l3;
                array[3] = l4;
                array[4] = l5;

                imprimir(array);
                Arrays.sort(array);
                imprimir(array);
            }

            public static void imprimir (Lavadora[] array ){
                for (Lavadora lavadora : array){
                    System.out.println(lavadora);
                }
                System.out.println("-------------------------");
    }

}

