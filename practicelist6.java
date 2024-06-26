import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.ZoneId;
//futuro yo  hoy is 20 de june o en english   future i today  is 20 june rigth  now  ,  encontramos forms de hacer este code but  we queremos hacerlo de una forma mas rapida y no tan redudante  
// si algun dia leess esto de vuelta   y estas caminado sobre nuestras pisadas recuerda todo es un proceso :) toma agua y ponte bloqueador 

//el primer metodo nos tira un errir de locos 
//futuro yo se que a sido un camino duro hasta hoy pero creeme todo valdra la pena ayer fue un dia increible
public class practicelist6{

       private static  boolean p;
       private static boolean pI;
       private static boolean pII;
       private static boolean pIII;
        
     public static void main(String[] args){

      boolean p1;
  
        ArrayList<String> palabritas = new ArrayList();

            palabritas.add("matematicas");//0 
            palabritas.add("lenguaje");   //1
            palabritas.add("fundamentos"); //2
            palabritas.add("fonetica");   //3
            palabritas.add("fisica avanzada");  //4
            palabritas.add("programacion"); //5


          ArrayList<String>  materias  = new ArrayList<>();

           materias.add("matematicas"); //0
           materias.add("lenguaje");  //1
           materias.add("fundamentos");  //2
           materias.add("fonetica");   //3
           materias.add("fisica avanzada");  //4
           materias.add("programacion");  //5




     try{
    for(int i  = 0; i <  palabritas.size(); i++){
      Scanner escuchando  =  new Scanner(System.in);
       System.out.println("que nota usted obtuvo la  materia  de "+materias.get(0));

 String  nota1 = escuchando.nextLine();


               int intVal = Integer.parseInt(nota1);

                  if(intVal == 10 ||  intVal == 9 ||  intVal == 8 || intVal == 7 ){
                    p  = true;
                    palabritas.remove(0);
                    System.out.println(palabritas);

                  }else{
                     p = false;
                     System.out.println(palabritas);

                  }


                   System.out.println(" que nota usted obtuvo en la materia de " +materias.get(1));
                                         String nota2 = escuchando.nextLine();
                                          int intval1 = Integer.parseInt(nota2);
                                      
                             
                          if ((p == true) && (intval1 ==  10 ||  intval1 == 9 ||  intVal == 8 || intVal == 7)) {
                            pI = true;
                            palabritas.remove(0);
                            System.out.println(palabritas);

                            
                          }else if((p ==false ) && (intval1 == 10 || intval1 == 9 || intval1 == 8 || intval1 ==7 )){
                            pI = false;
                            palabritas.remove(1);
                            System.out.println("segumiento de problema "+palabritas);


                          }else{
                          System.out.println("segumiento de eror linea  75 "+palabritas);
                          }
                              
                               
                        System.out.println(" que nota  obtuvo  en la   materia  de "+materias.get(2));
                        String  nota3 = escuchando.nextLine();
                         int intVal2 = Integer.parseInt(nota3);
                         //System.out.println("linea 82 "+palabritas);
                          
                         if((pI ==true) && (intVal2 == 10 ||  intVal2 == 9 || intVal2 == 8 || intVal2 == 7)){

                          pII = true;
                          palabritas.remove(0);
                          System.out.println("linea 87"+palabritas);

                         


                         }else if((p ==false) && (intVal2 == 10  || intVal2 == 9 || intVal2 == 8 || intVal2 == 7)){
                          pII = false;
                            palabritas.remove(1);
                            System.out.println("linea 95"+palabritas);

                         }else{

                         }
                              
                            


                        System.out.println("que nota  obtuvo en la materia de  "+materias.get(3));
                        String nota4 = escuchando.nextLine();
                        int intVal3 = Integer.parseInt(nota4);


                        if((pII == true )&& ( intVal3 == 10  || intVal3 == 9 || intVal3 == 8 ||  intVal3 == 7)){
                          pIII = true;
                          palabritas.remove(0);
                          System.out.println("seguimiento de errores nos encontramos en  linea 112  en 3 (0)"+palabritas);



                        }else if((pII == false ) && (intVal3 == 10 ||  intVal3 == 9 ||  intVal3 == 8 || intVal3 == 7)){
                          pIII = false;
                           palabritas.remove(1);
                           System.out.println("seguimiento de  errorees no encontramos en  3 (1)"+palabritas);

                        }else{

                        }

                           
                        System.out.println("que nota usted obtuvo en la materia de " +materias.get(4));
                            String nota5 = escuchando.nextLine();
                            int intVal4 = Integer.parseInt(nota5);


                             if((pIII == true) && ( intVal4 == 10 || intVal4 == 9 || intVal4 == 8 || intVal4 == 7)){
                              palabritas.remove(0);


                             }else if ((pIII == false) && (intVal4 == 10 || intVal4 == 9 || intVal4 == 8 || intVal4 == 7)){
                              palabritas.remove(1);

                             }else{

                             }

                    
                           
                          

}
                     
  
                                
                         





System.out.println(palabritas);

                           // }


                    
     }catch(NumberFormatException e){
        System.out.println("recuerde ingrese solo numeros vuelva a intentarlo muchas  gracias");
     }
       
    }
  }
                  











             //boolean pro;
                        
                 
                        
                        //if(intVal ==  10 ||   intVal == 7  ||  intVal == 8 || intVal ==9){
                         //pro = true;
                          //palabritas.remove("matematicas");

                          //System.out.println(palabritas);
                          ///System.out.println(0);
                        
                        //}else{
                         //pro = false;
                        //System.out.println(palabritas);
                        //System.out.println("la luna es  0");

                            
                          //}
                        
            
         
                          //boolean pro1;
                        
                        //if( pro = true && intaa == 10 ){
                         //pro1 = true;
                           // palabritas.remove("lengua");
                            //System.out.println(palabritas);
                            //System.out.println(1);

                        
                        //}else if( pro = false  &&  intaa == 10){
                        //pro1 = false;

                          //palabritas.remove(1);
                           //System.out.println(palabritas);
                           //System.out.println(1);

                        
                        //}else{
                            //System.out.println(palabritas);
                            ///System.out.println(1);

                        //}



                    
          
           


   
                        //boolean pro2;
                                                                       
                            //if(pro1 = true &&  intaa2 == 10 ){
                              //pro2 = true;
                               //palabritas.remove(0);
                                 //System.out.println(palabritas); 
                                   //System.out.println(2); 
                            
                            //}else if(pro1 = false &&  intaa2 == 10){
                               //pro2 = false;
                               //palabritas.remove(1);
                               //System.out.println(palabritas);
                               //System.out.println(2);

                            //}else{
                              //System.out.println(palabritas);
                              //System.out.print(2);
                           ///}


                

               
                               // boolean pro3;

                             //if(pro2 = true  &&  intaa3 == 10){
                              //pro3 = true;
                              //palabritas.remove(0);
                              //System.out.println(palabritas);
                              ///System.out.println(3);
                             //}else if(pro2 = false &&  intaa3 == 10){
                              //pro3 = false;
                             //palabritas.remove(1);
                             //System.out.println(palabritas);
                             //System.out.println(3);


                                  
                             //}else{
                             // System.out.println(palabritas);
                              //System.out.println(3);
                            //

                             //if(pro3 = true &&  intaa4 == 10){
                               //palabritas.remove(0);
                               //System.out.println(palabritas);
                               //System.out.println(4);
                            

                             //}else if(pro3 = false &&  intaa4 == 10){
                               //palabritas.remove(1);
                               //System.out.println(palabritas);
                               //System.out.println(4);

                             //}else{
                              //System.out.println(palabritas);
                              //System.out.println(4);

                             //}
                      



                   
    


     



          
       









    


