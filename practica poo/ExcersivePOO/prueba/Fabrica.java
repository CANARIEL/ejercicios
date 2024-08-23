import java.util.Scanner;


class Fabrica{
  static  int id = 0;;
    String  Dirrection;
    String  place;
    String measures;
    String name;
    String area;



     

 
Fabrica() {
        // id++;
    
    do {    
         Scanner worksFactory = new Scanner(System.in);
        System.out.println("buenas  usted esta acediendo a la fabrica revive muertos  cual es la dirrecion de su fabrica digite el numero gracias");
         DirretionFactory.Dirreciones();

        

           
        String userJobFactory = worksFactory.nextLine();

        switch (userJobFactory) {
            case "1":
                   System.out.println("su fabrica a sido seleccionada correctamente  va ser rederigido a esta  por favor  tenga sus documentos de  identificacion a mano");
                         User.user1(userJobFactory);
                     boolean verdadL0 = true;
                break;
            case "2":
                    System.out.println("su fabrica a sido seleccionada correctamente  va ser rederigido a esta  por favor  tenga sus documentos de  identificacion a mano");
                      User.user1(userJobFactory);


                      break;
            case "3":
                    System.out.println("su fabrica a sido seleccionada correctamente  va ser rederigido a esta  por favor  tenga sus documentos de  identificacion a mano");
                    User.user1(userJobFactory);
                    boolean verdadL2 = true;
                      break;
        
            default:
             System.out.println("no hemos logrado encontrar su ubicacion vuelva  intentar");
                    boolean falsL = false;
                
        }
  } while (true);
    // System.out.println("esta correcto");


    // User.user1(userJobFactory);
   

}
// Fabrica(String Dirrection, String place){
//         System.out.println(Dirrection+" "+place);
        
// }

// public void FabricaHablar() {

    // System.out.println(id);
    // System.out.println(Dirrection);
// }






}
