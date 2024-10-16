
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import one.util.streamex;






                class Pedido extends Producto{
                    private String fecha;
                    private Boolean Estado;
                    private ArrayList<Object>datosUsuario;


                

                public Pedido(String nameProduct, BigDecimal pay ){
                    super(nameProduct, pay);

                }


            //   public  Integer DatosBusqueda(){

                
            //   }
                /**
                 * futuro  casi lo hemos logrado pero falta mucho apenas  hemos camino las faldas de la gean montaña durante el camino cojeremos mas armas y experiencia 
                 * hemos  logrado hacer  el manejo de varios datos por lo tanto debemos saber que hemos progresado   aunque es  23 de septiembre y no hay luz ecu
                 * 
                 */
                @Override
                public void AddProduct(){


            
                        // System.out.println(
                        //     "hey mundo esto funciona o no"
                        // );

                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingrese  su pedido por favor \n"+"Recuerde que  si algun producto en especifico no se encuentra en nuestra lista principa\n" +"podemos verificar en bodega su stock \n consulte esto con stock /NameProduto/");
                System.out.println("ejemplo  5 vinos  3 beans and  1 water ");
                String  productoLin = scanner.nextLine();


                
                 ArrayList<Integer> numeritosCount = new ArrayList<>(); 

                String[] productMoviendo = productoLin.split("[\\s+]");

               
                        // System.out.println(Iterator.productMoviendo());

                            ArrayList<String>  datosUsuario = new ArrayList<>(Arrays.asList(productMoviendo));
                            // System.out.println(datosUsuario.size());
                              super.AddProduct();

                             ArrayList<Producto> productos11N = super.getProductTrue();
                            //  System.out.println(productos11N.size());
                                        for (int i = 0; i < productos11N.size(); i++) {
                         for (String  productoEntrada : productMoviendo) { 
                             try {                                    
                                if( Character.isDigit(productoEntrada.charAt(i)))  {
                                    
                                    Integer processSetOne =  Integer.parseInt(productoEntrada);
                                    //  System.out.println(processSetOne);
                                        numeritosCount.add(processSetOne);    
                                        // datosUsuario.Iterator();


                                            


                                              

                                    }
             
                             } catch (Exception e) {
                                // TODO: handle exception
                             }
                          

                         
                            }
                        }

                            // for (Integer productoNume : numeritosCount) {
                            //     System.out.println(productoNume);
                            // }



                                Map<String, Producto> pedidoUser = new HashMap<>();
                                     
  
                        System.out.println("Nuestros productos no incluyen IVA");
                              for (String usuario11 : datosUsuario) {
                                 for (Producto producto3 : productos11N) {
                                        for(Integer numeritosSet : numeritosCount ){
                                            
                                               
                                        
                                        
                                     if (usuario11.contains(producto3.getNameProduct())) {

                                        // System.out.println("su pedido si encuentra stock  un momento");
                                                    producto3.setCount(numeritosSet);
                                        BigDecimal  daticosOne =  new BigDecimal(String.valueOf(producto3.getPay()));

                                        BigDecimal precioRedt = daticosOne.setScale(2, BigDecimal.ROUND_HALF_DOWN);
 
                                        NumberFormat moneditaTwo = NumberFormat.getCurrencyInstance();
                                        String preciFormet = moneditaTwo.format(precioRedt);
                                       pedidoUser.put("cliente",  new Producto(producto3.getNameProduct(),  precioRedt, producto3.getCount()));



                                       System.out.println(producto3.getNameProduct()+"  "+producto3.getCount()+"  ");




                                       /* la pregunta aqui nace como hacemos que  la salida sea coherente y no un lio  de los mas grandes 
                                        *  nuestra salida esvino  5  $3,10
                                                vino  3  $3,10
                                                vino  4  $3,10
                                                Bean  5  $1,10
                                                Bean  3  $1,10
                                                Bean  4  $1,10
                                                tea  5  $4,00
                                                tea  3  $4,00
                                                tea  4  $4,00
                                                                                        */
                                                                                   

                                     } else {
                                        
                                     }
                                    }
                                }
                            }   

                                    // Iterator it =  pedidoUser.keySet().iterator();

                                    //          System.out.println(pedidoUser.size());

                               



                               for (Map.Entry<String, Producto> pedido : pedidoUser.entrySet()) {

                            
                                        Producto  producto = pedido.getValue();

                                        String name  = pedido.getKey();
                                        BigDecimal  daticosOne =  new BigDecimal(String.valueOf(producto.getPay()));

                                        BigDecimal precioRedt = daticosOne.setScale(2, BigDecimal.ROUND_HALF_DOWN);
 
                                        NumberFormat moneditaTwo = NumberFormat.getCurrencyInstance();
                                        String preciFormet = moneditaTwo.format(precioRedt);



                                        System.out.println(producto.getNameProduct()+" "+ producto.getCount()+" "+ preciFormet   );
                                        // System.out.println(producto.getNameProduct()+" "+ producto.getCount()+" "+ preciFormet   );
                                        // System.out.println(producto.getNameProduct()+" "+ producto.getCount()+" "+ preciFormet   );




                               }
                                    }

                
                public  void  TomarPedido(){
        
                //     Producto producto =  new Producto(null, null, 0);
                //     producto.AddProduct();
            
        

                // Scanner scanner = new Scanner(System.in);
                // System.out.println("Ingrese  su pedido por favor \n"+"Recuerde que  si algun producto en especifico no se encuentra en nuestra lista principa\n" +"podemos verificar en bodega su stock \n consulte esto con stock /NameProduto/");
                // System.out.println("ejemplo  5 vinos  3 beans and  1 water ");
                // String  productoLin = scanner.nextLine();


                
                //  ArrayList<Integer> numeritosCount = new ArrayList<>(); 

                // String[] productMoviendo = productoLin.split("[\\s+]");
                //             ArrayList<String>  datosUsuario = new ArrayList<>(Arrays.asList(productMoviendo));
                //              ArrayList<Producto> productos11N = producto.getProductTrue();
                //                         for (int i = 0; i < productos11N.size(); i++) {
                //          for (String  productoEntrada : productMoviendo) { 
                //              try {                                    
                //                 if( Character.isDigit(productoEntrada.charAt(i)))  {
                                    
                //                     Integer processSetOne =  Integer.parseInt(productoEntrada);
                //                         numeritosCount.add(processSetOne);                                                      //                         //  productos11N.get(i).setCount( ;
                //                         }

             
                //              } catch (Exception e) {
                //                 // TODO: handle exception
                //              }
                          

                         
                //             }
                //         }

                        // HashMap<String, List<Integer> ,List<String>>  productosDatosVer = new HashMap<>();

                            
              
                               
  
                        // System.out.println("Nuestros productos no incluyen IVA");
                        //       for (String usuario11 : datosUsuario) {
                        //          for (Producto producto3 : productos11N) {
                        //                 for(Integer numeritosSet : numeritosCount ){
                                            
                                
                        //                      producto3.setCount(numeritosSet);
                                        
                        //              if (usuario11.contains(producto3.getNameProduct())) {
                        //                 //  producto3.setCount(datosInt);
                        //                 BigDecimal  daticosOne =  new BigDecimal(String.valueOf(producto3.getPay()));

                        //                 BigDecimal precioRedt = daticosOne.setScale(2, BigDecimal.ROUND_HALF_DOWN);

                        //                 NumberFormat moneditaTwo = NumberFormat.getCurrencyInstance();
                        //                 String preciFormet = moneditaTwo.format(precioRedt);

                        //             //    System.out.println(producto3.getNameProduct()+"  "+producto3.getCount()+"  " +preciFormet);
                        //             productosDatosVer.put( producto3.getNameProduct(),  producto3.getCount(), preciFormet);
                                                                                   

                        //              } else {
                                        
                        //              }
                        //             }
                        //         }
                        //     }
                        //             for (int i = 0; i < productosDatosVer; i++) {
                        //                 System.out.println(productos11N.get(i).getNameProduct()+ +productos11N.get(i).getCount());
                        //                 //  break;
                                        
                        //             }
                                     

                              
                            }
                           

                                
                                static void  VerificandosDatos(){
                                      try {
                                            Scanner scanner = new Scanner(System.in);
                                              System.out.println("es correcto su pedido \n 1.-Siguiente \n 2.- Repetir 3.- Cancelar/Salir");  
                                                int listenUser = scanner.nextInt();

                                                    switch (listenUser) {
                                                        case 1:
                                                            
                                                            break;
                                                        case 2:
                                                        System.out.println("esta siendo redirigido a cajero un momento");
                                                        Cajero.CajeroVerification();
                                                              break;

                                                        case 3:
                                                        System.out.println(" usted desea salir  por completo o simplemente  cancelar este pedido  digite 0.- Salir \n 1.-Cancelar" );
                                                        int listenUse1r = scanner.nextInt();
                                                        switch (listenUse1r) {
                                                            case 0:
                                                            System.out.println("su pedido fue cancelo    en un minuto saldra del programa gracias por su visita");
                                                             return;

                                                             case 1:
                                                             System.out.println("pedido cancelado sera redirigido a zona de ofertas ");

                                                                
                                                            default:
                                                            System.out.println("su respuesta fue incorrecta vuelva intentar");
                                                                Pedido.VerificandosDatos();
                                                        }


                                                        default:
                                                            System.out.println("sus datos no fueron correctos vuelva  a intentar");
                                                              Pedido.VerificandosDatos();
                                                    }

                                        } catch (Exception e) {
                                            System.out.println("recuerde solo aceptamos respuesta en datos numericos vuelva  a repetir ");
                                                Pedido.VerificandosDatos();
                                        }
                                }

                                 
                        
                                            //    productos11N.clear();


                                    // }
                                    // }
                                        // comproOne.iterator();
                                        // comproOneIn.iterator();
                                        // comproOneBig.iterator();
                                        
                                        // System.out.println(comproOne+"\n "+comproOneIn+"\n "+comproOneBig);







                            //   }







                                    /*
                            *soluciones al problema  numero uno primero  tenemos los datos aqui  mismo  tenemos acceso a esto pero debemos poder moduarilarxos y cambiarlo sin   obtener
                             primero tamboen croe que podemos hacer una sobrecarga de mteodo pero con que fin ya que tendriamos que almacenar estos datos pero no sabemos todavia donde 
                            */




                    
                
                
            //      for (int k = 0; k < productos11N.size(); k++) {
            //      for (int j = 0; j < datosUsuario.size(); j++) {
            //      for (int i = 0; i <  numeritosCount.size(); i++) {
                    

                
    
            //        if (datosUsuario.get(j).contains(productos11N.get(k).getNameProduct())) {
            //           for (Integer numeros11 : numeritosCount) {
            //             System.out.println("daticos unicos"+numeros11);
            //             productos11N.get(k).setCount(numeros11);
            //             System.out.println("  sus pedidos es "+productos11N.get(k).getNameProduct()+" "+productos11N.get(k).getCount());

            //           }

                        



                      




            
            //             break;
            //        }else{
                       
            //        }
            //     }
            // }

                    //  }

                  

                //  }  

        
// for (int j = 0; j < productMoviendo.length; j++) {
                        //  for (String string : productMoviendo) {
                        //        try {
                                
                        //          if (Character.isDigit(string.charAt(j))) {
                        //              for (Producto producto2 : productos11N) {
                        //             //  if (datosUsuario.contains(producto2.getNameProduct())) {/
                        //                 int process1In = Integer.parseInt(string);
                        //                 producto2.setCount(process1In);
                                
                                          
                        //      producto2.getNameProduct();
                        //     System.out.println(producto2.getCount()); 
                        //      producto2.getPay();
                        //                 //   break;
                        //             //  }
                        //             }
                        //         } else {
                                    
                        //         }
                            
                        //        } catch (Exception e) {
                        //         // TODO: handle exception
                        //        }
                               




                        //  }
                
                        // }
                 






        
                  
                       
               

                


           


            
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