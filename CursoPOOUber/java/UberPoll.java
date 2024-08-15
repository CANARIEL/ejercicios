 class UberPoll extends Car {
    String typeCarAccepeted;
    String  seatsMaterial;


    public UberPoll(String license,  String typeCarAccepeted, String seatsMaterial, Integer id, Account driver){
        super(license, id, driver);
        this.typeCarAccepeted = typeCarAccepeted;
        this.seatsMaterial = seatsMaterial;

    }
    
}
