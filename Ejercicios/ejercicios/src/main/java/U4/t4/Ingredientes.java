package U1.ejercicios.src.main.java.U4.t4;

import java.util.Arrays;

public class Ingredientes {
    private Integer[] Ingredientes;
    private String nombre;
    private int calorias;

    public Ingredientes() {
        nombre = "queso";
        calorias = 250;
    }

    public Ingredientes(String nombre, int calorias) {
        this.nombre = nombre;
        this.calorias = calorias;
        this.Ingredientes = new Integer[3];
    }

    @Override
    public String toString() {
        return "Ingredientes{" +
                "Ingredientes=" + Arrays.toString(Ingredientes) +
                ", nombre='" + nombre + '\'' +
                ", calorias=" + calorias +
                '}';
    }
}


