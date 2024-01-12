package U1.ejercicios.src.main.java.U4.t1.Ejercicio8;

public class Bombilla {
    private boolean Luz_Bombilla;
    private boolean Interruptor;


    public Bombilla (){
        Luz_Bombilla=false;
        Interruptor=false;
    }

    public void encender_Interruptor (){
        if (Interruptor){
            System.out.println("El interruptor ya está encendido");
        } else if (!Interruptor) {
            System.out.println("INTERRUPTOR ENCENDIDO");
        }
        Interruptor=true;
    }

    public void apagar_Interruptor (){
        if (!Interruptor){
            System.out.println("El interruptor ya está apagado");
        }
        Interruptor=false;
        System.out.println("INTERRUPTOR APAGADO");;
    }

    public void encender_bombilla (){
        if (Luz_Bombilla && Interruptor){
            System.out.println("La bombilla ya está encendida");
        } else if (Interruptor) {
            System.out.println("BOMBILLA ENCENDIDA");
            Luz_Bombilla=true;
        } else if (!Interruptor) {
            System.out.println("El interruptor está apagado");
            Luz_Bombilla=true;

        }
    }

    public void apagar_bombilla (){
        if (!Luz_Bombilla){
            System.out.println("La bombilla ya está apagada");
        } else if (!Interruptor) {
            System.out.println("El interruptor está apagado");
        } else if (Interruptor) {
            System.out.println("BOMBILLA APAGADA");
            Luz_Bombilla=false;

        }
    }


    public void mostrar_estado (){
        if (!Interruptor){
            System.out.println("INTERRUPTOR APAGADO");
            if (Luz_Bombilla){
                System.out.println("BOMBILLA ENCENDIDA");
            } else if (!Luz_Bombilla) {
                System.out.println("BOMBILLA APAGADA");

            }
        } else if (Interruptor) {
            if (Luz_Bombilla){
                System.out.println("INTERRUPTOR ENCENDIDO");
                System.out.println("BOMBILLA ENCENDIDA");
            } else if (!Luz_Bombilla) {
                System.out.println("INTERRUPTOR ENCENDIDO");
                System.out.println("BOMBILLA APAGADA");

            }

        }
    }



}
