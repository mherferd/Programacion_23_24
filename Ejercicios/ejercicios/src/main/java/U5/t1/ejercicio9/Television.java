package U1.ejercicios.src.main.java.U5.t1.ejercicio9;

public class Television extends  Electrodomestico{

    private int Resolucion;
    private boolean Sintonizador;
    private double Precio_final=getPrecio_base();

    public Television() {
        Resolucion = 20;
        Sintonizador = false;
    }

    public Television(double precio_base, double peso, CONSUMO consumo, COLOR color, int resolucion, boolean sintonizador) {
        super(precio_base, peso, consumo, color);
        this.Resolucion = resolucion;
        this.Sintonizador = sintonizador;
    }

    public Television(double precio_base, double peso) {
        super(precio_base, peso);
    }

    public int getResolucion() {
        return Resolucion;
    }

    public boolean isSintonizador() {
        return Sintonizador;
    }

    public double getPrecioFinal(){
        if (Resolucion>40 && Sintonizador ){
            Precio_final= (Precio_final*1.3)+50;
        }
        else if (Sintonizador) {
            Precio_final=Precio_final+50;
        } else if (Resolucion>40) {
            Precio_final=Precio_final*1.3;
        }
        return Precio_final;
    }

    @Override
    public String toString() {

        return
                super.toString()+
                "Television{" +
                "Resolucion=" + Resolucion +
                ", Sintonizador=" + Sintonizador +
                ", Precio_final=" + Precio_final +
                '}';
    }
}
