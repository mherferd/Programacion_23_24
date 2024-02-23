package U1.ejercicios.src.main.java.U5.Examen_23_24;

import java.util.Arrays;
import java.util.List;

public abstract class Multimedia {

    //Creo los atributos Titulo y Año de creación en multimedia, ya que todas sus clases hijas comparten este atributo
    //Y los necesito en la clase Multimedia para más tarde poder usar el Comparator<Multimedia>
    protected String Titulo;
    protected int Anyo;

    protected static int Identificador_multimedia=0;

    public Multimedia(int identificadorMultimedia) {
        Identificador_multimedia=identificadorMultimedia;
    }

    public Multimedia(String titulo, int anyo) {
        Titulo = titulo;
        Anyo = anyo;
    }

    public abstract void dar_por_finalizado();

    public static int getIdentificador_multimedia() {
        return Identificador_multimedia;
    }

    public static void setIdentificador_multimedia(int identificador_multimedia) {
        Identificador_multimedia = identificador_multimedia;
    }


    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getAnyo() {
        return Anyo;
    }

    public void setAnyo(int anyo) {
        Anyo = anyo;
    }
}
