package U1.ejercicios.src.main.java.U5.t1.ejercicio8;

import U1.ejercicios.src.main.java.U5.t1.ejercicio7.Caja;
import U1.ejercicios.src.main.java.U5.t1.ejercicio7.Etiqueta;

public class CajaCarton extends Caja {


    public CajaCarton(Etiqueta etiqueta, double largo, double ancho, double fondo) {
        super(etiqueta, largo, ancho, fondo);
    }
    @Override
    public double getVolumen(){
        return largo*ancho*fondo*0.8;
    }

    public double getSuperficie(){
        return largo*2+ancho*2+fondo*2;
    }

    }
