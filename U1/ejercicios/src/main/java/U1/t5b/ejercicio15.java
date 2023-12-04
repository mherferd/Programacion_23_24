package U1.U1.t5b;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        {
            Scanner teclado;
            String num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
            int calificacion = 0;

            System.out.println("A continuación contesta las siguientes preguntas de verdadero o falso con v o f");


            teclado = new Scanner(System.in);
            System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
            num1 = teclado.nextLine();
            if (num1.equals("v")) {
                calificacion++;
                calificacion++;
                calificacion++;
            }


            teclado = new Scanner(System.in);
            System.out.println("2. Ha aumentado sus gastos de vestuario. ");
            num2 = teclado.nextLine();
            if (num2.equals("v")) {
                calificacion++;
                calificacion++;
                calificacion++;
            }


            teclado = new Scanner(System.in);
            System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti. ");
            num3 = teclado.nextLine();
            if (num3.equals("v")) {
                calificacion++;
                calificacion++;
                calificacion++;
            }


            teclado = new Scanner(System.in);
            System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer");
            num4 = teclado.nextLine();
            if (num4.equals("v")) {
                calificacion++;
                calificacion++;
                calificacion++;
            }


            teclado = new Scanner(System.in);
            System.out.println("5. No te deja que mires la agenda de su teléfono móvil  ");
            num5 = teclado.nextLine();
            if (num5.equals("v")) {
                calificacion++;
                calificacion++;
                calificacion++;
            }


            teclado = new Scanner(System.in);
            System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante ");
            num6 = teclado.nextLine();
            if (num6.equals("v")) {
                calificacion++;
                calificacion++;
                calificacion++;
            }


            teclado = new Scanner(System.in);
            System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a. ");
            num7 = teclado.nextLine();
            if (num7.equals("v")) {
                calificacion++;
                calificacion++;
                calificacion++;
            }


            teclado = new Scanner(System.in);
            System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo. ");
            num8 = teclado.nextLine();
            if (num8.equals("v")) {
                calificacion++;
                calificacion++;
                calificacion++;
            }


            teclado = new Scanner(System.in);
            System.out.println("9. Has notado que últimamente se perfuma más ");
            num9 = teclado.nextLine();
            if (num9.equals("v")) {
                calificacion++;
                calificacion++;
                calificacion++;
            }


            teclado = new Scanner(System.in);
            System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo ");
            num10 = teclado.nextLine();
            if (num10.equals("v")) {
                calificacion++;
                calificacion++;
                calificacion++;
            }

            System.out.println("Tu puntuación final es: " + calificacion);

            System.out.println(calificacion);
            if (calificacion <= 10) {
                System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
            }
            if ((calificacion >= 11) && (calificacion < 22)) {
                System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
            }
            if (calificacion >= 22) {
                System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
            }

        }

    }
}


