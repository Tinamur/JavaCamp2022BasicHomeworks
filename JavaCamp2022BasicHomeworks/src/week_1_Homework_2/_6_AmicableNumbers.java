package week_1_Homework_2;

public class _6_AmicableNumbers {

	public static void main(String[] args) {
		int number1 = 1184;
		int number2 = 1210;
		int calculatedNum1 = calculateSumOfDividers(number1);
		int calculatedNum2 = calculateSumOfDividers(number2);

		if (number1 == calculatedNum2 && number2 == calculatedNum1) {
			System.out.println("Number " + number1 + " and number " + number2 + " are amicable numbers");
		}else {
			System.out.println("Number " + number1 + " and number " + number2 + " are not amicable numbers");
		}

	}

	public static int calculateSumOfDividers(int number) {
		int total = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				total += i;
			}
		}
		return total;
	}

}
