import java.util.Scanner;

public class practiceprimo{
     public static void main(String[] args){

           Scanner process = new Scanner(System.in);
            System.out.println("ingrese un numero para verificar si es primo o no es");
             int pro = process.nextInt();


             int  resultado = pro % 1 ;
              int resultado1 = pro % pro;

               if(resultado < 1  &&  resultado1 < 1){

                    System.out.println("es un numero primo"+resultado1);
               }else{
                    System.out.println("no es un numero primo");
               }














        
     }












}