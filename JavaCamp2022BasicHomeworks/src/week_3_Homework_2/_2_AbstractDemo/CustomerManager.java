package week_3_Homework_2._2_AbstractDemo;

public class CustomerManager {

	private BaseDatabaseManager databaseManager;

	public CustomerManager(BaseDatabaseManager databaseManager) {
		this.databaseManager = databaseManager;
	};

	public void getCustomers() {
		databaseManager.getData();
	}
}
