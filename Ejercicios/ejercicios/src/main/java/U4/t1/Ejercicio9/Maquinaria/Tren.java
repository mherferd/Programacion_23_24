package U1.ejercicios.src.main.java.U4.t1.Ejercicio9.Maquinaria;

import U1.ejercicios.src.main.java.U4.t1.Ejercicio9.Personal.Maquinista;

public class Tren {
    Locomotora locomotora = new Locomotora();
    Vagon vagon = new Vagon();
    Maquinista maquinista = new Maquinista();

    public Tren() {
    }

    public Tren(Locomotora locomotora, Vagon vagon, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.vagon = vagon;
        this.maquinista = maquinista;
    }
}
