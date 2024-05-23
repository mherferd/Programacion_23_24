package U8.T3;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

    public class ArbolDOMPersonas {
        private Document documento;
        private String nombreFichero;

        public ArbolDOMPersonas(String nombreFichero) throws Exception {
            this.nombreFichero = nombreFichero;
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            this.documento = builder.parse(new File(nombreFichero));
        }

        public void parse() {
            try {
                Transformer transformer = TransformerFactory.newInstance().newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                DOMSource source = new DOMSource(documento);
                StreamResult console = new StreamResult(System.out);
                transformer.transform(source, console);
            } catch (TransformerException e) {
                e.printStackTrace();
            }
        }

        public void incrementarEdad(Persona persona) {
            NodeList personas = documento.getElementsByTagName("persona");
            for (int i = 0; i < personas.getLength(); i++) {
                Node personaNode = personas.item(i);
                if (personaNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element personaElement = (Element) personaNode;
                    String nombre = personaElement.getElementsByTagName("nombre").item(0).getTextContent();
                    if (nombre.equals(persona.getNombre())) {
                        Element edadElement = (Element) personaElement.getElementsByTagName("edad").item(0);
                        int edad = Integer.parseInt(edadElement.getTextContent());
                        edadElement.setTextContent(String.valueOf(edad + 1));
                        break;
                    }
                }
            }
        }

        public void guardarCambios() throws Exception {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(documento);
            StreamResult result = new StreamResult(new File(nombreFichero));
            transformer.transform(source, result);
        }

        public static void main(String[] args) {
            try {
                ArbolDOMPersonas arbol = new ArbolDOMPersonas("personas.xml");

                // Mostrar el contenido del archivo XML
                arbol.parse();

                // Crear un objeto Persona y incrementar su edad en el árbol DOM
                Persona persona = new Persona("Juan");
                arbol.incrementarEdad(persona);

                // Parsear de nuevo para verificar los cambios
                arbol.parse();

                // Guardar los cambios en el archivo XML
                arbol.guardarCambios();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


