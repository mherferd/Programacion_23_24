package U9.T3;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ClienteModel clienteModel = new ClienteModel();
        ADClassicModels adClassicModels = new ADClassicModels();
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

                    System.out.println("------------INSERTAR NUEVO CLIENTE-----------");

                    teclado.nextLine();

                    System.out.println("ID: ");
                    String id_cliente = teclado.nextLine();

                    System.out.println("Nombre: ");
                    String nombre = teclado.nextLine();

                    System.out.println("Apellido2: ");
                    String apellido1 = teclado.nextLine();

                    System.out.println("Apellido1: ");
                    String apellido2 = teclado.nextLine();

                    System.out.println("Numero: ");
                    String numero = teclado.nextLine();

                    System.out.println("Direccion1: ");
                    String direccion1 = teclado.nextLine();

                    System.out.println("Direccion2: ");
                    String direccion2 = teclado.nextLine();

                    System.out.println("Ciudad: ");
                    String ciudad = teclado.nextLine();

                    System.out.println("Estado: ");
                    String estado = teclado.nextLine();

                    System.out.println("Codigo Postal: ");
                    String cod_postal = teclado.nextLine();

                    System.out.println("Pais: ");
                    String pais = teclado.nextLine();

                    System.out.println("Credito: ");
                    String credito = teclado.nextLine();

                    Cliente cliente = new Cliente(id_cliente,nombre,apellido1,apellido2,numero,direccion1,direccion2,ciudad,estado,cod_postal,pais,credito);

                    clienteModel.insertCliente(cliente);
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

