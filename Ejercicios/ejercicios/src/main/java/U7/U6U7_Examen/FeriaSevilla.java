package U1.ejercicios.src.main.java.U7.U6U7_Examen;

import U1.ejercicios.src.main.java.U7.U6U7_Entregable.Atleta;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FeriaSevilla {

    ArrayList<Artista> Lista_Artistas = new ArrayList<>();
    ArrayList<Caseta> Lista_Casetas = new ArrayList<>();
    HashMap<String,Caseta> Mapa_Caseta = new HashMap<>();
    HashMap<String,Artista> Mapa_Artista = new HashMap<>();

    //He creado 2 HashMap iguales, pero cambiando la llave, debido a que para pedir las diferentes listas de las casetas
    //o de los artistas, necesito que cada uno de ellos sea la llave del mapa, no he encontrado otra forma de poder hacer
    //la lista de casetas según el artista.
    HashMap<Caseta, ArrayList<Artista>> Mapa_Actuaciones_Caseta = new HashMap<>();
    HashMap<Artista, ArrayList<Caseta>> Mapa_Actuaciones_Artista = new HashMap<>();


    public HashMap<String, Caseta> getMapa_Caseta() {
        return Mapa_Caseta;
    }

    public void setMapa_Caseta(HashMap<String, Caseta> mapa_Caseta) {
        Mapa_Caseta = mapa_Caseta;
    }

    public HashMap<String, Artista> getMapa_Artista() {
        return Mapa_Artista;
    }

    public void setMapa_Artista(HashMap<String, Artista> mapa_Artista) {
        Mapa_Artista = mapa_Artista;
    }

    public HashMap<Caseta, ArrayList<Artista>> getMapa_Actuaciones_Caseta() {
        return Mapa_Actuaciones_Caseta;
    }

    public void setMapa_Actuaciones_Caseta(HashMap<Caseta, ArrayList<Artista>> mapa_Actuaciones_Caseta) {
        Mapa_Actuaciones_Caseta = mapa_Actuaciones_Caseta;
    }

    @Override
    public String toString() {
        return "FeriaSevilla{" +
                "\nMapa_Caseta=" + Mapa_Caseta +
                "\nMapa_Artista=" + Mapa_Artista +
                "\nMapa_Actuaciones=" + Mapa_Actuaciones_Caseta +
                '}';
    }

    public void addCasetaFeria(String nombre, Caseta c){
        if (!Mapa_Caseta.containsKey(nombre)){
            Mapa_Caseta.put(nombre,c);
            Lista_Casetas.add(c);
        }
        else {
            System.out.println("La caseta "+nombre +" ya está registrada en la feria");
        }
    }

    public void addArtistaFeria(String nombre, Artista a){
        if (!Mapa_Artista.containsKey(nombre)){
            Mapa_Artista.put(nombre,a);
            Lista_Artistas.add(a);
        }
        else {
            System.out.println("El artista "+nombre +" ya está registrado en la feria");
        }
    }

    public void addActuacion(Caseta c, Artista a){
        //Esta es la lista de los artistas que actuan en cada caseta
        ArrayList<Artista> Lista_A = new ArrayList<>();
        if (Mapa_Actuaciones_Caseta.containsKey(c)){
            Lista_A= Mapa_Actuaciones_Caseta.get(c);
            Lista_A.add(a);
            Mapa_Actuaciones_Caseta.put(c,Lista_A);

        }
        else {
            Lista_A.add(a);
            Mapa_Actuaciones_Caseta.put(c,Lista_A);
        }

        //Esta es la lista de las casetas en las que actua cada artista
        ArrayList<Caseta> Lista_C = new ArrayList<>();
        if (Mapa_Actuaciones_Artista.containsKey(a)){
            Lista_C= Mapa_Actuaciones_Artista.get(a);
            Lista_C.add(c);
            Mapa_Actuaciones_Artista.put(a,Lista_C);

        }
        else {
            Lista_C.add(c);
            Mapa_Actuaciones_Artista.put(a,Lista_C);
        }
    }

    public List<Artista> getArtistas(Caseta c){
        System.out.println("Los artistas que actúan en la caseta "+c.getNombre() +" son:");
        List<Artista> Lista = new ArrayList<>();

        if (Mapa_Actuaciones_Caseta.containsKey(c)){
            Lista = Mapa_Actuaciones_Caseta.get(c);
        }

        Lista.sort(new OrdenarArtista());
        System.out.println(Lista);
        return Lista;
    }

   public List<Caseta> getCasetas(Artista a){
       System.out.println("Las casetas en las que actúa el artista "+a.getNombre() +" son:");
       List<Caseta> Lista = new ArrayList<>();

       if (Mapa_Actuaciones_Artista.containsKey(a)){
           Lista = Mapa_Actuaciones_Artista.get(a);
       }

       Lista.sort(new OrdenarCaseta());
       System.out.println(Lista);
       return Lista;
   }


    public Caseta getCaseta(String nombre){
        Caseta Caseta_Solicitada = Mapa_Caseta.get(nombre);

        if (Mapa_Caseta.containsKey(nombre)){
        System.out.println("La caseta solicitada es:" +Caseta_Solicitada);}
        else {
            System.out.println("Esa caseta no existe");
        }

        return Caseta_Solicitada;
    }

    public void removeCaseta(String nombre){

       if (Mapa_Caseta.containsKey(nombre)){
           Mapa_Caseta.remove(nombre);
           Mapa_Actuaciones_Caseta.remove(Mapa_Caseta.get(nombre));

           for (int i = 0; i < Lista_Casetas.size(); i++) {
               if (Lista_Casetas.get(i).getNombre().equalsIgnoreCase(nombre)){
                   Lista_Casetas.remove(i);
               }
           }
           System.out.println("Caseta Eliminada");

       }
       else {
           System.out.println("Caseta no existente");
       }




    }
        public Artista getArtista(String nombreArtistico){
        Artista Artista_Solicitado = Mapa_Artista.get(nombreArtistico);

        if (Mapa_Artista.containsKey(nombreArtistico)){
            System.out.println("El artista solicitado es:" +Artista_Solicitado);}
        else {
            System.out.println("Ese artista no existe");
        }

        return Artista_Solicitado;
    }

    public void cargarDatos() {
        try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream("feriasevilla.dat"))) {
            Lista_Artistas = (ArrayList<Artista>) oos.readObject();
            Lista_Casetas = (ArrayList<Caseta>) oos.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        for (Artista a : Lista_Artistas) {
            Mapa_Artista.put(a.getNombre(),a);
        }
        for (Caseta c : Lista_Casetas) {
            Mapa_Caseta.put(c.getNombre(),c);
        }
        System.out.println("Datos cargados");


    }

    public void guardarDatos() {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("feriasevilla.dat"))) {
            oos.writeObject(Lista_Artistas);
            oos.writeObject(Lista_Casetas);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Datos guardados");
    }

}
