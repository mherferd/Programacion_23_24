package U1.ejercicios.src.main.java.U5.t2.ejercicio3;

import U1.ejercicios.src.main.java.U5.t2.ejercicio1.PilaLista;

public class Triangulo extends PoligonoRegular implements Comparable{
    protected int Altura;

    public Triangulo(int lado, int altura) {
        super(lado,Color);
        Altura = altura;
    }

    public Triangulo(int lado) {
        super(lado);
    }

    @Override
    public double getArea() {
        return (double) (Lado * Altura) /2;
    }

    @Override
    public int compareTo(Object o) {
        if(this==o || o==null) return 0;
        Triangulo Lista_T = (Triangulo) o;
        if(this.Lado> Lista_T.Lado){
            return 1;
        }
        else if (this.Lado<Lista_T.Lado){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "Altura=" + Altura +
                ", Lado=" + Lado +
                '}';
    }
}
