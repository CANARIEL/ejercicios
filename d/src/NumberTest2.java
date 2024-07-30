import java.util.*;

public class NumberTest2{



   public static  boolean ValidandoEntraUsuario(int  usuarioListen){


       return  usuarioListen <= 100 && usuarioListen >=1;

   

   }


     

    public static void main(String[] args){


   // Genera un número aleatorio entre 1 y 100. El usuario debe intentar adivinarlo. El programa le dirá si su
      //  número es mayor o menor que el número secreto. Continuará hasta que el usuario acierte.
         // System.out.println(numberUsuario);
      

         try {
          
         Scanner publicUs1 =  new Scanner(System.in);
         System.out.println("ingrese un numero del 1-100 ");
         int  usuarioListen = publicUs1.nextInt();

         // usuarioListen = 1;


         System.out.println(usuarioListen);
         Random numberT1 = new Random();
         
         // scanner.remove();
         // System.out.println("ingrese nuevamente un numero");
         //       usuarioListen  = publicUs1.nextInt();
            boolean  usuarioLei = ValidandoEntraUsuario(usuarioListen);
               System.out.println(usuarioLei);


          int  numbert2 = numberT1.nextInt(100);

          while(usuarioListen <=  numbert2 && usuarioLei == true){
            System.out.println("ingrese nuevamente un numero");
               usuarioListen  = publicUs1.nextInt();



         

            if(usuarioListen < numbert2  ){

               System.out.println("su numero es menor al del computador vuelva  intentar"+numbert2);
               // usuarioListen = 1;
               continue;

            }else if( usuarioListen > numbert2){
               System.out.println("su numero es   mayor al del computador "+numbert2);
               // usuarioListen = 1;
               continue;
               
            }else {
               System.out.println("su numero es igual al del computador por lo tanto acerto");
                break;
            }
          }

         } catch (Exception  thread) {
            System.out.println("recuerde que solo son numeros que debe ingresar del 1-100");
         }
         }
    }









// }