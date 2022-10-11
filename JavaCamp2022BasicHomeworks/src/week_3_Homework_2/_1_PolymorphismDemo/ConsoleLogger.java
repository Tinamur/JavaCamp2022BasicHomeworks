package week_3_Homework_2._1_PolymorphismDemo;

public class ConsoleLogger extends BaseLogger {
	@Override
	public void log(String message) {
		System.out.println("Console Logger : " + message);
	}
}
