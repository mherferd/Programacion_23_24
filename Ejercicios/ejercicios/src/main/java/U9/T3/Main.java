package U9.T3;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int Opcion=0;

        do{
            System.out.println("-------------------¿Qué quiere hacer?-------------------");
            System.out.println("1 - Insertar cliente");
            System.out.println("2 - Asignar empleado a cliente ");
            System.out.println("3 - Añadir producto a pedido");
            System.out.println("4 - Mostrar con detalle un pedido");
            System.out.println("5 - SALIR");

            Opcion = teclado.nextInt();


            switch (Opcion){
                case 1:
                    Connection connection = null;

                    try {

                        connection = DriverManager.getConnection("jdbc:mysql://localhost:3336/classicmodels?user=root&password=XXXXX");

                        System.out.println("Numero del Empleado: ");
                        int customerNumber = teclado.nextInt();

                        System.out.println("Nombre del Empleado: ");
                        String customerName = teclado.nextLine();

                        System.out.println("Apellido del Contacto: ");
                        String contactLastName = teclado.nextLine();

                        System.out.println("Nombre del Contacto: ");
                        String contactFirstName = teclado.nextLine();

                        System.out.println("Telefono de Empleado: ");
                        int phone = teclado.nextInt();

                        System.out.println("Ubicacion 1: ");
                        String adress1 = teclado.nextLine();

                        System.out.println("Ubicacion 2: ");
                        String adress2 = teclado.nextLine();



                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    } finally {
                        try {
                            if (connection != null) {
                                connection.close();
                            }
                        } catch (SQLException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }

        }
        while ((Opcion!=5) & (Opcion<5));
    }
    }

