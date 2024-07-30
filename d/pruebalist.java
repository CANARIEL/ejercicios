import java.util.ArrayList;
import java.util.Scanner;
   public class pruebalist{
      private static boolean a;
      private static boolean b;
      private static boolean c;
      public static void main(String[] args){


        ArrayList<String>  palabras = new ArrayList<>();

        palabras.add("lenguaje");//00
        palabras.add("matematicas");//11
        palabras.add("fisica");
        palabras.add("historia");




        Scanner palabrasI = new Scanner(System.in);
        System.out.println("ingrese la calificacion que obtuvo en "+palabras.get(0));
        String nota0 = palabrasI.nextLine();
        int intVA = Integer.parseInt(nota0);

        if(intVA == 10 || intVA == 9 || intVA == 8 || intVA == 7){
          a = true;
             palabras.remove(0);
             System.out.println("este es el proceso 0  verificamos  el array "+palabras);
        }else{
           a = false;
           System.out.println("este es el proceso 0  verificamos  el array "+palabras);

        }
         
        System.out.println("ingrese la calificacion que obtuvo en "+palabras.get(1));
        String nota1 = palabrasI.nextLine();
        int intVAI = Integer.parseInt(nota1);



        if((a == true )&&(intVAI == 10 || intVAI == 9 || intVAI == 8 || intVAI == 7)){
         b = true;
              palabras.remove(0);
                    System.out.println("Seguimiento de errores   posisicon 1(0) "+palabras.get(0)+"vemos el array" +palabras);
        }else if ((a == false)&&(intVAI == 10 || intVAI == 9 || intVAI == 8 || intVA  == 7 )){
         b = false;
          palabras.remove(1);
          System.out.println("seguimiento de errores posicion 1 "+palabras.get(1)+"vemos el array"+palabras);

        }else{

        }
             

          System.out.println("que nota usted obtuvo en la materia de  "+palabras.get(2));
          String notaII = palabrasI.nextLine();
          int intVAII = Integer.parseInt(notaII);

          if((b == true)&&(intVAII == 10 || intVAII == 9 || intVAII == 8 || intVAII == 7)){
            c = true;
            palabras.remove(0);
            System.out.println("unidad anti expeciones dos(0)  "+palabras.get(0)+"obteniendo  array "+palabras);


          }else if((b == false)&& (intVAII == 10 || intVAII == 9 || intVAII == 8 || intVAII == 7)){
            c = false;
            palabras.remove(1);
            System.out.println("unidad anti expeciones dos (1)" +palabras.get(1)+"obteniendo array "+palabras);

          }else{

          }


        
      }

   }