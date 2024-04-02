package U1.ejercicios.src.main.java.U7.t3;

import java.util.*;

public class Ejercicio2 {
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


            System.out.println("Introduce -1 para finalizar o cualquier otro número para continuar:");
            contador = teclado.nextInt();
        }
        System.out.println(m);

        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Dame un DNI a comprobar:");
        String dni_comprobar = teclado2.nextLine();

        sumar(dni_comprobar);
        int suma2=sumar(dni_comprobar);


        Iterator<Integer> it = m.keySet().iterator();

        while (it.hasNext()) {
            int clave = it.next();
            if (clave == suma2) {
                System.out.println("La clave: " +clave +" pertenece a " +m.get(clave));
            }
        }

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
