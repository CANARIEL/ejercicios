

class SmartPhone{
            private Double weight;
            private String color;
            private Double price;
            private Double measures;


    public SmartPhone(double weight, String color, double price) {
                //TODO Auto-generated constructor stub 
                this.weight = weight;
                this.color = color;
                this.price = price;
                // this.measures = measures;
                
            }
     

    public Double getWeight() {
        return weight;
    }


    public String getColor() {
        return color;
    }


    public Double getPrice() {
        return price;
    }


    /**
     * @return /**
     * /
     */
    public Double getMeasures() {
         return measures;
    }
       /**
     * @param measures este es un parametro desde la clase main 
     *  
     */
    public void setMeasures(Double measures) {
        if(measures > 10.0){
           
        this.measures = measures;

        }else{
            System.out.println("error at measures retry please");
            // continue;
        }




    } 
       public void printSmartPhone() {

                    System.out.println("the weigth " +getWeight());
                    System.out.println("the color is  " +getColor());
                    System.out.println("the price " +getPrice());
                    System.out.println("the measures " +getMeasures());

                }
    

}


