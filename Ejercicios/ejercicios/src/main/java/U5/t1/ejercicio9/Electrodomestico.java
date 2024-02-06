package U1.ejercicios.src.main.java.U5.t1.ejercicio9;

public class Electrodomestico {
    public double Precio_base;
    public double Peso;
    private CONSUMO consumo;
    private COLOR color;
    private double Precio_final = getPrecio_base();
    public enum COLOR{
        blanco,negro,rojo,azul,gris
    }
    public enum CONSUMO{
        A,B,C,D,E,F
    }

    public Electrodomestico() {
        Precio_base = 100;
        Peso = 5;
        consumo = CONSUMO.F;
        color = COLOR.blanco;
    }

    public Electrodomestico(double precio_base, double peso, CONSUMO consumo, COLOR color) {
        this.Precio_base = precio_base;
        this.Peso = peso;
        this.consumo = consumo;
        this.color = color;}

    public Electrodomestico(double precio_base, double peso) {
        this.Precio_base = precio_base;
        this.Peso = peso;
    }

    public double getPrecio_base() {
        return Precio_base;
    }

    public double getPeso() {
        return Peso;
    }

    public CONSUMO getConsumo() {
        return consumo;
    }

    public COLOR getColor() {
        return color;
    }

    public double getPrecioFinal(double Precio_base, double Peso ){
        switch (consumo){
            case A -> {
                Precio_final+=100;
                break;
            }
            case B -> {
                Precio_final+=80;
                break;
            }
            case C -> {
                Precio_final+=60;
                break;
            }
            case D -> {
                Precio_final+=50;
                break;
            }
            case E -> {
                Precio_final+=30;
                break;
            }
            case F -> {
                Precio_final+=10;
                break;
            }
        }
        if (Peso<=29){
            Precio_final=Precio_base+10;
        }
        if (Peso>=30 && Peso<=49 ){
           Precio_final=Precio_base+60;
        }
        if (Peso>=50 && Peso<=79){
            Precio_final=Precio_base+80;
        }
        if (Peso>=80){
            Precio_final=Precio_base+100;
        }

        return Precio_base;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "Precio_base=" + Precio_base +
                ", Peso=" + Peso +
                ", consumo=" + consumo +
                ", color=" + color +
                ", Precio final:" +Precio_final+
                '}';
    }
}

