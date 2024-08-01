import java.util.ArrayList;



public class PruebaBurbuja{
    public static void main(String[] args){
        System.out.println("esto vale");
        ArrayList<Integer>  orden  = new ArrayList<>();
        ArrayList<Integer>  orden1  = new ArrayList<>();
   

          orden.add(1);
          orden.add(6);
          orden.add(3);
          orden.add(7);
          orden.add(19);
          orden.add(13);
          orden.add(2);
          orden.add(6);
          orden.add(3);



        for(int i = 0; i < orden.size() -1; i++){
            System.out.println(orden);
       

            if(orden.get(i) < orden.get(i)){
                orden1.add(orden.get(i));

                continue;


            }else{
                orden.set(orden.get(i),orden.get(i));
                System.out.println("pruea");
                continue;
            
        }
           
        }
       

    //   }


     }

// System.out.println(orden1);







    }










// }