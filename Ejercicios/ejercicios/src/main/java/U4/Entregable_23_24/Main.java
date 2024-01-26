package U1.ejercicios.src.main.java.U4.Entregable_23_24;

import java.util.Scanner;

import static U1.ejercicios.src.main.java.U4.Entregable_23_24.Conciertos.organizador;

public class    Main {
    public static void main(String[] args) {

        Canciones[] canciones = {};
        Canciones[] canciones2 = {};
        Canciones[] canciones3 = {};
        Canciones[] canciones4 = {};
        Canciones[] canciones5 = {};
        Canciones[] canciones6 = {};

        Cantantes[] cantantes ={};

        Escenarios[] escenario={};



        Cantantes cantante1 = new Cantantes("Eladio Carrión", "Eladio", 30, "Humacao", canciones);
        Cantantes cantante2 = new Cantantes("Bad Bunny", "Benito", 30, "Choli", canciones2);
        Cantantes cantante3 = new Cantantes("Gustavo", "Mr.Gus", 19, "Sevilla", canciones3);
        Cantantes cantante4 = new Cantantes("Hola buenas", "Hola", 50, "SiLand", canciones4);
        Cantantes cantante5 = new Cantantes("Nabil Fekir", "Magic", 33, "Rabat", canciones5);
        Cantantes cantante6 = new Cantantes("Enrique", "The Grefg", 20, "Sevilla", canciones6);


        Canciones canciones1 = new Canciones("Hielo", 234, Canciones.Generos.TRAP, cantante1);
        Canciones cancion2 = new Canciones("Hola", 250, Canciones.Generos.TRAP, cantante1);
        Canciones cancion3 = new Canciones("Si", 314, Canciones.Generos.TRAP, cantante2);
        Canciones cancion4 = new Canciones("Final", 220, Canciones.Generos.TRAP, cantante2);
        Canciones cancion5 = new Canciones("Que tal", 123, Canciones.Generos.EMORAP, cantante3);
        Canciones cancion6 = new Canciones("Te odio", 20, Canciones.Generos.EMORAP, cantante3);
        Canciones cancion7 = new Canciones("Hielo", 123, Canciones.Generos.TRAP, cantante4);
        Canciones cancion8 = new Canciones("NO", 543, Canciones.Generos.NEOPERREO, cantante4);
        Canciones cancion9 = new Canciones("Ordenador", 234, Canciones.Generos.EMORAP, cantante5);
        Canciones cancion10 = new Canciones("Programa", 213, Canciones.Generos.EMORAP, cantante5);
        Canciones cancion11 = new Canciones("Voy a suspender", 432, Canciones.Generos.NEOPERREO, cantante6);
        Canciones cancion12 = new Canciones("Raton", 123, Canciones.Generos.NEOPERREO, cantante6);

        //canciones1.mostrar_informacion();
        cantante1.aniadir_cancion(canciones1, cancion2);
        //cantante1.eliminar_cancion();
        //cantante1.mostrar_canciones();

        Escenarios escenario1 = new Escenarios("Cartuja Center", "Cartuja", 60000, cantantes);
        Escenarios escenario2 = new Escenarios("Villamarin", "Los remedios", 55000, cantantes);
        Escenarios escenario3 = new Escenarios("Parque Amate", "Amate", 10000, cantantes);
        Escenarios escenario4 = new Escenarios("Talleres Paco", "La negrilla", 1000, cantantes);
        Escenarios escenario5 = new Escenarios("Skate", "Los pajaros", 6500, cantantes);


        escenario1.aniadir_cantante(cantante1);

        //escenario1.mostrar_informacion();
        //escenario1.mostrar_cantantes();

        Conciertos concierto1 = new Conciertos("Cartuja Concert", escenario );
        Conciertos concierto2 = new Conciertos("El concierto mmundial", escenario );
        Conciertos concierto3 = new Conciertos("Viva la musica", escenario );


        concierto1.setFecha("12/1/2024");
        concierto1.aniadir_escenario(escenario1);
        concierto1.mostrar_informacion();

        Festival festival = new Festival(concierto1,null,null);
    }
}
