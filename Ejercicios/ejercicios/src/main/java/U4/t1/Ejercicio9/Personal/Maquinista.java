package U1.ejercicios.src.main.java.U4.t1.Ejercicio9.Personal;

public class Maquinista {
    private String nombre;
    private String DNI;
    private double sueldo;
    private String rango;

    public Maquinista() {
    }

    public Maquinista(String nombre, String DNI, double sueldo, String rango) {
        this.nombre=nombre;
        this.DNI=DNI;
        this.sueldo=sueldo;
        this.rango=rango;
    }

    @Override
    public String toString() {
        return "Maquinista{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", sueldo=" + sueldo +
                ", rango='" + rango + '\'' +
                '}';
    }
}
