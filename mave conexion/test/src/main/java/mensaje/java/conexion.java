package mensaje.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexion {
    public Connection get_Connection(){
             Connection conection = null;


            //  String url = "jdbc:mysql://localhost:3307/inicio";
            //  String user =  "Ariel mendoza";
            //  String password =  "1234567";



        try {
            
            // Class.forName("com.mysql.cj.jdbc.Driver");
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3307/inicio","Ariel mendoza" , "1234567xd");

        ;

            if(conection != null){

            //    System.out.println("todo ready"); 
            }
        } catch (SQLException e) {
            System.out.println("error" + e.getMessage());
        }
        return conection;

  }

}
