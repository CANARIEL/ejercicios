  import java.util.Scanner;
//terminamos mis felicitaciones ariel  sigue asi yo del futuro si regresas me comentas como vamos es 7 de junio :)
public class practicetentyone{
    public static void main(String[] args){
Scanner process = new Scanner(System.in);
  Scanner process2 = new Scanner(System.in);
     System.out.println("buenas tenemos dos tipos de pizzas la vegana y la clasica");
               String escuchando = process.nextLine();

             if(escuchando.contains("vegana")){
                System.out.println("pimiento, tofu.  recuerde solo puede elegir un ingrediente");
                 String escucha =  process2.nextLine();
                    System.out.println("tu pedido es un pizza vegana con el ingredinte  "+escucha+" muchas gracias en unos minutos estara su orden");

             }else{
                System.out.println("Peperoni, Jamón y Salmón  recuerde solo puede elegir un ingrediente ");
                   String escucha = process2.nextLine();
                   System.out.println("tu pedido es un pizza clasica con el ingredinte "+escucha+" muchas gracias en unos minutos estara su orden");


             }


    








        
    }












}