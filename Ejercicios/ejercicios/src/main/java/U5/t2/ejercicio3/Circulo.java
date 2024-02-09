package U1.ejercicios.src.main.java.U5.t2.ejercicio3;

public class Circulo implements Figura{

    private int Radio;
    @Override
    public double getArea() {

        return (Radio*Radio)*3.14;
    }

    public Circulo(int radio) {
        Radio = radio;
    }

    public Circulo() {
        Radio=10;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "Radio=" + Radio +
                '}';
    }
}
