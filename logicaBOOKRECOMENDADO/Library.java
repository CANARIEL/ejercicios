import java.util.ArrayList;
import java.util.Scanner;




class Library {
 private String nameBook;


 public Library(String  nameBook){
        this.nameBook = nameBook;
 }












public   void  VerificandoDato(){


 
    Book book = new Book(null, null);
    book.ADDBook();
    ArrayList<Book> librosUser = book.getStockDisponible();

     Scanner clienteOne = new Scanner(System.in);
     System.out.println("bienvenido a la libreria local ingrese el nombre del  book que usted busca");

     String clienteOne1 = "   ";
     if (clienteOne.hasNextInt()) {
        System.out.println("ingrese solo datos string");
        Cliente.BuscandoBook();
     } else {
        System.out.println("estamos verificando  su dato");
         clienteOne1 = clienteOne.nextLine();
     }


         boolean vLi1 = true;
         String userLibro =  "   ";
         float payUser = 0.00f;

        

            for (Book book2 : librosUser) {


                  if (book2.getTitle().equalsIgnoreCase(clienteOne1)) {
                      vLi1 = true;
                      userLibro = book2.getTitle();
                      payUser = book2.getPrice();
                      
                  } else {
                        vLi1 = false;
                  }
            
                   }


                   if (vLi1 = true) {
                    System.out.println(" su dato fue encontrado  el precio de su libro es" +payUser+" "+userLibro);
                    
                   } else {
                    System.out.println("su libro no fue encontrado");
                   }




     
          

 
  



     }


















     



    




       


 
    }

