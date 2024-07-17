import java.util.Scanner;

/*
 * Crea una función que calcule y retorne cuántos días hay entre dos cadenas
 * de texto que representen fechas.
 * - Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
 * - La función recibirá dos String y retornará un Int.
 * - La diferencia en días será absoluta (no importa el orden de las fechas).
 * - Si una de las dos cadenas de texto no representa una fecha correcta se
 *   lanzará una excepción.
 */




public class cuantosdias{
    public static void main(String[] args){


        Scanner escuchando  = new Scanner(System.in);
        System.out.println("escriba  las fechas en este formato para poder calcular cuanto tiempo paso  dd/mm/aa  ");
        String fechas = escuchando.nextLine();

        fechas = fechas.replaceAll("[\\D+ //]","");

        System.out.println(fechas);
 //hasta aqui lo dehamos mñn seguimos :)
 








        
    }
}