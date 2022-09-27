package week_1_Homework_2;

public class _3_IsNumberPrime {

	public static void main(String[] args) {
		int number = 91;
		boolean state = true;

		if (number == 2) {

		} else if (number < 2) {
			state = false;
		} else {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					state = false;
					System.out.println("number " + number + " has another factor: " + i);
					break;
				}
			}
		}

		if (state) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number ");
		}

	}

}
