
public class Testprogram {
    
    private String name;
    
    public Testprogram(String name) {
        this.name = name;
    }
    
    public void printWelcome() {
        System.out.println("Hello and welcome " + name + "!");
    }
    
    public String getName() {
        return name;
    }
    
}
