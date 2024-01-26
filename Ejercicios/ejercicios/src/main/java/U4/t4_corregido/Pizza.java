package U1.ejercicios.src.main.java.U4.t4_corregido;

import java.util.Arrays;

public class Pizza {
    private Tamanos tamano;
    private Ingrediente[] ingredientes;
    public enum Tamanos{
        MEDIANA,FAMILIAR
    };

    public Pizza(Tamanos tamano, Ingrediente[] ingredientes) {
    }

    public Pizza(Ingrediente[] ingredientes) {
        this.tamano = Tamanos.FAMILIAR;
    }

    public Pizza() {
        this.tamano = Tamanos.FAMILIAR;
        this.ingredientes= new Ingrediente[]{
                new Ingrediente()
        };
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "tamano=" + tamano +
                ", ingredientes=" + Arrays.toString(ingredientes) +
                '}';
    }
}
