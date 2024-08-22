// import java.util.ArrayList;

// import org.omg.DynamicAny.DynAnyOperations;

class Telefono extends  SmartPhone{
   private Double  measures;
    


    public Telefono(Double weigth, String color, Double price ){
                super(weigth, color, price);

    }

    @Override
    public void setMeasures(Double measures){

        if(measures <=  8.0 ){
            this.measures = measures;
        }else{
            System.out.println("work");
        }

    }

}




