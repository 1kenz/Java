package polymorphism;

public class CustomerManager {

    private BaseLogger baseLogger;
    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }

    public void add() {
        System.out.println("Customer added.");
        this.logger.Log("log message");

    }
}
