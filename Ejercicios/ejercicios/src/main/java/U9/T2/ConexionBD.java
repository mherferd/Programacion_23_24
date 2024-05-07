package U9.T2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
        private static Connection con=null;
        public static Connection getConnection(){
            try{
                if( con == null ){
                    String driver="com.mysql.jdbc.Driver"; //el driver varia segun la DB que usemos
                    String url="jdbc:mysql://localhost/nombre_DB?autoReconnect=true";
                    String pwd="contraseña";
                    String usr="usuario";
                    Class.forName(driver);
                    con = DriverManager.getConnection(url,usr,pwd);
                    System.out.println("Conection Succesfull");
                }
            }
            catch(ClassNotFoundException | SQLException ex){
                ex.printStackTrace();
            }
            return con;
        }
    }
