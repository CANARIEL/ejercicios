import   java.util.Scanner;

//dos cosas tenemos una version facil y un rapida optimixaremos desde aqui hace sueño 
 public class practicesixteen{
         public static void main(String[] args){
      int edad = 16;
      int ingresos = 1000;

        Scanner tribu = new Scanner(System.in);
              //System.out.println("recuerde usar valor numericos");
         System.out.println("buenas por favor digite su edad  y su ingreso mensual");
             String tributos = tribu.nextLine();
         tributos = tributos.replaceAll("[^\\d,]","");
           String[] compro = tributos.split(",");
                  
      
           

                 String valor = compro[0].trim();
                   int intvalue0 = Integer.parseInt(valor);
                   String valor1 = compro[1].trim();
                     int intvalue1 = Integer.parseInt(valor1);

                      if(intvalue0 == edad && intvalue1 == ingresos){
                          System.out.println("deberas pagar impuestos ya que estas adpto para poder hacerlo muchas gracias");
                      }else{
                        System.out.println("por el momento no debes pagar impuesto muchas gracias");
                      }
                  
          
                 }
        
     }



 