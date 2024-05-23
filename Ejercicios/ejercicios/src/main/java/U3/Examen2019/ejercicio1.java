package U3.Examen2019;

public class ejercicio1 {
    public static void main(String[] args) {

        int [] diagonal = new int [9];

        int [][] datos = new int[9][9];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j]= (int) (Math.random() * (500-900)+900 );
                System.out.print(datos[i][j]);
                System.out.print(" | ");
                if (i+j==8) {
                    diagonal[j] = datos [i] [j];
                }
            }

            System.out.println();
        }
        System.out.println();
        System.out.println();

        int media =0;

        System.out.print("DIAGONAL: ");
        for (int i = 0; i < datos.length; i++) {
            System.out.print(diagonal[i]+" ");
            media=diagonal[i]+media;
        }
        System.out.println();
        System.out.println("MEDIA: " +media/9);


        int maximo = diagonal[0];

        for (int j = 0; j < 9; j++) {
            if (diagonal[j] >= maximo) {
                maximo = diagonal[j];
            }
        }
        System.out.println("MAXIMO: "+maximo);


        int minimo = diagonal[0];


        for (int j = 0; j < 9; j++) {
            if (diagonal[j] <= minimo) {
                minimo = diagonal[j];
            }
        }
        System.out.println("MINIMO: "+minimo);

    }
}

