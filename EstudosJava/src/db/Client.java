package db;

public class Client {
	
	
	// ATRIBUTOS	
    public String name;
    public boolean vip;
    public double limit;
    
    
    // CONSTRUTOR
    public Client(String name, boolean vip, double limit) {
        this.name = name;
        this.vip = vip;
        this.limit = limit;
    }
    
    
    // METODO TO STRING    
    @Override
    public String toString() {
    	
        return  "name = " + name 
        		+ "\r\n"
        		+ "vip = " + vip 
        		+ "\r\n"
        		+ "limit = " + limit
        		+ "\r\n"
		;
        
    }
    

}