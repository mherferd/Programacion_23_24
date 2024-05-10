package U9.T3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteModel {
        public void insertCliente(Cliente cliente) {

            Connection con = ConexionBD.getConnection();

            try {

                String sql = "INSERT INTO customers(customerNumber,customerName,contactLastName, contactFirstName, phone, addressLine1, addressLine2, city, state, postalCode, country, creditLimit) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement sentencia = con.prepareStatement(sql);

                sentencia.setString(1, cliente.getCustomerNumber());
                sentencia.setString(2, cliente.getCustomerName());
                sentencia.setString(3, cliente.getContactLastName());
                sentencia.setString(4, cliente.getContactFirstName());
                sentencia.setString(5, cliente.getPhone());
                sentencia.setString(6, cliente.getAddressLine1());
                sentencia.setString(7, cliente.getAddressLine2());
                sentencia.setString(8, cliente.getCity());
                sentencia.setString(9, cliente.getState());
                sentencia.setString(10, cliente.getPostalCode());
                sentencia.setString(11, cliente.getCountry());
                sentencia.setString(12, cliente.getCreditLimit());

                int rowsInserted = sentencia.executeUpdate();

                if (rowsInserted > 0){
                    System.out.println("Cliente insertado");
                }
                else{
                    System.out.println("Cliente NO insertado");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

}
