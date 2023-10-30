package U1.examenes.U1;

import java.util.Scanner;

public class examen_4_4 {
    public static void main(String[] args) {

        int numero = (int) (Math.random() * 7);
        int contador =1;
        String caracter = null;

        while (contador<=numero){

            Scanner scanner = new Scanner(System.in);
            int  columna = 0, fila = 0;


            for (fila = 0; fila <= 0; fila++) {
                for (columna = 0; columna <= 3; columna++) {
                    int numerocaracter = (int) (Math.random() * 7);
                    switch (numerocaracter){
                        case 1:
                            caracter="do";
                            break;
                        case 2:
                            caracter="re";
                            break;
                        case 3:
                            caracter="mi";
                            break;
                        case 4:
                            caracter="fa";
                            break;
                        case 5:
                            caracter="sol";
                            break;
                        case 6:
                            caracter="la";
                            break;
                        case 7:
                            caracter="si";
                            break;
                    }
                    System.out.print(" "+caracter);
                }
                System.out.print(" | ");
            }

            contador++;
        }
        System.out.print("|");
    }


}


//public static void main(String[] args) {


    int numero = (int) (Math.random() * 7);
    int contador =1;
    String caracter = null, primercaracter = null;

    while (contador<=numero){

        Scanner scanner = new Scanner(System.in);
        int  columna = 0, fila = 0;


        for (fila = 0; fila <= 0; fila++) {
            for (columna = 0; columna <= 3; columna++) {
                int numerocaracter = (int) (Math.random() * 7);
                switch (numerocaracter){
                    case 1:
                        caracter="do";
                        break;
                    case 2:
                        caracter="re";
                        break;
                    case 3:
                        caracter="mi";
                        break;
                    case 4:
                        caracter="fa";
                        break;
                    case 5:
                        caracter="sol";
                        break;
                    case 6:
                        caracter="la";
                        break;
                    case 7:
                        caracter="si";
                        break;
                }
                if (contador==1 && columna==0 && fila==0){
                    primercaracter=caracter;
                }
                if (contador==numero && columna==3 && fila==0){
                    System.out.print(" "+primercaracter);
                }
                else {System.out.print(" "+caracter);}
            }
            System.out.print(" | ");
        }
        contador++;
    }
}


//public class random2 {
    public static void main(String[] args) {

        int n;
        int i = 1, j = 1, y=1;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("¿Cuanta altura quiere?");
        n = teclado.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= (i * 2) - 1; j++) {
                for (y=1;  y<=i; y++)
                    System.out.print(y);
            }

            System.out.println(" ");

        }
    }
}


// public static void main(String[] args) {

    int n;
    int i = 1, j = 1, y = 1;

    Scanner teclado;
    teclado = new Scanner(System.in);
    System.out.println("¿Cuanta altura quiere?");
    n = teclado.nextInt();

while (n <= 3 || n % 2 == 0) {
    System.out.println("Introduce la altura de la z (impar y >3): ");
    Scanner teclado2 = new Scanner(System.in);
    n = teclado2.nextInt();
}

    for (i = 1; i <= n; i++) {
        for (j = 1; j <= n/2+1; j++) {
            if ((i == n / 2+1)|| (j<=n/2+1 && i+j>n/2+1 && i<=n/2*1) || (j<=n/2+1 && i-j<n/2+1 && i>n/2*1)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        for (j = 1; j <= 5; j++) {
            if (i==n/2+1){
                System.out.print("*");
            }
        }
        System.out.println();

    }
}
}


// public static void main(String[] args) {

    System.out.print("Introduce un número: ");
    Scanner x = new Scanner(System.in);
    long numero = x.nextLong();

    System.out.print("Introduce otro número: ");
    long numero2 = x.nextLong();

    long numeroPrincipio = numero;
    long vuelta = 0;
    long numeroIntroducidoDos = numero2;
    long vueltaDos = 0;

    while (numeroPrincipio > 0) {
        vuelta = (vuelta * 10) + (numeroPrincipio % 10);
        numeroPrincipio = numeroPrincipio / 10;
    }


    while (numeroIntroducidoDos > 0) {
        vueltaDos = (vueltaDos * 10) + (numeroIntroducidoDos % 10);
        numeroIntroducidoDos = numeroIntroducidoDos / 10;
    }

    long ultimaCifraUna = 0;
    long ultimaCifraDos = 0;
    long vueltaPar = vuelta;
    long vueltaParDos = vueltaDos;


    System.out.print("El número formado por las cifras pares es: ");
    do {
        ultimaCifraUna = vueltaPar % 10;
        ultimaCifraDos = vueltaParDos % 10;
        if (ultimaCifraUna % 2 == 0){
            System.out.print(ultimaCifraUna);
        }
        if (ultimaCifraDos % 2 == 0){
            System.out.print(ultimaCifraDos);
        }
        vueltaPar = vueltaPar / 10;
        vueltaParDos = vueltaParDos / 10;
    } while (vueltaPar > 0 || vueltaParDos > 0);

    System.out.println("");
    System.out.print("El número formado por las cifras impares es: ");
    do {
        ultimaCifraUna = vuelta % 10;
        ultimaCifraDos = vueltaDos % 10;
        if (ultimaCifraUna % 2 != 0){
            System.out.print(ultimaCifraUna);
        }
        if (ultimaCifraDos % 2 != 0){
            System.out.print(ultimaCifraDos);
        }
        vuelta = vuelta / 10;
        vueltaDos = vueltaDos / 10;
    } while (vuelta > 0 || vueltaDos > 0);

}}


//  public static void main(String[] args) {

    System.out.print("Introduzca un número entero: ");
    long numeroIntroducido = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca un dígito: ");
    int digito = Integer.parseInt(System.console().readLine());

    System.out.print("Contando de izquierda a derecha, el " + digito);
    System.out.println(" aparece dentro de " + numeroIntroducido);
    System.out.print("en las siguientes posiciones: ");

   
    long numero = numeroIntroducido;

    numero = numero * 10 + 1;
    

    long volteado = 0;
    int longitud = 0;
    int posicion = 1;

    if (numero == 0) {
        longitud = 1;
    }

    while (numero > 0) {
        volteado = (volteado * 10) + (numero % 10);
        numero /= 10;
        longitud++;
    } 
    while (volteado != 1) {
        if ((volteado % 10) == digito) {
            System.out.print(posicion + " ");
        }
        volteado /= 10;
        posicion++;
    } 

    System.out.println();
}
}