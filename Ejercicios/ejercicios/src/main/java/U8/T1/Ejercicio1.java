package U1.ejercicios.src.main.java.U8.T1;
import java.sql.*;
public class Ejercicio1 {
    public static void main(String[] args) {


        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db"); // crear una conexión a base de datos
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30); // establecer un tiempo máximo de respuesta a 30 segundos.
            ResultSet rs = statement.executeQuery("SELECT * FROM books");
            while (rs.next()) { // leer el ResultSet
                System.out.println("name = " + rs.getString("title"));
                System.out.println("id = " + rs.getInt("id"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage()); // Si el mensaje de error es "out of memory", seguramente es que no se encuentra el fichero
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage()); // error al cerrar la conexión
            }
        }
    }
}
