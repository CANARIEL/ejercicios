package test;


import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class  servidorOne9 {

    public static void main(String[] args) throws IOException{
            // Conexion conexion = new Conexion();
            // conexion.getConnection();



    HttpServer server = HttpServer.create(new InetSocketAddress(9001), 0);

    server.createContext("/datos", new ServerTwos());
    server.createContext("/mensaje", new ServerTwos());

    server.setExecutor(null);
    server.start();


    server.createContext("/" , new HttpHandler() {
        public void  handle(HttpExchange exchange) throws IOException{

            String filePath = "prueba11.html" + exchange.getRequestURI().getPath();
            File file = new File(filePath);

           if (file.exists() && !file.isDirectory()) {
            byte[] response = Files.readAllBytes(file.toPath());
            exchange.sendResponseHeaders(200, response.length);
                    OutputStream os = exchange.getResponseBody();
                    os.write(response);
                    os.close();
                } else {
                    exchange.sendResponseHeaders(404, -1);
                    System.out.println("xddd");
                }
           }
        // }
        


    });
    System.out.println("xdxdhhee");

    } 


    static class ServerTwos implements  HttpHandler {

    public void  handle(HttpExchange exchange) throws IOException{






        System.out.println("ya tu madre esto funciona");
       Conexion conexion = new Conexion();
        switch (exchange.getRequestMethod()) {
        
            case "GET":
                
                System.out.println("xxxdxdxd");
               

                  conexion.ListenGet();
                break;

            case "PUT":

                String buscandoID = exchange.getRequestURI().getPath();
                Pattern pattern = Pattern.compile("\\d+");
                Matcher matcher = pattern.matcher(buscandoID);
                
                String  number = "0";
                while (matcher.find()) {
                      number  = matcher.group();
                    System.out.println(number);
                }



                InputStream  inputStream = exchange.getRequestBody();
                String dataConvert = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);


    
                    String unificando =  dataConvert;
                        System.out.println("xdxd");
                    conexion.ListenPut(unificando, number);
                
               break;
        
            default:
            System.out.println("i do not ");
                break;
        }

        }
    }
}
