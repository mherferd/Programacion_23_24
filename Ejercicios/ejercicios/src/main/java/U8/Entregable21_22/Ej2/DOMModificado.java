package U8.Entregable21_22.Ej2;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
public class DOMModificado {
    public static void main(String[] args) {

        try {
            File inputFile = new File("C:\\Users\\User\\Downloads\\Programacion_23_24\\Ejercicios\\ejercicios\\src\\main\\java\\U8\\Entregable21_22\\Ej2\\Alumno.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("alumno");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element instituto = doc.createElement("instituto");
                    instituto.appendChild(doc.createTextNode("IES VELAZQUEZ"));
                    node.appendChild(instituto);
                }
            }

            Element nuevoAlumno = doc.createElement("alumno");
            nuevoAlumno.setAttribute("dni", "8888888X");

            Element nombre = doc.createElement("nombre");
            nombre.appendChild(doc.createTextNode("Luis"));
            nuevoAlumno.appendChild(nombre);

            Element apellido = doc.createElement("apellido");
            apellido.appendChild(doc.createTextNode("Ruiz"));
            nuevoAlumno.appendChild(apellido);

            Element direccion = doc.createElement("direccion");
            direccion.appendChild(doc.createTextNode("Allí"));
            nuevoAlumno.appendChild(direccion);

            Element instituto = doc.createElement("instituto");
            instituto.appendChild(doc.createTextNode("IES VELAZQUEZ"));
            nuevoAlumno.appendChild(instituto);

            Node root = doc.getDocumentElement();
            root.insertBefore(nuevoAlumno, root.getFirstChild());

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new FileOutputStream("C:\\Users\\User\\Downloads\\Programacion_23_24\\Ejercicios\\ejercicios\\src\\main\\java\\U8\\Entregable21_22\\Ej2\\Alumno.xml"));
            transformer.transform(source, result);

            System.out.println("El archivo ha sido modificado exitosamente.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
