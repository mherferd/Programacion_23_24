package U1.ejercicios.src.main.java.U5.t2.ejercicio2;

import U1.ejercicios.src.main.java.U5.t1.ejercicio9.Electrodomestico;
import U1.ejercicios.src.main.java.U5.t2.ejercicio1.PilaLista;

public class Cliente implements Comparable{
    public String DNI;
    public String Nombre;
    public double Saldo;
    public int Edad;

    public Cliente(String DNI, String nombre, double saldo, int edad) {
        this.DNI = DNI;
        Nombre = nombre;
        Saldo = saldo;
        Edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "DNI='" + DNI + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Saldo=" + Saldo +
                ", Edad=" + Edad +
                '}';
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getSaldo() {
        return Saldo;
    }

    public int getEdad() {
        return Edad;
    }

    @Override
    public int compareTo(Object o) {
        if(this==o || o==null) return 0;
        Cliente lista = (Cliente) o;
        return this.DNI.compareTo(lista.getDNI());
    }
}
