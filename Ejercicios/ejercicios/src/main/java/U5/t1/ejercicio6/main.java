package U1.ejercicios.src.main.java.U5.t1.ejercicio6;

import U1.ejercicios.src.main.java.U5.t1.ejercicio5.Instrumento;

public class main {

    public static void main(String[] args) {

        Campana campana = new Campana();
        Piano piano =new Piano();

        campana.add(Instrumento.NOTAS.DO);
        campana.add(Instrumento.NOTAS.RE);
        campana.add(Instrumento.NOTAS.MI);
        campana.add(Instrumento.NOTAS.FA);
        campana.interpretar();


        piano.add(Instrumento.NOTAS.DO);
        piano.add(Instrumento.NOTAS.RE);
        piano.add(Instrumento.NOTAS.MI);
        piano.add(Instrumento.NOTAS.FA);
        piano.interpretar();


    }


}
