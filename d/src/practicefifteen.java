import  java.util.Scanner;
//diria yp que terminado pero no falta comprobar que lleguen dos valores jajaa de entrada para evitar una exeption :)
 // terminado manejamos la expecion de  que el usuario divida por cero

 public class practicefifteen{
    public static void main(String[] args){
         int divisor = 2;
         int resultado1 = 0;
           int resultado2 = 0;
            //int cero = 0;

        Scanner locus = new Scanner(System.in);

         System.out.println("Por favor digite dos numeros enteros ");

         String  numeros =  locus.nextLine();


            String[]  productopro = numeros.split(",");
               

           


 for(String prod : productopro){
           String  valor1  = productopro[0].trim();
            String valor2 = productopro[1].trim();

               int intvalue0 = Integer.parseInt(valor1);
                  int intvalue1 = Integer.parseInt(valor2);

                   if(intvalue0 < 1   ||  intvalue1 < 1){
                     System.out.println(" no es posible dividir por 0 por favor cambie sus valores");
                       break;
                   }else{

                  int process = intvalue0  % divisor;
                   int  process1 = intvalue1 % divisor;
                     
                  

                     resultado1 =  process;
                         resultado2 = process1;
                   
 }
 }

        
       switch(resultado1){

          case 0:
             System.out.println("el resultado es cero por lo tanto es un numero par");
               break;
           case 1:
               System.out.println("el resultado es  mayo a cero por lo tanto hablamos de un numero impar");
                break;
             case 2:
                System.out.println("numero supera el valor mayor a 9");
                 default:
                 System.out.println("este es un numro par");
                   break;

       }switch(resultado2){
          case 0:
           System.out.println("el resultado es cero por lo tanto es un numero par");
             break;
            case 1:
            System.out.println("el resultado es un numero mayor a cero por lo tanto es impar");
               break;
             case 2:
              System.out.println("el resultado es mayor a 10 es  impar");
                break;
               default:
               System.out.println("el resultado es mayor a 40 es impar");
                break;





       }



        
    }



 }