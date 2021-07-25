public class Main {

    public static void main(String[] args) {
       /*
        EmailLogger logger = new EmailLogger ();
        logger.log ("Log message");
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger()};
        for (BaseLogger logger: loggers){
            logger.log ("Log message");
        }
        CustomerManager customerManager = new CustomerManager (new DatabaseLogger ());
       */

        CustomerManager customerManager = new CustomerManager (new FileLogger ());
        customerManager.add();

    }
}
