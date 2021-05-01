package inheritance2;

public class CustomerManager {
    public void add(Logger logger) {
        // customer info
        System.out.println("Customer added.");
        
        // DatabaseLogger logger = new DatabaseLogger();
        logger.log();
    }
}