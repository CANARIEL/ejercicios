package mensaje.java;

import java.util.Scanner;

public class mensajeservice {



    public static void  CrearMensajes(){
        Scanner neAPP  = new Scanner(System.in);
        System.out.println("Escriba su mensaje");
        String userOne = neAPP.nextLine();


        System.out.println("escriba el nombre del autor");
      
        // System.out.println(autorN+"xdxd");
        mensaje registro = new mensaje();
        String autorN =  neAPP.nextLine();
        registro.setMensajes(userOne);
        registro.setAutor(autorN);
        // System.out.println(registro.getAutor());
        Mensajedb.CrearMensajes(registro);





    }
    
    public static void listarMensajes(){
        Scanner neAPP  = new Scanner(System.in);
        System.out.println("el numero de referencia del mensaje que desea ver o digite \n .-1 ver todos los mensajes \n  .-2 listar  por fecha  \n debe tener el numero de id para poder filtrar  sus datos " );
        String numberA = neAPP.nextLine(); 

        switch (numberA) {
            case "1":
                    System.out.println("usted a selecionado ver todos los mensajes");
                       Mensajedb.VerMensajes(numberA);
                break;
            
            case "2":
                    System.out.println("Usted a selecionado listar por fecha ");
                    // String numberTime = neAPP.nextLine();
                        Mensajedb.VerMensajes( numberA);



                break;


            default:
                break;
        }

    }

    public static void  EditarMensaje(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("usted a selecionado editar mensajes digite su nombre de usuario se le mostraran sus mensajes");
        String namePost = scanner.nextLine();
            Mensajedb.EditarMensaje(namePost);












        

    }


    public static void BorrarMensaje(int id_mensaje){

          
    }

    public static void VerMensajes(int id_mensaje){





            


    }
}
