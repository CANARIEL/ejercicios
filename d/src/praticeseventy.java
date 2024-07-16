import java.util.Scanner;
//aveces hay que descansar como  hoy 7 de 10 regresaremos pronto
//codigo funciona  pero el problema dado era confunso y tenia muchos problemas

public class praticeseventy{
    public  static void main(String[] args){

          String[] grupoA = {"a","b","c","d","e","f","g","h","i","j","k","l","m"};
           String[] grupob = {"ñ","n","o","p","q","r","s","t","u","v","w","x","y","z"};
             String f = "feminino";
            String m = "masculino";
             
              Scanner verif = new Scanner(System.in);
         System.out.println("escriba su genero y su nombre muchas gracias en base a esto se le asiganara un grupo");
                 String  palabras = verif.nextLine();

                   String[] veri = palabras.split(",");

                     String pal1 = veri[0].trim();
                     String pal2 =  veri[1].trim();

                      
              if(pal2.contains(f) || pal2.contains(m)){

                 System.out.println("por favor recuerde  primero su  genero y despues su nombre vuelva  a intentar ");

              }else if(pal1.contains(f)){
                System.out.println("usted es  f en proceso");
                  
              }else{
                System.out.println("usted es m en proceso");
              }
                      
                         
               String character = pal2.substring(0, 1);
                                 
                 

                     for(String grui : grupoA){
                          for(String gru : grupob){

                              if(character.contains(grui)){

                                 System.out.println("usted pertenece al grupoA");
                                        break;
                              }else if(character.contains(gru)){
                                        System.out.println("usted pertence al grupoB");
                                          break;
                              }




                          }





                     }

                        
                          
                         }


                     }

                 







        
   




//}