import java.util.ArrayList;
import java.util.Scanner;




public class CajeroAutom extends  Producto {


      

public CajeroAutom(String id, Double pay){
       super(id, pay);
}



//  }


public static  void CajeroAutom1(){
    Producto producto =  new Producto(null, null, 0);
    producto.AddProduct();


    Scanner  scanner = new Scanner(System.in);
    System.out.println("bienvenido al cajero automatico recuerda que soy una ia  se claro \n"+"  a continuacion se te  mostrara  los productos disponibles");
      
    
     Producto.DatosCompartir(producto);




    
}


}


    
     
       


      

     



