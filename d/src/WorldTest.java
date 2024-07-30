import java.util.Scanner;

public class WorldTest{
    public static void main(String[] args){

        // array[] = {1, "string", "2"};
         try {

            int contraseñaUsuario1 = 124567; 
            Scanner automatoBanco  =  new Scanner(System.in);
       

         int i = 0;
        while( i < 3 ){
            // System.out.println(listenBanco);
             System.out.println("escriba su contraseña banco banco su mejor en confianza");
             int listenBanco = automatoBanco.nextInt(); 
             if(listenBanco  ==  contraseñaUsuario1){
                System.out.println("Bienvenido a su banca ");
                 continue;
                 
            }else{
                i++;
                System.out.println(" vuelva intentar nuevamente recuerden que le quedan solo tiene 3 intentos" );
                 
                
            }

            if(i == 3){
                System.out.println("su cuenta fue  bloqueada");
            }
           

            
      
             }








              } catch (Exception  thread  ) {
                System.out.println("ingrese su contraseña  recuerde que banco banco solo usa digitos numericos");
              }
       



      
       



        
    }



}