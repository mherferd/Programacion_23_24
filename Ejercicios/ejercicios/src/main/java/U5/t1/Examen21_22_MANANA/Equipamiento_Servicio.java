package U1.ejercicios.src.main.java.U5.t1.Examen21_22_MANANA;

public class Equipamiento_Servicio extends Propiedad{
    public Equipamiento_Servicio(int ano_constr, String direccion, int metros2) {
        super(ano_constr, direccion, metros2);
    }

    private enum Tipo{
        EDUCATIVO, SANITARIO, DEPORTIVO, OTROS
    }
}
