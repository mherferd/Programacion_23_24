package U7.U6U7_Examen;

import java.io.Serializable;

public class Caseta implements Serializable {
    private static int contador=1;
    private String Nombre;
    private String Ubicacion;
    private int Tamano;
    private int ID;

    public Caseta(String nombre, String ubicacion, int tamano) {
        Nombre = nombre;
        Ubicacion = ubicacion;
        Tamano = tamano;
        ID = contador++;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Caseta.contador = contador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public int getTamano() {
        return Tamano;
    }

    public void setTamano(int tamano) {
        Tamano = tamano;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "\nCaseta{" +
                "Nombre='" + Nombre + '\'' +
                ", Ubicacion='" + Ubicacion + '\'' +
                ", Tamano=" + Tamano +
                ", ID=" + ID +
                '}';
    }
}
