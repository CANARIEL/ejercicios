package mensaje.java;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import  java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Mensajedb {

        class SvL{








          public static void CxF(){
              Scanner scanner = new Scanner(System.in);
            System.out.println(
              "su consulta  fue finalizada desea regresar al menu de inicio o volver a hacer otra consulta \n digite 1 menu 2 volver a consultar"
            );
            String decision = scanner.nextLine();


              switch (decision) {
                case "1":
                  
                  Main.main(null);
                  
                  break;
                case "2":
                  System.out.println("esta siendo dirigido nuevamente para realizar su consulta");
                    mensajeservice.listarMensajes();

                  break;
                default:
                  break;
              }


          }



        }



    public static void  CrearMensajes(mensaje  mensaje){

                     
        conexion  nConexion = new conexion();

        try(Connection conexion  = nConexion.get_Connection()) {
            PreparedStatement   p = null;

            try {
               String query= "INSERT INTO mensajes(mensaje, autor) VALUES(? , ?)"; 
                p=conexion.prepareStatement(query);
                p.setString(1,mensaje.getMensajes() );
                p.setString(2,mensaje.getAutor() );
                // System.out.println(""+mensaje.getAutor());
                p.executeUpdate();
                // System.out.println("db correcto");
            } catch (SQLException e) {
            // System.out.println("eerty" +e);
            }

            


        } catch (SQLException e) {
            // TODO: handle exception
        }
    }
    public static  void  EditarMensaje(String namePost){

      conexion nConexion = new conexion();

 
      
        
     try (Connection conexion  = nConexion.get_Connection()) {
      PreparedStatement p= null;
     String query = "SELECT * FROM mensajes WHERE autor = ? AND id_mensajes IS NOT NULL AND mensaje IS NOT NULL; "; 
      p = conexion.prepareStatement(query);  

     p.setString(1, namePost);

     ResultSet resultSet =   p.executeQuery();

      while (resultSet.next()) {

         
        System.out.println("[mensaje =]"+resultSet.getString("mensaje") +" [autor = ] "+  resultSet.getString("autor") +"[id_mensajes =]"+resultSet.getString("id_mensajes") );




      }



      Scanner scanner = new Scanner(System.in);
      System.out.println("digite el numero de id_mensaje para poder editar \n se le reclaca datos eliminos  no podran ser recuperados");
      String deleteUdpate = scanner.nextLine();
      String query3  = "Select * FROM mensajes  WHERE  id_mensajes = ? AND mensaje IS NOT NULL ";
      p = conexion.prepareStatement(query3);
          int conversionDate = Integer.parseInt(deleteUdpate);
          System.out.println(conversionDate);
      p.setInt(1, conversionDate);
       ResultSet reustadoOne =  p.executeQuery();

       String guardanodDato = "   ";
       while (reustadoOne.next()) {
               System.out.println( "[mensaje_editar =]"+reustadoOne.getString(   "mensaje"));
               guardanodDato = reustadoOne.getString("mensaje");
       }

      
      System.out.println("se ha encontrado su mensajes pero  usted desea editar y eliminar  o editar y conservar \n '1' para primera 'enter' para segunda");
       String filtrandString = scanner.nextLine();

      System.out.println("el mensaje a sido seleccionado ingrese los cambios o lo que desea modificar ");
      String editandoAndo = scanner.nextLine();

      String concatenadoAndo = guardanodDato+editandoAndo;
      // System.out.println(concatenadoAndo+"ndanudnaud");
       
      
  if (filtrandString == "1") {
    String query1 =  "UPDATE mensajes  set  mensaje = ?  WHERE  id_mensajes = ?";
    p = conexion.prepareStatement( query1);
    p.setString(1, concatenadoAndo );
    System.out.println(concatenadoAndo+"testi one");

    p.setInt(2 ,conversionDate );
    int reustadoOneL =  p.executeUpdate();


    System.out.println("cambios exitosos");




    




    
  } else  {

    

    String query1 =  "UPDATE mensajes  set  mensaje = ?  WHERE  id_mensajes = ?";

      p = conexion.prepareStatement( query1);
      p.setString(1,  editandoAndo );
      p.setInt(2 ,conversionDate );
     int reustadoOneL =  p.executeUpdate();


     System.out.println("cambios existosos");


    
  }


  
      // System.out.println
/*
 * se da un error al utilizar un palabra resevada buscalo ajajaja eso es rariisimo
 */



      // String query1 = "DELETE FROM mensajes  WHERE id_mensajes = ?";
      // p = conexion.prepareStatement(query1); 
      // p.setString(1, deleteUdpate);

      

      // System.out.println(reustadoOne.getString("id_mensajes"));

    // String querryConsulta = "SELECT * FROM  mensajes  WHERE id_mensajes = ?";
    // p.conexion.prepareStatement(querryConsulta);
    // p.setString(1, querryConsulta);




       
    




      

      




            } catch (SQLException e) {
                System.out.println("errpr" +e);
        // TODO: handle exception
      }











    }
     public static void BorrarMensaje(int id_mensaje){    
      
      

       try {
        
        



       } catch (Exception e) {
        // TODO: handle exception
       }







     }

     public static void VerMensajes(String  numberA){
      conexion nConexion  = new conexion();


    

     System.out.println("funciona");


     try (Connection conexion  = nConexion.get_Connection()) {
        PreparedStatement p= null;




        System.out.println("funciona2");


        try {
                    int conversionOne = 0;
                try{
                     conversionOne = Integer.parseInt(numberA);

                } catch (NumberFormatException e) {
                     
                }

           if (conversionOne == 1) {

            
        String query = "SELECT * FROM mensajes WHERE mensaje IS NOT NULL AND autor IS NOT NULL";
        // String query1 = "SELECT * FROM mensajes WHERE  autor";
        // System.out.println("funciona 3");

        p = conexion.prepareStatement(query);
        // b = conexion.prepareStatement(query1);
        // p = conexion.prepareStatement(query1);

        ResultSet  procesandoO =  p.executeQuery();





                  while (procesandoO.next()) {

                    System.out.println(procesandoO.getString("mensaje")+"  autor "+ procesandoO.getString("autor"));
                    
                      
                    



                  }
                                    SvL.CxF();

                
        } else  if (conversionOne == 2){

          Scanner scanner = new Scanner(System.in);
          System.out.println("ingrese la fecha  y año '2000-01-01' en este formato  para poder mostrarle las coincidencias");
          String fechaOne = scanner.nextLine();
          System.out.println("su busqueda sera listada por defecto  digite 'enter' \n digite  '1' para filtrar resultados iguales \n digite '2'  para filtar resutaldos menores o iguales   ");
           String fechaListar = scanner.nextLine();




           switch (fechaListar) {
            case "1":
            String query =  "SELECT * FROM mensajes WHERE fecha_creacion = ?";
            PreparedStatement p1 = conexion.prepareStatement(query);
            p1.setString(1, fechaOne);
            ResultSet  reiN =  p1.executeQuery();


            // System.out.println(reiN != null);
            while (reiN.next()) {
            System.out.println(reiN.getString("fecha_creacion"));

            System.out.println(fechaListar);


          
         }
  SvL.CxF();

            break;


            case "2":

            String query2 =  "SELECT * FROM mensajes WHERE fecha_creacion <= ?";
            PreparedStatement p2 = conexion.prepareStatement(query2);
            p2.setString(1, fechaOne);
            ResultSet  reiN2 =  p2.executeQuery();


            // System.out.println(reiN != null);
            while (reiN2.next()) {
            System.out.println(reiN2.getString("fecha_creacion"));

            System.out.println(fechaListar);

           

         }
 SvL.CxF();

         break;





              
           
            default:
                break;

                
           }


              String query =  "SELECT * FROM mensajes WHERE fecha_creacion >= ?";
              PreparedStatement p1 = conexion.prepareStatement(query);
              p1.setString(1, fechaOne);
              ResultSet  reiN =  p1.executeQuery();


              // System.out.println(reiN != null);
              while (reiN.next()) {
              System.out.println(reiN.getString("fecha_creacion"));

              System.out.println(fechaListar);
              

           }
         
             
SvL.CxF();
    
        }else{
            
        }
      try {
        
        // String  query2 =  "SELECT * FROM mensajes ";
      } catch (Exception e) {
        // TODO: handle exception
      }








            
        // } 
        } catch (SQLException e) {
            System.out.println("eerirr"+e);

        }
    
    } catch (SQLException e) {
        
            System.out.println(e);
    }
     }

     








    }
    

