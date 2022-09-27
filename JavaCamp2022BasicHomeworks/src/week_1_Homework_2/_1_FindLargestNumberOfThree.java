package week_1_Homework_2;

public class _1_FindLargestNumberOfThree {

	public static void main(String[] args) {
		int number1 = 35;
		int number2 = 41;
		int number3 = 76;
		int largestNumber = number1;

		if (largestNumber < number2) {
			largestNumber = number2;
		}
		if (largestNumber < number3) {
			largestNumber = number3;
		}
		System.out.println("Largest Number = " + largestNumber);

	}

}
