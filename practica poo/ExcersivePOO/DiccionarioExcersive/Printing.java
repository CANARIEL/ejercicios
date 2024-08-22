class Printing{
static String id =  "11cdf";
  static String Topic;
   String NumberPage;



   public void PrintingTalk(){
    System.out.println("eh estoy vivo");
   }


   public Printing(String id, String topic){
    this.id = id;
     Topic = "libro";
   }

   public void PrintingTopic(){
      System.out.println(Topic);
      System.out.println(id);
   }

}