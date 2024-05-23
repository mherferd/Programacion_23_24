package U8.Entregable21_22.Ej1;

import U8.Entregable_XML.RecorridoDOM;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


   try {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc =
                db.parse(new File("C:\\Users\\User\\Downloads\\Programacion_23_24\\Ejercicios\\ejercicios\\src\\main\\java\\U8\\Entregable21_22\\Ej1\\Alumno.xml"));

        // Cojo directamente las etiquetas persona
        NodeList nl = doc.getElementsByTagName("alumno");
        ArrayList<Alumno> alumnos = new ArrayList<>();

        for (int i = 0; i < nl.getLength(); i++) {
            Node node = nl.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String dni = element.getAttribute("dni");
                String nombre = element.getElementsByTagName("nombre").item(0).getTextContent();
                String apellido = element.getElementsByTagName("apellido").item(0).getTextContent();
                String direccion = element.getElementsByTagName("direccion").item(0).getTextContent();

                alumnos.add(new Alumno(dni, nombre, apellido, direccion));
            }
        }

        Collections.sort(alumnos, Comparator.comparing(Alumno::getDni));

        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }

    } catch (ParserConfigurationException | SAXException | IOException e) {
        for (StackTraceElement element : e.getStackTrace()) {
            System.out.println(element);
        }

    }
}}
