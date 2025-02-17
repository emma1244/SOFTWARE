class Driver extends Account { 
    public Driver(string name, String 
    document, String email, String 
    password){ 
        super(name, document, email, 
        password);
    }    
    void printDataDriver(){
        system.out.println("Document
        driver: " + document + " Name
        driver: " + name + " E-mail: "
        + email + " Password: "+
        password);
    }
}     