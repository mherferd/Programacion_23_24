package U1.ejercicios.src.main.java.U5.t1.Examen21_22;

public class Romancero extends Agrupacion implements Callejera{
        private String Nombre;
        private String Autor;
        private String Autor_música;
        private String  Autor_letras;
        private String  Tipo_disfraz;
        private String Tematica;


        public Romancero(String Nombre,String Tipo_disfraz) {
                this.Nombre=Nombre;
                this.Tipo_disfraz=Tipo_disfraz;
        }

        @Override
        public void cantar_la_presentacion() {
                System.out.println("Cantando la presentación del Romancero con nombre " +Nombre);
        }

        @Override
        public void hacer_tipo() {
                System.out.println("El Romancero " +Nombre +" va de " +Tipo_disfraz);
        }

        @Override
        public void amo_a_escucha() {
                System.out.println("Amo a escucha el Romancero " +Nombre );

        }

        @Override
        public String toString() {
                return "Romancero{ \n" +
                        "Nombre=" + Nombre + '\n' +
                        "Tipo_disfraz=" + Tipo_disfraz + '\n' +
                        '}';
        }
}




