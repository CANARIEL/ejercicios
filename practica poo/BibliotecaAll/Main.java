import java.util.ArrayList;
import java.util.Scanner;







class Main{
public static ArrayList<String> LibrosEt(){
    ArrayList<String> NameBook = new ArrayList<>();

    NameBook.add("Orgullo y Prejuicio");
    NameBook.add("Orgullo y Prejuicios");
    NameBook.add("El señor de los anillos");
    NameBook.add("Stephen King");
    NameBook.add("Haruki Murakami");
    NameBook.add("Elena Ferrante");
    NameBook.add("Elena Ferrante");
    NameBook.add("Harry Potter");
    NameBook.add("Los Juegos del Hambre");
    NameBook.add("Orgullo y Prejuicios");

   return NameBook;


}



    public static void main(String[] args) {
      
        
           Biblioteca  bibliote =  new Biblioteca(null);

        Scanner userOne = new Scanner(System.in);
        System.out.println("esciba por favor el nombre del libro que desea");
        String userListen = userOne.nextLine();
   
         ArrayList<String> LibrosEtc = LibrosEt();
            bibliote.BuscandoBook(userListen,LibrosEtc );
        Biblioteca.Libro Libro =  bibliote.new Libro();
         Libro.LibroAutor( null );
         




        
        


        




    }



  
}