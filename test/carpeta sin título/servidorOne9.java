import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class  servidorOne9 {



    // class conexion{
         


     final static  void   conexion(){
    

        // System.out.println("xdxd");
 Connection  conection = null;

            try {
                

                conection  = DriverManager.getConnection("jdbc:mysql://localhost:3307/inicio", "Ariel mendoza", "1234567xd");


                if (conection != null) {
                    System.out.println("camino bien");
                    
                }
            } catch (SQLException e) {
                System.out.println("error" +e.getMessage());
            }


        }
        



    // }

    public static void main(String[] args) throws IOException{
    
        servidorOne9 servidorOne9 = new servidorOne9();
        servidorOne9.conexion();


    HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

    server.createContext("/datos", new ServerTwos());

    server.setExecutor(null);
    server.start();




    } 

    static class ServerTwos implements  HttpHandler {

    public void  handle(HttpExchange exchange) throws IOException{


        switch (exchange.getRequestMethod()) {
            case "GET":

            System.out.println("heyy esto funcionaaa");
            String respuesta =  "funciona";
            exchange.sendResponseHeaders(200,  respuesta.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(respuesta.getBytes());
            os.close();
            
                break;
            case "POST":

            

                 break;
            case  "PUT":

                 break;
            case  "DELETE":

                break;
            default:
             System.out.println("la vida es una  loqcura pro");
                break;
        }


    }



    }
    
}
