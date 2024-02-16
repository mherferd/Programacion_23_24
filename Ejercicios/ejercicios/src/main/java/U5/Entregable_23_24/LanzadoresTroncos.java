package U1.ejercicios.src.main.java.U5.Entregable_23_24;

public class LanzadoresTroncos extends Participante implements Lanzar{

    protected Tipo_Prueba Tipo_Arbol;

    protected enum Tipo_Prueba{
        PINO, ROBLE, OLIVO
    }

    public LanzadoresTroncos(String nombre, int edad, Tipo_Prueba tipo_Arbol) {
        super(nombre, edad);
        Tipo_Arbol = tipo_Arbol;
    }
    @Override
    public void hacerjuramento() {
        System.out.println("Yo"+Nombre+", como lanzador, juro los valores deportivos mundiales");
    }
    @Override
    public void lanzar() {
        System.out.println("Voy a lanzar" );

    }


    public Tipo_Prueba getTipo_Arbol() {
        return Tipo_Arbol;
    }

    public void setTipo_Arbol(Tipo_Prueba tipo_Arbol) {
        Tipo_Arbol = tipo_Arbol;
    }

    @Override
    public String toString() {
        return   "Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", Tipo_Arbol=" + Tipo_Arbol +

                '}';
    }
}
