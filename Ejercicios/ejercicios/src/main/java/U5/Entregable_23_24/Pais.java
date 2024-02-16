package U1.ejercicios.src.main.java.U5.Entregable_23_24;

import U1.ejercicios.src.main.java.U5.t2.ejercicio2.Cliente;

public class Pais {
    protected String Nombre;
    protected int N_Participantes;


    public Pais(String nombre, int n_Participantes) {
        Nombre = nombre;
        N_Participantes = n_Participantes;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getN_Participantes() {
        return N_Participantes;
    }

    public void setN_Participantes(int n_Participantes) {
        N_Participantes = n_Participantes;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "Nombre='" + Nombre + '\'' +
                ", N_Participantes=" + N_Participantes +
                '}';
    }
}
