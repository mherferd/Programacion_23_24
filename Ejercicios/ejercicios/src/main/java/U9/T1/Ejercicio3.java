package U9.T1;

import java.sql.*;

public class Ejercicio3 {
    public static void main(String[] args) {


        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);
            ResultSet rs = statement.executeQuery("SELECT employeeNumber, reportsTo " +" FROM employees " + "WHERE reportsTo = 1143");


            while (rs.next()) {
                System.out.print("Da cuenta a: " + rs.getInt("reportsTo") +"  ");
                System.out.println("|| ID = " + rs.getInt("employeeNumber"));
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
