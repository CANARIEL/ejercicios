import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;



public class PruebaBurbuja{


    //  public static  verificamosx
    public static void main(String[] args){
        // System.out.println("esto vale");
        ArrayList<Integer>  orden  = new ArrayList<>();
        ArrayList<Integer>  orden1  = new ArrayList<>();
        
        int indiceTern = 1;
//algortimo de burbujas como funcionan  ets funciona de comparando el primer elemento con el segundo  si el primero es mayor  cambios de lugares  
//para que la condicion sea  verdadera
   

///futuro yo encontramos una forma de cmabiar indices esto nos ayudara full 

// es  5 de agosto si tardamos demas pero hoy hemos comprendido ciclo anidados no allinado sjajajajja :) pero  bueno hasta ahora  nuestro codigo tira
// un input  [1, 3, 6, 7, 13, 2, 6, 3]  falta poco dice la ia :)
//en este codigo hay multiples intentos  en muchos casi lo logramos pero terminamos  aprendiendo del internte con el metodo ocllections

           
               orden.add(1); 
               orden.add(6);
               orden.add(3); 
               orden.add(7); 
               orden.add(19);
               orden.add(13);
               orden.add(2);  
               orden.add(6);     
               orden.add(3);


               int n = orden.size();
    
                    
            // explicare este codigo para mi futuro yo hasta ahora hemos hecho muchos tipos de intentos pasaron 3 dias y estuvimos muy cerca  pero terminamsos usando la ia
             for (int i = 0; i < n - 1; i++) {///en este recorremos  cuantos inidces tiene  arraylist   que por el -1  analizemos  i = 0  i menor que n o numero esto tiene el valor de; array
                // el menos 1  lo usamos para que no se pueda acceder a inidces invalidos

                for (int j = 0; j < n -i - 1; j++) {  //en este caso tenemos  nuestro segundo array  que es quien recieb el valor de los array y comparamos el -i  es aquel que nos ayuda a no 
                    //comparar con valor que se encuentran en su lugar y el - 1 sigue cumpliendo  el mimso proposito
                    System.out.println(orden.get(j));


                    if (orden.get(j) > orden.get(j+1)) { //cpmparamos los valores si de das cuentas  comparamos las dos j pero por que  estas son las recorren os valores  pero agregamos el +1
                        // para poder  comparar valor   ya que si comparariasmos el mismo valor
                        Collections.swap(orden, j, j+1); //este nos ayuda a intercambiar valores  el valor j a j +1 que cumple su misma funcion  
                    }



                    
                }
               

    //             for (int j = 0; j < orden.size() -1; j++) {

    //                 if(orden.get(j) <  orden.get(j+1)){
    //                     orden.add(orden.get(j));

    //                 }else{
    //                     Collections.swap(orden, j, j+1);
    //                 }



                    
    //             }


    //  System.out.println(orden);




               
             }
























                // do {


            //  for (int i = 0; i <= orden.size() ; i++) {
            //     for(int ii = 0; ii < orden.size()-1; i++){


            //     if (orden.get(0) < orden.get(1)){
            //         System.out.println(orden.get(0));
            //         orden1.add(orden.get(0));  
            //         orden.remove(0);
            //         continue;
                    
            //     } else {
            //     int tempC = orden.get(0); // s
            //     orden.set(0, orden.get(1));
            //     orden.set(1, tempC);
            //     continue;
            //     }  
              
            //  }
            // }  
    
               
            // System.out.println(orden1);
            // System.out.println(orden);
            //  do{

            //  for(int v = 0; v < orden1.size();  v++){
            //     System.out.println("esto funciona");

            //     orden.clear();
            //      if(orden1.get(0) < orden1.get(1)){
            //         System.out.println("esto funciona");

            //         orden.add(orden1.get(0));
            //         orden1.remove(0);
            //         continue;

            //      }else{
            //         System.out.println("esto funciona11");


            //         int tempFinaly =  orden.get(0);
            //         orden.set(0, orden.get(1));
            //         orden.set(1, tempFinaly);
            //         continue;

            //      }
    
            //     }while (true);





            // }

            
        }
    }


        

            


                    
                // } while (!(false));
                // System.out.println("hey mundo");


            
        
    
            
      


            
        











                     

         
                 


             

            // }



          



        
         








                // }
            
                             
             

            

      

            

           
            //    }

           
            //     }
            // }

            // }
            // }
        //   }






















            // for(int i = 0; i < orden.size() -1; i++){
            //     for(int ii = 0; ii < orden.size() -i  -1;  ii++){
                    
            //         System.out.println(orden.get(i)+" "+orden.get(ii));
                   

            //         // if (orden.get(i) <  orden.) {
                        
            //         // }
                    








            //     }


            //     // System.out.println(orden.get(i));
             

            // }
       

           
            
        // }
           
    // }
        // }
       

    //   }


    //  }

// System.out.println(orden1);


















// }