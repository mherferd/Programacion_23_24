package U1.ejercicios.src.main.java.U5.Entregable_23_24;

public abstract class Participante {
    protected String Nombre;
    protected int Edad;

    public Participante(String nombre, int edad) {
        Nombre = nombre;
        Edad = edad;
    }

    public abstract void hacerjuramento();

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }



    @Override
    public String toString() {
        return "Participante{" +
                "Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                '}';
    }
}
