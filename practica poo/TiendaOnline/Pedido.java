
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;
import org.omg.PortableInterceptor.INACTIVE;
import java.util.ListIterator;
import java.util.HashMap;



            /*
             * hemos logrado  muchachos cosas aqui pero hya un ultimo desafio que nos esta jodiendo 
             */



                class Pedido extends Producto{
                    private String fecha;
                    private Boolean Estado;
                    private ArrayList<String>datosUsuario;
                    private PayMoreTax PayMoreTax;




                
                

                public Pedido(String nameProduct, BigDecimal pay ){
                    super(nameProduct, pay);

                }
                public void setPayMoreTax(PayMoreTax PayMoreTax) {
                    this.PayMoreTax = PayMoreTax;
                    PayMoreTax.setPedido(this);

                    }
                
                    

              



            

          



                @Override
                public void AddProduct(){
                    System.out.println("ssxdxd");

                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingrese  su pedido por favor \n"+"Recuerde que  si algun producto en especifico no se encuentra en nuestra lista principa\n" +"podemos verificar en bodega su stock \n consulte esto con stock /NameProduto/");
                System.out.println("ejemplo  5 vinos  3 beans and  1 water ");
                String  productoLin = scanner.nextLine();


                
                ArrayList<Integer> numeritosCount = new ArrayList<>(); 
                String[] productMoviendo = productoLin.split("[\\s+]");
                ArrayList<String>  datosUsuario = new ArrayList<>(Arrays.asList(productMoviendo));
                ArrayList<Producto> productos11N = super.getProductTrue();  
                super.AddProduct();


                ArrayList<String> productoM = new ArrayList<>();

                  for (String string :productMoviendo ) {
                    productoM.add(string);
                    
                  }



                   for (int i =  productoM.size() -1; i >= 0;  i--) {
                            String searchNumner = productoM.get(i);
                        for (int j = 0; j < searchNumner.length(); j++) {
                             try {
                                  if (Character.isDigit(searchNumner.charAt(j))) {

                                Integer  numberTogo = Integer.parseInt(searchNumner);
                                // System.out.println(numberTogo);
                                 numeritosCount.add(numberTogo);
                        }
                             } catch (Exception e) {
                                // TODO: handle exception
                             }
                          
                        }
                        

                   }

                                




                        System.out.println("Nuestros productos no incluyen IVA");

 
                  AuxiliarOne(datosUsuario,numeritosCount,productos11N);
                               
                            /*
                             *  primero tenemos el for each que recorre   los datos de usuario que son los de entrada
                             * en el segundo for each  tenemos   productos11N este tiene el inventario de  productos que tenemos 
                             *  poiir ultimo tenemos  numetitos es donde sobrescribimos datos   a los count 
                             */


                             for (Producto producto3 : productos11N) {
                              for (String usuario11 : datosUsuario) { 
                             
                                    // for (Integer num11dX : numeritosCount) {
                                        
                                 
                                     if (usuario11.contains(producto3.getNameProduct())) {


                                                // producto3.setCount(num11dX);
                                          
                                    BigDecimal  daticosOne =  new BigDecimal(String.valueOf(producto3.getPay1()));

                                                
                                          
                                        BigDecimal precioRedt = daticosOne.setScale(2, BigDecimal.ROUND_HALF_DOWN);
 
                                        NumberFormat moneditaTwo = NumberFormat.getCurrencyInstance();
                                        String preciFormet = moneditaTwo.format(precioRedt);

                                            
                                    
                                         System.out.println(usuario11+" "+ preciFormet+" "+ producto3.getCount());


                                        //  Double  taxData = 0.15;
                                         
                

                                  

                                     } else {
                                        
                                     }

                                }

                            }
                             }

                                   


                         public void   AuxiliarOne(ArrayList<String> datosUsuario, ArrayList<Integer>numeritosCount, ArrayList<Producto> productos11N ){


                                     

                                        ArrayList<Integer> numerosOne = new ArrayList<>(numeritosCount);

                                    ListIterator<Integer> datosOne =  numerosOne.listIterator();


                                                   while (datosOne.hasNext()) {
                                                 for (Producto producto : productos11N) {
                                                    if (datosUsuario.contains(producto.getNameProduct())) {
                                                        // System.out.println(producto.getNameProduct());
                                                            Integer datosU = datosOne.next();

                                                                 producto.setCount(datosU);

                                                            


                                                    }
                                                        
                                                    }
                                                 }
           
                                        }



                                            public void bodegaOn(){


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