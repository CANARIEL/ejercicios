package api_conetion;



class SERVIDOR{

/*
 * ERRPR FUTURO IMPLEMENTAR BASES DE  POO EN LO QUE ORRESPONDE
 * A SERVIDOR O RESPUESTA HTTP O API ES COMPLETA ESTUPIDES
 * TE ROBO ALGUNAS ESTE CODIGO QUEDA DE COMPRESION Y MUESTRA 
 * PARA FUTURPS ERRPRES
 * 
 * 
 */





public static void main(String[] args) throws IOException{
   SERVIDOR servidor = new Servidor();


   /*
    * DOCUMENTANDO ANDO  PRIMERO SE CREA EL SERVIDOR EN ESTE 
    * LE DECIMOS A QUE  PUERTI PREGUNTAR LA SINTAXIS  MULTI FUNCIONAL
    */
HttpServer server = HttpServer.create(new  InetSocketAddress(8080),0);



/*
 * AQUUI NOS SURGE UNA DUDA  POR QUE HACEMOS REFERENCIA A DATOS CUANDO
 *  UN SEEVIDOR RESIVE UNA SOLUCITO TTENE QUE RESPONDER ALGO PUES
 *  
 * TAMBIEN *SE HACE REFEENCIA A SERVERResolt * es que el encargado de ver que tipp de peticion s ele ahce 
 * 
 * 
 */
server.createContext("/datos", new ServerResolt() );


server.setExecutor(null);
server.start();

}


static class ServerResolt implements  CentrelVal{
@override
public void Resolt(HttpExchange exchange)  throws IOException{

if("GET".equals(exchange.getRequestMethod())){

        System.out.println("respondiendo de forma basica");


}else{

    exchange.sendResponseHeaders(405, -1);

}




}



}

}

