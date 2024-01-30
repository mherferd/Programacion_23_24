package U1.ejercicios.src.main.java.U5.t1.ejercicio1;

public class Hora {
    private int hora;
    private int minuto;

    public Hora(int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
    }

    public void inc(){
        if (minuto<59){
        minuto++;}
        else{
            minuto=0;
            hora++;
        }
        if ((minuto == 0) && (hora == 24)){
            hora=0;
        }
    }

    @Override
    public String toString() {
        return "Son las: " +
                 hora +
                " : " + minuto;
    }

    public void setHora(int hora) {
        if(hora<=23 && hora>=0){
        this.hora = hora;}
    }

    public void setMinuto(int minuto) {
        if (minuto<=59 && minuto>=0){
        this.minuto = minuto;}
    }
}
