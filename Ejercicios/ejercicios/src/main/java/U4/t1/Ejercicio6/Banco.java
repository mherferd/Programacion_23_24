package U1.ejercicios.src.main.java.U4.t1.Ejercicio6;

public class Banco {
    private final String nombre;
    public double capital;
    public String direccion;

    public Banco (String nombre, String direccion){
        this.nombre=nombre;
        capital= 5.2;
        this.direccion= direccion;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", capital=" + capital +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
