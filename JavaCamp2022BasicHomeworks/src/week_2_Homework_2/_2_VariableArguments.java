package week_2_Homework_2;

public class _2_VariableArguments {

	public static void main(String[] args) {
		int number = addition(1, 3, 4, 9, 54, 2, 35);
		System.out.println(number);
	}

	public static int addition(int... numbers) {

		int total = 0;

		for (int number : numbers) {
			total += number;
		}

		return total;
	}

}
