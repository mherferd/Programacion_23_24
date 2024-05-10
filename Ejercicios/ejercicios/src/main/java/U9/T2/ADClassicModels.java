package U9.T2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ADClassicModels {
    public ADClassicModels() {
    }

    public List getEmpleados(){

        ArrayList<Employee> Lista_Empleados = new ArrayList<>();
        Connection con = ConexionBD.getConnection();
        try {

            String sql = "SELECT * FROM employees";
            PreparedStatement sentencia = con.prepareStatement(sql);

            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) {
                Integer number = rs.getInt("employeeNumber");
                String name = rs.getString("lastName");
                String name2 = rs.getString("firstName");
                String extension = rs.getString("extension");
                String email = rs.getString("email");
                String codigo_oficina = rs.getString("officeCode");
                Integer reporte = rs.getInt("reportsTo");
                String titulo = rs.getString("jobTitle");


                Employee Empleado = new Employee(number,name,name2,extension,email,codigo_oficina,reporte,titulo);
                Lista_Empleados.add(Empleado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Lista_Empleados;
    }

    public List getOffices(){

    ArrayList<Office> Lista_Oficinas = new ArrayList<>();
        Connection con = ConexionBD.getConnection();
        try {

            String sql = "SELECT * FROM offices";
            PreparedStatement sentencia = con.prepareStatement(sql);

            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) {
                String number = rs.getString("officeCode");
                String ciudad = rs.getString("city");
                String numero = rs.getString("phone");
                String direccion1 = rs.getString("addressLine1");
                String direccion2 = rs.getString("addressLine2");
                String estado = rs.getString("state");
                String pais = rs.getString("country");
                String cod_postal = rs.getString("postalCode");
                String territorio = rs.getString("territory");



                Office Oficina = new Office(number,ciudad,numero,direccion1,direccion2,estado,pais,cod_postal,territorio);
                Lista_Oficinas.add(Oficina);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Lista_Oficinas;
    }

}
