package U1.ejercicios.src.main.java.U7.Entregable_PRA_2;

import U1.ejercicios.src.main.java.U7.Entregable_PRA_1.Alumno;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Concurso {
    private String Nombre;
    private String Localidad;
    private ArrayList<Perro> ListaPerros= new ArrayList<>();
    private Map<String,ArrayList<Perro>> ListaConcursos = new HashMap<>();

    public Concurso(String nombre, String localidad) {
        Nombre = nombre;
        Localidad = localidad;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String localidad) {
        Localidad = localidad;
    }

    public ArrayList<Perro> getListaPerros() {
        return ListaPerros;
    }

    public void setListaPerros(ArrayList<Perro> listaPerros) {
        ListaPerros = listaPerros;
    }

    public Map<String, ArrayList<Perro>> getListaConcursos() {
        return ListaConcursos;
    }

    public void setListaConcursos(Map<String, ArrayList<Perro>> listaConcursos) {
        ListaConcursos = listaConcursos;
    }

    @Override
    public String toString() {
        return "Concurso{" +
                "Nombre='" + Nombre + '\'' +
                ", Localidad='" + Localidad + '\'' +
                ", ListaPerros=" + ListaPerros +
                ", ListaConcursos=" + ListaConcursos +
                '}';
    }


    //----------------------------------MÉTODOS-------------------------------------------

    public void addDog(String raza, Perro perro){
        ArrayList<Perro> lista = new ArrayList<>();
        if (perro.getRaza().equalsIgnoreCase(raza)){
            if (ListaConcursos.containsKey(raza)){
                lista=ListaConcursos.get(raza);
                lista.add(perro);
                ListaConcursos.put(raza,lista);
            }
            else{
                lista.add(perro);
                ListaConcursos.put(raza,lista);
            }
        }
        else {
            System.out.println("Ese perro no corresponde a esa raza");
        }
    }

    public void disqualifyDog(Perro perro){
        ArrayList<Perro> lista = new ArrayList<>();
        if (ListaConcursos.containsKey(perro.getRaza())){
            lista=ListaConcursos.get(perro.getRaza());
            lista.remove(perro);
            ListaConcursos.put(perro.getRaza(), lista);
        }
        else {System.out.println("Perro no inscrito");}

    }

    public void ownerDogs(int num_socio){
    }

    public void perrosporPeso(ArrayList<Perro> lista){

    }

    public void perrosporEdad(ArrayList<Perro> lista){

    }

    public void cargarPerros() {

    }

    public void guardarPerros() {

    }
}
