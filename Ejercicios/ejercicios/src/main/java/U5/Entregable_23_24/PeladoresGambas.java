package U1.ejercicios.src.main.java.U5.Entregable_23_24;

public class PeladoresGambas extends Participante implements Pelar{

    protected int Peso;

    public PeladoresGambas(String nombre, int edad, int peso) {
        super(nombre, edad);
        Peso = peso;
    }
    @Override
    public void hacerjuramento() {
        System.out.println("Yo"+Nombre +", como pelador, juro los valores deportivos mundiales");
    }

    @Override
    public void pelar() {
        System.out.println("Voy a pelar mis gambas" );
    }



    public int getPeso() {
        return Peso;
    }

    public void setPeso(int peso) {
        Peso = peso;
    }


    @Override
    public String toString() {
        return  "Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", Peso=" + Peso +

                '}';
    }


}
