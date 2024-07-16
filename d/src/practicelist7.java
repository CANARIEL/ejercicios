import java.util.ArrayList;

public class  practicelist7{
    //futuro yo hoy cambiamos ingles por programacion seguimos luchadno con los movimientos de programacion exactamrnete de arraylist claro me falto decirte es 25 de june o yun en english  vamos si podemos 
    public static void main(String[] args){

        ArrayList<String>  palabrita =  new ArrayList<>();
      
       
 
        palabrita.add("A"); //0    //1
        palabrita.add("B"); // 1   //2
        palabrita.add("C"); // 2     //3
        palabrita.add("D"); // 3   //4
        palabrita.add("E"); // 4   //5
        palabrita.add("F");  // 5
        palabrita.add("G"); // 6
        palabrita.add("H");  //7
        palabrita.add("I");  // 8
        palabrita.add("J");  // 9
        palabrita.add("K");   // 10
        palabrita.add("L");  // 11
        palabrita.add("M");  //12
        palabrita.add("N");  //13
        palabrita.add("O");   //14
        palabrita.add("P");   //15
        palabrita.add("Q");    //16
        palabrita.add("R");   //17
        palabrita.add("S");  //18
        palabrita.add("T");   //19
        palabrita.add("U");   //20
        palabrita.add("V");  //21
        palabrita.add("W"); //22
        palabrita.add("X"); //23
        palabrita.add("Y"); //24
        palabrita.add("Z"); //25


    
     for(int i = palabrita.size() -1;  i >= 1; i-- ){
   
     int p  =  i % 3;

     if(p == 0){
        System.out.println(i);
        palabrita.remove(i);
     }
     }


        


 System.out.println(palabrita);
          }
   
}