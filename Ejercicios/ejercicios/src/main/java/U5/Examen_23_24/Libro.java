package U1.ejercicios.src.main.java.U5.Examen_23_24;

public class Libro extends Multimedia{

    //Creamos los atributos de la clase Libro
    private String Autor;
    private String Identificador_ISBN;
    private String Editorial;
    private int N_paginas;

    //En el constructor aparecen Titulo y Anyo, que son atributos creados en Multimedia pero que debemos introducir
    //desde este constructor a la hora de crear un objeto de clase Libro
    public Libro(String titulo, String autor, int ano_publicacion, String identificador_ISBN, String editorial, int n_paginas) {
        super(Identificador_multimedia+1);
        Titulo = titulo;
        Autor = autor;
        Identificador_ISBN = identificador_ISBN;
        Anyo = ano_publicacion;
        Editorial = editorial;
        N_paginas = n_paginas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }


    public String getIdentificador_ISBN() {
        return Identificador_ISBN;
    }

    public void setIdentificador_ISBN(String identificador_ISBN) {
        Identificador_ISBN = identificador_ISBN;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public int getN_paginas() {
        return N_paginas;
    }

    public void setN_paginas(int n_paginas) {
        N_paginas = n_paginas;
    }

    @Override
    public String toString() {
        return "\n Libro{" +
                "Titulo='" + Titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", Ano_publicacion=" + Anyo +
                ", Identificador_ISBN='" + Identificador_ISBN + '\'' +
                ", Editorial='" + Editorial + '\'' +
                ", N_paginas=" + N_paginas +
                '}';
    }

    @Override
    public void dar_por_finalizado() {
        System.out.println(getTitulo() +" se ha marcado como finalizado");
    }
}
