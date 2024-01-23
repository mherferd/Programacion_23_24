package U1.ejercicios.src.main.java.U4.t4;

public class Pedido {
    private Pizza Pizza;
    private Integer Fecha;

    public Pedido(Pizza pizza, Integer fecha) {
        Pizza = pizza;
        Fecha = fecha;
    }

    public Pedido() {
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "Pizza=" + Pizza +
                ", Fecha='" + Fecha + '\'' +
                '}';
    }
}
