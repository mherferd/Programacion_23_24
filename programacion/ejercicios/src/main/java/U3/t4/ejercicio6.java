package U3.t4;

public class ejercicio6 {

    public static void main(String[] args) {


        int [][] datos = new int[6][10];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j]= (int) (Math.random() * 1000     + 0);
                System.out.print(datos[i][j]);
                System.out.print(" | ");
            }

            System.out.println();
        }
        System.out.println();
        System.out.println();

        int maximo = datos[0] [0];
        int fila_min = 0;
        int fila_max = 0;
        int columna_max = 0;
        int columna_min =0;

        for(int i =0; i<datos.length; i++){
            for (int j = 0; j < datos[i].length; j++) {
                if (maximo<=datos[i][j]){
                    maximo=datos[i][j];
                    fila_max= i;
                    columna_max = j;

                }
            }
        }
        System.out.println("MAXIMO: "+maximo);
        System.out.println("POSICION: ");
        System.out.println("FILA : "+ (fila_max+1) +"   COLUMNA: " +(columna_max+1));

        int minimo = datos[0] [0];

        for(int i =0; i<datos.length; i++){
            for (int j = 0; j < datos[i].length; j++) {
                if (minimo>=datos[i][j]){
                    minimo=datos[i][j];
                    fila_min= i;
                    columna_min = j;
                }
            }
        }
        System.out.println("MINIMO: "+minimo);
        System.out.println("POSICION: ");
        System.out.println("FILA : "+ (fila_min +1)+"   COLUMNA: " +(columna_min+1));

    }
}
