import java.util.ArrayList;
import java.util.Scanner;


public  class Cajero extends Producto{


 



public Cajero(String id, Double pay){
           super(id, pay);
}

  

     


    static void CajeroSaluda(){
        Scanner Hey = new Scanner(System.in);
        System.out.println("bienvenido a nuestra tienda  ");
    }


    


   public  void CajeroVerification(){
    
      boolean talkUser = false;
      Scanner verificandoOne =  new Scanner(System.in);
      System.out.println("Estimado usuario desea un cajero manual o electronico \n");
      System.out.println("Digite 1 manual \n"+"Digite 2 electronico \n"+" 0 Salir");

      int processOne = verificandoOne.nextInt();
      
      Producto producto =  new Producto(null, null, 0);
      producto.AddProduct();





        do{
        switch (processOne) {

        case 1:
        System.out.println("usted a elegido cajero manual sera redirrecionado recuerde que tenemos varios metodos de pago");
        talkUser = true;
        System.out.println("Bienvenido al cajero manual \n"+"Es un gusto atenderle esto son nuestros productos disponible" );
    
        Producto.DatosCompartir(producto);
        break;
        case 2:
        System.out.println("usted a elegido cajero electronico sera redirrecionado recuerde que tenemos varios metodos de pago ");
        talkUser = true;
        CajeroAutom.CajeroAutom1();

          break;
      
        case 0:
          System.out.println("usted a elegido salir muchas gracias por visitarnos \n"+"RECUERDA QUE  NUESTRO CAJERO  VIRTUAL ESTA ABIERTO 24/7");
          talkUser = true;

            break;    
        default:
          System.out.println("No he entendido  o no escrito nada por favor  vuelva  intentar ");

          continue;
       }
 } while (!talkUser);




  }









}

    





    
  
  // }
