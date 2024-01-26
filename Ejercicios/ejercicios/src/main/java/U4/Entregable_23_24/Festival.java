package U1.ejercicios.src.main.java.U4.Entregable_23_24;

import java.util.Arrays;

public class Festival {
    private Conciertos[] conciertos = new Conciertos[3];


    public Festival(Conciertos concierto1, Object o, Object object) {
    }

    public Festival(Conciertos[] conciertos) {
        this.conciertos=conciertos;
    }

    public Conciertos[] getConciertos() {
        return conciertos;
    }

    public void setConciertos(Conciertos[] conciertos) {
        this.conciertos = conciertos;
    }

    @Override
    public String toString() {
        return "Festival{" +
                "conciertos=" + Arrays.toString(conciertos) +
                '}';
    }
}
