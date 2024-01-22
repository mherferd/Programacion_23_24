package U1.ejercicios.src.main.java.U4.t1.Ejercicio9.Maquinaria;

import U1.ejercicios.src.main.java.U4.t1.Ejercicio9.Personal.Maquinista;
public class Tren {
    private Locomotora locomotora = new Locomotora();
    private  Vagon vagon = new Vagon();
    private Maquinista maquinista = new Maquinista();



    public Tren(Locomotora locomotora, Vagon vagon, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.vagon = vagon;
        this.maquinista = maquinista;
    }

    public Tren() {
    }

    @Override
    public String toString() {
        return "Tren{" +
                "locomotora=" + locomotora +
                ", vagon=" + vagon +
                ", maquinista=" + maquinista +
                '}';}
}


