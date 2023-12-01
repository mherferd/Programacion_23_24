package U3.ENTREGABLE;

public class ejercicio3 {

    public static void main(String[] args) {

        int [][] datos = new int[5][5];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j]= i+j;
                System.out.print(datos[i][j]);
            }
            System.out.println();
        }

    }
}
