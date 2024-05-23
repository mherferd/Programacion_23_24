package U8.Entregable_XML;

import javax.xml.parsers.ParserConfigurationException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException {
        RecorridoDOM recorridoDOM = new RecorridoDOM();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una etiqueta");
        String etiqueta = teclado.nextLine();

       // recorridoDOM.mostrarContenidoEtiqueta(etiqueta);
        recorridoDOM.numNodosHijos();
        recorridoDOM.mostrarXMLDom();
        recorridoDOM.mostrarContenidoEtiqueta(etiqueta);
    }
}
