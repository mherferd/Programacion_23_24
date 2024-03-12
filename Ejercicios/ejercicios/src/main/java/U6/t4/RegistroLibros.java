package U1.ejercicios.src.main.java.U6.t4;

import U1.ejercicios.src.main.java.U5.Examen_23_24.Multimedia;

import java.util.Arrays;

public class RegistroLibros {
    private Libro[] lista;
    private int contador_libros = 0;

    public RegistroLibros(int Maximo_libros) {
        lista = new Libro[Maximo_libros];
    }

    public void add_libro(Libro libro) {
        if (lista.length > contador_libros) {
            lista[contador_libros] = libro;
            contador_libros++;
        }

    }

    @Override
    public String toString() {
        return "RegistroLibros{" +
                "lista=" + Arrays.toString(lista) +
                '}';
    }
}
