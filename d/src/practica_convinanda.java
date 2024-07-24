=import java.util.Scanner;
import java.util.ArrayList;

public class practica_convinanda {
    public static void main(String[] args) {
        // hoy me pasa cosas locas no se como funciona parte de este codigo el dia de
        // ayer estuvo muy lleno de actividades futuro yo no hay que rendirse hemos
        // avanzado mucho desde el primer dia
        // es 27 de junio el senior nos dijo que arreglemos este lio :) que se puede
        // hacer mas bonito

        ArrayList<Integer> palabrita = new ArrayList<>();
        ArrayList<String> paln = new ArrayList<>();

        Scanner pro = new Scanner(System.in);
        String pro1;
        String pro2;
        String pro3;
        String pro4;
        String pro5;
        String escuchando;
        do {

            System.out.println("bienvenido a mi minini proyecto de bucles  optimizado version 2.0");
            pro1 = pro.nextLine();

            System.out.println("escriba una palabra");
            pro2 = pro.nextLine();

            for (int i = 0; i < 10; i++) {
                System.out.println(pro2);
            }

            System.out.println("es su edad por favor");
            pro3 = pro.nextLine();
            pro3 = pro3.replaceAll("[//d]", "");
            int intValue = Integer.parseInt(pro3);

            for (int ii = 1; ii < intValue; ii++) {
                palabrita.add(ii);
            }
            System.out.println("las edades que usted a recorrido hasta hoy son " + palabrita);

            palabrita.clear();

            System.out.println("Escriba  una numero entero negativo");
            pro4 = pro.nextLine();
            int intv = Integer.parseInt(pro4);

            for (int i = intv - 1; i >= 0; i--) {
                System.out.println(i);
            }

            try {

                System.out
                        .println("buenas  por favor  escriba una cantidad  a invertir los años  y   el interes anual");
                escuchando = pro.nextLine();
                escuchando = escuchando.replaceAll("[^\\d$%\\s+]", "");

                String ee[] = escuchando.split("\\s+");

                for (String e : ee) {

                    paln.add(e);

                }

                paln.remove(0);

                if (paln.size() >= 3 && paln.get(0).contains("$") && paln.get(2).contains("%")) {
                    String ultimo = paln.get(0).replaceAll("[^\\d]", "");
                    String ultimo1 = paln.get(2).replaceAll("[^\\d]", "");
                    paln.set(2, ultimo1);
                    paln.set(0, ultimo);

                    System.out.println("estamos procesando sus  valores  un momento por favor :)");

                } else {
                    System.out.println(" error recuerde  ingresar los valores requeridos");

                }

            } catch (IndexOutOfBoundsException e) {
                System.out.println("recuerde poner   solo los datos requerido muchas gracias vuelva intentar");
            }

            try {
                for (String p : paln) {

                    palabrita.add(Integer.parseInt(p));

                }

                double process = palabrita.get(1) / 100.0;

                int pproces = (int) (palabrita.get(0) * process * palabrita.get(2));
                System.out.println("usted su ganancia sera de" + pproces);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("recuerde ingresar valores numericos ");
            }

            System.out.println("escriba un numero entero ");
            int numbe = pro.nextInt();

            for (int b = 0; b < numbe; b++) {
                System.out.println("*    ");
                System.out.println("   ");
            }

            System.out.println("escriba nuevamente un palabra para poder mostrale un tabla");
            String numb1 = pro.nextLine();
             int[] arra = {1,2,3,4,5,6,7,8,9,10};

            for (int c = 0; c <= arra.length; c++) {
                for( int d = 1; d <= 10; d++){
            
              System.out.println( d * arra[c]);
                }
            }

        } while (!pro1.equals("salir"));
        System.out.println("el programa a termiando muchas gracias");

    }

}
