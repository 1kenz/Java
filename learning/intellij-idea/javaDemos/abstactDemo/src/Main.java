public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager ();
        // strategy pattern
        // customerManager.databaseManager = new SqlServerDatabaseManager ();
        // customerManager.databaseManager = new OracleDatabaseManager ();
        customerManager.databaseManager = new MySqlDatabaseManager ();
        customerManager.getCustomers ();
    }
}
