package U1.ejercicios.src.main.java.U4.t4;

public class Pizza {
    private Ingredientes ingredientes = new Ingredientes();
    private String Tamano;

    public Pizza() {
    }

    public Pizza(Ingredientes ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "ingredientes=" + ingredientes +
                '}';
    }
}
