
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;






                class Pedido extends Producto{
                    private String fecha;
                    private Boolean Estado;
                    private ArrayList<Object>datosUsuario;


                

                public Pedido(String nameProduct, Double pay ){
                    super(nameProduct, pay);

                }



                /**
                 * futuro  casi lo hemos logrado pero falta mucho apenas  hemos camino las faldas de la gean montaña durante el camino cojeremos mas armas y experiencia 
                 * hemos  logrado hacer  el manejo de varios datos por lo tanto debemos saber que hemos progresado   aunque es  23 de septiembre y no hay luz ecu
                 * 
                 */
                public static void  TomarPedido(){
        
                    Producto producto =  new Producto(null, null, 0);
                    producto.AddProduct();
            
        

                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingrese  su pedido por favor \n"+"Recuerde que  si algun producto en especifico no se encuentra en nuestra lista principa\n" +"podemos verificar en bodega su stock \n consulte esto con stock /NameProduto/");
                System.out.println("ejemplo  5 vinos  3 beans and  1 water ");
                String  productoLin = scanner.nextLine();


                

                String[] productMoviendo = productoLin.split("[\\s+]");

            
                ArrayList<String>  datosUsuario = new ArrayList<>(Arrays.asList(productMoviendo));
                    
                /*
                 *  la pregunta es por que nos complicamos tanto la vida por que le convertimos en
                 */

                    
                ArrayList<Producto> productos11N = producto.getProductTrue();
                ArrayList<Integer> numeritosEscribir = new ArrayList<>();


                 for (int i = 0; i < productos11N.size(); i++) {
                 for (int j = 0; j < datosUsuario.size(); j++) {
                  
                    String tomaUser = datosUsuario.get(j);
                    for (int k = 0; k < tomaUser.length(); k++) {
                        
                    
                        if (Character.isDigit(tomaUser.charAt(k)) &&  tomaUser.length() > 0 && tomaUser != null) {
                              try {
                                 int processTwo =  Integer.parseInt(tomaUser);
                                 numeritosEscribir.add(processTwo);


                                System.out.println(""+processTwo);
                              } catch (Exception e) {
                                
                              }
                              break;

                        } else {
                            
                        }

                    }
                



                   if (datosUsuario.get(j).contains(productos11N.get(i).getNameProduct())) {
                        System.out.println("se a encontrado su datos  estamos progresando " +productos11N.get(i).getNameProduct());
                        break;
                   }else{
                       
                   }
                
                  
                       
                }



                 }

                //  for (int i = 0; i < numeritosEscribir.size(); i++) {
                //       System.out.println(numeritosEscribir.get(i));
                //  }

                


           


                }
                        /* 
                         *  hey futuro yo dentro de unas horas tendremos conexiones pilas con las collections  por que dias 
                         * nos vemos en la necesidad  de usar   las collecions  eh elegido las  treeset
                         *  pero esto no cuentan con todas las cosas que deseo  por tal tenemos que usar otra 
                         *  por lo tanto debemos  tener en cuenta  las otras collecions en java tenemos las clases anidadas  
                         * que podria nuestra solucion para asi poder  eleminar datos del arraylist en caso que se use 
                         *  ideas  principal descartada no es del mundo real 
                        */


        


                    public String getFecha() {
                        return fecha;
                    }


                    public Boolean getEstado() {
                        return Estado;
                    }


                    public void setFecha(String fecha) {
                        this.fecha = fecha;
                    }


                    public void setEstado(Boolean estado) {
                        Estado = estado;
                    }

}