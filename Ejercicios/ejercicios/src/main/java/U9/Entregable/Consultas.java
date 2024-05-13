package U9.Entregable;

import U9.T2.Office;

import java.sql.*;
import java.util.Scanner;

public class Consultas {

    public Consultas() {
    }

    public void empleadosOficinaMayor() {

        Connection con = ConexionBD.getConnection();

        try {

            String sql = "SELECT * FROM employees WHERE officeCode = (SELECT officeCode FROM employees GROUP BY officeCode ORDER BY COUNT(*) DESC LIMIT 1)";
            PreparedStatement sentencia = con.prepareStatement(sql);

            ResultSet rs = sentencia.executeQuery();
            while (rs.next()) {
                System.out.println("|| Numero empleado = " + rs.getString("employeeNumber"));
                System.out.print("Apellido = " + rs.getString("lastName"));
                System.out.print("Nombre = " + rs.getString("firstName"));
                System.out.print("extension = " + rs.getString("extension"));
                System.out.print("email = " + rs.getString("email"));
                System.out.print("nºOficina = " + rs.getString("officeCode"));
                System.out.print("Reporte = " + rs.getString("reportsTo"));
                System.out.print("Titulo = " + rs.getString("jobTitle"));
            }

            } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void productosNoVendidos() {

        Connection con = ConexionBD.getConnection();

        try {
            String sql = "SELECT * FROM products WHERE productCode NOT IN (Select productCode FROM orderdetails);";
            PreparedStatement sentencia = con.prepareStatement(sql);

            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) {
                System.out.println("\n  |Codigo= " + rs.getString("productCode"));
                System.out.print("  Nombre = " + rs.getString("productName"));
                System.out.print("  Categoria = " + rs.getString("productLine"));
                System.out.print("  Escala = " + rs.getString("productScale"));
                System.out.print("  Vendedor = " + rs.getString("productVendor"));
                System.out.print("  Descripcion = " + rs.getString("productDescription"));
                System.out.print("  Stock = " + rs.getString("quantityInStock"));
                System.out.print("  Precio venta = " + rs.getString("buyPrice"));
                System.out.print("  MSRP = " + rs.getString("MSRP"));


            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    public void informeCategoria(){
        Scanner teclado = new Scanner(System.in);

        Connection con = ConexionBD.getConnection();
        System.out.println("Introduce una categoria: ");
        String categoria = teclado.nextLine();


        try {
            String sql = "SELECT productName, quantityInStock, buyPrice, productCode  FROM products where ProductLine = ?";
            PreparedStatement sentencia = con.prepareStatement(sql);

            sentencia.setString(1,categoria);

            ResultSet rs = sentencia.executeQuery();
            while (rs.next()) {
                System.out.print("  Nombre = " + rs.getString("productName"));
                System.out.print("  Stock = " + rs.getString("quantityInStock"));
                System.out.print("  Precio venta = " + rs.getString("buyPrice"));
                System.out.print("  Codigo = " + rs.getString("productCode"));

                System.out.println();

            }


        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
