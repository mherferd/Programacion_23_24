package U1.ejercicios.src.main.java.U4.t4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String[] ingredientesPizza = {"queso",};
        int[] caloriasPizza = {250, };

        Ingredientes ingredientes = new Ingredientes (ingredientesPizza,caloriasPizza);

        Pizza pizza = new Pizza(ingredientes, "Grande");

        System.out.println(pizza);
        int n =0;
        do{

        Scanner teclado = new Scanner(System.in);
        System.out.println("Qué desea hacer?: ");
        System.out.println("1 - Cuántos ingredientes tiene mi Pizza?: ");
        System.out.println("2 - Añadir un ingrediente: ");
        System.out.println("3 - Mostrar información: ");
        System.out.println("4 - Salir del prgrama: ");
        n = teclado.nextInt();

        switch (n){
            case 1:
                System.out.println(ingredientesPizza.length);
                break;
            case 2:
                pizza.SumarIngrediente(ingredientesPizza, caloriasPizza);
            break;
                case 3:
                System.out.println(pizza);
                break;

                }
        } while (n!=4);
    }
    }

