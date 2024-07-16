import java.util.Scanner;
import java.util.ArrayList;


public class prueba{
   //evaluaremos lo mismo que en el codigo anterior pero con contando mas caracteres y de distinto tipos 
   // lo logramos auqnue creo que podemos dar mas :) 
   public static void main(String[] args){



      Scanner buscando = new Scanner(System.in);
      System.out.println("ingrese una frase de vida");
      String busqueda = buscando.nextLine();
         int contador = 0;
         
          int contador1 = 0;
         int contador2 = 0;
 if(busqueda.length() >= 3){
     System.out.print("estamos procesado sus datos ");

 
        for(int i  = 0;  i < busqueda.length();  i++){

            char penultimo = busqueda.charAt(busqueda.length() -3);
            char antultimo = busqueda.charAt(busqueda.length() -2);
            char   ultimo = busqueda.charAt(busqueda.length() -1);
             char cadena = busqueda.charAt(i);

            //System.out.println("cada porceso pasa por la accion de algo "+penultimo+" "+antultimo+" "+ultimo);
            if(cadena == penultimo){
                  contador++;
            }if(cadena == antultimo ){
               contador2++;
            }if(cadena == ultimo){

               contador++;
          }

         
         }
System.out.println(" "+valores);

      }else{
         System.out.println("error  su frase es muy corta");
      }

        
     
              

      }

        }

  //String palabra = "gatoaaaa";
      //char letra = 'a';
       //int contador = 0;

//for(int i = 0;  i < palabra.length();  i ++){
                     
               //char process =  palabra.charAt(i);
                 //if (process == letra ){
                   // contador++;
                 //}
              //}
              //System.out.println("el proceso " +contador);


