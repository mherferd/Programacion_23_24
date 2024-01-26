package U1.ejercicios.src.main.java.U4.Entregable_23_24;

import java.util.Arrays;
import java.util.Scanner;

public class Conciertos {
    private String nombre;
    private String fecha;
    static String organizador = "Universal Entertaiment";
    private Escenarios[] escenario;
    private int indice =0;

    public Conciertos() {
        escenario = new Escenarios[0];
    }

    public Conciertos(String nombre, Escenarios[] escenario) {
        this.nombre = nombre;
        this.escenario = escenario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public Escenarios[] getEscenario() {
        return escenario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setEscenario(Escenarios[] escenario) {
        this.escenario = escenario;
    }


    public void aniadir_escenario(Escenarios escenario1){
        escenario=Arrays.copyOf(escenario,escenario.length+1);
        escenario[indice]=escenario1;
        indice++;
    }

    public void mostrar_escenario(){
        System.out.println("Escenarios: " +Arrays.toString(escenario));
    }



    public void mostrar_informacion(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Fecha: " +fecha);
        System.out.println("Organizador: " +organizador);
        System.out.println("Escenarios: " +Arrays.toString(escenario));
    }


    @Override
    public String toString() {
        return "Conciertos{" +
                "Nombre='" + nombre + '\'' +
                ", Fecha='" + fecha + '\'' +
                ", Organizador='" + organizador + '\'' +
                ", Escenario=" + Arrays.toString(escenario) +
                '}';
    }
}
