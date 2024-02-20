package U1.ejercicios.src.main.java.U5.t1.Examen21_22_MANANA;

public abstract class Local extends Propiedad{
    public Local(int ano_constr, String direccion, int metros2) {
        super(ano_constr, direccion, metros2);
    }
    private Personas Propietario;
    protected double Precio;

    public Local(int ano_constr, String direccion, int metros2, Personas propietario, double precio) {
        super(ano_constr, direccion, metros2);
        Propietario = propietario;
        Precio = precio;
    }
}
