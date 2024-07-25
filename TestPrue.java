public class TestPrue {
    public static void main(String[] args){


          double lony = 10.3;
            int lonL = 12;

            //  System.out.println(Math.PI);
            //  System.out.println(Math.ceil(lony)); 
            //  System.out.println(Math.floor(lonL));   
            //  System.out.println(Math.max(10, 200));
            //  System.out.println(Math.min(12, 200));
            //  System.out.println(Math.pow(lony, lonL));
             System.out.println(Math.sqrt(lonL));
            //  System.out.println(Math.);
             //calcual el area del circulo pi * r2

            //  System.out.println(Math.PI * Math.pow(lony, 3));


             // 4/3 *   PI  * r3


            //  System.out.println((4/3) * Math.PI * Math.pow( lonL , 3));

            int lunNumber =1;
            int uNumber = 100;
            
            


            System.out.println((float)lunNumber/uNumber);


            char letricaPrueba = 'r';

            uNumber =  uNumber + letricaPrueba;

            System.out.println(uNumber);



            // Ponte creativo y preséntanos a tu familia con variables, utiliza todos los tipos 
            // y cantidad de variables que puedas, no olvides las convenciones de nombres Camel Case.

            short madreFamily = 145; 

            boolean blancaMadre = false; 


            System.out.println("mi madre es  short ella mide "+madreFamily+"ella es  blanca "+blancaMadre);



             double padreFamily = 1.67;

             boolean blancoPadre = false;

             long pesoPadre = 80;


             System.out.println("mi padre es   un (int) es no  muy alto ni pequeño "+padreFamily+"ella es blanca "+blancoPadre+"su peso es (long) "+pesoPadre);



            double pesoHermana  = 80.5;
             boolean blancaHermana = true;
             short hermanaFamily = 166;


             System.out.println("mi hermana  es un float en su peso "+pesoHermana+"ella es blanca "+blancaHermana+" su altura es "+hermanaFamily);


             byte gerenteFamily = 40;
             long alturaGerente = 130;
             boolean esMachoc = true;
             

             System.out.println("el gerente es un  gato long en altura es" +alturaGerente+"su peso es byte "+gerenteFamily+" es macho"+esMachoc);



            //  Ejercicio 2

            //  Usando los dos tipos de casting que aprendiste (implícito y explícito), resuelve 
            // los siguientes casteos indicando qué tipo es y si se está calculando estimación o exactitud.
             
            //  char c = ‘z’; conviertelo a int
            //  int i = 250; conviertelo a long y luego de long a short
            //  double d = 301.067; conviertelo a long
            //  int i = 100; súmale 5000.66 y conviertelo a float
            //  int i = 737; multiplícalo por 100 y conviertelo a byte
            //  double d = 298.638; divídelo entre 25 y conviertelo a long


             // implicito
            char numberT = 'z';

             int converTen = numberT;
             System.out.println(converTen);

             //exacto
             int i = 250;

             long numeTo = i;

             System.out.println(numeTo+"convetiendo a short"+(short)numeTo);


                ///exacto
             double dTener =  301.067;

            System.out.println((long)dTener);


            //exacto
            int iFlo = 100;
            double ooFo = 5000.66;
             

            System.out.println((float)iFlo + ooFo);

             int iFety = 737;

         

             System.out.println((byte)iFety * 100);



                //exacto
             double numberTsss = 298.638;

             System.out.println((long)numberTsss / 25 );


             boolean pruebaOne =  true;
             int contadorBluetooth = 3;



             if(!(pruebaOne == false)){
               contadorBluetooth++;
                   System.out.println("el bluetooth "+contadorBluetooth);
             }

            //  int a = 8;
            //  int b = 5;

              boolean process = 8 < 5;

              System.out.println(process);


            
              
            //  System.out.println(pruebaO1);


            

    }
}




             
  public static int pruebaO1( int a, int b){
        

     a = 13;
     b = 12;

   

      return  a  + b; 
   }