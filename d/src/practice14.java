///Escribir un programa que almacene la cadena de caracteres contraseña en una variable, pregunte
//al usuario por la contraseña e imprima por pantalla si la contraseña introducida por 
///el usuario coincide con la guardada en la variable sin tener en cuenta mayúsculas y minúsculas.

import java.util.Scanner;
public class practice14{
    //terminado
   
      public static void main(String[] args) {
        Scanner passport = new Scanner(System.in);
         Scanner nuevamente1 =  new Scanner(System.in);


         System.out.println("ingrese su contraseña");
            String passportcomp = passport.nextLine();
                       String comprobacion = passportcomp;



                   
                System.out.println("vuelva ingresar su contraseña nuevamente por favor");
                 String p2d = nuevamente1.nextLine();

                    if(comprobacion == p2d){
                         System.out.println("muchas gracias bienvenido que tenga un excelente dia");

                    }else{
                    System.out.println("por favor digite la contraseña nuevamente");
                    }
        

      }
    }