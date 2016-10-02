public class Testprogram {
    
    private String name;
    private String lastname;
    
	/**
	* Constructor som starter klassen.
	*/
    public Testprogram(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    
    public void printWelcome() {
        System.out.println("Hello and welcome " + name + " " 
                            + lastname + "!");
    }
    
    public String getNames() {
        return name + " " + lastname;
    }
    
}
