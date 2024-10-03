import java.util.ArrayList;

class Book{
private  String title;
private  Float price;
private ArrayList<Book> stockDisponible = new ArrayList<>();



public Book(String title, Float price){

    this.title = title;
     this.price = price;

}




public  void ADDBook(){
        // System.out.println("hey mundo estas hay");
    // for (int i = 0; i < stockDisponible.size(); i++) {

         
        
    // }
    Book libro = new Book("100 años de soledad", 30.99f);
    Book libro1 = new Book("mill años en guerra", 17.00f);
    Book libro2 = new Book("como hacer que te pasen cosas buenas", 20.99f);
    Book libro3 = new Book("como lidiar con gente loca", 40.55f);
    Book libro4 = new Book("dias de gloria ", 10.00f);
    




     stockDisponible.add(libro);
     stockDisponible.add(libro1);
     stockDisponible.add(libro2);
     stockDisponible.add(libro3);
     stockDisponible.add(libro4);

}




public String getTitle() {
    return title;
}




public Float getPrice() {
    return price;
}




public ArrayList<Book> getStockDisponible() {
    return stockDisponible;
}



}
