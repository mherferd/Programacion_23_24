package U1.ejercicios.src.main.java.U5.Entregable_23_24;

import U1.ejercicios.src.main.java.U5.t1.Examen21_22.Integrante;

import java.util.Arrays;
import java.util.Objects;

public class PeladoDeGambas extends Deporte{
    protected int N_Puestos;
    protected Participante[] Lista_Participantes = new Participante[0];

    protected int indice=0;

    public PeladoDeGambas(String nombre, String pabellon, int n_Puestos) {
        super(nombre, pabellon);
        N_Puestos = n_Puestos;
    }

    public int getN_Puestos() {
        return N_Puestos;
    }

    public void setN_Puestos(int n_Puestos) {
        N_Puestos = n_Puestos;
    }

    public void insertar_participante(Participante participante) {
        if (Lista_Participantes.length == indice) {
            Lista_Participantes = Arrays.copyOf(Lista_Participantes, Lista_Participantes.length + 1);
        }
        Lista_Participantes[indice] = participante;
        indice++;
    }

    public void eliminar_integrante(Participante participante) {
        int posicion = 0;
        for (int i = 0; i < indice; i++) {
            if (Objects.equals(Lista_Participantes[i].getNombre(), participante.getNombre())) {
                posicion = i;
            }
        }
        Participante[] copia_lista = Arrays.copyOfRange(Lista_Participantes, posicion + 1, Lista_Participantes.length);
        if (Lista_Participantes.length == indice) {
            Lista_Participantes = Arrays.copyOf(Lista_Participantes, Lista_Participantes.length - 1);
        }
        for (int i = 0; i < copia_lista.length; i++) {
            Lista_Participantes[posicion] = copia_lista[i];
            posicion++;
        }
        indice--;

    }


    @Override
    public String toString() {
        return "\nPeladoDeGambas" +
                ", Nombre='" + Nombre + '\'' +
                ", Pabellon='" + Pabellon + '\'' +
                ", N_Puestos=" + N_Puestos +
                ", Lista_Participantes=" + Arrays.toString(Lista_Participantes) +

                '}';
    }

    public void mostrarParticipantes(){
        Arrays.sort(Lista_Participantes, new Ordenacion_Participantes());
        System.out.println(Arrays.toString(Lista_Participantes));
    }
}
