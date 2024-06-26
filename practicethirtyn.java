import java.util.Scanner;


public class practicethirtyn{
      public static void main(String[] args){
      //codigo terminado :)
             
            Scanner enteros =  new Scanner(System.in);

            System.out.println("buenas por favor digite dos numeros  muchas gracias");

String productos =  enteros.nextLine();
 
    String[]  divisores = productos.split(",");
            String div1  = divisores[0].trim();
              String div2 = divisores[1].trim();

               int intvalue0 = Integer.parseInt(div1);
                 int intvalue1 = Integer.parseInt(div2);

                   if(intvalue1 < 1){

                        System.out.println("no es posible dividir para cero vuelve a intentarlo");
                   }else{

                     System.out.println("estamos procesando su informacion ");


                   }
                        int process =  intvalue0 / intvalue1;
                           if(process < 1){
                               
                              float po1 = (float)intvalue0 / (float)intvalue1;
                                       System.out.println(po1);
                             

                           }else{
                               float xd = intvalue0 / intvalue1; 
                          
                             

                           }
                     

      
        
      }

}