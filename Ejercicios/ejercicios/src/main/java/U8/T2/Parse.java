package U8.T2;

import U8.T2.Persona;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Parse {
    private static Document doc;
    private static List<Persona> listaPersonas = new ArrayList<>();

    public static void creaFicheroDatosPersonas() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("FichPersona.dat"))) {
            Persona p1 = new Persona("Pedro", 53);
            Persona p2 = new Persona("Ana", 34);
            Persona p3 = new Persona("Luis", 25);
            Persona p4 = new Persona("Marta", 29);

            listaPersonas.add(p1);
            listaPersonas.add(p2);
            listaPersonas.add(p3);
            listaPersonas.add(p4);

            oos.writeObject(listaPersonas);

            System.out.println("Fichero creado correctamente");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void Leer() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("FichPersona.dat"))) {
            listaPersonas = (List<Persona>) ois.readObject();
            System.out.println("Personas leidas correctamente");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public static void crearDocumentoXML(String nomFile) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.newDocument();

            Element root = doc.createElement("Personas");
            doc.appendChild(root);

            for (Persona p : listaPersonas) {
                Element persona = doc.createElement("Persona");

                Element nombre = doc.createElement("Nombre");
                nombre.appendChild(doc.createTextNode(p.getNombre()));
                persona.appendChild(nombre);

                Element edad = doc.createElement("Edad");
                edad.appendChild(doc.createTextNode(String.valueOf(p.getEdad())));
                persona.appendChild(edad);

                root.appendChild(persona);
            }

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(nomFile));

            transformer.transform(source, result);

            System.out.println("Documento XML creado correctamente");

        } catch (ParserConfigurationException | TransformerException e) {
            throw new RuntimeException(e);
        }
    }

    public static void parse(String nomFile) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db;
            db = dbf.newDocumentBuilder();
            doc = db.parse(new File(nomFile));
            System.out.println("XML parseado correctamente");
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }
    }
}

