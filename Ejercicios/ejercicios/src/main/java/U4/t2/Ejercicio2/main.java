package U1.ejercicios.src.main.java.U4.t2.Ejercicio2;

public class main {
    public static void main(String[] args) {
        Pila tabla = new Pila();
        tabla.apilar(1);
        tabla.apilar(2);
        tabla.apilar(3);
        tabla.apilar(4);
        tabla.apilar(5);
        tabla.apilar(6);
        System.out.println(tabla);
        tabla.desapilar();
        tabla.desapilar();
        System.out.println(tabla);
        System.out.println(tabla.cima());
    }
}
