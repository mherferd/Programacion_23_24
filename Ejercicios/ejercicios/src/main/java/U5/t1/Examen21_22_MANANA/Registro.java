package U1.ejercicios.src.main.java.U5.t1.Examen21_22_MANANA;

import U1.ejercicios.src.main.java.U5.Entregable_23_24.Deporte;

import java.util.Arrays;
import java.util.Objects;

public class Registro {

    private int indice_propiedades;
    private Propiedad[] Lista_Propiedades = new Propiedad[0];


    public void addpropiedad(Propiedad propiedad){
        if (Lista_Propiedades.length == indice_propiedades) {
            Lista_Propiedades = Arrays.copyOf(Lista_Propiedades, Lista_Propiedades.length + 1);
        }
        Lista_Propiedades[indice_propiedades] = propiedad;
        indice_propiedades++;
    }

    public void eliminarPropiedad(Propiedad propiedad) {
        int posicion = 0;
        for (int i = 0; i < indice_propiedades; i++) {
            if (Objects.equals(Lista_Propiedades[i].getDireccion(), propiedad.getDireccion())) {
                posicion = i;
            }
        }
        Propiedad[] copia_lista = Arrays.copyOfRange(Lista_Propiedades, posicion + 1, Lista_Propiedades.length);
        if (Lista_Propiedades.length == indice_propiedades) {
            Lista_Propiedades = Arrays.copyOf(Lista_Propiedades, Lista_Propiedades.length - 1);
        }
        for (int i = 0; i < copia_lista.length; i++) {
            Lista_Propiedades[posicion] = copia_lista[i];
            posicion++;
        }
        indice_propiedades--;

    }

    public void informeSuperficie(){
        Arrays.sort(Lista_Propiedades, new ORDENAR_SUPERFICIE());
    }

    public void informeAntiguedad(){
        Arrays.sort(Lista_Propiedades, new ORDENAR_ANTIGUEDAD());
    }
}

