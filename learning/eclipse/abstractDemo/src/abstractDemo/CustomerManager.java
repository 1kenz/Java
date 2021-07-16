package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;  // strategy pattern
	
	public void getCustomers() {
		databaseManager.getData();
		
	}
}
