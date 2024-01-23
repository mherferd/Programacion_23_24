package U1.ejercicios.src.main.java.U4.t4_corregido;

public class Ingrediente {
    private String nombre;
    private int calorias;

    public Ingrediente() {
        nombre="queso";
        calorias=250;
    }

    public Ingrediente(String nombre, int calorias) {
        this.nombre = nombre;
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "nombre='" + nombre + '\'' +
                ", calorias=" + calorias +
                '}';
    }
}
