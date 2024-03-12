package U1.ejercicios.src.main.java.U6.t4;

import U1.ejercicios.src.main.java.U6.t3.Ejercicio1.Menores;

import java.time.LocalDateTime;

public class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    static void StringNumero(String string)throws StringNumero{
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < 9; j++) {
                if (string.charAt(i) == j) {
                    throw new StringNumero("Ha introducido carácteres incorrectos");
                }
            }
        }
    }

    @Override
    public String toString() {
        return
              titulo + ": " + autor;
    }
}
