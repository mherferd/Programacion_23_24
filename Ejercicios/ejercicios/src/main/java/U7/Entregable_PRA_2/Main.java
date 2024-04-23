package U1.ejercicios.src.main.java.U7.Entregable_PRA_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Propietario pro1 = new Propietario("Miguel","Hernandez", 111,"España");
        Propietario pro2 = new Propietario("Ruru","Esefese", 222,"Rusia");
        Propietario pro3 = new Propietario("Xiaodon","Ji", 333,"China");

        Perro p1 = new Perro("Caniche","RevientaMuelas",2,5,true,pro1);
        Perro p2 = new Perro("Caniche","Petabuelas",4,7,true,pro2);
        Perro p3 = new Perro("Pitbull","AlgodoncitoDeAzucarDulce",8,65,true,pro1);
        Perro p4 = new Perro("Pitbull","FresaDeChocolate",6,63,true,pro3);


        Concurso c1 = new Concurso("ConDog1","Sevilla");

        c1.addDog("Caniche",p1);
        c1.addDog("Pitbull",p2);
        System.out.println(c1);

        c1.disqualifyDog(p3);
        c1.disqualifyDog(p1);
        System.out.println(c1);

    }
}
