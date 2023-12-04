package U1.U1.ejercicios.src.main.java.U3.Entregable_PRA;

public class ejercicio1{
    public static void main(String[] args) {
        Scanner teclado2 = new Scanner(System.in);
        System.out.print("Introduzca la posición del alfil, por ejemplo d5: ");
        String posicion = teclado2.nextLine();

        int columna = (int)(posicion.charAt(0)) - 96;
        int fila = (int)(posicion.charAt(1)) - 48;

        System.out.println("El alfil puede moverse a las siguientes posiciones:");

        for(int j = 8; j >= 1; j--) {
            for(int i = 1; i <= 8; i++) {
                if ((Math.abs(fila - j) == Math.abs(columna- i))
                        && (! ((fila == j) && (columna == i)))) {
                    System.out.print((char)(i + 96) + "" + j + " ");
                }
            }
        }
    }
}
