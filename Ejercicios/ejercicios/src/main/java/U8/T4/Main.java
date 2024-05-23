package U8.T4;

import U8.T1.ParseadorDOMPersonas;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            ParseadorDOMPersonas2 parseadorDOMPersonas = new ParseadorDOMPersonas2();

            Scanner teclado = new Scanner(System.in);

            System.out.println("Nombre del archivo: ");
            String archivo = "personas2XML.xml";

            parseadorDOMPersonas.parse(archivo);

//        parseadorDOMPersonas.parse_elemento(archivo);
        }
    }


