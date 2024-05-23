package U7.U6U7_Examen;


import java.util.Comparator;

public class OrdenarArtista implements Comparator<Artista> {
    @Override
    public int compare(Artista o1, Artista o2) {

        return o1.getNombre().compareTo(o2.getNombre());
    }
}
