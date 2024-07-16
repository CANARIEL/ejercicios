import java.util.ArrayList;

//  Escribe un programa que imprima los 50 primeros números de la sucesión
//  * de Fibonacci empezando en 0.
//  * - La serie Fibonacci se compone por una sucesión de números en
//  *   la que el siguiente siempre es la suma de los dos anteriores.
// 0.1,2,3,4,5,7,8,9         0+1 =1   1+1 =2



    public class Fibonacci{
    public static void main(String[] args){

    ArrayList<Integer> nume  =new  ArrayList<>();
 
     ArrayList<Integer> nume1  =new  ArrayList<>();
     nume1.add(0);
     nume1.add(1);

     for(int i  =1; i < 50; i++){
        nume.add(i);
        

     }
int process =  nume1.get(0) +  nume1.get(1);
        nume1.add(process);
System.out.println(nume);
    for(int ii = 0; ii < nume.size();  ii++){
        
        int p =  nume.get(0) + nume.get(1);
        nume1.add(p);
        nume.remove(0);
         
        
    }


    System.out.println(nume1);
    
    
     



           
    
        }

 }