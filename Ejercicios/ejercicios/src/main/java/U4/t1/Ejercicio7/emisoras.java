package U1.ejercicios.src.main.java.U4.t1.Ejercicio7;

public class emisoras {
    public double frecuencia;

    public emisoras (){
        frecuencia=80;
    }

    public void up (){
        frecuencia=frecuencia+0.5;
        if (frecuencia>108){
            frecuencia =80;
        }
    }

    public void down (){
        frecuencia=frecuencia-0.5;
        if (frecuencia<80){
            frecuencia =108;
        }
    }

    @Override
    public String toString() {
        return "emisoras{" +
                "frecuencia=" + frecuencia +
                '}';
    }
}
