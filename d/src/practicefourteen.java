import java.util.Scanner;
import java.util.ArrayList;

public class practicefourteen{
     public static void main(String[] args){
///codigo resuelto



           Scanner prt = new Scanner(System.in);
             System.out.println("por favor ingrese  un numero entero positivo muchas gracias");
               String fgt = prt.nextLine();
                 int intValue = Integer.parseInt(fgt);

                  ArrayList<Integer> numero = new ArrayList<Integer>();
                    ArrayList<Integer> num1 = new ArrayList<Integer>();
                
                

                 for(int i  = 0;  i < intValue; i++){
                        numero.add(i + 1);
                 }
               
                  for(int num : numero){
                   
                      int process = num % 2;
                         
                    if ( process < 1) {
                        
                       }else{
                         num1.add(num);
                         
                       }

           
                        
                   }

                       System.out.println("los numeros impare son "+num1);











     }








}