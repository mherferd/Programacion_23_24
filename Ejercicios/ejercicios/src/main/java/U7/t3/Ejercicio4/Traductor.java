package U1.ejercicios.src.main.java.U7.t3.Ejercicio4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Traductor {
    protected static Map<String, String> diccionario = new HashMap<>();

    public Traductor(String archivo) {
        diccionario = new HashMap<>();

        String texto="";
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Archivos_PRO\\"+archivo));
            String linea = in.readLine();
            while (linea != null) {
                texto += linea +"\n";
                String[] partes = linea.split(",");
                diccionario.put(partes[0], partes[1]);
                linea= in.readLine();
            }
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(texto);


        System.out.println(diccionario);
    }

    public void  traducir (String cadena){
        System.out.println("La traduccion de la palabra "+cadena +" es " +diccionario.get(cadena));
    }


}
