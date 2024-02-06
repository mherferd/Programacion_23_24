package U1.ejercicios.src.main.java.U5.t1.ejercicio9;

import java.util.Objects;

public class Lavadora extends Electrodomestico implements Comparable{
    private int Carga;

    private double Precio_final=getPrecio_base();

    public Lavadora() {

        Carga=5;
    }

    public Lavadora(double precio_base, double peso, CONSUMO consumo, COLOR color, int carga) {
        super(precio_base, peso, consumo, color);
        this.Carga = carga;
    }

    public Lavadora(double precio_base, double peso) {
        super(precio_base, peso);
    }

    public int getCarga() {
        return Carga;
    }

    public void getPrecioFinal(){
        if (Carga>30){
            Precio_final= Precio_final+50;
        }
        else {Precio_final=getPrecio_base();}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lavadora lavadora = (Lavadora) o;
        return Precio_final == lavadora.Precio_final;
    }

    @Override
    public double getPrecioFinal(double Precio_base, double Peso) {
        Precio_final=super.getPrecioFinal(Precio_base, Peso);

        return Precio_base;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Carga);
    }

    @Override
    public String toString() {
        return
                super.toString()+
                        "Lavadora{" +
                "Carga=" + Carga +
                ", Precio_final=" + Precio_final +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(this==o || o==null) return 0;
        Lavadora lavadora = (Lavadora) o;
        if(this.Precio_final> lavadora.Precio_final){
            return -1;
        }
        else if (this.Precio_final<lavadora.Precio_final){
            return 1;
        }
        return 0;
    }
}
