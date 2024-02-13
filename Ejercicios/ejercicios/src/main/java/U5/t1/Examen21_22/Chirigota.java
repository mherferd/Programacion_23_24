package U1.ejercicios.src.main.java.U5.t1.Examen21_22;

import java.util.Arrays;

public class Chirigota extends AgrupacionOficial implements Callejera{
        private String Nombre;
        private String Autor;
        private String Autor_música;
        private String  Autor_letras;
        private String  Tipo_disfraz;
        private int N_cuples;
        private int Puntos;

        public Chirigota(String Nombre, String Tipo_disfraz) {
                this.Nombre = Nombre;
                this.Tipo_disfraz = Tipo_disfraz;
        }
        @Override
        public void cantar_la_presentacion() {
                System.out.println("Cantando la presentación de la Chirigota con nombre " +Nombre);

        }

        @Override
        public void hacer_tipo() {
                System.out.println("La Chirigota " + Nombre + " va de " + Tipo_disfraz);

        }

        @Override
        public void insertar_integrante(Integrante Integrante) {
                if (Lista_Integrantes.length == indice) {
                        Lista_Integrantes = Arrays.copyOf(Lista_Integrantes, Lista_Integrantes.length + 1);
                }
                Lista_Integrantes[indice] = Integrante;
                indice++;
        }

        @Override
        public boolean eliminar_integrante(Integrante Integrante) {
                int posicion = 0;
                for (int i = 0; i < indice; i++) {
                        if (Lista_Integrantes[i].getNumero_integrante()==(Integrante.getNumero_integrante())) {
                                posicion = i;
                        }
                }
                Integrante[] copia_lista = Arrays.copyOfRange(Lista_Integrantes, posicion + 1, Lista_Integrantes.length);
                if (Lista_Integrantes.length == indice) {
                        Lista_Integrantes = Arrays.copyOf(Lista_Integrantes, Lista_Integrantes.length - 1);
                }
                for (int i = 0; i < copia_lista.length; i++) {
                        Lista_Integrantes[posicion] = copia_lista[i];
                        posicion++;
                }
                indice--;

                return true;
        }

        @Override
        public void caminito_del_falla() {
                System.out.println("La Chirigota " +Nombre + " va caminito del falla");

        }

        @Override
        public String toString() {
                return "Chirigota{ \n" +
                        "Nombre=" + Nombre + '\n' +
                        "Tipo_disfraz=" + Tipo_disfraz + '\n' +
                        "Lista_Integrantes=" + Arrays.toString(Lista_Integrantes) + '\n'+
                        '}';
        }

        @Override
        public void amo_a_escucha() {
                System.out.println("Amo a escucha la Chirigota " +Nombre );

        }
}



