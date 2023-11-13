package U3.t2;

public class ejercicio9_2 {
    public static void main(String[] args) {

        int chicharrones=5000;

        StringBuffer string = new StringBuffer();
        string.append("Alabí Alixar");
        System.out.println(string);

        System.out.println("Capacidad inicial: "+string.capacity());
        System.out.println("Longitud inicial: "+string.length());

        string.delete(0,string.length());
        string.append("Chicharrones de Chiclana ");
        System.out.println(string);

        String string2 = "Hay "+chicharrones +" ";
        System.out.println(string2);

        string.insert(0, string2);
        System.out.println(string);

        System.out.println(string.substring(string.length()-4,string.length()));
        System.out.println("Capacidad final: "+string.capacity());
        System.out.println("Longitud final: "+string.length());
    }
}
