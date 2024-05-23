package U8.Entregable_XML;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
public class RecorridoDOM {

    public void numNodosHijos() {
        try {

            // Cargo el Fichero XML en Memoria
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc =
                    db.parse(new File("src/main/java/U8/Entregable1/fichero_entregable1.xml"));


            NodeList nodeList = doc.getDocumentElement().getChildNodes();
            System.out.println("Número de nodos hijos: " + nodeList.getLength());
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println("Nodo: " + node.getNodeName() + ", Tipo: Elemento");
                } else if (node.getNodeType() == Node.TEXT_NODE) {
                    System.out.println("Nodo: " + node.getNodeName() + ", Tipo: Texto");
                } else if (node.getNodeType() == Node.COMMENT_NODE) {
                    System.out.println("Nodo: " + node.getNodeName() + ", Tipo: Comentario");
                }
            }
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }

    public void mostrarXMLDom()  {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = null;
        try {
            db = dbf.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
        Document doc = null;
        try {
            doc = db.parse(new File("src/main/java/U8/Entregable1/fichero_entregable1.xml"));
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        NodeList nodeList = doc.getDocumentElement().getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println("Etiqueta: " + element.getNodeName());
                NamedNodeMap attributes = element.getAttributes();
                for (int j = 0; j < attributes.getLength(); j++) {
                    Node attribute = attributes.item(j);
                    System.out.println("Atributo: " + attribute.getNodeName() + " = " + attribute.getNodeValue());
                }
                if (element.hasChildNodes()) {
                    NodeList childNodes = element.getChildNodes();
                    for (int j = 0; j < childNodes.getLength(); j++) {
                        Node childNode = childNodes.item(j);
                        if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                            System.out.println("  Contenido de " + childNode.getNodeName() + ": " + childNode.getTextContent());
                        }
                    }
                }
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

            if (nl.getLength() == 0) {
                System.out.println("No se encontraron etiquetas con el nombre: " + s);
                return;
            }

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
