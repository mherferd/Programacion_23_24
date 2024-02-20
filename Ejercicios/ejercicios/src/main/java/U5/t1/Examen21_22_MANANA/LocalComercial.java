package U1.ejercicios.src.main.java.U5.t1.Examen21_22_MANANA;

import java.time.LocalDateTime;

public class LocalComercial extends Local implements mostrarPrecioVenta{

    private String Descripcion;

    public LocalComercial(int ano_constr, String direccion, int metros2, Personas propietario, double precio, String descripcion) {
        super(ano_constr, direccion, metros2, propietario, precio);
        Descripcion = descripcion;
    }

    public void mostrarPropiedad(){
        LocalDateTime localDate = LocalDateTime.now();
        int hours = localDate.getHour();
        int minutes = localDate.getMinute();
        int seconds = localDate.getSecond();
        System.out.println("HORA ACTUAL: " + hours +" : " +minutes +" : "+seconds);
        System.out.println("LOCAL COMERCIAL:");
        System.out.println("Descripcion='" + Descripcion + '\'' +
                ", Precio=" + Precio +
                ", Ano_constr=" + Ano_constr +
                ", direccion='" + direccion + '\'' +
                ", Metros2=" + Metros2 +
                '}');
    }

    @Override
    public String toString() {
        return "LocalComercial{" +
                "Descripcion='" + Descripcion + '\'' +
                ", Precio=" + Precio +
                ", Ano_constr=" + Ano_constr +
                ", direccion='" + direccion + '\'' +
                ", Metros2=" + Metros2 +
                '}';
    }

    @Override
    public void mostrarprecioventa() {
        System.out.println("Soy un LocalComercial que me dedico a " +Descripcion +" y valgo " +Precio);
    }
}
