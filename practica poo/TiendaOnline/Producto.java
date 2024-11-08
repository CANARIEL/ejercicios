import java.util.ArrayList;
import java.math.BigDecimal;
import java.text.NumberFormat;

class Producto{
   protected  ArrayList<Producto>productTrue  =  new ArrayList<>();
   private String nameProduct;
    private BigDecimal  pay;
   private String stock;
   private String name;
   private String id;
    private Integer  count;
    private ArrayList<String> datosUsuario;

   

   
public Producto(String nameProduct, BigDecimal  pay, Integer count){

        this.nameProduct = nameProduct;
        this.pay =  pay;
        this.count  = count;


       


}

public Producto(String nameProduct, BigDecimal  pay, Integer count,String datosUsuario){
             this.nameProduct = nameProduct;
             this.pay =  pay;
             this.count  = count;
             this.datosUsuario = datosUsuario;

}

public Producto(String id, BigDecimal  pay){
     this.id = id;
     this.pay =  pay;

}







public void  AddProduct(){
    Producto producto0 = new Producto("Coffe",  new BigDecimal(1.10),0); 
    Producto producto1 = new Producto("Suggar", new BigDecimal(3.45), 0); 
    Producto producto2 = new Producto("Chicken", new BigDecimal(7.80),0); 
    Producto producto3 = new Producto("Bean", new BigDecimal(1.10),0); 
    Producto producto4 = new Producto("Water", new BigDecimal(0.67),0); 
    Producto producto5 = new Producto("tea", new BigDecimal(4.00), 0); 
    Producto producto6 = new Producto("vino",new BigDecimal(3.10) , 0); 
    Producto producto7 = new Producto("cerveza", new BigDecimal(1.10), 0); 


    







    productTrue.add(producto0);
    productTrue.add(producto1);
    productTrue.add(producto2);
    productTrue.add(producto3);
    productTrue.add(producto4);
    productTrue.add(producto5);
    productTrue.add(producto6);
    productTrue.add(producto7);


 

}





public  ArrayList<Producto> getProductTrue() {
    return productTrue;
    
}


public String getNameProduct() {
    return nameProduct;
}

public void setNameProduct(String nameProduct) {
    this.nameProduct = nameProduct;
}


public String getStock() {
    return stock;
}

public String getName() {
    return name;
}


public String getId() {
    return id;
}

public BigDecimal getPay(){
     return pay;


}


public Integer getCount() {
    return count;
}

//    public void PribLt(){
    //  Producto.DatosCompartir(Producto);
//    }

  public static void DatosCompartir(Producto objeto){

      ArrayList<Producto> produteLind = objeto.getProductTrue();
      
            produteLind.iterator();

            for (Producto producto : produteLind) {
            
                 if (producto != null) {
                    
                 } else {
                    objeto.AddProduct();
                 
                 } 

                              
                 BigDecimal  daticosOne =  new BigDecimal(String.valueOf(producto.getPay()));

                                                
                                          
                BigDecimal precioRedt = daticosOne.setScale(2, BigDecimal.ROUND_HALF_DOWN);
 
                NumberFormat moneditaTwo = NumberFormat.getCurrencyInstance();
                String preciFormet = moneditaTwo.format(precioRedt);

System.out.println("  stock " +producto.getNameProduct()+" "+ preciFormet);

            }



}

public void setProductTrue(ArrayList<Producto> productTrue) {
    this.productTrue = productTrue;
}


public void setCount(Integer count) {
    this.count = count;
}

}
