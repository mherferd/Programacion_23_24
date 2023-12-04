import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n = teclado.nextInt();

        String resultado = convierteEnMorse(n);
        System.out.println(resultado);
    }

    public static String convierteEnMorse(int n) {

        String[] morse = { "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----." };

        StringBuilder resultado = new StringBuilder();
        String numero = String.valueOf(n);

        for (int i = 0; i < numero.length(); i++) {
            char digitChar = numero.charAt(i);
            if (Character.isDigit(digitChar)) {
                int digit = Character.getNumericValue(digitChar);
                resultado.append(morse[digit]).append(" ");
            } else {
                resultado.append(" ");
            }
        }

        return resultado.toString().trim();
    }
}
