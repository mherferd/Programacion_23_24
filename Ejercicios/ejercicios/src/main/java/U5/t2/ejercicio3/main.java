package U1.ejercicios.src.main.java.U5.t2.ejercicio3;

import U1.ejercicios.src.main.java.U4.Entregable_23_24.Main;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {

    Cuadrado cu1= new Cuadrado();
    Circulo ci1=new Circulo();


    Triangulo[] Lista_T = new  Triangulo[5];
    Triangulo t1= new Triangulo(4,6);
    Triangulo t2= new Triangulo(10,6);
    Triangulo t3= new Triangulo(8,8);
    Triangulo t4= new Triangulo(4,4);
    Triangulo t5= new Triangulo(3,5);

        Lista_T [0] = t1;
        Lista_T [1] = t2;
        Lista_T [2] = t3;
        Lista_T [3] = t4;
        Lista_T [4] = t5;

    Arrays.sort(Lista_T);
    System.out.println(Arrays.toString(Lista_T));

        System.out.println(cu1);
        System.out.println(ci1);
    }
}
