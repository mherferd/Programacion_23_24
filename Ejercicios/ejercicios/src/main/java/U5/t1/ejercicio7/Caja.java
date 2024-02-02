package U1.ejercicios.src.main.java.U5.t1.ejercicio7;

public class Caja {
    private Etiqueta etiqueta;
    protected final double largo;
    protected final double ancho;
    protected final double fondo;

    public Caja(Etiqueta etiqueta, double largo, double ancho, double fondo) {
        this.etiqueta = etiqueta;
        this.largo = largo;
        this.ancho = ancho;
        this.fondo = fondo;
    }

    public double getVolumen(){
         return largo*ancho*fondo;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "largo=" + largo +
                ", ancho=" + ancho +
                ", fondo=" + fondo +
                ", etiqueta=" + etiqueta +

                '}';
    }
}
