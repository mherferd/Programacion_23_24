package U8.T3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        ParseadorDOMPersonas parseadorDOMPersonas = new ParseadorDOMPersonas();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Nombre del archivo: ");
        String archivo = "personasXML.xml";

        parseadorDOMPersonas.parse(archivo);
    }
}
