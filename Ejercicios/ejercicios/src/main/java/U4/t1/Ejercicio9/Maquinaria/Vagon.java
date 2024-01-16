package U1.ejercicios.src.main.java.U4.t1.Ejercicio9.Maquinaria;

public class Vagon {

    protected int capacidad_max;
    protected int capacidad;
    protected String mercancia;

    public Vagon () {
    }

    public Vagon(int capacidad_max, int capacidad, String mercancia) {
        this.capacidad_max = capacidad_max;
        this.capacidad = capacidad;
        this.mercancia = mercancia;
    }

    @Override
    public String toString() {
        return "Vagon{" +
                "capacidad_max=" + capacidad_max +
                ", capacidad=" + capacidad +
                ", mercancia='" + mercancia + '\'' +
                '}';
    }
}
