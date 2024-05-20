package U8.T5;

import java.util.ArrayList;

public class Futbolista {
    private int Dorsal;
    private String Nombre;
    private String Equipo;
    ArrayList<String> Posiciones = new ArrayList<>();

    public Futbolista(int dorsal, String nombre, String equipo) {
        Dorsal = dorsal;
        Nombre = nombre;
        Equipo = equipo;
    }


    public int getDorsal() {
        return Dorsal;
    }

    public void setDorsal(int dorsal) {
        Dorsal = dorsal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String equipo) {
        Equipo = equipo;
    }

    public ArrayList<String> getPosiciones() {
        return Posiciones;
    }

    public void setPosiciones(ArrayList<String> posiciones) {
        Posiciones = posiciones;
    }

    @Override
    public String toString() {
        return "Futbolista {" +
                "Dorsal=" + Dorsal +
                ", Nombre='" + Nombre + '\'' +
                ", Equipo='" + Equipo + '\'' +
                ", Posiciones=" + Posiciones +
                "}";
    }
}
