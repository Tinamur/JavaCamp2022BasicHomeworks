package week_3_Homework_2._1_PolymorphismDemo;

public class Main {

	public static void main(String[] args) {
//		BaseLogger loggers[] = new BaseLogger[] { new FileLogger(), new DatabaseLogger(), new EmailLogger(),
//				new ConsoleLogger() };
//
//		for (BaseLogger logger : loggers) {
//			logger.log("Loglandi");
//		}

		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}