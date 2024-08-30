//maginemos que queremos crear un simulador sencillo de una biblioteca. 
//Tendremos una clase principal Biblioteca que contendrá información sobre los libros y los usuarios.
//Clases anidadas:

/*Libro: Esta clase será anidada dentro de Biblioteca para representar un libro en particular. Podrá tener 
atributos como título, autor, ISBN y un método para indicar si está disponible o prestado.
Usuario: Similar a Libro, esta clase también será anidada dentro de Biblioteca y representará a un usuario.
 Podrá tener atributos como nombre, ID de usuario y una lista de libros prestados.*/

import java.util.ArrayList;
import java.util.Scanner;

class Biblioteca{

  




private ArrayList<String> LibrosEtc;;
private String titulo;
String id;
String Autor;
String  Fecha;
String email;
String name;
Double page;
String dirretion;
boolean elseSay;

   

public  Biblioteca(String titulo){
    this.titulo = titulo;

}
  
public  static void BuscandoBook(String titulo, ArrayList<String>LibrosEtc){

   boolean elseSay = false;

  for (int i = 0; i <  LibrosEtc.size() -1; i++) {

    boolean  VerificandoTrueOFalse =  (LibrosEtc.get(i).contains(titulo)) ?   true : false;

            // System.out.println(VerificandoTrueOFalse);

            if (VerificandoTrueOFalse == true) {
               elseSay = VerificandoTrueOFalse;
              
            } else {
              
            }
        

    }
 



}
class Libro{

public void Libro(Double page){

    for (int i = 0; i < LibrosEtc.size(); i++) {

          if (LibrosEtc.contains(titulo)) {
                System.out.println("su libro fue encontrado en nuestra base datos  a continuacion mostraremos "+LibrosEtc.get(i));
          } 
          Scanner userOne = new Scanner(System.in);
          System.out.println("Escriba el autor de su libro para poder  encontrar el indicado");
          String autorTitle =  userOne.nextLine();
    
    }


  

   

  }
  
}
}
class Usuario{





  public  void Usuario(String  id, String email, String page){
          

  }
    


}







    
   

