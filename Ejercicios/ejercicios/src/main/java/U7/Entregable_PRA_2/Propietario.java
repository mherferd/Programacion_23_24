package U1.ejercicios.src.main.java.U7.Entregable_PRA_2;

public class Propietario {
    private String Nombre;
    private String Apellidos;
    private int NumSocio;
    private String Pais;

    public Propietario(String nombre, String apellidos, int numSocio, String pais) {
        Nombre = nombre;
        Apellidos = apellidos;
        NumSocio = numSocio;
        Pais = pais;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getNumSocio() {
        return NumSocio;
    }

    public void setNumSocio(int numSocio) {
        NumSocio = numSocio;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", NumSocio=" + NumSocio +
                ", Pais='" + Pais + '\'' +
                '}';
    }
}
