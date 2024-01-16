package U1.ejercicios.src.main.java.U4.t1.Ejercicio9;

import U1.ejercicios.src.main.java.U4.t1.Ejercicio9.Maquinaria.Locomotora;
import U1.ejercicios.src.main.java.U4.t1.Ejercicio9.Maquinaria.Tren;
import U1.ejercicios.src.main.java.U4.t1.Ejercicio9.Maquinaria.Vagon;
import U1.ejercicios.src.main.java.U4.t1.Ejercicio9.Personal.Jefe_Estacion;
import U1.ejercicios.src.main.java.U4.t1.Ejercicio9.Personal.Maquinista;
import U1.ejercicios.src.main.java.U4.t1.Ejercicio9.Personal.Mecanico;


public class main {
    public static void main(String[] args) {

        Jefe_Estacion jefe = new Jefe_Estacion("Antonio", "942395F");
        Mecanico mecanico = new Mecanico("Jose", "54321C", 999999999, "Electricidad");
        Maquinista maquinista = new Maquinista("Raul", "2345934H", 2300, "Alto");
        Locomotora locomotora = new Locomotora("JLD3002", 1994, 1400, mecanico);
        Vagon vagon = new Vagon(2000,1000,"Comida");
        Tren tren = new Tren(locomotora,vagon,maquinista);
        System.out.println(tren);

    }
}
