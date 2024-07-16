import java.util.Scanner;
import java.util.ArrayList;

///futuro yo no sabes cuantas horas me tomo este codigo pero asi se aprende i remember discipline 
//hoy 19 de june este codigo tiene  errores jajaa  los resolveremos ponte bloqueador :)
// es 15 julio te olvidaste de  dejar comentarios ahhhh

public class  stwichslepp{
    public static void main(String[] args){
ArrayList<Integer> numeritos = new ArrayList<>();

   Scanner process = new Scanner(System.in);
   System.out.println("escriba los numeros  de la loteria por favor");
   String number  = process.nextLine();


   number = number.replaceAll("[^\\d,]","");

   String[] yt = number.split(",");

     
   for(String y : yt){

    int intValue = Integer.parseInt(y);
     numeritos.add(intValue);
     }
   

if(numeritos.get(0)   >    numeritos.get(1)){
  System.out.println(numeritos.get(0));
}else if(numeritos.get(1)    >= numeritos.get(0) ){
  System.out.println(numeritos.get(1));
}else{
  System.out.println("error primer valor fuera erorr");
}


    if(numeritos.get(1) > numeritos.get(2)){
      System.out.println(numeritos.get(2));
        }else if(numeritos.get(2)   >= numeritos.get(1)){
          System.out.println(numeritos.get(2));
        }else{
          System.out.println("error");
        }

             
        if(numeritos.get(2) >  numeritos.get(3)){

          System.out.println(numeritos.get(2));
        }else if(numeritos.get(3)  >=  numeritos.get(2)){
           System.out.println(numeritos.get(3));

        }else{
          System.out.println("error");

        }

        if(numeritos.get(3) >  numeritos.get(4)){
          System.out.println(numeritos.get(3));
        }else if(numeritos.get(4 ) >= numeritos.get(3)){
          System.out.println(numeritos.get(4));
        }else{
          System.out.println("error");
        }


         if(numeritos.get(4) >  numeritos.get(5)){
             System.out.println(numeritos.get(4));
         }else if(numeritos.get(5) >= numeritos.get(4)){
               System.out.println(numeritos.get(5));
         }else{
          System.out.println("xd");
         }

          }


    }

    


    







        

   

           
                                  
          

         
    
    
            


    //if(pro.length()  <= 6){

            //String c4 = proce[0].trim();
              //int intValue = Integer.parseInt(c4);
            //String c1 = proce[1].trim();
             //int intvr = Integer.parseInt(c1);
                
            //String c2 = proce[2].trim();
            //nt intv31 = Integer.parseInt(c1);

            //String c0 = proce[3].trim();
            //int intv4 = Integer.parseInt(c1);

           // String c11 = proce[4].trim();
            //int intv3 = Integer.parseInt(c1);

            //String c12 = proce[5].trim();
            //nt intv2 = Integer.parseInt(c1);

         // }else{
           // System.out.println("recuerde que  son 6 numeros ganadores de la loteria");
          //}

        
          
        
             



  
    

      
   


     


      


    








      

 
     




     

       




 

      

    

           
                 
  
     
                

        





   

