 import java.util.Scanner;
 
 
 public class practicenineteen{
  
    public static void main(String[] main){
        double porcient = 0.4;
         double procien = 0.6;
         int ganancias = 2400;

      Scanner puntaje =  new Scanner(System.in);
      System.out.println("ingrese su puntaje de usuario");
       String  referencial = puntaje.nextLine();
           //referencial = referencial.replaceAll("[^\\d]","");
            double doubleValue  = Double.parseDouble(referencial);
            
                    if(doubleValue == 0.0){
                     System.out.println("usted tiene  un puntaje muy por lo tanto su paga sera cero");

                    }else if(doubleValue  == porcient){
                     double process =  doubleValue *  ganancias;
                       

                     System.out.println("tu puntaje referencial es aceoptable por lo tanto tu pago total sera" +process);

                    }else if(doubleValue ==  porcient){
                     int process =  (double) doubleValue * ganancias; 
                     System.out.println("tu puntaje referencial es aceoptable por lo tanto tu pago total sera" +process);


                    }else if(doubleValue > procien){
                        int process  = (double) doubleValue * ganancias;
         
                       System.out.println("tu puntaje referencial es muy buena  por lo tanto tu pago total sera" +process);
  

                    }else{
                     System.out.println("Estas loco hermano");
                    }


              




            

                        






















        
    }


















 }