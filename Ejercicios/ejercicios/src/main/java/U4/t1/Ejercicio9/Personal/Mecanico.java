package U1.ejercicios.src.main.java.U4.t1.Ejercicio9.Personal;

public class Mecanico {
    private String nombre;
    private String DNI;
    private double tlfno;
    private String especialidad;

    public Mecanico() {
    }

    public Mecanico(String nombre, String DNI, double tlfno, String especialidad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.tlfno = tlfno;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", tlfno=" + tlfno +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
