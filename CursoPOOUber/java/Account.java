 
 
 class Account {

        String id;
        String name;
        String email;
        String document;
        String password;


 

    public Account( String name, String document, String email) {
             
                this.name = name;
                this.document = document;
                this.email = email;
    }

    public Account(String name, String id, String document, String email, String password){

                this.name = name;
                this.id = id;
                this.document = document;
                this.email = email;
                this.password = password;
                  
    }

        // public Account()



    
}
