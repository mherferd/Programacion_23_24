package U1.ejercicios.src.main.java.U5.t1.ejercicio7;

import U1.ejercicios.src.main.java.U5.t1.ejercicio8.CajaCarton;

public class main {
    public static void main(String[] args) {
        Etiqueta etiqueta = new Etiqueta("Paco el flaco", "Avenida Bomboclat");
        Caja caja = new Caja(etiqueta,52.5,52.5,65.7);
        CajaCarton cajacarton = new CajaCarton(etiqueta,52.5,52.5, 65.7);

        System.out.println("VOLUMEN (Caja normal): "+caja.getVolumen());
        System.out.println("VOLUMEN (Caja carton): "+cajacarton.getVolumen());
        System.out.println("SUPERFICIE (Caja carton): "+cajacarton.getSuperficie());
        System.out.println(cajacarton);
    }
}
