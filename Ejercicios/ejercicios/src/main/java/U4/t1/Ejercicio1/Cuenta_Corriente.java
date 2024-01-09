package U1.ejercicios.src.main.java.U4.t1.Ejercicio1;

public class Cuenta_Corriente {
    private long saldo;
    private long limite_de_descubrimiento;
    private String Nombre;
    private String DNI;

    public Cuenta_Corriente (String Nombre, String DNI){
        this.saldo=0;
        this.limite_de_descubrimiento=-50;
        this.Nombre = Nombre;
        this.DNI = DNI;
    }


    public boolean sacar_dinero (long dinero){
        boolean resultado = false;

        if (saldo-dinero<limite_de_descubrimiento)
            {
                System.out.println("La operación no ha sido realizada");}
        else
            {
                System.out.println("La operación ha sido realizada");
                saldo =- dinero;
                resultado= true;}
        return resultado;
    }

    public void ingresar_dinero(long dinero){
        saldo=saldo+dinero;
    }

    @Override
    public String toString() {
        return "Cuenta_Corriente{" +
                "saldo=" + saldo +
                ", limite_de_descubrimiento=" + limite_de_descubrimiento +
                ", Nombre='" + Nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
