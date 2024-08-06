import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class EjerciciosIntemedio{

    public static ArrayList<Integer> CreamosElArregloEnBaseAlUsuario(int numberEntero){

        ArrayList<Integer> numerosTest = new ArrayList<>();
        ArrayList<Integer> numerosOrden = new ArrayList<>();
       

    for(int i = 1;  i <= numberEntero; i++){
        numerosTest.add(i);

    }

    return numerosTest;

    }



    public static void OrdenamientoFormaDesendentesAcedente(ArrayList<Integer>procesoLin){
        Random numberTe =  new Random();
        int numberT12  = numberTe.nextInt(100);
       Scanner escuchandoTEL =  new Scanner(System.in);

        
       ArrayList<Integer> NumberWoo = new ArrayList<>();
        
        for(int ii = 0; ii <  procesoLin.size(); ii++){
            NumberWoo.add(procesoLin.get(ii));
        }
    


        for(int iv = 0; iv < numberT12; iv ++){
                NumberWoo.add(iv);

        }

        
      
              do {
        System.out.println("buenas  usted desea ordenar en  decendiente o ascendente  y por medio de los algoritmos burbuja o inserción recuerde solo puedo elegir uno a uno");
        System.out.println("Ejemplo:  ascendente, burbuja");
        String usuarioOne = escuchandoTEL.nextLine();

        String[] comprobandoUser =  usuarioOne.split(",");
            
        // for(int i =0;  i < comprobandoUser.length; i++){
        boolean preguntaOne =  (comprobandoUser.length >= 2) ?   true : false;
        String userOne1;
        String userOne2;
        if(preguntaOne == true ){

        userOne1 = comprobandoUser[0].trim();
        userOne2 = comprobandoUser[1].trim();
          
        }else{
          continue;
        }
        

         if(userOne1.equals("decendiente") &&  use rOne2.equals("burbuja")){
            System.out.println("usted selecciono  decendiente  y burbuja");


       
            for(int i = 0;  i <  NumberWoo.size(); i++){
            for(int iv = NumberWoo.size();  iv >= 0; i--){

            if(NumberWoo.get(i) < NumberWoo.get(iv)){
                numerosOrden.add(NumberWoo.get(i));

                 
            }else{
            NumberWoo.set( NumberWoo.get(i), NumberWoo.get(i));
            continue;
            }

            }

     
            }

        

         }else if(userOne1.equals("descendente")  && userOne2.equals("insercion")){
            System.out.println("usted selecciono  decendiente  y insercion");


         }else if(userOne1.equals("ascendente") && userOne2.equals("burbuja")){
            System.out.println("usted selecciono  ascendente  y burbuja");


         }else{
            System.out.println("usted selecciono  ascendente  y insercion");

         }


        

       } while (true);
    //    System.out.println("usted a terminado este programa con exito muchas gracias por contribuir en  el aprendizaje");

    }


    public static void main(String[] args){


        // Descripción: Implementa una función que ordene un arreglo de números enteros de forma ascendente utilizando el algoritmo de burbuja o inserción.
        // Desafíos adicionales:
        // Implementa una función que ordene un arreglo de objetos personalizados (por ejemplo, una clase Persona con atributos nombre y edad).
        // Permite al usuario elegir el tipo de ordenamiento (ascendente o descendente).
        // Mide el tiempo de ejecución de cada algoritmo para comparar su eficiencia.

        Scanner enterosHumano = new Scanner(System.in);
        System.out.println("ingrese un numero entero para poder crear  un arreglo de numeros");
        int numberEntero = enterosHumano.nextInt();


        ArrayList<Integer> procesoLin = CreamosElArregloEnBaseAlUsuario( numberEntero);



         System.out.println(procesoLin);


        OrdenamientoFormaDesendentesAcedente(procesoLin);



        
        
    }



}