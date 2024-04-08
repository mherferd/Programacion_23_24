package U1.ejercicios.src.main.java.U7.t4;

import U1.ejercicios.src.main.java.U4.t2.Ejercicio1.Lista;
import U1.ejercicios.src.main.java.U5.t1.Examen21_22_MANANA.Personas;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.Serializable;

public class Main {
    public static void main(String[] args) {


        ArrayList<Empleado> Lista_empleados = new ArrayList<>();
        Map<String, Empleado> diccionario = new HashMap<>();

        Scanner teclado = new Scanner(System.in);


        System.out.println("----------------------MENÚ-----------------------");
        System.out.println("¿Qué desea hacer?");
        System.out.println("1- Cargar los datos de un fichero");
        System.out.println("2- Insertar los datos desde la consola");
        int decision = teclado.nextInt();


        switch (decision) {
            case 1:
                crear_fichero();
                ArrayList<Empleado> lista_diccionario = leer_fichero(Lista_empleados);
                for (int i=0; i<lista_diccionario.size();i++){
                  diccionario.put(String.valueOf(lista_diccionario.get(i)), lista_diccionario.get(i));}
                System.out.println(diccionario);
                System.out.println();
                break;

            case 2:
                String quierecontinuar = "si";
                do {
                    System.out.println("INTRODUZCA SUS DATOS: ");

                    System.out.println("Nombre:");
                    String nombre = teclado.next();
                    teclado.nextLine();

                    System.out.println("DNI:");
                    String dni = teclado.nextLine();

                    System.out.println("Edad:");
                    int edad = teclado.nextInt();

                    System.out.println("Estatura:");
                    double estatura = teclado.nextDouble();

                    System.out.println("Sueldo:");
                    int sueldo = teclado.nextInt();

                    Empleado e1 = new Empleado(nombre, dni, edad, estatura, sueldo);
                    diccionario.put(dni, e1);
                    System.out.println("Datos introducidos");

                    System.out.println(diccionario);

                    teclado.nextLine();
                    System.out.println("Quire continuar introduciendo usuarios? (SI/N0)");
                    quierecontinuar = teclado.nextLine();

                }
                while (quierecontinuar.equalsIgnoreCase("Si"));

                break;
        }


        String mas_op ="si";
        int decision2=0;
        do{


        System.out.println("----------------------MENÚ DE OPERACIONES-----------------------");
        System.out.println("¿Qué desea hacer?");
        System.out.println("1- Visualizar Listado");
        System.out.println("2- Borrar Empleados");
        System.out.println("3- Visualizar Empleado");
        System.out.println("4- Modificar Empleado");
        System.out.println("5- Insertar Empleado");
        System.out.println("6- Salir");


        decision2 = teclado.nextInt();

            switch (decision2) {
                case 1:
                    System.out.println(diccionario);
                    break;
                case 2:

                    borrar_empleado(diccionario);
                    break;
                case 3:
                  vis_empleado(diccionario);
                    break;
                case 4:
                    mod_empleado(diccionario);
                    break;
                case 5:
                    ins_empleado(diccionario);
                    break;
            }
        }while (decision2!=6);
    }


    public static void crear_fichero() {

        ArrayList<Empleado> Lista_empleados = new ArrayList<>();

        Empleado e2 = new Empleado("Jose", "11111111A", 32, 1.76, 2000);
        Empleado e3 = new Empleado("Canales", "22222222B", 34, 1.86, 50000);
        Empleado e4 = new Empleado("Fekir", "33333333C", 30, 1.73, 100000);
        Empleado e1 = new Empleado("Isco", "44444444D", 29, 1.77, 3333333);

        Lista_empleados.add(e1);
        Lista_empleados.add(e2);
        Lista_empleados.add(e3);
        Lista_empleados.add(e4);

        try (ObjectOutputStream hola = new ObjectOutputStream(new FileOutputStream("C:\\Archivos_PRO\\EJERCICIO_T4.bin"))) {
            hola.writeObject(Lista_empleados);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }



    public static ArrayList<Empleado> leer_fichero(ArrayList<Empleado> Lista) {

        try (ObjectInputStream Lee = new ObjectInputStream(new FileInputStream("C:\\Archivos_PRO\\EJERCICIO_T4.bin"))){
            Lista = (ArrayList<Empleado>)Lee.readObject();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        return Lista;
    }

    public static void borrar_empleado(Map<String,Empleado> mapa) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el dni del empleado a eliminar:");
        String dni_eliminar = teclado.nextLine();

        if (mapa.containsKey(dni_eliminar)){
            mapa.remove(dni_eliminar);
        }
        else{
            System.out.println("No existe nadie con ese DNI");
        }
        System.out.println(mapa);
    }

    public static void vis_empleado(Map<String,Empleado> mapa) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el dni del empleado a visualizar:");
        String dni_ver = teclado.nextLine();
        if(mapa.containsKey(dni_ver)){
            System.out.println(mapa.get(dni_ver));}
        else {
            System.out.println("Ese dni no existe");
        }
    }

    public static void mod_empleado(Map<String,Empleado> mapa) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el dni del empleado a modificar:");
        String dni_mod = teclado.nextLine();

        if(mapa.containsKey(dni_mod)){

            System.out.println("INTRODUZCA SUS DATOS: ");

            System.out.println("Nombre:");
            String nombre = teclado.nextLine();

            System.out.println("Edad:");
            int edad = teclado.nextInt();

            teclado.nextLine();
            System.out.println("Estatura:");
            double estatura = teclado.nextDouble();

            System.out.println("Sueldo:");
            int sueldo = teclado.nextInt();

            Empleado e_prov =new Empleado(nombre,dni_mod,edad,estatura,sueldo);

            mapa.put(dni_mod,e_prov);
            System.out.println(mapa);}
                        else{
            System.out.println("No existe nadie con ese DNI");
        }
    }
    public static void ins_empleado(Map<String,Empleado> mapa) {
        System.out.println("INTRODUZCA LOS DATOS: ");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre:");
        String nombre = teclado.nextLine();

        System.out.println("DNI:");
        String dni = teclado.nextLine();

        System.out.println("Edad:");
        int edad = teclado.nextInt();

        System.out.println("Estatura:");
        double estatura = teclado.nextDouble();

        System.out.println("Sueldo:");
        int sueldo = teclado.nextInt();

        if(mapa.containsKey(dni)){
            System.out.println("Ese empleado ya existe");}
        else{
            Empleado nuevo_em = new Empleado(nombre,dni,edad,estatura,sueldo);
            mapa.put(dni, nuevo_em);
            System.out.println("Datos introducidos");
            System.out.println(mapa);
    }
    }

}

