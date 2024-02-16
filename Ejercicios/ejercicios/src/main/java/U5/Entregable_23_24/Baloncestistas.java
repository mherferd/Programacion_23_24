package U1.ejercicios.src.main.java.U5.Entregable_23_24;

import java.util.Arrays;

public class Baloncestistas extends Participante implements Encestar{

    protected double Altura;

    public Baloncestistas(String nombre, int edad, double altura) {
        super(nombre, edad);
        Altura = altura;
    }
    @Override
    public void hacerjuramento() {
        System.out.println("Yo" +Nombre +", como jugador de baloncesto, juro los valores deportivos mundiales");
    }

    @Override
    public void encestar() {
        System.out.println("2 puntos!!!!!");
    }




    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    @Override
    public String toString() {
        return "Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", Altura=" + Altura +

                '}';
    }


}
