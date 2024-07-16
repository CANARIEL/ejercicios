import java.util.ArrayList;
//facilito eso :)

public class  practicelistas1{
    public static void main(String[] args){
           
        ArrayList<String> palabras  =  new ArrayList<String>();
          

        String[] asigantura = {"Matematicas" ,"Fisica" ,"Quimica","Historia","Lengua"};


          for(String asig : asigantura){
              palabras.add(asig);
          }



System.out.println(palabras);


        
    }
}


