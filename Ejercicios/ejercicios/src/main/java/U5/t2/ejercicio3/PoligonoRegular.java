package U1.ejercicios.src.main.java.U5.t2.ejercicio3;

public abstract class  PoligonoRegular implements Figura{
    @Override
    public double getArea() {

        return 0;
    }
    private int ContadorPoligonos=0;
    protected int Lado;
    private Color color;
    public enum Color{
        AZUL,
        ROJO,
        VERDE,
        AMARILLO
    }

    public PoligonoRegular(int lado) {
        Lado = lado;
        color= Color.AZUL;
    }

    @Override
    public String  toString() {
        return "PoligonoRegular{" +
                "ContadorPoligonos=" + ContadorPoligonos +
                ", Lado=" + Lado +
                ", color=" + color +
                '}';
    }

    public PoligonoRegular() {
        Lado=10;
    }
}
