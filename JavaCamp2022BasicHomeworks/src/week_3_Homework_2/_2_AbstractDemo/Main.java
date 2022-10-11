package week_3_Homework_2._2_AbstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MySqlDatabaseManager());
		customerManager.getCustomers();
	}

}
