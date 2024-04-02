package U1.ejercicios.src.main.java.U7.t3;

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {


        int contador=0;
        Map<Integer, String> m = new HashMap<>();

        while (contador!= (-1)) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Dame tu DNI:");
            String dni = teclado.nextLine();

            System.out.println("Dame tu Nombre:");
            String nombre = teclado.nextLine();


            sumar(dni);
            int suma= sumar(dni);
            m.put(suma, nombre);

            System.out.println("La clave " +suma +" está asociada al nombre '" +nombre + "'");


            System.out.println("Introduce -1 para finalizar o cualquier otro número para continuar:");
            contador = teclado.nextInt();
        }
        System.out.println(m);


    }

    public static Integer sumar (String dni){
        List<Integer> numeros = new ArrayList<>();
        int suma=0;
        for (int i=0; i<8; i++){
            numeros.add((int) dni.charAt(i)-48);
        }

        for (int i=0; i<8 ;i++) {
            suma = suma + numeros.get(i);
        }
        return suma;
    }
}
