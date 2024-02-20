package U1.ejercicios.src.main.java.U5.t1.Examen21_22_MANANA;

public class Personas {
    private String NIF;
    private String Nombre_Apellidos;
    protected static int Identificador;
    protected int contador_identificador=1;

    public Personas(String NIF, String nombre_Apellidos) {
        this.NIF = NIF;
        Nombre_Apellidos = nombre_Apellidos;
        this.Identificador = contador_identificador;
        contador_identificador++;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getNombre_Apellidos() {
        return Nombre_Apellidos;
    }

    public void setNombre_Apellidos(String nombre_Apellidos) {
        Nombre_Apellidos = nombre_Apellidos;
    }

    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int identificador) {
        Identificador = identificador;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "NIF='" + NIF + '\'' +
                ", Nombre_Apellidos='" + Nombre_Apellidos + '\'' +
                ", Identificador=" + Identificador +
                ", Personas Viviendo=" + contador_identificador +
                '}';
    }
}
