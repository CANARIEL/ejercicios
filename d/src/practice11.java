import java.util.Scanner;
//condicionales ejercicio 1 


public class practice11{
    public static void main(String[] args){
        //codigo terminado  la meta del dia es terminar como minino 10 ejercicios es  6 de junio del 2024

          Scanner produces = new Scanner(System.in);
 
              System.out.println("buenas por favor digite  su edad para poder saber si es mayor de edad o menor muchas gracias ");
                       String  edad = produces.nextLine();
                        edad = edad.replaceAll("[^\\d]","");

                            int intValue = Integer.parseInt(edad);


                            if(intValue >= 18){
                                System.out.println("eres mayor de edad recuerda la vida es un viaje vive tanto como puedad pero deja huella y experiencia la anecdota es mejor que todo");
                            }else{
                                System.out.println("no eres mayor de edad pero un dia lo seras ");
                            }

                              

            



                   }




    }
        
   // }

