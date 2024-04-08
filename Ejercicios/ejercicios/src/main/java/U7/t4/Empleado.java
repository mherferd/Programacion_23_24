package U1.ejercicios.src.main.java.U7.t4;

import java.io.Serializable;
public class Empleado extends Persona implements Serializable{

    private int Sueldo;

    public Empleado(String nombre, String DNI, int edad, double estatura, int sueldo) {
        super(nombre, DNI, edad, estatura);
        Sueldo=sueldo;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int sueldo) {
        Sueldo = sueldo;
    }

    @Override
    public String toString() {
        return
        super.toString()+
                "Sueldo=" + Sueldo ;
    }
}
