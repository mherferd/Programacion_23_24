package U1.ejercicios.src.main.java.U4.t4;

import java.util.Arrays;
import java.util.Scanner;

public class Pizza {
    private Ingredientes ingredientes;
    private String tamano;

    public Pizza() {
        ingredientes = new Ingredientes();
    }

    public Pizza(Ingredientes ingredientes, String tamano) {
        this.ingredientes = ingredientes;
        this.tamano = tamano;
    }

    public boolean SumarIngrediente (String[] ingredientesPizza, int[] caloriasPizza){
        if (ingredientesPizza.length<=3){

            int contador = ingredientesPizza.length;

            ingredientesPizza= Arrays.copyOf(ingredientesPizza,ingredientesPizza.length+1);
            caloriasPizza= Arrays.copyOf(caloriasPizza,caloriasPizza.length+1);

            Scanner teclado = new Scanner(System.in);

            System.out.println("Introduzca un nuevo ingrediente:");
            String nuevoingrediente = teclado.nextLine();

            ingredientesPizza[contador]=nuevoingrediente;

            System.out.println(Arrays.toString(ingredientesPizza));

            System.out.println("Introduzca sus calorías:");
            int nuevocalorias = teclado.nextInt();

            caloriasPizza[contador]=nuevocalorias;
            this.ingredientes = new Ingredientes(ingredientesPizza, caloriasPizza);


            return true;
        }
        else {
            System.out.println("Ya tiene 3 ingredientes, no puede introducir más");
            return false;
        }

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "ingredientes=" + ingredientes +
                ", tamano='" + tamano + '\'' +
                '}';
    }
}
