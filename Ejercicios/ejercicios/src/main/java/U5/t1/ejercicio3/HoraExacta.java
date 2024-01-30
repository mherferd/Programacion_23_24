package U1.ejercicios.src.main.java.U5.t1.ejercicio3;

import U1.ejercicios.src.main.java.U5.t1.ejercicio1.Hora;

import java.util.Objects;

public class HoraExacta extends Hora {

    public int segundos;

    public HoraExacta(int hora, int minuto, int segundos) {
        super(hora, minuto);
        if (segundos<60){
        this.segundos=segundos;}
    }

    @Override
    public void inc() {
        if (segundos<59){
            segundos++;
        }
        else if (segundos==59){
            super.inc();
            segundos=0;
        }
    }

    @Override
    public String toString() {
        return super.toString() +" : " +segundos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoraExacta that = (HoraExacta) o;
        return segundos == that.segundos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(segundos);
    }
}
