import java.util.Scanner;
import java.util.ArrayList;

public class money{
    public static void main(String[] args){

    //     ArrayList<Character> palabritas = new ArrayList<>();
     ArrayList<Character> vocalesCharacters = new ArrayList<>();

    vocalesCharacters.add('a'); vocalesCharacters.add('e');  vocalesCharacters.add('i');   vocalesCharacters.add('o');  vocalesCharacters.add('u');

         
        
        int contador0 = 0;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;



         Scanner pla  = new Scanner(System.in);
         System.out.println("hey que tal como les va que viva la patria");
         String nef = pla.next();




        for(int i = 0;  i < nef.length();  i++){
              char pr =  nef.charAt(i);
            if(pr == vocalesCharacters.get(0)){
             contador0++;
            }else{
              
            }
         if(pr == vocalesCharacters.get(1)){
            contador1++;
         }else{

         }
         if(pr == vocalesCharacters.get(2)){
            contador2++;

         }else{

         }
         if(pr == vocalesCharacters.get(3)){
            contador3++;
         }else{

         }
         if(pr == vocalesCharacters.get(4)){
            contador4++;
         }else{

         }
        }
          
        System.out.println("las vocales  de a que contiene tu palabras son "+contador0+" y  vocales de  e son "+contador1+" vocales de i son"+contador2+"vocales de o son"+contador3+"vocales de u son "+contador4);
              
           }
        
       }

    

