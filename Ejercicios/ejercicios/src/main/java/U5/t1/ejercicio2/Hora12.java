package U1.ejercicios.src.main.java.U5.t1.ejercicio2;

import U1.ejercicios.src.main.java.U5.t1.ejercicio1.Hora;

public class Hora12 extends Hora {

    public Mediodia mediodia;
    public enum Mediodia{
        AM,PM
    }
    public Hora12(int hora, int minuto) {
        super(hora, minuto);
        if (hora < 12) {
            this.mediodia = mediodia.AM;
        } else if (hora > 12 && hora < 24) {
            this.setHora(hora - 12);
            this.mediodia = mediodia.PM;

        }
    }

    @Override
    public String toString() {
        return super.toString() +" " +mediodia;
    }
}
