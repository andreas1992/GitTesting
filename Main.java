public class Main {

    public static void main (String args[]){
        Testprogram testP = new Testprogram("Andreas", "Semb");
        testP.printWelcome();
        testP.setCar("Ferrari 458");
        System.out.println("\nYour car is a " + testP.getCar());
    }
}
