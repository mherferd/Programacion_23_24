package U1.ejercicios.src.main.java.U4.t1.Ejercicio6;

public class Cuenta_Corriente {
    private long saldo;
    private long limite_de_descubrimiento;
    public String Nombre;
    protected String DNI;

    static String banco;

    public Cuenta_Corriente (long saldo, long limite_de_descubrimiento, String DNI){
        this.saldo=saldo;
        this.limite_de_descubrimiento=limite_de_descubrimiento;
        this.DNI = DNI;
    }

    public Cuenta_Corriente (long saldo){
        this.saldo=saldo;
        this.limite_de_descubrimiento=0;
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
                ", DNI='" + DNI + '\'' +
                '}';
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public long getLimite_de_descubrimiento() {
        return limite_de_descubrimiento;
    }

    public void setLimite_de_descubrimiento(long limite_de_descubrimiento) {
        this.limite_de_descubrimiento = limite_de_descubrimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
}