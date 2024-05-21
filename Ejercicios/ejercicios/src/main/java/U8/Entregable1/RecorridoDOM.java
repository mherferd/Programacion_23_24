package U8.Entregable1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
public class RecorridoDOM {

    public void numNodosHijos() {
        try {

            // Cargo el Fichero XML en Memoria
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc =
                    db.parse(new File("src/main/java/U8/Entregable1/fichero_entregable1.xml"));

            // Cojo directamente las etiquetas persona
            NodeList nl = doc.getElementsByTagName("partido");

            System.out.println("En este fichero tengo " + nl.getLength() + " etiquetas partido");

Element root = doc.getDocumentElement();
            NodeList nl2 = root.getChildNodes();
            for (int i=0; i<nl2.getLength(); i++){
            System.out.println("Tipo de fichero: "+nl2.item(i).getNodeType());}

        } catch (ParserConfigurationException | SAXException | IOException e) {
        for (StackTraceElement element : e.getStackTrace()) {
            System.out.println(element);
        }
    }
    }

    public void mostrarXMLDom(){
        try {

            // Cargo el Fichero XML en Memoria
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc =
                    db.parse(new File("src/main/java/U8/Entregable1/fichero_entregable1.xml"));

            // Cojo directamente las etiquetas persona
            NodeList nl = doc.getElementsByTagName("partidos");

            System.out.println("partidos");

            // Voy a tratar cada una de estas etiquetas persona
            for (int i = 0; i < nl.getLength(); i++) {
                Node nodo = nl.item(i);

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nl.item(i);

                    if (e.hasChildNodes()) {
                        NodeList listaInterior = nodo.getChildNodes();

                        for (int j = 0; j < listaInterior.getLength(); j++) {

                            if (listaInterior.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                Element eHijo = (Element) listaInterior.item(j);
                                System.out.println(eHijo.getTagName());
                            }
                        }
                    }
                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element);
            }
        }
    }

    public void mostrarContenidoEtiqueta(String s) {
        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("src/main/java/U8/Entregable1/fichero_entregable1.xml"));

            // Cojo directamente las etiquetas persona
            NodeList nl = doc.getElementsByTagName(s);

            for (int i = 0; i < nl.getLength(); i++) {
                Node nodo = nl.item(i);

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nl.item(i);

                    if (e.hasChildNodes()) {
                        NodeList listaInterior = nodo.getChildNodes();

                        for (int j = 0; j < listaInterior.getLength(); j++) {

                            if (listaInterior.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                Element eHijo = (Element) listaInterior.item(j);
                                System.out.println(eHijo.getTagName());
                            }
                        }
                    }
                }
            }
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }}
