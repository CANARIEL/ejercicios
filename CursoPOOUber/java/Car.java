 class Car {
    
    Integer id;
    String license;
    Account driver;
    Integer passegenger;

  
    public Car(String license , Integer id, Account driver){

        this.license = license;
        this.id = id;
        this.driver = driver;

    }


    


    void printCar() {
        System.out.println(" id " +id + "  license  " +license+ " driver " +passegenger);
    }

}
