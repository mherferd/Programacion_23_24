package U1.ejercicios.src.main.java.U7.t5;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CalificacionPruebas {

    ArrayList<Integer> id = new ArrayList<>();
    HashMap<Integer, ArrayList<Integer>> lista = new HashMap<>();

    public void leeFichero() {

        try (ObjectInputStream Lee = new ObjectInputStream(new FileInputStream("C:\\Archivos_PRO\\id_aspirantes.dat"))) {
            id = (ArrayList<Integer>) Lee.readObject();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Scanner teclado = new Scanner(System.in);
        System.out.println(id.size());

        for (int i = 0; i <= id.size(); i++) {
            ArrayList<Integer> notas = new ArrayList<>();

            System.out.println("Introduce la nota del aspirante " + (i+1) + " del 1ºTRIMESTRE");
            int cal1 = teclado.nextInt();
            notas.add(cal1);

            System.out.println("Introduce la nota del aspirante " + (i+1) + " del 2ºTRIMESTRE");
            int cal2 = teclado.nextInt();
            notas.add(cal2);


            System.out.println("Introduce la nota del aspirante " + (i+1) + " del 3ºTRIMESTRE");
            int cal3 = teclado.nextInt();
            notas.add(cal3);


            lista.put(i, notas);
        }

        System.out.println(lista);
    }

        public void guardarFicheros () {
            try (ObjectOutputStream hola = new ObjectOutputStream(new FileOutputStream("C:\\Archivos_PRO\\calificaciones.dat"))) {
                hola.writeObject(lista);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

}
