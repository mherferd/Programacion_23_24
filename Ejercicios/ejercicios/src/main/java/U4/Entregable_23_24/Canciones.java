package U1.ejercicios.src.main.java.U4.Entregable_23_24;

public class Canciones {
    private String titulo;
    private int duracion;
    private Generos genero;
    private Cantantes autor;
    public enum Generos{
        TRAP, NEOPERREO, EMORAP
    }

    public Canciones() {
    }

    public Canciones(String titulo, int duracion, Generos genero, Cantantes autor) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public Generos getGenero() {
        return genero;
    }

    public Cantantes getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        titulo = titulo;
    }

    public void setDuracion(int duracion) {
        duracion = duracion;
    }

    public void setGenero(Generos genero) {
        genero = genero;
    }

    public void setAutor(Cantantes autor) {
        autor = autor;
    }

    public void mostrar_informacion(){
        System.out.println("Titulo: " +titulo);
        System.out.println("Duracion: " +duracion);
        System.out.println("Género: " +genero);
        System.out.println("Autor: " +autor);

    }

    @Override
    public String toString() {
        return "Canciones{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                ", genero=" + genero +
//                ", autor=" + autor +
                '}';
    }
}
