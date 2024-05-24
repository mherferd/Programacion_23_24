package U8.Entregable_23_24;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Post post = new Post("Buenas noches","necesito_aprobar.www","Miguel alumno necesita aprobar", "12/7/2020","ID_789");

        ProcessPosts processPosts = new ProcessPosts();

        String nombre_fichero = "posts.xml";


        //MÉTODO 1
        processPosts.parseDOM(nombre_fichero);

        //MÉTODO 2
        processPosts.addPost(post);

        //MÉTODO 3
        System.out.println();
        System.out.println("Arraylist del XML:");
        List XML_Final = processPosts.getPosts();

        for (int i =0; i<XML_Final.size(); i++){
            System.out.println(XML_Final.get(i));
        }

        //MÉTODO 4
        System.out.println();
        System.out.println("JSON:");
        System.out.println(processPosts.convertToJSON());


    }
}
