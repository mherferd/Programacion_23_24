package U9.Entregable;

import U9.T3.ADClassicModels;
import U9.T3.Cliente;
import U9.T3.ClienteModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Transacciones {
    Connection con = ConexionBD.getConnection();

    public void transaccion1() {

        try {
            String sql = "INSERT into customers (customerNumber,customerName,contactLastName, contactFirstName, phone, addressLine1, addressLine2, city, state, postalCode, country, creditLimit) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement sentencia = con.prepareStatement(sql);

            Scanner teclado = new Scanner(System.in);
            System.out.println("------------INSERTAR NUEVO CLIENTE-----------");

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

            String sql1 = "INSERT into payments (customerNumber,checkNumber,paymentDate, amount) VALUES (?, ?, ?, ?)";
            PreparedStatement sentencia1 = con.prepareStatement(sql1);

            System.out.println("------------INSERTAR PAGO 1-----------");


            System.out.println("ID del cliente: ");
            String cliente_pago = teclado.nextLine();

            System.out.println("Check Number: ");
            String check_number = teclado.nextLine();

            System.out.println("Fecha: ");
            String fecha = teclado.nextLine();

            System.out.println("total: ");
            String precio = teclado.nextLine();

            String sql2 = "INSERT into payments (customerNumber,checkNumber,paymentDate, amount) VALUES (?, ?, ?, ?)";
            PreparedStatement sentencia2 = con.prepareStatement(sql2);
            System.out.println("------------INSERTAR PAGO 2-----------");


            System.out.println("ID del cliente: ");
            String cliente_pago2 = teclado.nextLine();

            System.out.println("Check Number: ");
            String check_number2 = teclado.nextLine();

            System.out.println("Fecha: ");
            String fecha2 = teclado.nextLine();

            System.out.println("total: ");
            String precio2 = teclado.nextLine();


            sentencia.setString(1, id_cliente);
            sentencia.setString(2, nombre);
            sentencia.setString(3, apellido2);
            sentencia.setString(4, apellido1);
            sentencia.setString(5, numero);
            sentencia.setString(6, direccion1);
            sentencia.setString(7, direccion2);
            sentencia.setString(8, ciudad);
            sentencia.setString(9, estado);
            sentencia.setString(10, cod_postal);
            sentencia.setString(11, pais);
            sentencia.setString(12, credito);

            sentencia1.setString(1, cliente_pago);
            sentencia1.setString(2, check_number);
            sentencia1.setString(3, fecha);
            sentencia1.setString(4, precio);

            sentencia2.setString(1, cliente_pago2);
            sentencia2.setString(2, check_number2);
            sentencia2.setString(3, fecha2);
            sentencia2.setString(4, precio2);

            sentencia.executeUpdate();
            sentencia1.executeUpdate();
            sentencia2.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void transaccion2() {
        try {
            String sql = "INSERT into offices (officeCode,city,phone, addressLine1, addressLine2,state, country, postalCode, territory) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement sentencia = con.prepareStatement(sql);

            Scanner teclado = new Scanner(System.in);
            int Opcion = 0;
            System.out.println("------------INSERTAR NUEVA OFICINA EN TOKYO-----------");

            System.out.println("ID: ");
            String id_oficina_tokyo = teclado.nextLine();

            String ciudad_tokyo = "Tokyo";

            System.out.println("Numero: ");
            String phone_tokyo = teclado.nextLine();

            System.out.println("Direccion1: ");
            String direccion1_tokyo = teclado.nextLine();

            System.out.println("Direccion2: ");
            String direccion2_tokyo = teclado.nextLine();

            String state_tokyo = "Tokyo";
            String country_tokyo = "Japon";


            System.out.println("Codigo Postal: ");
            String cod_postal_tokyo = teclado.nextLine();

            System.out.println("Territorio: ");
            String territory_tokyo = teclado.nextLine();

            sentencia.setString(1, id_oficina_tokyo);
            sentencia.setString(2, ciudad_tokyo);
            sentencia.setString(3, phone_tokyo);
            sentencia.setString(4, direccion1_tokyo);
            sentencia.setString(5, direccion2_tokyo);
            sentencia.setString(6, state_tokyo);
            sentencia.setString(7, country_tokyo);
            sentencia.setString(8, cod_postal_tokyo);
            sentencia.setString(9, territory_tokyo);

            sentencia.executeUpdate();



            String sql1 = "UPDATE employees officeCode = ?";
            PreparedStatement sentencia1 = con.prepareStatement(sql1);

            sentencia1.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}


