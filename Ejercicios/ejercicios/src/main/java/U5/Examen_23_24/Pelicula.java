package U1.ejercicios.src.main.java.U5.Examen_23_24;

public class Pelicula extends Multimedia implements Reproducible{

    //Creamos los atributos de la clase Pelicula
    private String Director;
    private int Duracion;
    private String Productora;
    private String Pais;

    //En el constructor aparecen Titulo y Anyo, que son atributos creados en Multimedia pero que debemos introducir
    //desde este constructor a la hora de crear un objeto de clase Pelicula
    public Pelicula(String titulo, String director, int ano_estreno, int duracion, String productora, String pais) {
        super(Identificador_multimedia+1);
        Titulo = titulo;
        Director = director;
        Anyo = ano_estreno;
        Duracion = duracion;
        Productora = productora;
        Pais = pais;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int duracion) {
        Duracion = duracion;
    }

    public String getProductora() {
        return Productora;
    }

    public void setProductora(String productora) {
        Productora = productora;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }
    

    @Override
    public void play() {
        System.out.println("Reproduciendo película" +getTitulo());
    }

    @Override
    public void pause() {
        System.out.println("Pausando película "+getTitulo());
    }

    @Override
    public void stop() {
        System.out.println("Parando película "+getTitulo());
    }

    @Override
    public String toString() {
        return " \n Pelicula{" +
                "Titulo='" + Titulo + '\'' +
                ", Director='" + Director + '\'' +
                ", Ano_estreno=" + Anyo +
                ", Duracion=" + Duracion +
                ", Productora='" + Productora + '\'' +
                ", Pais='" + Pais + '\'' +
                '}' ;
    }

    @Override
    public void dar_por_finalizado() {
        System.out.println(getTitulo() +" se ha marcado como finalizado");
    }
}
