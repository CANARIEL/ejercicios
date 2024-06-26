import java.util.Scanner;


//este mismo codigo fue hecho en el pasado pero quedo con errores  que podian causarse por  el usuario en este intenatre dejar el algoritmo mas robusto
 public class practicefiveteen{
      public static void main(String[] args){
                    
        double valor = 100;
         String  prolt1 =  "   ";
        String prolt2 = "   ";
         String prolt3 = "      " ;






            Scanner process = new Scanner(System.in);
             System.out.println("por favor ingrese sus cantidad a invertir, interes anual y los años " );
              String process1 = process.nextLine();
             process1 = process1.replaceAll("[^\\d$%]","  ");
              //System.out.println(process1);
                   
                 String[] procss   = process1.split(" \\s+" );
                
                 for(String por : procss){


                  if(procss.length >= 3){
                
               //porcss.contains("$") &&  porcss.contains("%"))
                        
                    String vl1 = procss[0].trim();
                    prolt1 = vl1;
                     
                    String vl2 = procss[1].trim();
                     prolt2 = vl2;
                    

                    String vl3 = procss[2].trim();
                     prolt3 = vl3;
                      System.out.println("estamos procesando su  informacion un momento por facvor.........");
                     }else{
                    System.out.println("error error no tenemos los valores requeridos vuelva intentarlo");
                   }
//System.out.println("eef  "+prolt1+" "+prolt2+" "+prolt3);
                 }


                 if(prolt1.contains("$") && prolt2.contains("%")){
                    prolt1 = prolt1.replaceAll("[^\\d]","");
                    prolt2 = prolt2.replaceAll("[^\\d]","");
                  
                  int intValue = Integer.parseInt(prolt1);
                  int intValue1 = Integer.parseInt(prolt2);
                   int intValue2 = Integer.parseInt(prolt3);
                    double pro = (int)  intValue1 * valor;
                     
                    int ultimo = (int) (intValue * pro *  intValue2);
                     System.out.println(ultimo);
 
              /// System.out.println(" "+intValue+" "+intValue1+" "+intValue2);

                 }else if(prolt2.contains("%") && prolt2.contains("$")){

                  int intValue = Integer.parseInt(prolt1);
                  int intValue1 = Integer.parseInt(prolt2);
                  int intValue2 = Integer.parseInt(prolt3);

                  double pro = (int)  intValue * valor;
                     
                  int ultimo = (int) (intValue1 * pro *  intValue2);
                   System.out.println(ultimo);

                 }else{
                  System.out.println("error xd");
                 }

                  }
 }

                   
























                    //vl1 = vl1.replaceAll("[^\\d]","");
                     ///vl2 = vl2.replaceAll("[^\\d]","");

                       //int intValue = Integer.parseInt(vl1);
                      // int intValue1 = Integer.parseInt(vl2);
                      // int intValue2 = Integer.parseInt(vl3);

                        
                        //double pr = (int)intValue1 * valor;
                         
                         //int ultimo = (int)( intValue * pr *  intValue2);
                          
                          /// System.out.println(ultimo);

                      
            

                  // }else if(porcss.contains("%") &&  porcss.contains("$")){

                    //String vl1 = procss[0].trim();
                     
                    //String vl2 = procss[1].trim();

                    //String vl3 = procss[2].trim();

                     //vl1 = vl1.replaceAll("[^\\d]","");
                     //vl2 = vl2.replaceAll("[^\\d]","");

                     //int intValue = Integer.parseInt(vl1);
                     //int intValue1 = Integer.parseInt(vl2);
                     //int intValue2 = Integer.parseInt(vl3);

                     //double pr = (int)intValue / valor;

                     //int ultimo =(int)  (intValue1 * pr  * intValue2);
                      //System.out.println(ultimo);


                  




           
                

                 // }else{
                   // System.out.println("el processo no es correcto por favor  ingrese los valores requeridos  ");
                  //}


             
                 
                  



  




                

                // String[] procee = process1.split("\\s+,");

                  //for(String proce : procee){
                        
                    //String va0 = procee[0].trim();


                     //if(proce.contains("$") &&  proce.contains("%")){
                        
                      //String va = procee[1].trim();
                      //String va1 = procee[2].trim();
                      //System.out.println(va0+" "+va+" "+va1 );

                     //}else if( proce.contains("%") && proce.contains("$")){

                      //String va = procee[1].trim();
                      //String va1 = procee[2].trim();
                      //System.out.println(va0+" "+va+" "+va1 );



                    // }else{
                      //System.out.println("error problema segundario xd");
                     //}

                    


                  //}
           
                                       
                
                       

                  


                  


                    
                        
                                    
                  
                            
                     
                 
                    






                                 
              
                               

                             
                                 
                            
                                 
                      


                    
                       
                     


                         

                    









        
 


