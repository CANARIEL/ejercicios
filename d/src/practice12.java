import java.util.Scanner;
public class practice12{

  //codigo terminado costo pero no es imposible :) futuro yo si se puede son las 11:10 del 5 junii del 2024  cambio y fuera
   
   
    public static void main(String[] args) {
        float valor1 = 0.00f; 
         int unidades1 = 0;      
 Scanner palabras = new  Scanner(System.in);
           System.out.println("buenas escriba el nombre y precio unitario de su producto y cuantos de estos lleva muchas gracias");
             String  entrada =  palabras.nextLine();
                 String[] newentrada = entrada.split(",");
               String word1 =  newentrada[0].trim();
                     
       
                        for(String enr : newentrada){
                             
                      
                         String  payu = newentrada[1].trim();
                          float floatValue = Float.parseFloat(payu);
                                  valor1 =  floatValue;
                        String  unidades = newentrada[2].trim();
                                    int intValue = Integer.parseInt(unidades);
                                         unidades1 = intValue;
                                            ///System.out.println(unidades1);

                       }
                        //System.out.println(word1+" "+valor1+""+unidades1);
                        float process = valor1 * (int)unidades1;
                          //System.out.println(process);
                       System.out.println("el nombre del producto" +word1+" es el precio unitario es "+valor1+"las unidades son "+unidades1+"el total a pagar es"+process);
                  }
                
                  }
