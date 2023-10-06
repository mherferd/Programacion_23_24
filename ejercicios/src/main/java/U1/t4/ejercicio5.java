package U1.t4;

public class ejercicio5 {
    public static void main(String[] args) {


        long tMinTotal = System.currentTimeMillis() / (60 * 1000);
        int tMinCurrent = (int) (tMinTotal % (24 * 60));
        float hours = tMinCurrent / 60;
        float minutes = tMinCurrent % 60;
    }
}
