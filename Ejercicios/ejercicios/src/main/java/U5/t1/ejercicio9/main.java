package U1.ejercicios.src.main.java.U5.t1.ejercicio9;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Electrodomestico e1 = new Electrodomestico(100, 5, Electrodomestico.CONSUMO.F, Electrodomestico.COLOR.blanco);

        e1.getPrecioFinal(e1.getPrecio_base(), e1.getPeso());
        System.out.println(e1);

        Electrodomestico[] array = new Electrodomestico[10];

        Electrodomestico l1 = new Lavadora(150, 20, Electrodomestico.CONSUMO.F, Electrodomestico.COLOR.blanco, 20);
        l1.getPrecioFinal(l1.getPrecio_base(), l1.getPeso());

        Electrodomestico l2 = new Lavadora(300, 40, Electrodomestico.CONSUMO.A, Electrodomestico.COLOR.blanco, 70);
        l2.getPrecioFinal(l2.getPrecio_base(), l2.getPeso());

        Electrodomestico l3 = new Lavadora(100, 5, Electrodomestico.CONSUMO.C, Electrodomestico.COLOR.blanco, 20);
        l3.getPrecioFinal(l3.getPrecio_base(), l3.getPeso());

        Electrodomestico l4 = new Lavadora(200, 5, Electrodomestico.CONSUMO.C, Electrodomestico.COLOR.blanco, 70);
        l4.getPrecioFinal(l4.getPrecio_base(), l4.getPeso());

        Electrodomestico l5 = new Lavadora(100, 70, Electrodomestico.CONSUMO.D, Electrodomestico.COLOR.blanco, 40);
        l5.getPrecioFinal(l5.getPrecio_base(), l5.getPeso());

        Electrodomestico l6 = new Television(200,30, Electrodomestico.CONSUMO.A, Electrodomestico.COLOR.blanco,120,true);
        l6.getPrecioFinal(l6.getPrecio_base(), l6.getPeso());

        Electrodomestico l7 = new Television(400,10, Electrodomestico.CONSUMO.C, Electrodomestico.COLOR.blanco,60,true);
        l7.getPrecioFinal(l7.getPrecio_base(), l7.getPeso());

        Electrodomestico l8 = new Television(400,10, Electrodomestico.CONSUMO.C, Electrodomestico.COLOR.blanco,60,false);
        l8.getPrecioFinal(l8.getPrecio_base(), l8.getPeso());

        Electrodomestico l9 = new Television(100,5, Electrodomestico.CONSUMO.F, Electrodomestico.COLOR.blanco,120,true);
        l9.getPrecioFinal(l9.getPrecio_base(), l9.getPeso());

        Electrodomestico l10 = new Television(500,50, Electrodomestico.CONSUMO.A, Electrodomestico.COLOR.blanco,240,true);
        l10.getPrecioFinal(l10.getPrecio_base(), l10.getPeso());


        array[0] = l1;
        array[1] = l2;
        array[2] = l3;
        array[3] = l4;
        array[4] = l5;
        array[5] = l6;
        array[6] = l7;
        array[7] = l8;
        array[8] = l9;
        array[9] = l10;

        imprimir(array);
        Arrays.sort(array);
        System.out.println("--------------");
        imprimir(array);
    }

    public static void imprimir(Electrodomestico[] array) {
        for (Electrodomestico electrodomestico : array) {
            System.out.println(electrodomestico);
        }
    }

}

