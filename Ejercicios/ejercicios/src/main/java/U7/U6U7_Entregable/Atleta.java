package U7.U6U7_Entregable;

import java.io.Serializable;

public class Atleta implements Serializable {
    private static int contador=1;
    private int Dorsal;
    private String Nombre;
    private String Pais;
    private int Marca;
    private CATEGORIA Categoria;
    private boolean Finisher;

    protected enum CATEGORIA{
        Senior,
        Junior,
        Veterano
    }

    public Atleta(String nombre, String pais, CATEGORIA categoria) {
        Nombre = nombre;
        Pais = pais;
        Categoria = categoria;
        Dorsal = contador++;
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

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public int getMarca() {
        return Marca;
    }

    public void setMarca(int marca) {
        Marca = marca;
    }

    public CATEGORIA getCategoria() {
        return Categoria;
    }

    public void setCategoria(CATEGORIA categoria) {
        Categoria = categoria;
    }

    public boolean isFinisher() {
        return Finisher;
    }

    public void setFinisher(boolean finisher) {
        Finisher = finisher;
    }

    @Override
    public String toString() {
        return "Atleta " + Dorsal + " -->"+
                " Dorsal=" + Dorsal +
                " Nombre='" + Nombre +
                " Pais='" + Pais + '\'' +
                " Marca=" + Marca +
                " Categoria=" + Categoria +
                " Finisher=" + Finisher +
                '\n';
    }


}
