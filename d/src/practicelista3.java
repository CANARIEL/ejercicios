import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class practicelista3{
     public static void main(String[] args){
          Scanner palab = new Scanner(System.in);
     List<Object> palabra  = new ArrayList<Object>(); 

     palabra.add("Matematicas"); //0
     palabra.add("Lengua");    //1
     palabra.add("Fisica");    //2
     palabra.add("Quimica");   //3
     palabra.add("Fisica");    //4


Object elem  = palabra.get(0);

System.out.println("cual es su calificacion en la siguiente materia " +elem);
          int  num1  = palab.nextInt();
          palabra.add(num1); //5

Object el1 = palabra.get(1);
    
System.out.println("cual es su calificacion en la siguiente materia "+el1);
             int num2 = palab.nextInt();
             palabra.add(num2);//6

Object el2 = palabra.get(2);
System.out.println("cual es su calificacion en la siguiente  materia " +el2); 
            int num3 = palab.nextInt();
            palabra.add(num3);//7

Object el3 = palabra.get(3);
System.out.println("cual es su calificacion en la siguiente  materia " +el3); 
      int num4 = palab.nextInt();
         palabra.add(num4);//8

Object el4  = palabra.get(4);//9
System.out.println("cual es su calificaciin en la siguiente materia "+el4);
       int numult = palab.nextInt();
           palabra.add(numult);



  Object n1 = palabra.get(5);

System.out.println("la nota de "+elem+ "es "+n1);



 Object n2  = palabra.get(6);

 System.out.println(
     "la nota de la materia " +el1+"  es " +n2);


 Object n3  = palabra.get(7);
 
 System.out.println("la nota de la materia "+el2+ "es" +n3);


 Object n4  = palabra.get(8);

 System.out.println("la nota de la materia es "+el3+" es" +n4);



 Object n5 = palabra.get(9);
System.out.println("la nota de la materia es "+el4+"es "+n5);


                    




               
          






     

         


        
     }








}