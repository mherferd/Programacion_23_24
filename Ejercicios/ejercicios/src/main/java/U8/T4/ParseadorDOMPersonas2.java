package U8.T4;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ParseadorDOMPersonas2 {

    public static void parse(String nomFile) {
        try {
            // Cargar el Fichero XML en Memoria
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("src/main/java/U8/T4/" + nomFile));
            doc.getDocumentElement().normalize();

            // Obtener las etiquetas <persona>
            NodeList nodeList = doc.getElementsByTagName("persona");

            // Procesar cada una de las etiquetas <persona>
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    // Obtener los atributos del elemento <persona>
                    String id = element.getAttribute("id");
                    String genero = element.getAttribute("genero");

                    // Obtener los valores de las etiquetas <nombre> y <edad>
                    String nombre = element.getElementsByTagName("nombre").item(0).getTextContent();
                    String edad = element.getElementsByTagName("edad").item(0).getTextContent();

                    // Imprimir los atributos y los valores de las etiquetas
                    System.out.println("Persona:");
                    System.out.println("  ID: " + id);
                    System.out.println("  Nombre: " + nombre);
                    System.out.println("  Edad: " + edad);
                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        parse("personas.xml");
    }
}


