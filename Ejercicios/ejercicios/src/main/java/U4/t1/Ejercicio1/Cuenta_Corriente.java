package U1.ejercicios.src.main.java.U4.t1.Ejercicio1;

public class Cuenta_Corriente {
    private double saldo;
    private double limite_de_descubrimiento;
    private String Nombre;
    private String DNI;

    public void crear_cuenta(String Nombre, String DNI){
        saldo=0;
        limite_de_descubrimiento=-50;
    }

    public boolean sacar_dinero (){
        if (saldo<limite_de_descubrimiento)
            {return true;}
        else
            {return false;}
    }

    public void ingresar_dinero(double dinero){
        saldo=saldo+dinero;
    }

    public void mostrar_informacion(){
        System.out.println("NOMBRE: " +Nombre);
        System.out.println("DNI: " +DNI);
        System.out.println("SALDO:" +saldo);
        System.out.println("LÍMITE DE DESCUBRIMIMENTO: " +limite_de_descubrimiento);
    }
}
