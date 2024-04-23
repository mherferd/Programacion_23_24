package U1.ejercicios.src.main.java.U7.Entregable_PRA_2;

public class Perro {
    private String Raza;
    private String Nombre;
    private int Edad;
    private int Peso;
    private boolean Vacuna;
    private Propietario propietario;

    public Perro(String raza, String nombre, int edad, int peso, boolean vacuna, Propietario propietario) {
        Raza = raza;
        Nombre = nombre;
        Edad = edad;
        Peso = peso;
        Vacuna = vacuna;
        this.propietario = propietario;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

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

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int peso) {
        Peso = peso;
    }

    public boolean isVacuna() {
        return Vacuna;
    }

    public void setVacuna(boolean vacuna) {
        Vacuna = vacuna;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "Raza='" + Raza + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", Peso=" + Peso +
                ", Vacuna=" + Vacuna +
                ", propietario=" + propietario +
                '}';
    }
}
