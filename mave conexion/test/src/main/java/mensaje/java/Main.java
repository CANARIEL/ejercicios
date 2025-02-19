package mensaje.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
            // conexion conexion = new conexion();
            // try {
            //      conexion.get_Connection();

            // } catch (Exception e) {
            //     // System.out.println("errpr");
            // }







 Scanner usuariosOne = new Scanner(System.in);
    
   int usuNu = 0;

  Main regresando = new  Main();
    do {
    System.out.println("Bienvendio a  nuestra app ");
    System.out.println("1.- escribir un mensajes ");
    System.out.println("2.- editar el mensaje ");
    System.out.println("3.-  eliminar el mensaje ");
    System.out.println("4.- ver  mensajes ");
    System.out.println("5.- salir del programa");
         usuNu = usuariosOne.nextInt();


        switch (usuNu) {
            case  1:
              mensajeservice.CrearMensajes();
            
                
                break;
            case 2:
              mensajeservice.EditarMensaje();
               break;

            case 3:

              mensajeservice.BorrarMensaje(0);
              break;
            case 4:

              mensajeservice.listarMensajes();
     
              break;
            
            
            default:
              System.out.println("no se a comprendido su respuesta ");
                  
                break;
        }

    } while (usuNu != 5);
    System.out.println("Gracias vuelve pronto");
 
  }
    }




/*
 * encontrar el erro es parte del proceso ajajaja busca en la carpeta madre donde guardaste el archivo ajaj
 * 
 */