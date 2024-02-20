package U1.ejercicios.src.main.java.U5.t1.Examen21_22_MANANA;

import java.time.LocalDateTime;
import java.util.Arrays;

public class LocalIndustrial extends Local implements mostrarPrecioVenta{

    private String Consumo_Elec;


    public LocalIndustrial(int ano_constr, String direccion, int metros2, Personas propietario, double precio, String consumo_Elec) {
        super(ano_constr, direccion, metros2, propietario, precio);
        Consumo_Elec = consumo_Elec;
    }

    public void mostrarPropiedad(){
        LocalDateTime localDate = LocalDateTime.now();
        int hours = localDate.getHour();
        int minutes = localDate.getMinute();
        int seconds = localDate.getSecond();
        System.out.println("HORA ACTUAL: " + hours +" : " +minutes +" : "+seconds);
        System.out.println("LOCAL INDUSTRIAL:");
        System.out.println(  "Consumo_Elec='" + Consumo_Elec + '\'' +
                ", Precio=" + Precio +
                ", Ano_constr=" + Ano_constr +
                ", direccion='" + direccion + '\'' +
                ", Metros2=" + Metros2 +
                '}');
    }

    @Override
    public String toString() {
        return "LocalIndustrial{" +
                "Consumo_Elec='" + Consumo_Elec + '\'' +
                ", Precio=" + Precio +
                ", Ano_constr=" + Ano_constr +
                ", direccion='" + direccion + '\'' +
                ", Metros2=" + Metros2 +
                '}';
    }

    @Override
    public void mostrarprecioventa() {
        System.out.println("Soy un LocalIndustrail con un consumo máxio de " +Consumo_Elec +" y valgo " +Precio);

    }
}
