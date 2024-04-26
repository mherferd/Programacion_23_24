package U1.ejercicios.src.main.java.U7.U6U7_Entregable;

import U1.ejercicios.src.main.java.U7.Entregable_PRA_1.Alumno;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maraton implements Serializable {
    Map<Integer,Atleta> Lista_Atletas = new HashMap<>();

    ArrayList<Atleta> Lista = new ArrayList<>();

    @Override
    public String toString() {
        return "Maraton: \n" +
                Lista_Atletas +
                '}';
    }

    public Map<Integer, Atleta> getLista_Atletas() {
        return Lista_Atletas;
    }

    public void setLista_Atletas(Map<Integer, Atleta> lista_Atletas) {
        Lista_Atletas = lista_Atletas;
    }

    public ArrayList<Atleta> getLista() {
        return Lista;
    }

    public void setLista(ArrayList<Atleta> lista) {
        Lista = lista;
    }

    public void CargarAtletas() {
        try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream("atletas.dat"))) {
            Lista = (ArrayList<Atleta>) oos.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        for (Atleta a : Lista) {
            Lista_Atletas.put(a.getDorsal(),a);
        }
        System.out.println("Atletas cargados");
    }

    public void GuardarAtletas() {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("atletas.dat"))) {
            oos.writeObject(Lista);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Atletas guardados");
    }

    public void InscribirAtleta(Atleta atleta) {
        Lista.add(atleta);
        Lista_Atletas.put(atleta.getDorsal(),atleta);
    }


    public void InscribirAtletaPorConsola() {
        Scanner tec = new Scanner(System.in);

        System.out.println("Nombre del atleta:");
        String nombre = tec.nextLine();

        System.out.println("Pais del atleta:");
        String pais = tec.nextLine();

        System.out.println("Categoria del atleta (Senior/Junior/Veterano):");
        String categoria = tec.nextLine();

        if (categoria.equalsIgnoreCase("Senior")){
            Atleta A1 = new Atleta(nombre,pais, Atleta.CATEGORIA.Senior);
            Lista_Atletas.put(A1.getDorsal(),A1);
            Lista.add(A1);
        }
        else if (categoria.equalsIgnoreCase("Junior")){
            Atleta A1 = new Atleta(nombre,pais, Atleta.CATEGORIA.Junior);
            Lista_Atletas.put(A1.getDorsal(),A1);
            Lista.add(A1);

        }
        else if (categoria.equalsIgnoreCase("Veterano")){
            Atleta A1 = new Atleta(nombre,pais, Atleta.CATEGORIA.Veterano);
            Lista_Atletas.put(A1.getDorsal(),A1);
            Lista.add(A1);
        }

        System.out.println(Lista_Atletas);
    }

    public void GuardarTiempo(int Dorsal, int marca) {
        if (Lista_Atletas.containsKey(Dorsal)){
            Atleta A1 = Lista_Atletas.get(Dorsal);
            A1.setMarca(marca);
            A1.setFinisher(true);
            Lista_Atletas.put(Dorsal,A1);
            System.out.println("Marca registrada");
        }
        else{
            System.out.println("Atleta no encontrado");
        }
    }

    public void BorrarAtleta(int Dorsal) {
        if (Lista_Atletas.containsKey(Dorsal)){
            Atleta A1 = Lista_Atletas.get(Dorsal);
            Lista_Atletas.remove(Dorsal,A1);
            Lista.remove(A1);
            System.out.println("Atleta " +Dorsal +" eliminado");
        }
        else {
            System.out.println("Atleta no encontrado");
        }

    }

    public void MostrarListaFinishers() {
    ArrayList<Atleta> Lista_finisher = new ArrayList<>();
    for (Atleta a : Lista){
        if (a.isFinisher()){
            Lista_finisher.add(a);
        }
    }
    Lista_finisher.sort(new OrdenarFinisher());
        System.out.println("ATLETAS QUE HAN ACABADO ORDENADOS POR TIEMPO");
        System.out.println(Lista_finisher);
    }

    public void MostrarListaCategoria(Atleta.CATEGORIA categoria) {
        ArrayList<Atleta> Lista_Categoria = new ArrayList<>();

        for (Atleta a : Lista) {
            if (categoria.equals(a.getCategoria())) {
            Lista_Categoria.add(a);
            }
            Lista_Categoria.sort(new OrdenarCategoria());

        }
        System.out.println("ATLETAS DE LA CATEGORIA " +categoria);
        System.out.println(Lista_Categoria);
    }

    public void ParticipantesPorPais(String Pais) {
        int ContadorPais = 0;
        for (Atleta a : Lista) {
            if (a.getPais().equalsIgnoreCase(Pais)){
                ContadorPais++;
            }
        }
        System.out.println("Hay " +ContadorPais +" atletas de " +Pais);
    }


}
