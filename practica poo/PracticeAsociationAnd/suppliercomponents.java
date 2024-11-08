import java.security.Key;
import java.util.ArrayList;
import java.util.Map;

class SupplierComponents{
ArrayList<String> motherPlate  = new ArrayList<>();
Map<String, Double> ProcessorAndHgz = new Map<>();
Map<Double,Double >  WeightAndHeightperipherals = new Map<Double,Double>();
 
public SupplierComponents(Map<String, Double> ProcessorAndHgz, Map<Double,Double >  WeightAndHeightperipherals ){
this. ProcessorAndHgz = ProcessorAndHgz;
this. WeightAndHeightperipherals = WeightAndHeightperipherals;
}

class computer{
String processor;
Double hgz;
Double price;
String color;
SupplierComponents supplierComponents;

public computer(String processor,Double hgz, Double price,String color  ){

      this.processor = processor;
      this.hgz = hgz;
      this.price = price;
      this.color = color;

}
}
public void disassemble(){
      ArrayList<String> motherPlate  = new ArrayList<>();

       motherPlate.add("mother liquid  refriregation ");
       motherPlate.add("mother  1 asus   ");
       motherPlate.add("mother  2.0 nvidia ");
       motherPlate.add("mother  window sdt      2003 ");
       Map<String, Double> ProcessorAndHgz = new Map<>();

       ProcessorAndHgz.put( "intel 9  1 generation  " , 2.40 );
       ProcessorAndHgz.put("intel 7  2 generation ",  4.30 );
       ProcessorAndHgz.put("intel 3  1 generation ",  2.00);
       ProcessorAndHgz.put("intel celetron  2 generation ",  1.27 );
       ProcessorAndHgz.put("intel 5  3 generation ",  150);
       Map<Double,Double >  WeightAndHeightperipherals = new Map<Double,Double>();

       WeightAndHeightperipherals.put(  20.0,  15.0);
       WeightAndHeightperipherals.put(  19.0,  15.0);
       WeightAndHeightperipherals.put(  15.0,  9.0);
       WeightAndHeightperipherals.put(  20.0,  15.0);
       WeightAndHeightperipherals.put(  20.0,  15.0);



       SupplierComponents  supplierComponents = new SupplierComponents(ProcessorAndHgz, WeightAndHeightperipherals);
       for (Map.Entry<String,Double >ProcessoraHgz : ProcessorAndHgz.entrySet()) {

            System.out.println(ProcessoraHgz.getKey());
               Computer  computer = new computer( ProcessoraHgz.getKey() ,  ProcessoraHgz.getKey(),  20000, "black"); 
       }


}


}















