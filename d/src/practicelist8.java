import java.util.Scanner;
import java.util.ArrayList;

public class  practicelist8{

    public static void main(String[] args){

ArrayList<Character> pa = new ArrayList<>();
//ArrayList<Character> palac = new ArrayList<>();
String palabra = "  ";

        Scanner process = new Scanner(System.in);
        System.out.println("escriba una palabra o frase para poder saber si es un palindromo");
        String pali  = process.nextLine();
        palabra = pali;
        String result = "";



     for(int i = pali.length() -1;  i >=0; i--){
              
          result += pari.charAt(i);
        pa.add(p);
        
    System.out.println(pa);
        
     }

     System.out.println(result);

     if (pa.equals(result)) {
        System.out.println("Es un palindromo");
     }else{

     }








      











    //for(int i = 0;   i < pali.length(); i++){

        //char o = pali.charAt(i);
  //pa.add(o);
   
    //}
      //System.out.println(pa);



//for(int ii = pa.size() -1;  ii >= 0;  ii--){
      
   
    //Character p =  pa.get(ii);
    //palac.add(p);
//}
      // System.out.println(palac);
 
        




    

     





        
    }
}