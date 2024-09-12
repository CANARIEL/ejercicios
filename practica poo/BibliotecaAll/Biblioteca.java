//maginemos que queremos crear un simulador sencillo de una biblioteca. 
//Tendremos una clase principal Biblioteca que contendrá información sobre los libros y los usuarios.
//Clases anidadas:

/*Libro: Esta clase será anidada dentro de Biblioteca para representar un libro en particular. Podrá tener 
atributos como título, autor, ISBN y un método para indicar si está disponible o prestado.
Usuario: Similar a Libro, esta clase también será anidada dentro de Biblioteca y representará a un usuario.
 Podrá tener atributos como nombre, ID de usuario y una lista de libros prestados.*/
import java.util.HashMap;

import java.util.ArrayList;
import java.util.Scanner;

class Biblioteca{

  public static  void  SegundaLibroDatos(String titulo, ArrayList<String>LibrosEtc){
    Scanner userOne = new Scanner(System.in);
    boolean heyT =  true;
     int i  = 0;
     System.out.println(i);
      while (  heyT == true ) {
              

            System.out.println("Ingrese nuevamente el  nombre de su libro");
           String busquedaUser = userOne.nextLine();
             titulo = busquedaUser;
                
                  for (int j = 0; j < LibrosEtc.size(); j++) {
                                // System.out.println(titulo+" "+heyT+" "+LibrosEtc.get(j));
            if (LibrosEtc.get(j).contains(titulo)) {
               System.out.println("se a encontrado su  libro y sus coincidencias "+LibrosEtc.get(j));
                  heyT = false;
                   
                   break;
            } else {
                  //  i++;
              heyT =  true;
            // 
            }

          }
      }
  }
private ArrayList<String> LibrosEtc;
private String titulo;
private String id;
private String Autor;
private String  Fecha;
private String email;
private String name;
private Double page;
private String dirretion;
private boolean elseSay;

   

public  Biblioteca(String titulo){
    this.titulo = titulo;

}
  
public  static void BuscandoBook(String titulo, ArrayList<String>LibrosEtc){

            String  fraseSe = " cc  ";
              for (int i = 0; i < LibrosEtc.size() -1; i++) {
                    if (LibrosEtc != null  && LibrosEtc.get(i).equalsIgnoreCase(titulo)) {
                       fraseSe ="se a encontrado su libro "+LibrosEtc.get(i);
                    }

              }
  //  System.out.println(fraseSe);
    
   if (fraseSe.contains("cc")) {

     SegundaLibroDatos(titulo, LibrosEtc);
   }else{
    System.out.println(fraseSe);
   }


  }
class Libro{

    public HashMap<String, String> AutorName(){
        HashMap<String, String> NameOne = new HashMap<>();
         NameOne.put(Fecha, Autor)



       
           
        
    return NameOne;


    }



public void  LibroAutor( String autor){

   HashMap<String, String> NameAutor = AutorName();
     
   System.out.println(NameAutor);

    

  


          Scanner userOne = new Scanner(System.in);
          System.out.println("Escriba el autor de su libro para poder  encontrar el indicado");
          String autorTitle =  userOne.nextLine();






    
    }



  
  
}

class Usuario{





  public  void Usuario(String  id, String email, String page){
          

  }
    


  
  }







}








    
   

