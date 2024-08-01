import java.util.ArrayList;

import java.util.Random;

public class PruebasTest{

          


    public static void main(String[] args){

           ArrayList<Integer> numeroFrecuencioa = new ArrayList<>();
           ArrayList<Integer>  numeroFrecuencia1  = new ArrayList<>();



         Random numerosUnidos = new Random();
      

         int numeroOne = numerosUnidos.nextInt(100);
         int numeroTwo =  numerosUnidos.nextInt(100);
        ß
032





    for(int i = 0; i <= numeroOne; i++  ){
        System.out.println(i+"hey ");
        numeroFrecuencioa.add(i);
    }
    
    for(int ii = 0;  ii  <=  numeroTwo; ii++){
        System.out.println(ii);
        numeroFrecuencia1.add(ii);
    }


    for(int iv = 0 ; iv < numeroFrecuencioa.size(); iv++){
    for(int vi = 0;  vi < numeroFrecuencia1.size();  vi++){
        if(numeroFrecuencioa.get(iv) == numeroFrecuencia1.get(vi)){
            // trueFrecuencia.add(numeroFrecuencioa);
             System.out.println("estamos procesando sus valores con frecuencia un momento" );

             numeroFrecuencia1.removeAll(numeroFrecuencia1);

            numeroFrecuencia1.add(numeroFrecuencioa.get(iv));
            System.out.println("sus valores con frecuencia son > "+numeroFrecuencioa);
        }else{

        }
    }
    }

  



    }








}