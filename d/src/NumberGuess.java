import java.util.Random;
import java.util.Scanner;



public class NumberGuess{
    public static void main(String[] args){

        // Genera un número aleatorio entre 1 y 100. El usuario debe intentar adivinarlo. El programa le dirá si su
        //  número es mayor o menor que el número secreto. Continuará hasta que el usuario acierte.
        // System.out.println(numberUsuario);

        
             
        
            Random numberUsuario = new   Random();
            Scanner usuarioListen =  new Scanner(System.in);
        
        int randomUsuario;
        int soloNumeros;
        
        
            do {
            System.out.println("escriba un numero quiere ganarle a la maquina :0");
            soloNumeros = usuarioListen.nextInt();
            // int intValue = Integer.parseInt(soloNumeros);
            randomUsuario =  numberUsuario.nextInt(100);
        
             
            String process =  (soloNumeros>randomUsuario) ? "gano usuario" :  "gano  maquina"; 
        
            System.out.println(process+" numeros mayor");
        
        
                
            } while (soloNumeros == randomUsuario);
            System.out.println("ganaste tu numero acetto ya que el numero de la maquina fue " +randomUsuario);















    }















}