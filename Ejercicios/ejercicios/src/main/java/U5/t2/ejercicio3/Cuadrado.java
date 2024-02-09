package U1.ejercicios.src.main.java.U5.t2.ejercicio3;

public class Cuadrado extends PoligonoRegular{

    public Cuadrado() {
    }

    public double getArea() {
        return Lado*Lado;
    }



    @Override
    public String toString() {
        return "Cuadrado{" +
                "Lado=" + Lado +
                '}';
    }
}
