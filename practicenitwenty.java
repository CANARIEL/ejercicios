import java.util.Scanner;

 public class practicenitwenty{
      public static void main(String[] args){
          //funcionando :0  7 de junio  casi las 10 futuro yo somos mas rapidos jaajja

            Scanner usuario =  new Scanner(System.in);
              System.out.println("por favor digite su edad");
                String  escuchando = usuario.nextLine();
                  escuchando = escuchando.replaceAll("[^\\d]","");

                   int intValue = Integer.parseInt(escuchando);

                   if(intValue < 4){
                     System.out.println("usted no paga entrada  ingrese  ");
                   }else if( intValue <= 18   ){
                      
                        System.out.println("usted esta dentro del rango debe cancelar 5$");
                   
                   }else{
                    System.out.println("usted es mayor de edad debe cancelar 10$");
                   }














        
      }








 }