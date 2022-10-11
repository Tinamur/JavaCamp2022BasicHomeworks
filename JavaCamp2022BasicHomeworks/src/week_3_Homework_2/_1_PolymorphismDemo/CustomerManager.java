package week_3_Homework_2._1_PolymorphismDemo;

public class CustomerManager {

	private BaseLogger logger;

	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}

	public void add() {
		System.out.println("Musteri eklendi");
		logger.log("Musteri eklendi, loglandi");

	}
}
