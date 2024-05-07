package U9.T3;

import java.sql.*;
import java.util.Scanner;

public class AccesoDatos {

    public static void main(String[] args) {

        // Creamos el objeto conexión
        Connection connection = null;

        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3336/classicmodels?user=root&password=XXXXX");


            String sql = "select * from customers where customerName= ? and country = ? ";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, "La Rochelle Gifts");
            statement.setString(2, "France");

            System.out.println("LA CONSULTA CONSTRUIDA ES: " + statement);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                String number = rs.getString("customerNumber");
                String name = rs.getString("customerName");
                String address = rs.getString("addressLine1");
                String country = rs.getString("country");

                System.out.println("-------------------------");
                System.out.println("CustomerNumber: " + number);
                System.out.println("CustomerName: " + name);
                System.out.println("Address: " + address);
                System.out.println("Country: " + country);
                System.out.println("-------------------------");
            }

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
    }
}