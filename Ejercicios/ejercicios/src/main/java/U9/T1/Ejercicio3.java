package U9.T1;

import java.sql.*;

public class Ejercicio3 {
    public static void main(String[] args) {


        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);
            ResultSet rs = statement.executeQuery("SELECT amount, customerNumber " +" FROM payments " + "WHERE amount > 30000");


            while (rs.next()) { // leer el ResultSet
                System.out.println("|| ID = " + rs.getString("customerNumber"));
                System.out.print("Dinero = " + rs.getString("amount") +"  ");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
