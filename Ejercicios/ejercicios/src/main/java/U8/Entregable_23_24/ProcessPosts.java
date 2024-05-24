package U8.Entregable_23_24;

import com.google.gson.Gson;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProcessPosts {
    private List<Post> XML_Mostrado = new ArrayList<>();
    private static Document document;

    public ProcessPosts() {

    }

        public void parseDOM(String filename) {
            try {
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                document = db.parse(new File("C:\\Users\\DAW_M\\Documents\\GitHub\\Programacion_23_24\\Ejercicios\\ejercicios\\src\\main\\java\\U8\\Entregable_23_24\\"+filename));

            } catch (ParserConfigurationException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (SAXException e) {
                throw new RuntimeException(e);
            }
        }


            public void addPost(Post post) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Node root = document.getDocumentElement();

            Element post_nuevo = document.createElement("post");

            Element title = document.createElement("title");
            title.setTextContent(post.getTitle());

            Element link = document.createElement("link");
            link.setTextContent(post.getLink());

            Element description = document.createElement("description");
            description.setTextContent(post.getDescription());

            Element pubDate = document.createElement("pubDate");
            pubDate.setTextContent(post.getPubDate());

            Element guid = document.createElement("guid");
            guid.setTextContent(post.getGuid());
            guid.setAttribute("isPermaLink","true");

            root.appendChild(post_nuevo);
            post_nuevo.appendChild(title);
            post_nuevo.appendChild(link);
            post_nuevo.appendChild(description);
            post_nuevo.appendChild(pubDate);
            post_nuevo.appendChild(guid);


            File nuevoPost =
                    new File("C:\\Users\\DAW_M\\Documents\\GitHub\\Programacion_23_24\\Ejercicios\\ejercicios\\src\\main\\java\\U8\\Entregable_23_24\\posts.xml");
            StreamResult destino = new StreamResult(nuevoPost);


            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);
            transformer.transform(origenDOM, destino);


        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }


    public List<Post> getPosts(){
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Element raiz = document.getDocumentElement();
            NodeList hijos = raiz.getChildNodes();

            for (int i = 0; i < hijos.getLength(); i++) {
                Node node = hijos.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) hijos.item(i);

                    String title = element.getElementsByTagName("title").item(0).getTextContent();
                    String link = element.getElementsByTagName("link").item(0).getTextContent();
                    String description = element.getElementsByTagName("description").item(0).getTextContent();
                    String pubDate = element.getElementsByTagName("pubDate").item(0).getTextContent();
                    String guid = element.getElementsByTagName("guid").item(0).getTextContent();

                    Post post = new Post(title,link,description,pubDate,guid);

                    XML_Mostrado.add(post);

                }
            }
            return XML_Mostrado;
        }
        catch(ParserConfigurationException e){
                throw new RuntimeException(e);
            }
        }




    public String convertToJSON(){

        Gson gson = new Gson();
        String posts_json = gson.toJson(XML_Mostrado);

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\DAW_M\\Documents\\GitHub\\Programacion_23_24\\Ejercicios\\ejercicios\\src\\main\\java\\U8\\Entregable_23_24\\posts.json"));
            out.write(posts_json);

            out.close();
        } catch (IOException ex) {
            System.out.println("No se puede crear el archivo JSON"+ex.getMessage());
        }

        return posts_json;
    }
}

