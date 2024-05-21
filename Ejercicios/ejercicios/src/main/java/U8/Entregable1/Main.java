package U8.Entregable1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RecorridoDOM recorridoDOM = new RecorridoDOM();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una etiqueta");
        String etiqueta = teclado.nextLine();

        recorridoDOM.mostrarContenidoEtiqueta(etiqueta);
    }
}
