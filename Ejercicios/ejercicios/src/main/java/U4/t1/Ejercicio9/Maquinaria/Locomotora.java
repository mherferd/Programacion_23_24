package U1.ejercicios.src.main.java.U4.t1.Ejercicio9.Maquinaria;

import U1.ejercicios.src.main.java.U4.t1.Ejercicio9.Personal.Mecanico;

public class Locomotora {
    private String matricula;
    private int ano;
    private double potencia;
    private Mecanico mecanico = new Mecanico();

    public Locomotora() {
    }

    public Locomotora(String matricula, int ano, double potencia, Mecanico mecanico) {
        this.matricula = matricula;
        this.ano = ano;
        this.potencia = potencia;
        this.mecanico = mecanico;
    }

    @Override
    public String toString() {
        return "Locomotora{" +
                "matricula='" + matricula + '\'' +
                ", ano=" + ano +
                ", potencia=" + potencia +
                ", mecanico=" + mecanico +
                '}';
    }
}
