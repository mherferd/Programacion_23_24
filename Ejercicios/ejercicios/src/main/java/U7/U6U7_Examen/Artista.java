package U1.ejercicios.src.main.java.U7.U6U7_Examen;

import java.io.Serializable;

public class Artista implements Serializable {
    private static int contador=1;
    private String Nombre;
    private String Genero_Musical;
    private String Nacionalidad;
    private int ID;

    public Artista(String nombre, String genero_Musical, String nacionalidad) {
        Nombre = nombre;
        Genero_Musical = genero_Musical;
        Nacionalidad = nacionalidad;
        ID = contador++;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getGenero_Musical() {
        return Genero_Musical;
    }

    public void setGenero_Musical(String genero_Musical) {
        Genero_Musical = genero_Musical;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "\nArtista{" +
                "Nombre='" + Nombre + '\'' +
                ", Genero_Musical='" + Genero_Musical + '\'' +
                ", Nacionalidad='" + Nacionalidad + '\'' +
                ", ID=" + ID +
                '}';
    }
}
