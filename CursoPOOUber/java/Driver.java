 class Driver  extends Account{
    String license;


    public Driver(String name, String id, String document, String email, String password, String license ){
        super(name, id, document, email, password);
        this.license = license;

    } 
    
}
