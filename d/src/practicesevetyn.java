import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;
 
 public class practicesevetyn{
    //terminado ajjaja


       
    public static void main(String[] args){
    
        ArrayList<Integer> numeros = new ArrayList<Integer>();



        Scanner  numero = new Scanner(System.in);
        System.out.println("escriba un numero por favor");
         int numer = numero.nextInt();
         
         

         for(int i = 1; i <=  numer; i++ ){
           for(int a = 0; a < numer; a++ ){
            numeros.add(a+1);   System.out.println(" **"+numeros);
             
           
           }
       


         }


     

            
               

        
    }
}
 









 