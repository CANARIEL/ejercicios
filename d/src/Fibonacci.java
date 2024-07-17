import java.util.ArrayList;

//  Escribe un programa que imprima los 50 primeros números de la sucesión
//  * de Fibonacci empezando en 0.
//  * - La serie Fibonacci se compone por una sucesión de números en
//  *   la que el siguiente siempre es la suma de los dos anteriores.
// 0.1,2,3,4,5,7,8,9         0+1 =1   1+1 =2

///hey que tal futuro yo como te va  tengo una duda   o mas bien para rama de pruebasdeminutos mira podemos  hacer el proceso  pone atencion comesamos 1+2 = 3 wliminamos 0  y comenzamos hacer 
//calculos con el ultimo resultado en el arraylist que seria 3 y  el 1 de la otras lista  seria



    public class Fibonacci{
    public static void main(String[] args){

    ArrayList<Integer> nume  =new  ArrayList<>();
    nume.add(0);
    nume.add(1);
    
   

      int process = nume.get(0) +  nume.get(1);
         nume1.add(process);
     for(int i =0; i <=50; i++){
        
        int n = nume.get(nume.size() -2);
        int n1 = nume.get(nume.size() -1);
          int fr = n + n1;
           
          nume.add(fr);
       
            

    
     }



 System.out.println(nume); 
    
        }

 }
