package U1.ejercicios.src.main.java.U7.t5;

public class Aspirante {
    private String Nombre;
    private String DNI;
    private int Telefono;

    protected int ID;

    public Aspirante(String nombre, String DNI, int telefono) {
        Nombre = nombre;
        this.DNI = DNI;
        Telefono = telefono;
    }

    public Aspirante() {

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Aspirante{" +
                "Nombre='" + Nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", Telefono=" + Telefono +
                '}';
    }

    public static void InsertaAspirante (Aspirante aspirante){

    }
}
