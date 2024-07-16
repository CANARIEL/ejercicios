    import java.util.Scanner;
    import java.util.ArrayList;


    public class processf{
        public static void main(String[] args){
          //fututro yo despues de tanti encontramos un camino donde podemos manejar las expeciones de una forma mejor y si pero casi en el final nos encontrmao con un problemita 
          // futuro yo   este codigo paso de como 100 lineas  ala mitad y funcionando  y controlado expeciones bueno eos falta mas es 1 julio 8:38
          // imtetamos dejarlo robusto como debe de ser
          // es 2 de julio aqui andamos este codigo pasara al arhcivo proyecto y seguiremos futuro hoy  hemos logrado esto espero y regreses no te rindas por favor
          // recuerda  constacia es la cable no te RINDAS ACTIVA EL MODO NOMADA
        ArrayList<String>  pal = new ArrayList<>();
        ArrayList<Integer> numeritos = new ArrayList<>();
        try{

            

        double need = 100.0;


         Scanner pro = new Scanner(System.in);
            System.out.println("buenas  por favor  escriba una cantidad  a invertir los años  y   el interes anual" );
            String escuchando  = pro.nextLine();  
            escuchando = escuchando.replaceAll("[^\\d$%\\s+]","");

          
          String ee[] = escuchando.split("\\s+");

        for(String e : ee){
        // System.out.println(e);
          pal.add(e);


        }

      pal.remove(0);


      if(pal.size() >= 3 &&  pal.get(0).contains("$") &&  pal.get(2).contains("%")){
        String ultimo = pal.get(0).replaceAll("[^\\d]","");  
        String ultimo1 = pal.get(2).replaceAll("[^\\d]","");
        pal.set(2, ultimo1);
          pal.set(0, ultimo);
      
      System.out.println("estamos procesando sus  valores  un momento por favor :)");

      }else{
      System.out.println(" error recuerde  ingresar los valores requeridos");

      }


      
    }catch(IndexOutOfBoundsException e){
      System.out.println("recuerde poner   solo los datos requerido muchas gracias vuelva intentar");
    }
      
        try{
    for(String p : pal){
      
          numeritos.add(Integer.parseInt(p));
      
        }
      
        double process = numeritos.get(1) / 100.0;
      
        int pproces = (int) (numeritos.get(0) *  process  *  numeritos.get(2));
        System.out.println("usted su ganancia sera de" +pproces);
      }catch(IndexOutOfBoundsException e){
    System.out.println("recuerde ingresar valores numericos ");
    }
                      }

              
    }


                
            


      
      

         

    
          

        











      



          

        





        



        // for(int i = 0; i < escuchando.length(); i++){
        //      if(escuchando.length() >= 3){
        //         String v1 =  escuchando.trim();
        //         System.out.println("si se pudp"+v1);
        //      }else{
        //         System.out.println("ssss");
        //      }
        // }

        // hemos vuelto al paso  este si nos costo en el pasado pero
        // ahora conocemos mas concetpos pero no sigue costando por recomendacion del sensei hemos  aprendido que el codigo debe verse  limpio




















        //  int tex  = escuchando.indexOf("$");
        //  int tex2 = escuchando.indexOf("%");

        //  System.out.println("busqeda " +tex+ " ddd"+tex2);

        //  String extreacio = escuchando.substring(tex);
        //  String eee = escuchando.substring(tex2);

        //  System.out.println(extreacio);
        //  System.out.println(eee);
           
    
   
        













       
               
        // for(String escuc: escuchando){
        //   String []process = pr.split("  ");
        // if(pr.length() >=  3){
        //     String vl = pr.trim();
        //     String vl1 = pr.trim();
        //     String vl2 = pr.trim();
        //     System.out.println(" "+vl+" "+vl1+" "+vl2);

        // }else{
        //     System.out.println("relajado");
        // }
        // }

            








       

      
       





    

       



      

              
        

        





    





        
    
// }