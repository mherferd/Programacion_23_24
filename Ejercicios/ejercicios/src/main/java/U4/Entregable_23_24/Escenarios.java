package U1.ejercicios.src.main.java.U4.Entregable_23_24;

import java.util.Arrays;

public class Escenarios {
    private String nombre;
    private String ubicacion;
    private int capacidad;
    private Cantantes[] cantantes;
    private int indice =0;

    public Escenarios() {
        cantantes=new Cantantes[0];
    }

    public Escenarios(String nombre, String ubicacion, int capacidad, Cantantes[] cantantes) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.cantantes = cantantes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Cantantes[] getCantantes() {
        return cantantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setCantantes(Cantantes[] cantantes) {
        this.cantantes = cantantes;
    }



    public void aniadir_cantante(Cantantes cantantes1){
        cantantes=Arrays.copyOf(cantantes,cantantes.length+1);
        cantantes[indice]=cantantes1;
        indice++;
    }

    public void mostrar_cantantes(){
        System.out.println("Cantantes: " +Arrays.toString(cantantes));
    }



    public void mostrar_informacion(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Nombre Artístico: " +ubicacion);
        System.out.println("Capacidad: " +capacidad);
        System.out.println("Cantantes: " +Arrays.toString(cantantes));
    }

    @Override
    public String toString() {
        return "Escenarios{" +
                "Nombre='" + nombre + '\'' +
                ", Ubicacion='" + ubicacion + '\'' +
                ", Capacidad=" + capacidad +
                ", cantantes=" + Arrays.toString(cantantes) +
                '}';
    }
}
