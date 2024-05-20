package U8.T1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ParseadorDOMPersonas parseadorDOMPersonas = new ParseadorDOMPersonas();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Nombre del archivo: ");
        String archivo = "personasXML.xml";

      parseadorDOMPersonas.parse(archivo);

//        parseadorDOMPersonas.parse_elemento(archivo);
    }
}
