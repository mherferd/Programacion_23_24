package U1.ejercicios.src.main.java.U5.Entregable_23_24;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Juegos {
    protected int Anio;
    protected String Sede;
    protected Pais[] Lista_Paises = new Pais[0];
    protected Deporte[] Lista_Deportes = new Deporte[0];
    protected int indice_paises;
    protected int indice_deportes;


    public Juegos(int anio, String sede) {
        if (anio%4==0){
        Anio = anio;}
        else {
            Anio= Integer.parseInt("Fecha Inválida");
        }
        Sede = sede;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int anio) {
        Anio = anio;
    }

    public String getSede() {
        return Sede;
    }

    public void setSede(String sede) {
        Sede = sede;
    }

    public Pais[] getLista_Paises() {
        return Lista_Paises;
    }

    public void setLista_Paises(Pais[] lista_Paises) {
        Lista_Paises = lista_Paises;
    }

    public Deporte[] getLista_Deportes() {
        return Lista_Deportes;
    }

    public void setLista_Deportes(Deporte[] lista_Deportes) {
        Lista_Deportes = lista_Deportes;
    }
    public void insertar_pais(Pais pais) {
        if (Lista_Paises.length == indice_paises) {
            Lista_Paises = Arrays.copyOf(Lista_Paises, Lista_Paises.length + 1);
        }
        Lista_Paises[indice_paises] = pais;
        indice_paises++;
    }

    public void eliminar_pais(Pais pais) {
        int posicion = 0;
        for (int i = 0; i < indice_paises; i++) {
            if (Objects.equals(Lista_Paises[i].getNombre(), pais.getNombre())) {
                posicion = i;
            }
        }
        Pais[] copia_lista = Arrays.copyOfRange(Lista_Paises, posicion + 1, Lista_Paises.length);
        if (Lista_Paises.length == indice_paises) {
            Lista_Paises = Arrays.copyOf(Lista_Paises, Lista_Paises.length - 1);
        }
        for (int i = 0; i < copia_lista.length; i++) {
            Lista_Paises[posicion] = copia_lista[i];
            posicion++;
        }
        indice_paises--;

    }


    public void insertar_deportes(Deporte deporte) {
        if (Lista_Deportes.length == indice_deportes) {
            Lista_Deportes = Arrays.copyOf(Lista_Deportes, Lista_Deportes.length + 1);
        }
        Lista_Deportes[indice_deportes] = deporte;
        indice_deportes++;
    }

    public void eliminar_deportes(Deporte deporte) {
        int posicion = 0;
        for (int i = 0; i < indice_deportes; i++) {
            if (Objects.equals(Lista_Deportes[i].getNombre(), deporte.getNombre())) {
                posicion = i;
            }
        }
        Deporte[] copia_lista = Arrays.copyOfRange(Lista_Deportes, posicion + 1, Lista_Deportes.length);
        if (Lista_Deportes.length == indice_deportes) {
            Lista_Deportes = Arrays.copyOf(Lista_Deportes, Lista_Deportes.length - 1);
        }
        for (int i = 0; i < copia_lista.length; i++) {
            Lista_Deportes[posicion] = copia_lista[i];
            posicion++;
        }
        indice_deportes--;

    }

    public void mostrarPaises(){
        Arrays.sort(Lista_Paises, new Ordenacion_Pais());
    }

    public void mostrarPaisesParaCeremonia(){
        Arrays.sort(Lista_Paises, new Ordenacion_Pais_Nombre());
    }
    @Override
    public String toString() {
        return "Juegos{ \n" +
                "Anio=" + Anio +'\n'+
                "Sede='" + Sede + '\n' +
                "Lista_Paises=" + Arrays.toString(Lista_Paises)+'\n' +
                "Lista_Deportes=" + Arrays.toString(Lista_Deportes)+'\n';
    }
}
