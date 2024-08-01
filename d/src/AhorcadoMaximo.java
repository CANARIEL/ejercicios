// import java.io.fileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
// import java.nio.Buffer;
import java.util.IOException;



public class AhorcadoMaximo{
    public static void main(String[] args){
        // El programa debe seleccionar una palabra aleatoriamente de un archivo de texto.
        // El usuario debe intentar adivinar la palabra letra por letra.
        // Por cada letra incorrecta, se añade una parte al dibujo del ahorcado.
        // El juego termina cuando el usuario adivina la palabra completa o cuando se completa el dibujo del ahorcado.
        // Se deben implementar diferentes niveles de dificultad, que pueden variar en la longitud de las palabras o en el número de intentos permitidos.
        // Se debe mostrar la cantidad de intentos restantes y las letras ya utilizadas

        //conectamos  el  nuestro codigo a  un archivo txt

        File archivoTexto = new File("/Users/arielmendoza/Desktop/ homework java/d/src/lectura.txt");
        // File pruebaTest = new File("/user/name ");

        if(archivoTexto.exists()){

            System.out.println("este archivo si existe y dice estamos procesamdo lo que contiene" );
            FileReader fileArchivo1 =  new  FileReader("/Users/arielmendoza/Desktop/ homework java/d/src/lectura.txt");
            BufferedReader pruebaTesti1  = new BufferedReader(fileArchivo1);
            // BufferedReader pruebaTesti1 = new  BufferedReader( new FileReader( "/Users/arielmendoza/Desktop/ homework java/d/src/lectura.txt"      ));
            String  lineaTest1;
            
            while ((lineaTest1 = pruebaTesti1.readLine()) !=null) {
                System.out.println(lineaTest1);
                
            }

        }else{
            System.out.println("no sirve ");
        }
        
                


        

        

    }
}