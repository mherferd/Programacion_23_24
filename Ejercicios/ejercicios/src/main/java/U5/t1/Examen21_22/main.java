package U1.ejercicios.src.main.java.U5.t1.Examen21_22;

import U1.ejercicios.src.main.java.U4.t2.Ejercicio1.Lista;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        Coro coro1=new Coro("Los Coristas", "Los Pájaros");
        Chirigota chi1=new Chirigota("Cantantos", "Trenes");
        Comparsa com1=new Comparsa("Parseros", "Mejicanos");
        Cuarteto cua1=new Cuarteto("4 gatos", "Gatos");
        Romancero rom1=new Romancero("Enamorados", "El amor");

        Integrante i1 = new Integrante(1,"Manolo",20,"Sevilla");
        Integrante i2 = new Integrante(2,"Jesus",32,"Zamora");
        Integrante i3 = new Integrante(3,"Juanele",22,"Guatemala");

        Integrante i7 = new Integrante(7,"Fekir",31,"Malaga");
        Integrante i8 = new Integrante(8,"ANUEL",32,"Puerto Rico");
        Integrante i9 = new Integrante(9,"Kobey",45,"Missisipi");

        Integrante i10 = new Integrante(10,"Sabaly",28,"Senegal");
        Integrante i11 = new Integrante(11,"Isco",29,"Malaga");
        Integrante i12 = new Integrante(12,"Juanmi",30,"Sevilla");

        Integrante i13 = new Integrante(13,"Joaquin",42,"Cadiz");
        Integrante i14 = new Integrante(14,"Picha",19,"Cadiz");
        Integrante i15 = new Integrante(15,"Pablo",26,"Almeria");

        coro1.insertar_integrante(i1);
        coro1.insertar_integrante(i2);
        coro1.insertar_integrante(i3);

        chi1.insertar_integrante(i7);
        chi1.insertar_integrante(i8);
        chi1.insertar_integrante(i9);

        com1.insertar_integrante(i10);
        com1.insertar_integrante(i12);
        com1.insertar_integrante(i11);

        cua1.insertar_integrante(i13);
        cua1.insertar_integrante(i14);
        cua1.insertar_integrante(i15);


        System.out.println(coro1);
        System.out.println(chi1);
        System.out.println(com1);
        System.out.println(cua1);



    }
}
