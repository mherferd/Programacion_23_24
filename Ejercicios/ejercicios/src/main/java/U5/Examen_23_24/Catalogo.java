package U1.ejercicios.src.main.java.U5.Examen_23_24;


import java.util.Arrays;

public class Catalogo {

    //Creamos como atributo la Lista Multimedia y el índice que nos permite saber cuantos elementos Multimedia hay
    //introducidos en el array
    protected Multimedia[] Lista_Multimedia = new Multimedia[0];

    private int indice_multimedia=0;

    public Multimedia[] getLista_Multimedia() {
        return Lista_Multimedia;
    }

    public void setLista_Multimedia(Multimedia[] lista_Multimedia) {
        Lista_Multimedia = lista_Multimedia;
    }

    public int getIndice_multimedia() {
        return indice_multimedia;
    }

    public void setIndice_multimedia(int indice_multimedia) {
        this.indice_multimedia = indice_multimedia;
    }

    //Mediante este método añadimos elementos a la lista de multimedias
    public void add_multimedia(Multimedia elemento) {
        if (Lista_Multimedia.length == indice_multimedia) {
            Lista_Multimedia = Arrays.copyOf(Lista_Multimedia, Lista_Multimedia.length + 1);
        }
        Lista_Multimedia[indice_multimedia] = elemento;
        indice_multimedia++;
    }

    //Mediante este método eliminamos elementos a la lista de multimedias
    public void eliminar_multimedia(Multimedia elemento) {
        int posicion = 0;
        for (int i = 0; i < indice_multimedia; i++) {
            if (Lista_Multimedia[i].equals(elemento)) {
                posicion = i;
            }
        }
        Multimedia[] copia_lista = Arrays.copyOfRange(Lista_Multimedia, posicion + 1, Lista_Multimedia.length);
        if (Lista_Multimedia.length == indice_multimedia) {
            Lista_Multimedia = Arrays.copyOf(Lista_Multimedia, Lista_Multimedia.length - 1);
        }
        for (int i = 0; i < copia_lista.length; i++) {
            Lista_Multimedia[posicion] = copia_lista[i];
            posicion++;
        }
        indice_multimedia--;

    }

    //En los siguientes métodos llamamos a las clases de ordenación donde comparamos mediante un Comparator los
    //atributos de la clase Multimedia.
    public void ordenar_por_id(){
        Arrays.sort(Lista_Multimedia, new Ordenar_ID());
    }

    public void ordenar_por_titulo(){
        Arrays.sort(Lista_Multimedia, new Ordenar_Titulo());
    }
    public void ordenar_por_anyo(){
        Arrays.sort(Lista_Multimedia, new Ordenar_Anyo());
    }

    //Creamos el método que nos cuenta los elementos del array mediante el índice ya creado arriba
    public void numero_de_elementos(){
        System.out.println("Este catálogo tiene " +indice_multimedia + " elementos");
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "Lista_Multimedia=" + Arrays.toString(Lista_Multimedia) +
                '}';
    }


}
