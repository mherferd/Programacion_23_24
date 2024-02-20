package U1.ejercicios.src.main.java.U5.t1.Examen21_22_MANANA;

import U1.ejercicios.src.main.java.U5.Entregable_23_24.Deporte;
import U1.ejercicios.src.main.java.U5.t1.ejercicio9.Lavadora;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;

public class Viviendas extends Propiedad implements mostrarPrecioVenta,Comparable<Viviendas> {
    public Viviendas(int ano_constr, String direccion, int metros2) {
        super(ano_constr, direccion, metros2);
    }

    protected int N_Banos;
    protected int N_Habitaciones;
    protected int Capacidad;
   protected double Precio;
    private int Personas_Viven;
    private Personas[] Lista_Personas  = new Personas[0];
    private int indice_personas=0;

    public Viviendas(int ano_constr, String direccion, int metros2, int n_Banos, int n_Habitaciones, int capacidad, double precio) {
        super(ano_constr, direccion, metros2);
        N_Banos = n_Banos;
        N_Habitaciones = n_Habitaciones;
        Capacidad = capacidad;
        Precio = precio;
    }

    public int getN_Banos() {
        return N_Banos;
    }

    public void setN_Banos(int n_Banos) {
        N_Banos = n_Banos;
    }

    public int getN_Habitaciones() {
        return N_Habitaciones;
    }

    public void setN_Habitaciones(int n_Habitaciones) {
        N_Habitaciones = n_Habitaciones;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public int getPersonas_Viven() {
        return Personas_Viven;
    }

    public void setPersonas_Viven(int personas_Viven) {
        Personas_Viven = personas_Viven;
    }

    public boolean Comparar_personas(Personas personas){
        int posicion=0;
        for(int i=0; i<Lista_Personas.length; i++){
            if (Lista_Personas[i].equals(personas)){
                posicion=i;
                return true;
            }
        }
        return false;
    }

    public void insertar_personas(Personas personas) {
        if (indice_personas>=Capacidad){
            System.out.println("La casa está llena");
        }
        else if (Comparar_personas(personas)){
            System.out.println("Esta persona ya está registrada");
        }
        else if (Lista_Personas.length == indice_personas) {
            Lista_Personas = Arrays.copyOf(Lista_Personas, Lista_Personas.length + 1);

        Lista_Personas[indice_personas] = personas;
        indice_personas++;}
    }
    public void eliminar_deportes(Deporte deporte) {
        int posicion = 0;
        for (int i = 0; i < indice_personas; i++) {
            if (Objects.equals(Lista_Personas[i].getNIF(), deporte.getNombre())) {
                posicion = i;
            }
        }
        Personas[] copia_lista = Arrays.copyOfRange(Lista_Personas, posicion + 1, Lista_Personas.length);
        if (Lista_Personas.length == indice_personas) {
            Lista_Personas = Arrays.copyOf(Lista_Personas, Lista_Personas.length - 1);
        }
        for (int i = 0; i < copia_lista.length; i++) {
            Lista_Personas[posicion] = copia_lista[i];
            posicion++;
        }
        indice_personas--;

    }


    public void mostrarPropiedad(){
        LocalDateTime localDate = LocalDateTime.now();
        int hours = localDate.getHour();
        int minutes = localDate.getMinute();
        int seconds = localDate.getSecond();
        System.out.println("HORA ACTUAL: " + hours +" : " +minutes +" : "+seconds);
        System.out.println("VIVIENDA:");
        System.out.println("N_Banos=" + N_Banos +
                ", N_Habitaciones=" + N_Habitaciones +
                ", Capacidad=" + Capacidad +
                ", Precio=" + Precio +
                ", Personas_Viven=" + indice_personas +
                ", Lista_Personas=" + Arrays.toString(Lista_Personas) +
                '}');

    }





    @Override
    public String toString() {
        return "Viviendas{" +
                "N_Banos=" + N_Banos +
                ", N_Habitaciones=" + N_Habitaciones +
                ", Capacidad=" + Capacidad +
                ", Precio=" + Precio +
                ", Personas_Viven=" + indice_personas +
                ", Lista_Personas=" + Arrays.toString(Lista_Personas) +
                ", indice_personas=" + indice_personas +
                '}';
    }

    @Override
    public void mostrarprecioventa() {
        System.out.println("Soy una Vivienda con capacidad máxima "+getCapacidad() +" y valgo "+getPrecio());
    }


    @Override
    public int compareTo(Viviendas viviendas) {
        if(this.N_Habitaciones>viviendas.N_Habitaciones){
            return 1;
        } else if (this.N_Habitaciones<viviendas.N_Habitaciones) {
            return -1;
        }
        return 0;
    }
}



