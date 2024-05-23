package U8.T2;

import U8.T2.Parse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int eleccion = 0;

        while (eleccion != 4) {
            System.out.println("Elige una opcion de las siguientes " + "\n" +
                    "1) Crea un fichero FichPersona.dat, y almacena varios objetos persona." + "\n" +
                    "2) Tomando como base el fichero anterior, crea un documento XML usando DOM." + "\n" +
                    "3) Prueba los parsers del Ejercicio 1 para comprobar que permiten leer el documento XML que has generado en el apartado anterior." + "\n" +
                    "4) Salir.");
            eleccion = sc.nextInt();

            String f = "FichPersona.xml";

            switch (eleccion) {
                case 1:
                    Parse.creaFicheroDatosPersonas();
                    Parse.Leer();
                    break;
                case 2:
                    Parse.Leer();
                    Parse.crearDocumentoXML(f);
                    break;
                case 3:
                    Parse.parse(f);
                    break;
                case 4:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Elige una opcion correcta");
                    break;
            }
        }
    }
}

