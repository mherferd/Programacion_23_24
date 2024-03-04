package U1.ejercicios.src.main.java.U6.t1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4 {
    public static void main(String[] args) {

        String texto="";
        int Contador_lineas=0;
        int Contador_palabras=0;
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Ficheros_UD6\\t1\\Ej4\\carta.txt"));
            String linea = in.readLine();
            while (linea != null) {
                texto += linea +"\n";
                linea = in.readLine();
                Contador_lineas++;
                Contador_palabras++;
            }
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(texto);
        System.out.println("Carácteres: " +texto.length());
        for (int i=0; i<texto.length(); i++){
            if (texto.charAt(i) == ' '){
                Contador_palabras++;
            }
        }
        System.out.println("Palabras: "+Contador_palabras);
        System.out.println("Lineas: "+Contador_lineas);
    }
}
