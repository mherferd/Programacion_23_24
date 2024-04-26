package U1.ejercicios.src.main.java.U7.U6U7_Entregable;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Maraton maraton = new Maraton();

        Atleta Atleta1 = new Atleta("Yung Beef","España", Atleta.CATEGORIA.Junior);
        Atleta Atleta2 = new Atleta("Pelko","España", Atleta.CATEGORIA.Junior);
        Atleta Atleta3 = new Atleta("Bad bunny","Puerto Rico", Atleta.CATEGORIA.Junior);
        Atleta Atleta4 = new Atleta("Armando Broonca","Lituania", Atleta.CATEGORIA.Junior);
        Atleta Atleta5 = new Atleta("Ruru Esefese","Rusia", Atleta.CATEGORIA.Junior);

        Atleta Atleta6 = new Atleta("Gustavo","España", Atleta.CATEGORIA.Senior);
        Atleta Atleta7 = new Atleta("Javier","España", Atleta.CATEGORIA.Senior);
        Atleta Atleta8 = new Atleta("David","EE.UU.", Atleta.CATEGORIA.Senior);
        Atleta Atleta9 = new Atleta("Jenny Tales","Albania", Atleta.CATEGORIA.Senior);
        Atleta Atleta10 = new Atleta("Josepeis Robledo","Rusia", Atleta.CATEGORIA.Senior);

        Atleta Atleta11 = new Atleta("Auronplei","España", Atleta.CATEGORIA.Veterano);
        Atleta Atleta12 = new Atleta("Canales","Mexico", Atleta.CATEGORIA.Veterano);
        Atleta Atleta13 = new Atleta("Pedro Sanchez","EE.UU.", Atleta.CATEGORIA.Veterano);
        Atleta Atleta14 = new Atleta("Vladimir Putin","Rusia", Atleta.CATEGORIA.Veterano);
        Atleta Atleta15 = new Atleta("Eladio Carrion","Rusia", Atleta.CATEGORIA.Veterano);

        maraton.InscribirAtleta(Atleta1);
        maraton.InscribirAtleta(Atleta2);
        maraton.InscribirAtleta(Atleta3);
        maraton.InscribirAtleta(Atleta4);
        maraton.InscribirAtleta(Atleta5);
        maraton.InscribirAtleta(Atleta6);
        maraton.InscribirAtleta(Atleta7);
        maraton.InscribirAtleta(Atleta8);
        maraton.InscribirAtleta(Atleta9);
        maraton.InscribirAtleta(Atleta10);
        maraton.InscribirAtleta(Atleta11);
        maraton.InscribirAtleta(Atleta12);
        maraton.InscribirAtleta(Atleta13);
        maraton.InscribirAtleta(Atleta14);
        maraton.InscribirAtleta(Atleta15);


        maraton.GuardarTiempo(1,5000);
        maraton.GuardarTiempo(2,4000);
        maraton.GuardarTiempo(6,2800);
        maraton.GuardarTiempo(7,3000);
        maraton.GuardarTiempo(9,2500);
        maraton.GuardarTiempo(11,1800);
        maraton.GuardarTiempo(12,1900);
        maraton.GuardarTiempo(13,1700);
        maraton.GuardarTiempo(14,1500);
        maraton.GuardarTiempo(15,2000);




        Scanner teclado = new Scanner(System.in);
        int Opcion=0;
        do{
            System.out.println("-----------Bienvenido al menú de la maratón-------------");
            System.out.println("-------------------¿Qué quiere hacer?-------------------");
            System.out.println("1 - Cargar Atletas");
            System.out.println("2 - Guardar Atletas");
            System.out.println("3 - Inscribir Atleta");
            System.out.println("4 - Guardar Tiempo");
            System.out.println("5 - Borrar Atleta");
            System.out.println("6 - Mostrar Atletas por Tiempo");
            System.out.println("7 - Mostrar Atletas por Categoria");
            System.out.println("8 - Mostrar Numero Inscritos por Pais");
            System.out.println("9 - SALIR");
            Opcion = teclado.nextInt();


            switch (Opcion){
                case 1:
                    maraton.CargarAtletas();
                    break;
                case 2:
                    maraton.GuardarAtletas();
                    break;
                case 3:
                    maraton.InscribirAtletaPorConsola();
                    break;
                case 4:
                    System.out.println("Dorsal del Atleta: ");
                    int dorsal = teclado.nextInt();

                    System.out.println("Tiempo del Atleta: ");
                    int tiempo = teclado.nextInt();

                    maraton.GuardarTiempo(dorsal,tiempo);
                    break;
                case 5:
                    System.out.println("Dorsal del Atleta: ");
                    dorsal = teclado.nextInt();

                    maraton.BorrarAtleta(dorsal);
                    break;
                case 6:
                    maraton.MostrarListaFinishers();
                    break;
                case 7:
                    System.out.println("Que categoria quieres ver: ");
                    teclado.nextLine();
                    String categoria = teclado.nextLine();

                    maraton.MostrarListaCategoria(Atleta.CATEGORIA.valueOf(categoria));
                    break;
                case 8:
                    System.out.println("Que pais quieres ver: ");
                    teclado.nextLine();
                    String pais = teclado.nextLine();

                    maraton.ParticipantesPorPais(pais);
                    break;
                case 9:
                    break;
            }

        }
        while ((Opcion!=9) & (Opcion<9));
    }


}
