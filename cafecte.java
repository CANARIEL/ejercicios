               
import java.util.Scanner;
// import java.util.Dictionary;
import java.util.LinkedHashMap;
import java.util.Map;

public class cafecte{

///prueba de merger

     public static void VerificarCualEsElPedidoDelClientemap(LinkedHashMap<String,Double> menuCafeteria, String listenCafe){

                    //  return "hey este es un test" +listenCafe;

                     if(menuCafeteria.containsKey(listenCafe)){
                         double process =  menuCafeteria.get(listenCafe)+ 0.15;
                         System.out.println("su pedido es  "+listenCafe+"su valor total a pagar es "+process);
                     }else{
                         System.out.println("este  producto no se encuentra disponible muchas gracias");
                     }
               }

     public static void main(String[] args){

                          
          // try{
        
        LinkedHashMap<String, Double> menuCafeteria = new LinkedHashMap<>();

                    String productoUno = "capuchino";
                     Double precioProducto = 1.50;

                     String productoDos = "batido";
                     Double precioProductoDos = 2.00;

                     String productoTres = "miklkey";
                     Double precioProductoTres = 2.70;

         menuCafeteria.put(productoUno,precioProducto );
         menuCafeteria.put(productoDos, precioProductoDos);
         menuCafeteria.put(productoTres,precioProductoTres );

                        
       
         Scanner listeningCoffe =  new Scanner(System.in);
         System.out.println("hey como estas a continucion a parecera  nuestro muchas gracias ");
         System.out.println(menuCafeteria);
         String listenCafe = listeningCoffe.nextLine();
       
          listenCafe = listenCafe.replaceAll("[0-9]","");
         
          




       VerificarCualEsElPedidoDelClientemap(menuCafeteria, listenCafe );

          // }catch(Ex){

          // }
         

          // System.out.println(VerificarCualEsElPedidoDelClientemap);
     }

     
} 
         
       







         

          
          




           





     //  if(listenCafe.equals(menuCafeteria)){
     //      System.out.println("xdxd");
     //  }else{
     //      System.out.println("la luanes acuadrada");
     //  }










     

        
     //    System.out.println(map);




// }