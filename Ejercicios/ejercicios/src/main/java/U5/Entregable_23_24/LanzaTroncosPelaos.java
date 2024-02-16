package U1.ejercicios.src.main.java.U5.Entregable_23_24;

import U1.ejercicios.src.main.java.U5.t1.Examen21_22.Integrante;

import java.util.Arrays;
import java.util.Objects;

public class LanzaTroncosPelaos extends Deporte{
    protected int N_Pruebas;
    protected Participante[] Lista_Participantes = new Participante[0];

    protected int indice=0;

    public LanzaTroncosPelaos(String nombre, String pabellon, int n_Pruebas) {
        super(nombre, pabellon);
        N_Pruebas = n_Pruebas;
    }

    public int getN_Pruebas() {
        return N_Pruebas;
    }

    public void setN_Pruebas(int n_Pruebas) {
        N_Pruebas = n_Pruebas;
    }

    public Participante[] getLista_Participantes() {
        return Lista_Participantes;
    }

    public void setLista_Participantes(Participante[] lista_Participantes) {
        Lista_Participantes = lista_Participantes;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }


    public void insertar_participante(Participante participante) {
        if (Lista_Participantes.length == indice) {
            Lista_Participantes = Arrays.copyOf(Lista_Participantes, Lista_Participantes.length + 1);
        }
        Lista_Participantes[indice] = participante;
        indice++;
    }

    public void eliminar_integrante(Participante participante ) {
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

    public void mostrarParticipantes(){
        Arrays.sort(Lista_Participantes, new Ordenacion_Participantes());
        System.out.println(Arrays.toString(Lista_Participantes));
    }


    @Override
    public String toString() {
        return "\nLanzaTroncosPelaos" +
                ", Nombre='" + Nombre + '\'' +
                ", Pabellon='" + Pabellon + '\'' +
                ", N_Pruebas=" + N_Pruebas +
                ", Lista_Participantes=" + Arrays.toString(Lista_Participantes) +

                '}';
    }
}
