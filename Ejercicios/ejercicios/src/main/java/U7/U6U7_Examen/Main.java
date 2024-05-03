package U1.ejercicios.src.main.java.U7.U6U7_Examen;

import U1.ejercicios.src.main.java.U7.U6U7_Entregable.Atleta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FeriaSevilla Feria = new FeriaSevilla();

        Caseta C1 = new Caseta("Pinsapo", "Joselito el gallo, 42", 20);
        Caseta C2 = new Caseta("Tussam", "Sanchez Mejias, 122", 16);
        Caseta C3 = new Caseta("Pol.Local", "Infierno, 108", 10);
        Caseta C4 = new Caseta("Manolito PiesPlateados", "Portada, 31", 20);
        Caseta C5 = new Caseta("Coro Patatin", "Joselito el Gallo, 234", 13);


        Artista A1 = new Artista("Camaron", "Flamenco", "España");
        Artista A2 = new Artista("Cigala", "Flamenco", "España");
        Artista A3 = new Artista("Bizarrap", "Urbano", "Argentina");
        Artista A4 = new Artista("Tylor Swift", "Pop", "Estados Unidos");
        Artista A5 = new Artista("Omar Montes", "Flamenco", "España");


        //INTRODUZCO LAS CASETAS EN EL MAPA DE CASETAS

        Feria.addCasetaFeria(C1.getNombre(), C1);
        Feria.addCasetaFeria(C2.getNombre(), C2);
        Feria.addCasetaFeria(C3.getNombre(), C3);
        Feria.addCasetaFeria(C4.getNombre(), C4);
        Feria.addCasetaFeria(C5.getNombre(), C5);

        //INTRODUZCO LOS ARTISTAS EN EL MAPA DE ARTISTAS

        Feria.addArtistaFeria(A1.getNombre(), A1);
        Feria.addArtistaFeria(A2.getNombre(), A2);
        Feria.addArtistaFeria(A3.getNombre(), A3);
        Feria.addArtistaFeria(A4.getNombre(), A4);
        Feria.addArtistaFeria(A5.getNombre(), A5);


        //AÑADO LAS ACTUACIONES LLAMANDO AL METODO ADDACTUACION

        Feria.addActuacion(C1, A1);
        Feria.addActuacion(C1, A2);
        Feria.addActuacion(C1, A3);

        Feria.addActuacion(C2, A1);
        Feria.addActuacion(C2, A5);
        Feria.addActuacion(C2, A4);

        Feria.addActuacion(C3, A1);
        Feria.addActuacion(C3, A4);
        Feria.addActuacion(C3, A3);


        //PRUEBA DE MÉTODOS:

        System.out.println("---------------------------------------------------------------");
        Feria.getArtistas(C2);


        System.out.println("---------------------------------------------------------------");
        Feria.getCasetas(A1);


        //En esta prueba del método getCaseta pruebo introduciento tanto yo mismo el nombre de la caseta como un .get de la caseta
        //Si introduzco un nombre que no existe debe dar error

        System.out.println("---------------------------------------------------------------");
        Feria.getCaseta(C4.getNombre());
        //Feria.getCaseta("Manolito PiesPlateados");

        //Si introduzco un nombre que no existe debe dar error
        System.out.println("---------------------------------------------------------------");
        Feria.getCaseta("La bombonera");


        //En esta prueba del método getArtista pruebo introduciento tanto yo mismo el nombre del artista como un .get del artista
        System.out.println("---------------------------------------------------------------");
        Feria.getArtista(A1.getNombre());
        //Feria.getArtista("Camaron");

        //Si introduzco un nombre que no existe debe dar error
        System.out.println("---------------------------------------------------------------");
        Feria.getArtista("Federico");

        //Metodos de guardar y cargar los datos en un fichero
        System.out.println("---------------------------------------------------------------");
        Feria.guardarDatos();
        Feria.cargarDatos();


        System.out.println("---------------------------------------------------------------");
        Feria.removeCaseta(C1.getNombre());

        //Si introduzco un nombre que no existe debe dar error, voy a probar la caseta C1 que al estar eliminada no debe existir
        System.out.println("--------------------------------------------------------------");
        Feria.removeCaseta(C1.getNombre());

    }
}
