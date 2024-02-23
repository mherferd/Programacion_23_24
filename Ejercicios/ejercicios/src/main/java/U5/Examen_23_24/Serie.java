package U1.ejercicios.src.main.java.U5.Examen_23_24;


import java.util.Arrays;
import java.util.Objects;

public class Serie extends Multimedia implements Reproducible{

    //Creamos los atributos de la clase Serie
    private String Creador;
    private int N_temporadas;
    protected String[] Lista_Capitulos = new String[0];
    private int indice_capitulos=0;

    //En el constructor aparecen Titulo y Anyo, que son atributos creados en Multimedia pero que debemos introducir
    //desde este constructor a la hora de crear un objeto de clase Serie
    public Serie(String titulo, String creador, int n_temporadas, int ano_estreno) {
        super(Identificador_multimedia+1);
        Titulo = titulo;
        Creador = creador;
        N_temporadas = n_temporadas;
        Anyo = ano_estreno;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getCreador() {
        return Creador;
    }

    public void setCreador(String creador) {
        Creador = creador;
    }

    public int getN_temporadas() {
        return N_temporadas;
    }

    public void setN_temporadas(int n_temporadas) {
        N_temporadas = n_temporadas;
    }


    public String[] getLista_Capitulos() {
        return Lista_Capitulos;
    }

    public void setLista_Capitulos(String[] lista_Capitulos) {
        Lista_Capitulos = lista_Capitulos;
    }

    public int getIndice_capitulos() {
        return indice_capitulos;
    }

    public void setIndice_capitulos(int indice_capitulos) {
        this.indice_capitulos = indice_capitulos;
    }



    //Mediante estos métodos añadimos y eliminamos capitulos creados en el main de tio String de la lista de capitulos.
    public void add_capitulo(String capitulo) {
        if (Lista_Capitulos.length == indice_capitulos) {
            Lista_Capitulos = Arrays.copyOf(Lista_Capitulos, Lista_Capitulos.length + 1);
        }
        Lista_Capitulos[indice_capitulos] = capitulo;
        indice_capitulos++;
    }

    public void eliminar_capitulo(String capitulo) {
        int posicion = 0;
        for (int i = 0; i < indice_capitulos; i++) {
            if (Lista_Capitulos[i].equalsIgnoreCase(capitulo)) {
                posicion = i;
            }
        }
        String[] copia_lista = Arrays.copyOfRange(Lista_Capitulos, posicion + 1, Lista_Capitulos.length);
        if (Lista_Capitulos.length == indice_capitulos) {
            Lista_Capitulos = Arrays.copyOf(Lista_Capitulos, Lista_Capitulos.length - 1);
        }
        for (int i = 0; i < copia_lista.length; i++) {
            Lista_Capitulos[posicion] = copia_lista[i];
            posicion++;
        }
        indice_capitulos--;

    }


    @Override
    public String toString() {
        return " \n Serie{" +
                "Titulo='" + Titulo + '\'' +
                ", Ano_estreno=" + Anyo +
                ", Creador='" + Creador + '\'' +
                ", N_temporadas=" + N_temporadas +
                ", Lista_Capitulos=" + Arrays.toString(Lista_Capitulos) +
                '}';
    }

    public String serie_aleatoria(){
        return Lista_Capitulos[(int) (Math.random() * (Lista_Capitulos.length))];
        }



    @Override
    public void play() {
        System.out.println("Reproduciendo serie "+getTitulo() +" capítulo " +serie_aleatoria());
    }

    @Override
    public void pause() {
        System.out.println("Pausando serie " +getTitulo()  +" capítulo " +serie_aleatoria());
    }

    @Override
    public void stop() {
        System.out.println("Parando serie " +getTitulo()+" capítulo " +serie_aleatoria());
    }

    @Override
    public void dar_por_finalizado() {
        System.out.println(getTitulo() +" se ha marcado como finalizado");
    }
}
