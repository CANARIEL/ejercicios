import java.util.Random;
import java.util.Scanner;



public class Main{

public static String  ListeninUser() {
        Scanner userNoe = new Scanner(System.in);
  System.out.println("escriba un numero");

        String userTwo = userNoe.nextLine();
      

        return userTwo;
}


public  static  int  GenerandoNumeroRandom(){

                Random Machine = new Random();
                int randoMachine = Machine.nextInt(100);

                
             

                return randoMachine;

  

///codigo en proceso




}



        public static void main(String[] args){


        String userListen  =  ListeninUser();
        System.out.println(userListen);


       int numberMaquina =  GenerandoNumeroRandom();
       System.out.println(numberMaquina);




         
                

    











        }



}
