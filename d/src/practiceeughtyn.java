import java.util.Scanner;
 ///futuro yo intentamos usar swicth pero fue un desastre horas perdidas muchas
 
 public class practiceeughtyn{
      public static void main(String[] args){

                       
     
             Scanner pregunta = new Scanner(System.in);

              System.out.println("por favor digite el pago anual de renta muchas gracias");

              String renta = pregunta.nextLine();
                 /// renta = renta.replaceAll("[^\\d$]","");
               int intValue = Integer.parseInt(renta);
                 
                

                     if( intValue <= 10000){
                         System.out.println("Menos de 10000 5%");
                            
                     }else if(intValue <= 20000){
                         System.out.println("Entre 10000€ y 20000 15%");
                     }else if( intValue <= 35000){
                         System.out.println("Entre 20000€ y 35000€ 20%");
                     }else if(intValue <= 60000){
                          System.out.println("Entre 35000€ y 60000 30%");

                     }else{
                         System.out.println("Más de 60000€ 45%");


                     }









                    }
















                     ///System.out.println(renta);
                ///int intValue = Integer.parseInt(renta);
                   
                         //switch (renta) {
                              ///case 0:
                                 ///  System.out.println("tu renta anual es menor a 10000 por  tienes 5% de imposicion");
                                //  break;
                              //case 1:
                                 ///System.out.println("tu renta actual anual esta  entre 10000 y 20000 tu imposicion  es del 15%");
                         
                              //default:
                                 //System.out.println("errorxd");
                             
                                // break;
                        // }
                       //  pregunta.close();

      }




 