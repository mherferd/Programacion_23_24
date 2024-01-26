package U1.ejercicios.src.main.java.U4.Entregable_23_24;

import java.util.Arrays;

public class Cantantes {
    private String nombre;
    private String nombre_Art;
    private int edad;
    private String ciudad;
    private Canciones[] canciones;
    private int indice=0;

    public Cantantes() {
        canciones=new Canciones[0];
    }

    public Cantantes(String nombre, String nombre_Art, int edad, String ciudad, Canciones[] canciones) {
        this.nombre = nombre;
        this.nombre_Art = nombre_Art;
        this.edad = edad;
        this.ciudad = ciudad;
        this.canciones = canciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombre_Art() {
        return nombre_Art;
    }

    public int getEdad() {
        return edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Canciones[] getCanciones() {
        return canciones;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public void setNombre_Art(String nombre_Art) {
        this.nombre_Art = nombre_Art;
    }

    public void setEdad(int edad) {
        edad = edad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setCanciones(Canciones[] canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Cantantes{" +
                "nombre='" + nombre + '\'' +
                ", nombre_Art='" + nombre_Art + '\'' +
                ", edad=" + edad +
                ", ciudad='" + ciudad + '\'' +
                ", canciones=" + Arrays.toString(canciones) +
                '}';
    }

    public void mostrar_canciones(){
        System.out.println(Arrays.toString(canciones));
    }


    public void aniadir_cancion(Canciones canciones1, Canciones cancion2){
        canciones=Arrays.copyOf(canciones,canciones.length+1);
        canciones[indice]=canciones1;
        indice++;
    }

    public void eliminar_cancion(){
        canciones=Arrays.copyOf(canciones,canciones.length-1);
        System.out.println(Arrays.toString(canciones));
    }

    public void mostrar_informacion(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Nombre Artístico: " +nombre_Art);
        System.out.println("Edad: " +edad);
        System.out.println("Ciudad: " +ciudad);
        System.out.println("Canciones: "+canciones);
    }


}
