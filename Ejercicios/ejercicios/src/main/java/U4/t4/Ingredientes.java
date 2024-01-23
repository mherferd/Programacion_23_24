package U1.ejercicios.src.main.java.U4.t4;

import java.util.Arrays;

public class Ingredientes {
    private String[] nombres;
    private int[] calorias;

    public Ingredientes() {
        nombres = new String[]{"queso"};
        calorias = new int[]{250};
    }

    public Ingredientes(String[] nombres, int[] calorias) {
        this.nombres = nombres;
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Ingredientes{" +
                "nombres=" + Arrays.toString(nombres) +
                ", calorias=" + Arrays.toString(calorias) +
                '}';
    }
}

