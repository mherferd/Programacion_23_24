package U1.ejercicios.src.main.java.U5.t2.ejercicio1;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        Pila [] p = new PilaLista[10];

        PilaLista pila1=new PilaLista(6);
        PilaLista pila0=new PilaLista(3);
        PilaLista pila2=new PilaLista(5);
        PilaLista pila3=new PilaLista(1);
        PilaLista pila4=new PilaLista(8);
        PilaLista pila5=new PilaLista(6);
        PilaLista pila6=new PilaLista(2);
        PilaLista pila7=new PilaLista(10);
        PilaLista pila8=new PilaLista(45);
        PilaLista pila9=new PilaLista(1);

        p[0]=pila0;
        p[1]=pila1;
        p[2]=pila2;
        p[3]=pila3;
        p[4]=pila4;
        p[5]=pila5;
        p[6]=pila6;
        p[7]=pila7;
        p[8]=pila8;
        p[9]=pila9;

        Arrays.sort(p);
        System.out.println(Arrays.toString(p));
    }
}
