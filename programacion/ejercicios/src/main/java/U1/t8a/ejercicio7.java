package U1.U1.t8a;

public class ejercicio7 {
    public static void main(String[] args) {
        int contador = 0, contador2 = 1;
        int numero = 1;

        while (contador < 10) {
            if (numero % 2 == 1) {
                System.out.println(numero);
                contador++;
                contador2 = contador2 * numero;
            }
            numero = numero + 1;
        }

        System.out.println("El producto de todos estos numeros es: " + contador2);


    }

}

