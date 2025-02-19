package test;

import java.io.StreamTokenizer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.concurrent.Exchanger;

// import com.sun.tools.classfile.StackMapTable_attribute.full_frame;

import test.servidorOne9.ServerTwos;



public class Conexion  extends AbstrateGlobal {










    

@Override
    public  Connection getConnection(){

    Connection conexion = null;
    









        try{


        conexion = DriverManager.getConnection( "jdbc:mysql://localhost:3307/inicio","Ariel mendoza" , "1234567xd");

        if (conexion != null) {
            System.out.println("corriendo");

  

        }



        }catch(SQLException e){
            System.out.println("error" +e.getMessage());
         
        }
        return conexion;






            }



            public static void ListenGet(){
            
                Conexion nconexion = new Conexion();
                


                    System.out.println("estas vivo no podemos perder");
                try(Connection conexion =  nconexion.getConnection()) {

                    PreparedStatement p = null;

                    String query ="SELECT * FROM  mensajes WHERE mensaje IS NOT NULL";

                    p=conexion.prepareStatement(query);
                     ResultSet resultSet = p.executeQuery();
                   
                        
                    ArrayList<String> datosP = new ArrayList<>();

                     while (resultSet.next()) {

                            String  respuesta  = resultSet.getString("mensaje");
                            datosP.add(respuesta);


                     }

                     System.out.println(" y si perdemos regresaremos de las cenizas no hay plan b"+datosP);
                    
                } catch (Exception e) {
                        System.out.println("eeror" +e.getMessage());
                }

                }



            public static void  ListenPost(){







                
            }


            public static void ListenPut(String unificando , String number ){
                String delimitador = " ";

                PreparedStatement p = null;
                Conexion nconexion = new Conexion();


                try(Connection conexion =  nconexion.getConnection()) {
                
                    String query = "UDPATE  mensajes  SET  mensaje = ?  WHERE id_mensajes = ?";

                    p=conexion.prepareStatement(query);
                    p.setString(1, unificando);
                    p.setString(2, number);
                    int datosO = p.executeUpdate();

                     System.out.println("funcionaa"+datosO);



                } catch (Exception e) {
                    System.out.println(e.getMessage());

                }



            }


    }





    

  

