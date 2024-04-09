package U1.ejercicios.src.main.java.U7.t5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class InsertaAspirante  {

    private static int identificador =1;

    HashMap<Integer,Aspirante> Lista = new HashMap<>();
    ArrayList<Integer> Lista_ID = new ArrayList<>();
    public InsertaAspirante() {
        super();
        identificador=1;
    }

    public void IntroducirAspirantes() {

        String pregunta1;

        do {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Introduce el nombre");
            String nombre = teclado.nextLine();

            System.out.println("Introduce el dni");
            String DNI = teclado.nextLine();

            System.out.println("Introduce el telefono");
            int telefono = teclado.nextInt();

            Aspirante a1 = new Aspirante(nombre, DNI, telefono);

            a1.setID(identificador);
            identificador++;

            Lista.put(a1.getID(), a1);
            Lista_ID.add(a1.getID());

            System.out.println(Lista);
            teclado.nextLine();
            System.out.println("¿Quiéres introducir otro aspirante? S/N");
            pregunta1 = teclado.nextLine();

        } while (pregunta1.equalsIgnoreCase("S"));
    }

    public void guardarFicheros(){

        try (ObjectOutputStream hola = new ObjectOutputStream(new FileOutputStream("C:\\Archivos_PRO\\aspirantes.dat", true))) {
            hola.writeObject(Lista);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (ObjectOutputStream hola = new ObjectOutputStream(new FileOutputStream("C:\\Archivos_PRO\\id_aspirantes.dat", true))) {
            hola.writeObject(Lista_ID);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int getIdentificador() {
        return identificador;
    }

    public static void setIdentificador(int identificador) {
        InsertaAspirante.identificador = identificador;
    }

    public HashMap<Integer, Aspirante> getLista() {
        return Lista;
    }

    public void setLista(HashMap<Integer, Aspirante> lista) {
        Lista = lista;
    }

    public ArrayList<Integer> getLista_ID() {
        return Lista_ID;
    }

    public void setLista_ID(ArrayList<Integer> lista_ID) {
        Lista_ID = lista_ID;
    }
}
