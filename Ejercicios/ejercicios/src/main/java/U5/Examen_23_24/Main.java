package U1.ejercicios.src.main.java.U5.Examen_23_24;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //Creo elementos Multimedia

        Serie ser1 = new Serie("Historias Corrientes","Bob Marley",10,2012);
        Pelicula pel1 = new Pelicula("La copa","Lopera",2022,123,"RBB","España");
        Libro lib1 = new Libro("El principito","Chuck Norris",1995,"2345-FD","Komanche",120);
        Pelicula pel2 = new Pelicula("Spiderman 78","Pedro Sanchez",2020,180,"Spain Prod","España");

        //Creo capitulos (para la clase Serie)
        String capitulo1 = "S01E01";
        String capitulo2 = "S01E02";
        String capitulo3 = "S01E03";
        String capitulo4 = "S01E04";
        String capitulo5 = "S02E01";
        String capitulo6 = "S02E02";


        //Añado los capitulos creados a la serie ya creada anteriormente mediante el método add_capitulo
        ser1.add_capitulo(capitulo1);
        ser1.add_capitulo(capitulo2);
        ser1.add_capitulo(capitulo3);
        ser1.add_capitulo(capitulo4);
        ser1.add_capitulo(capitulo5);
        ser1.add_capitulo(capitulo6);

        //Imprimo para comprobar que funciona correctamente
        //System.out.println(ser1);

        //Elimino un capitulo para comprobar si el método eliminar_capitulo funciona
        ser1.eliminar_capitulo(capitulo4);

        //Imprimo para comprobar que vuelve a funciona correctamente
        //System.out.println(ser1);

        //Uso el método dar_por_finalizado para comprobar que funciona
        ser1.dar_por_finalizado();
        pel1.dar_por_finalizado();
        lib1.dar_por_finalizado();
        pel2.dar_por_finalizado();
        System.out.println();

        //Utilizamos los métodos implementados por la interfaz reproducible
        ser1.play();
        ser1.pause();
        ser1.stop();
        pel1.play();
        pel1.pause();
        pel1.stop();


        //Creamos un catálogo y añadimos nuestros elementos a este catálogo
        System.out.println();
        Catalogo catalogo = new Catalogo();
        catalogo.add_multimedia(ser1);
        catalogo.add_multimedia(pel1);
        catalogo.add_multimedia(lib1);
        catalogo.add_multimedia(pel2);

        //Ejecutamos el método que nos muestra cuantos elementos hay en el catálogo
        catalogo.numero_de_elementos();

        System.out.println(catalogo);


        //Comenzamos a comprobar si funcionan las ordenaciones, para comprobar que funcionan elimine el comentario.

        //Al incrementar el ID cada vez que añadimos un elemento, estos estarán en el mismo orden
        System.out.println();
        catalogo.ordenar_por_id();
        System.out.println(catalogo +"\n");


        catalogo.ordenar_por_titulo();
        System.out.println(catalogo+"\n");

        catalogo.ordenar_por_anyo();
        System.out.println(catalogo+"\n");


        //Ahora voy a comprobar si funciona bien el método eliminar_elemento, para eliminar un elemento multimedia

        catalogo.eliminar_multimedia(pel2);
        System.out.println("Se ha eliminado la pelicula " +pel2.getTitulo() +" del catálogo");
        System.out.println(catalogo+"\n");




    }
}
