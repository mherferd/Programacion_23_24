package U1.ejercicios.src.main.java.U7.t5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class Aprobados {


    HashMap<Integer, ArrayList<Integer>> calificaciones = new HashMap<>();


    public void LeeFichero() {

        try (ObjectInputStream Lee = new ObjectInputStream(new FileInputStream("C:\\Archivos_PRO\\calificaciones.dat"))) {
            calificaciones = (HashMap<Integer, ArrayList<Integer>>) Lee.readObject();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(calificaciones);
        calcularMedia();
    }

    public int calcularMedia() {
        int media = 0;
        for (int i = 0; i < calificaciones.size(); i++) {
            for (int o=0; o<calificaciones.get(i).size(); o++){
                media=media+calificaciones.get(i).get(o);
            }
            System.out.println("Media final del aspirante "+(i+1)+media);
            media=0;

        }
        return media;
    }
}
