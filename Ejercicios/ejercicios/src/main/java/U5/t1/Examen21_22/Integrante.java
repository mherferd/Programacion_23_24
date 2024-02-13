package U1.ejercicios.src.main.java.U5.t1.Examen21_22;

public class Integrante {
    private int Numero_integrante;
    private String Nombre;
    private int Edad;
    private String Localidad;
    public Integrante(int numero_integrante, String nombre, int edad, String localidad) {
        Numero_integrante = numero_integrante;
        Nombre = nombre;
        Edad = edad;
        Localidad = localidad;
    }

    public int getNumero_integrante() {
        return Numero_integrante;
    }

    public void setNumero_integrante(int numero_integrante) {
        Numero_integrante = numero_integrante;
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

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String localidad) {
        Localidad = localidad;
    }

    @Override
    public String toString() {
        return "Integrante{" +
                "Numero_integrante=" + Numero_integrante +
                ", Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", Localidad='" + Localidad + '\'' +
                '}';
    }
}
